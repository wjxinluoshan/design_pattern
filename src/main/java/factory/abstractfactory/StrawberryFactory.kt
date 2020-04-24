package factory.abstractfactory

class StrawberryFactory : AbstractFactory {
    override fun strawberry(): IIcecream? {
        return StrawberryIcecream()
    }

    override fun vanilla() = null
}