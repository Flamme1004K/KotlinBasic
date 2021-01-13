package kotlinCookBook

/*
문제 :
코틀린에서 배열을 생성하고 배열에 데이터를 추가하고 싶다.

해법 :
arrayOf 함수를 이용해 배열을 만들고 Array 클래스에 들어 있는 속성과 메소드를 이용해
배열에 들어 있는 값을 다룬다.
 */

fun main() {
    val strings = arrayOf("this", "is", "an", "array", "of", "strings")

    val nullStringArray = arrayOfNulls<String>(5)

    val squares = Array(5) {i -> (i * i).toString()}

    //booleanArrayOf, byteArrayOf, shortArrayOf, charArrayOf, intArrayOf,
    //longArrayOf, floatArrayOf, doubleArrayOf


}