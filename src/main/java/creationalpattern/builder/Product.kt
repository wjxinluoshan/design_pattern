package creationalpattern.builder

import java.util.*

class Product private constructor(var builder: Builder) {
    var pname: String? = null
    var price: Float? = null
    var pAddress: String? = null
    var pDateInProduced: Date? = null

    init {
        pname = builder.pname
        price = builder.price
        pAddress = builder.pAddress
        pDateInProduced = builder.pDateInProduced
    }

    companion object {
        class Builder constructor(var pname: String, var price: Float) {
            var pAddress: String? = null
            var pDateInProduced: Date? = null

            fun pAddress(pAddress: String): Builder {
                this.pAddress = pAddress
                return this
            }

            fun pDateInProduced(pDateInProduced: Date): Builder {
                this.pDateInProduced = pDateInProduced
                return this
            }

            fun build(): Product {
                return Product(this)
            }

        }
    }

    override fun toString(): String {
        return "Product(creationalpattern.builder=$builder, pname=$pname, price=$price, pAddress=$pAddress, pDateInProduced=$pDateInProduced)"
    }

}