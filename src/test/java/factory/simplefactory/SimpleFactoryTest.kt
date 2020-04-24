package factory.simplefactory

import org.junit.Test

class SimpleFactoryTest {

    @Test
    fun test() {
        println(IceCreamFactory().createIceCream("Strawberry")?.brandName)
    }

}