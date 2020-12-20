package kotlinCookBook

/*

코틀린에서 가장 매력적인 기능은 가능한 모든 널 값을 제거한다는 것.
*/

var name : String = ""

class Person(val first: String, val middle: String?, val last: String)

val jkRowling = Person("Joanne", null, "Rowling")
val nothWest = Person("North", null, "West")

fun main() {
    name = "Dolly"

    var p = Person(first = "North", middle = null,  last = "West")

    if(p.middle != null) {
        //val middleNameLength = p.middle.length
        // p.middl이 복합식이므로 String 타입으로 영리한 타입 변환이 불가능하다.
        val middleNameLength = p.middle!!.length
        // !! : 널이 아님을 단언(assert)(꼭 필요한 경우가 아니라면 사용하지 말 것)
    }

    val middleNameLength = p.middle?.length?:0
    // ?.( 안전 호출 연산자 ): 값이 널이면 null을 돌려줌
    // ?:( 엘비스 연산자 ) 자신의 왼쪽에 위치한 식의 값을 확인해서 해당 값이 널이 아니면 그 값을 리턴한다.
    println("middleNameLength = $middleNameLength")

    val p1 = p as? Person
}