package kotlinCookBook

data class Product3(
        val name: String, var price: Double, var onSale: Boolean = false)


fun nameOfProductsOnSale(products: List<Product3>)
= products.filter { it.onSale }.map { it.name }.joinToString(separator = ",")



fun main() {
    val overthruster = Product3("Oscillation Overthruster", 1_000_000.00)
    val fluxcapacitor = Product3("fluxcapacitor", 299_999.95, onSale = true)
    val tpsReportCoverSheet = Product3("tpsReportCoverSheet", 0.25)
    val products = nameOfProductsOnSale(listOf(overthruster, fluxcapacitor, tpsReportCoverSheet))
    println("products = ${products}")

}
