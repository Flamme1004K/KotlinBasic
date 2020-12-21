package kotlinCookBook

/*
Pair 클래스의 인스턴스를 생성하고 싶다.

직접 Pair 클래스의 인스턴스를 생성하기보다는 중위 to 함수를 사용한다.
 */

//fun <K, V> mapOf(vararg pairs: Pair<K, V>): Map<K, V>

//data class Pair<out A, out B> : Serializable

//public infix fun <A, B> A.to(that: B): Pair<A,B> = Pair(this, that)

fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 2) //to를 사용해서 Pair생성

    val p1 = Pair("a", 1)
    val p2 = "a" to 1 // 생성자를 통해 Pair 생성

    val pair = "a" to 1
    val (x,y) = pair

}