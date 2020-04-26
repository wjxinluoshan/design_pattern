package structuralpattern.bridge

interface CreateFoodImplementor {
     fun addMaterial(materialName:String)
     fun createFood()
}