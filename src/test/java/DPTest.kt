import creationalpattern.builder.Product
import creationalpattern.factory.abstractfactory.FactoryGenerator
import creationalpattern.factory.simplefactory.IceCreamFactory
import org.junit.Test
import structuralpattern.adaptor.CameraAdaptor
import structuralpattern.adaptor.PC
import structuralpattern.adaptor.Usb
import structuralpattern.bridge.CreateFoodAbstractImpl
import structuralpattern.bridge.CreateFoodImplementorImpl
import java.util.*

class DPTest {

    /**
     * 创建型
     */

    @Test
    fun simpleFactory() {
        println(IceCreamFactory().createIceCream("Strawberry")?.brandName)
    }

    @Test
    fun abstractFactory() {
        //得到工厂对象
        var factory = FactoryGenerator().createFactory("strawberry")
        //生产冰淇凌
        println(factory?.strawberry()?.brandName)
    }

    @Test
    fun builder() {
        println(Product.Companion.Builder("电脑", 4500F)
                .pAddress("信阳")
                .pDateInProduced(Date())
                .build())
    }

    /**
     *结构型
     */

    @Test
    fun adaptor() {
        val usb: Usb = CameraAdaptor()
        PC().usbAccess(usb)
        println(usb)
    }

    @Test
    fun bridge() {
        CreateFoodAbstractImpl(CreateFoodImplementorImpl()).run {
            addMaterial("白菜")
            createFood()
        }
    }

}