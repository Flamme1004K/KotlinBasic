package kotlinCookBook

/*
자바처럼 코틀린도 객체 지향 프로그래밍 언어다.

코틀린의 추상 클래스와 구상 클래스, 인터페이스는 자바 개발자에게 익숙한 방식으로 사용한다.

문제 : 런타임보다는 컴파일 타임에 변수가 상수임을 나타내야 한다.

해법 : 컴파일 타임 상수에 const 변경자를 사용한다.
      val 키워드는 변수에 한 번 할당되면 변경이 불가능함을 나타내지만 이러한 할당은 실행 시간에 일어난다.

코틀린 키워드는 val은 값이 변경 불가능한 변수임을 나타낸다. 자바에서 final 키워드가 같은 목적으로 사용된다.

컴파일 타임 상수는 반드시 객체나 동반 객체선언의 최상위 속성 또는 멤버여야 한다.

컴파일 타임 상수는 컴파일 시점에 값을 사용할 수 있도록 main 함수를 포함한 모든 함수의 바깥쪽에서
할당돼야 한다.
 */


class Task(val name: String, _priority: Int = DEFAULT_PRIORITY) {
    //_priorty는 속성이 아니라 생성자의 인자일 뿐이다.
    companion object{
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    } //컴파일 타입 상수

    var priorty = validPriority(_priority)
        set(value) {
            field = validPriority(value)
        }
    // 사용자 정의 설정자(setter)를 사용하는 속성

    private fun validPriority(p: Int) =
            p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
    // private 검증 함수
}

// 3개의 상수가 정의 되어있다.
// 코틀린에서 val은 키워드지만 const는 private, inline 등과 같은 변경자이다.
// const는 val 키워드를 대체하는 것이 아니라 같이 쓰여야 한다.private final과 같음.
// companion object는 뭔데..?