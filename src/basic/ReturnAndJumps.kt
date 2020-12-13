package basic
/*
코틀린에는 label이 있다.

label로 Break and Continue가 가능하다.
- 레이블 표현 : label@, abc@, fooBar@
식별자 + @ 형태로
식별자 이름은 내 맘대로 쓰면 된다.

레이블을 통하여 return과 jump가 가능하다.

label로 Return

코틀린에서 중첩 될 수 있는 요소들
함수 리터럴
지역함수
객체 표현식
함수
 */

fun foo() {
    var ints = listOf(0,1,2,3)

    ints.forEach(fun(value: Int) {
        if(value == 1) return
        print(value)
    })
    print("End")
}
/*
람다식에서 return 할 때 주의사항
 - 람다식에서 return시 nearest enclosing 함수가 return 됨.
 - 람다식에서 대해서만 return 하려면 label을 이용해야 함.
 */
fun foo1() {
    var ints = listOf(0,1,2,3)

    ints.forEach label@ {
        if (it == 1) return@label //retrun과 @레이블을 붙여야함
        print(it)
    }
    print("End")
}

/*
암시적 레이블
- 람다식에서만 return 하는 경우 label을 이용해서 return 해야함
- 직접 label을 사용하는 것보다 암시적 레이블이 편함.
- 암시적 레이블은 람다가 사용된 함수의 이름과 동일함
 */

fun foo2() {
    var ints = listOf(0,1,2,3)

    ints.forEach  {
        if (it == 1) return@forEach //retrun과 @레이블을 붙여야함
        print(it)
    }
    print("End")
}

fun main() {
    foo2()
}