package factory.abstractfactory

class FactoryGenerator {
    fun createFactory(type: String): AbstractFactory? {
        return when (type) {
            "strawberry" -> {
                StrawberryFactory()
            }
            "vanilla" -> VanillaFactory()
            else -> null
        }
    }
}