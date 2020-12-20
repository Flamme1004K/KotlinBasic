package kotlinCookBook

/*
문제 :
코틀린은 자동으로 기본 타입을 더 넓은 타입으로, 예를 들어 Int -> Long으로 승격하지 않는다.

해법 :
더 작은 타입을 명시적으로 변환하려면 toInt, toLong 등 구체적인 함수를 사용한다.

 */

// 코틀린에서는 기본 타입을 직접적으로 제공하지 않는다.
// 개발자가 코드를 직접 작성할 때는 기본 타입이 아닌 클래스를 다룬다.
// 코틀린에서는 toInt, toLong 같은 형태의 변환 메소드를 제공한다.

val intVar : Int = 3
// val longVar: Long = intVar -> x
val longVar : Long = intVar.toLong()

/*
toByte() : Byte
toChar() : Char
toShort() : Short
toInt() : Int
toLong() : Long
toFloat() : Float
toDouble() : Double
 */

val LongSum = 3L + intVar
//타입 변환을 투명하게 수행하는 연산자 중복 장점이 있기 때문에 명시적 타입 변환이 필요 없다.