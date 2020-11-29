package basic

/*
코틀린의 기본 타입
코틀린의 모든 것은 객체이다.
모든 것에 대해 함수나 프로퍼티를 호출 가능하다는 의미
*/

/*
숫자(Numbers)
- Java의 숫자형과 거의 비슷하다.
- Kotlin의 Number는 class이다. java의 primitive type에 직접 접근할 수없음
- Java 에서 숫자형이던 char가 kotlin에서 숫자형이 아님
 */


fun test() {
    var a:Int = 1000
    var b:Int? = 1000
    //? 로 하면 b가 primitive로 되어지기 때문에 ===은 false이다.


    println("a === b : ${a === b}")
    println("a == b : ${a == b}")
}

/*
코틀린은 작은 타입에서 큰타입으로 대입이 안되기 때문에
변환을 해주어야 한다.
 */

fun test2() {
    var a : Int = 2
    //var b : Long = a
    var b : Long = a.toLong()
}

/*
문자(Characters)
- Char는 숫자로 취급하지 않는다.
``안에 넣고 취급해야 한다.
 */

fun check(c: Char): Char {
    if(c==`c`){
        return c
    }
    return c
}

/*
Array
- 배열이 class로 표현된다.
- get, set으로 표현된다.
- size 등 배열의 유용한 멤버 함수 포함
 */

fun array() {
    var array : Array<String> = arrayOf("코틀린", "강좌")
    array.get(0)
    array[0]
    array.size

    /*
    배열 생성
    - Array의 팩토리 함수 이용
    - arrayOf의 라이브러리 함수 이용
     */

    val b = Array(5) { i -> i.toString() }
    val a = arrayOf("0", "1", "2", "3", "4")

    /*
    특별한 Array클래스
    - primitive 같은 타입의 박싱 오버헤드를 없애기 위한 타입
    - IntArray, ShortArray
    - Array를 상속한 클래스들은 아니지만, Array와 같은 메소드와 프로퍼티를 가짐
    - size 등 유용한 멤버 함수를 포함
     */
    val x: IntArray = intArrayOf(1,2,3)
    x[0] = 7
}

/*
 문자열(String)
 자바 문자열과 똑같다.

 문자열 리터럴
 - escape String
    - 전통적인 방법의 String
    - BackSlash를 사용하여 escaping 처리
 - raw String
    - escaping 처리 필요 없음.
    - 개행이나 어떤 문자든 포함 가능
 */

fun string() {
    val s = "Hello world \n"

    val s2 = """
        "'이것은 
        코틀린의 raw String 입니다'"
    """
}
