package creationalpattern.factory.simplefactory

import creationalpattern.factory.abstractfactory.IIcecream
import creationalpattern.factory.abstractfactory.StrawberryIcecream
import creationalpattern.factory.abstractfactory.VanillaIcecream

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