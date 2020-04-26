package creationalpattern.factory.abstractfactory

class VanillaFactory : AbstractFactory {
    override fun strawberry() = null

    override fun vanilla(): IIcecream? {
        return VanillaIcecream()
    }
}