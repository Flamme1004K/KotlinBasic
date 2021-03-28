package kotlinInAction.Chapter4

/*
자바의 기본 가시성 패키지 전용은 코틀린에 없음.

코틀린은 패키지를 네임스페이스를 관리하기 위한 용도로만 사용

패키지 전용 가시성을 위해서는 internal이라는 새로운 가시성 변경자를 도입
(internal은 모듈 내부에서만 볼 수 있음.)

모듈은 한 번에 한꺼번에 컴파일되는 코틀린 파일들을 의미한다.

모듈 내부 가시성은 캡슐화를 제공한다는 장점이 있다.

internal은 하위 시스템의 자세한 구현 사항을 외부에 감추고 싶을 때 유용한 방법이다.

public : 모든 곳에서 볼 수 있다.
internal : 같은 모듈에서만 볼 수 있다.
protected : 하위 클래스 안에서만 볼 수 있다.
private : 같은 클래스 안에서만 볼 수 있다.
 */

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey");
    fun whisper() = println("Let's talk!");
}

fun ffff() {
    val talkativeButton= TalkativeButton();
    talkativeButton.whisper();
}

