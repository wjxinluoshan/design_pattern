package buider

import creationalpattern.builder.Product
import org.junit.Test
import java.util.*

class BuilderTest {
    @Test
    fun test() {
        println(Product.Companion.Builder("电脑", 4500F)
                .pAddress("信阳")
                .pDateInProduced(Date())
                .build())
    }
}