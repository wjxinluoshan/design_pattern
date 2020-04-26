package structuralpattern.bridge

class CreateFoodImplementorImpl : CreateFoodImplementor {
    private var materialName: String? = null
    override fun addMaterial(materialName: String) {
        this.materialName = materialName
    }

    override fun createFood() {
        println("使用 ${this.materialName} 做了一道美食!!!")
    }
}