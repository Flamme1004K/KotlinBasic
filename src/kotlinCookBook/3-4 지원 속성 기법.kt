package kotlinCookBook

/*
 문제
 클래스의 속성(Property)을 클라이언트에게 노출하고 싶지만 해당 속성을 초기화하거나 읽는 방법을
 제외해야 한다.

 해법
 같은 타입의 속성을 하나 더 정의하고 사용자 정의 획득자와 설정자를 이용해 원하는 속성에 접근한다.
 */

class Customer(val name: String) {
    /*
    private var _message: List<String>? = null // null 허용 private

    val messages: List<String> // 불러올 속성
        get() {                 // private 함수
            if (_message == null) {
                _message = loadMessage()
            }
            return _message!!
        }
     */
    //생성 즉시 초기화?

    val messages : List<String> by lazy { loadMessage() }

    private fun loadMessage(): MutableList<String> =
            mutableListOf(
                    "Initial contact",
                    "Convinced them to use Kotlin",
                    "Sold training class, Sweet"
            ).also { println("Loaded message") }
}

fun main() {
    val customer = Customer("Fred").apply { messages }
    println("customer.messages.size = ${customer.messages.size}")
}
