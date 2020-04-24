package factory.simplefactory

import factory.abstractfactory.IIcecream
import factory.abstractfactory.StrawberryIcecream
import factory.abstractfactory.VanillaIcecream

class IceCreamFactory {
    fun createIceCream(brandName: String): IIcecream? {
        return when (brandName) {
            "Strawberry" -> {
                StrawberryIcecream()
            }
            "Vanilla" -> {
                VanillaIcecream()
            }
            else -> null
        }
    }
}