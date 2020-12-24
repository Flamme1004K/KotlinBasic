package kotlinCookBook

/*
문제 : 라이브러리에 정의된 클래스와 더블어 +와 * 같은 연산자를 사용할 수 있는
클라이언트를 만들고 싶다.

해법 : 코틀린의 연산자 중복 메커니즘을 사용해서 +와 * 등의 연산자와 연관된 함수를 구현한다.
 */

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(10, 20)

fun main() {
    println(-point)
}