package structuralpattern.bridge

class CreateFoodAbstractImpl constructor(var createFoodImplementor: CreateFoodImplementor) : CreateFoodAbstract() {

    override fun addMaterial(materialName: String) {
        createFoodImplementor.addMaterial(materialName)
    }

    override fun createFood() {
        createFoodImplementor.createFood()
    }
}