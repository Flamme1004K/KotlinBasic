package kotlinCookBook

import java.text.NumberFormat

/*
문제 :
기본 파라미터를 가진 코틀린 함수가 있는데, 자바에서 각 파라미터의 값을 직접적으로 명시하지
않고 해당 코틀린 함수를 호출하고 싶다.

해결방법 :
@JvmOverloads 애노테이션을 사용한다.
 */


fun addProduct( name : String, price: Double = 0.0, desc: String? = null) =
        "Adding product with $name, ${desc ?: "None"}, and " +
                NumberFormat.getCurrencyInstance().format(price)

data class Product @JvmOverloads constructor(
        val name : String,
        val price : Double = 0.0,
        val desc : String? = null
)