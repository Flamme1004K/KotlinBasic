package kotlinInAction.Chapter4

/*
코틀린 가시성/접근 병견자는 자바와 비슷하지만 아무것도 지정하지 않은 경우 기본 가시성은 다르다.

가시성 : 사물 또는 대상을 보다.

* 코틀린의 인터페이스

추상 메소드뿐 아니라 구현이 있는 메소드도 정의할 수 있다.

다만 인터페이스에는 아무런 상태(필드)도 들어갈 수 없다.

 */

interface Clickable {
    fun click() // 일반 메소드
    fun showOff() = println("I'm clickable") // Default Method
}

// Click이라는 추상 메소드가 있는 인터페이스를 정의 --> 모든 비추상 클래스는 click에 대한 구현을 제공해야 한다.

class Button : Clickable {
    /* 자바에서는 extends와 implements 키워드를 사용하지만, 코틀린에서는 클래스 뒤에 (:)를 붙인다.
    : 이 클래스 확장과 인터페이스를 모두 처리한다.
     */
    override fun click() = println("I was clicked")
}

fun main() {
    Button().click()
}