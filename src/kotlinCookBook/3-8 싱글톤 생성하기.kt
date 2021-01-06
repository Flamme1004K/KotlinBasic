package kotlinCookBook

/*
문제 :
클래스 하나당 인스턴스는 딱 하나만 존재하게 만들고 싶다

해법 : class 대신 object 키워드를 사용하면 된다.

설명 :

싱글톤 디자인 패턴

1. 클래스의 모든 생성자를 private으로 정의한다.
2. 필요하다면 해당 클래스를 인스턴스화하고 그 인스턴스 레퍼런스를 리턴하는 정적 팩토리 메소드를
    제공한다.

자바 표준 라이브러리에서 싱글톤 예는 Runtime 클래스를 들 수 있다.
사용 중인 플랫폼에서 몇개의 프로세서가 사용 가능한지 알고 싶다고 하자.
*/

fun main() {
    val processors = Runtime.getRuntime().availableProcessors()
    MySingleton.myFunction()
    println(processors)
}

/*
코틀린에서 싱글톤 구현은 class 대신 object 키워드를 사용하기만 하면 된다.
이를 객체 선언이라고 한다.
 */

object MySingleton {
    val myProperty = 3

    fun myFunction() = "Hello"
}

// 싱글톤 안의 코드를 호출할 때는 자바의 static 멤버처럼 객체 이름에서 멤버에 접근할 수 있다.
// 코틀린 object의 멤버 함수와 속성은 필요한 모든 획득자 메소드와 함께 디컴파일된 자바 클래스의 static
// final 메소드와 속성으로 변환되고 이 속성들은 자신의 클래스와 함께 static 블록에서 초기화 된다.
//

