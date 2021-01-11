package kotlinCookBook

import java.math.BigInteger

/*
4장 함수형 프로그래밍

함수형 프로그래밍이란

불변성(immutability)을 선호한다.
불변성이란 ? 객체가 생성된 이후 그 상태를 변경할 수 없는 디자인 패턴이다.
순수 함수를 사용하는 경우 동시성을 쉽게 구현할 수 있으며, 반복보다 변형을 사용하고,
조건문보다는 필터를 사용하는 코딩 스타일을 지정한다.

4장에서는 꼬리 재귀나 다소 다르게 구현된 fold 또는 reduce 같은 코틀린의
함수형 기능과 관련있는 내용을 설명한다.

4-1 알고리즘에서 fold 사용하

문제 :
반복 알고리즘을 함수형 방식으로 구현하고 싶다.

해법 :
fold 함수를 사용해 시퀀스나 컬렉션을 하나의 값으로 축약 reduce 시킨다.

fold : 배열 또는 바복 가능한 컬렉션에 적용할 수 있는 reduce 연산이다.
 */

fun main() {
    val numbers = intArrayOf(3,1,4,1,5,9)
    val sum = numbers.sum()
    sumWithTrace(3,1,4,1,5,9)
    println("sum = ${sum}")
}

fun sumWithTrace(vararg nums : Int) {
    nums.fold(0) {
        acc, n ->
        println("acc = $acc, n = $n")
        acc+n
    }
}

fun recursiveFactorial(n: Long) : BigInteger =
        when (n) {
            0L, 1L -> BigInteger.ONE
            else -> BigInteger.valueOf(n) * recursiveFactorial(n-1)
        }

fun factioralFold(n: Long): BigInteger =
        when (n) {
            0L, 1L -> BigInteger.ONE
            else -> (2..n).fold(BigInteger.ONE) {
                acc, l ->
                acc * BigInteger.valueOf(l)
            }
        }

fun fibonacciFold(n: Int) =
        (2 until n).fold(1 to 1) { (prev, curr),_ ->
            curr to (prev + curr)
        }.second