package kotlinCookBook

/*
문제 : equals, hashCode, toString 등이 완벽하게 갖춰진 엔티티를 나타내는
클래스를 생성하고 싶다

해법 : 클래스를 정의할 때 data 키워드를 사용한다.
 */

data class Product2(
        val name : String,
        var price : Double,
        var onSale : Boolean = false
)
// 자바에서 데이터베이스 테이블의 정보를 나타내면 엔티티라고 부른다.

data class OrderItem(val product: Product2, val quantity : Int)

fun main() {
    val p1 = Product2("baseball", 10.0)
    val p2 = Product2("baseball", 10.0, false)

    val item1 = OrderItem(Product2("baseball", 10.0) ,5)
    val item2 = item1.copy();
    val products = setOf(p1, p2)
    // p1과 p2는 동등하다

    println(item1== item2)
    println(item1=== item2) // copy 함수로 생성한 OrderItem은 다른 객체다.
    println(item1.product== item2.product)
    println(item1.product=== item2.product)
    // 두 OrderItem 인스턴스에 있는 Product는 같은 객체다.


}