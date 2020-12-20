package kotlinCookBook

/*
문제 :
십진법이 아닌 다른 기수를 사용하는 숫자를 출력하고 싶다.

해법 :
올바른 기수를 위해 확장 함수 toString를 사용하자/.
 */
val binary : String = 42.toString(2)

fun main() {
    println("binary = ${binary}")
}