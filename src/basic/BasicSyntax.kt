package basic

class BasicSyntax {

    //함수 함수명, 인자, 리턴타입 순으로 쓴다.
    fun sum(a: Int, b:Int):Int {
        return a+b;
    }

    //함수 바디를 생략하고 식으로 관리하면 return을 생략한다.
    fun sum2(a: Int, b:Int) = a+b

    //함수 정의 리턴 값이 없으면 void 대신 Unit을 사용한다.
    //Unit을 생략할 수도 있다.
    fun printlnKotlin():Unit {
        println("printlnKotlin")
    }

    fun printlnKotlin2() {
        println("printlnKotlin2")
    }

    /*코틀린에서의 지역변수는 val로 지정해서 쓴다.
    val은 읽기 전용 변수이다.
    값의 할당이 1회만 가능하며 자바의 final과 같다.
     */

    val a: Int =1 //즉시할당
    val b = 2 //Int 타입 추론
    //val c: Int //Compile error null이기 때문에
    //c =3 // 읽기전용 오류

    //var : mutable변수
    var x = 5




}

/*
fun main() {
    var a = 1
    var s1 = "a is $a"

    a=2

    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
 */

//조건문
fun maxOf(a: Int, b: Int):Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if(a > b) a else b

//nullable
// ?를 쓰므로써 Int가 나올수도 있고 Null이 나올 수가 있다라는 것을 알켜줌.

fun parseInt(str: String): Int?{
    val x: Int? = Integer.parseInt(str)
    if( x is Int) {
        return x
    }
    return null

}
    //정수가 아닌 경우 null 리턴

fun printProduct(arg1:String, arg2: String) {
    val x: Int? = parseInt(arg1)
    val y: Int? = parseInt(arg2)

    if(x != null && y != null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number ")
    }
}

fun main() {
    printProduct("1", "하")
}

//자동 타입변환
// 타입 체크만 해도 자동으로 변경됨.
//Any -> Object
fun getStringLength(obj:Any):Int? {
    if(obj is String) {
        return obj.length
    }
    return null
}

fun whildLoop() {
    val items = listOf("Apple", "Banana", "Orange")
    var index = 0
    while(index < items.size) {
        println("item is $index is ${items[index]}")
        index++
    }
}

//When Expression
fun describe(obj: Any): String {
    return when(obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        is String -> "String"
        else -> "UnKnown"
    }
}

//Range In연산자를 사용하여 숫자범위 체크 완료
fun range() {
   val x = 3
   if(x in 1..10) {
       println("first range")
   }
   for(x in 1..5) {
       print(x)
   }
}

//Collection
fun collection() {
    val items = listOf("Apple", "Banana", "Orange")
    for(item in items) {
        println(item)
    }

    items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach {println(it)}

    val items2 = setOf("Apple", "Banana", "Orange")
    when {
        "Orange" in items2 -> println("juicy")
        "apple" in items2 -> println("Apple is sweet")
    }


}

