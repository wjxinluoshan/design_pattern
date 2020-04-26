package structuralpattern.bridge

abstract class CreateFoodAbstract {
    abstract fun addMaterial(materialName:String)
    abstract fun createFood()
}