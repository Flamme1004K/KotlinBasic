package kotlinCookBook

/*
문제 :
리스트, 세트 또는 맵을 생성하고 싶다.

해법 :
listOf, setOf, mapOf 처럼 변경 불가능한 컬렉션을 생성하기 위해 만들어진 함수나 mutableListOf,
mutableSetOf, mutableMapOf 처럼 변경 가능한 컬렉션을 생성하기 위해 고안된 함수 중 하나를 사용한다.

kotlin.collections 패키지에는 listOf, setOf, mapOf가 있다.
 */

fun main() {
    var numList = listOf(3,1,4,1,5,9)
    var numSet = setOf(1,2,3,4,5,6)
    var map = mapOf(1 to "one", 2 to "two", 3 to "three")
}

/*
기본적으로 코틀린 컬렉션은 불변이다. 그런 의미에서 원소를 추가하거나 제거하는 메소드를 지원하지 않는다.
 */