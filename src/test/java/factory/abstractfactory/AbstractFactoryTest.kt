package factory.abstractfactory

import org.junit.Test

class AbstractFactoryTest {

    @Test
    fun test() {
        //得到工厂对象
        var factory = FactoryGenerator().createFactory("strawberry")
        //生产冰淇凌
        println(factory?.strawberry()?.brandName)
    }
}