package kotlinCookBook

/*
문제
변경 가능한 list, set, map이 있을 때 해당 컬렉션의 읽기 전용 버전을 생성하고 싶다.

해법
toList, toSet, toMap 메소드를 사용해 새로운 읽기 전용 컬렉션을 생성하자.
 */

val mutableNums = mutableListOf(3,1,4,1,5,9)
fun main() {
    val readOnlyNumList: List<Int> = mutableNums.toList()
    // mutableNums.add(2)
    // 읽기 전용 컬렉션은 add나 remove 할 수 없다.
}

