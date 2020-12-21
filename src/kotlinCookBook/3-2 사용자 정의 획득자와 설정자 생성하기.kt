package kotlinCookBook

/*
문제 : 값을 할당하거나 리턴하는 방법을 사용자 정의하고 싶다.

해법 : 코린 클래스의 속성에 get과 set함수를 추가한다.틀

다른 객체 지향 언어처럼 코틀린 클래스는 데이터와 보통 캡슐화로 알려진 해당 데이터를 조작하는 함수로
이뤄진다.

코틀린은 모든 것이 기본적으로 public이다.

코틀린 클래스에서 필드는 직접 선언 할 수 있다.
 */

class Task2(val name: String ) {
    var priority = 3
}

//속성 하나는 주 생성자 안에 선언된 반면에 다른 속성은 클래스의 최상위 멤버로 선언되었다.
//priority는 apply 블록을 사용해서 값을 할당할 수 있지만 클래스를 인스턴스화할 때 priority에 값을
//할당 할 수 없다.



fun main() {
    val myTask = Task2("test").apply { priority = 4 }
    println("myTask = ${myTask}")
}

var priority = 3
    set(value) {
        field = value.coerceIn(1..5)
    }
