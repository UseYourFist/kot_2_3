fun main() {
    val oldPurchase = 12_000
    val newPurchase = 1000
    val regularBuyer = true
    val sum = if (oldPurchase in 1..1000) {
            newPurchase
    } else if (oldPurchase in 1001..10_000) {
            newPurchase - 100
    } else {
            newPurchase * 0.95
    }
    if (regularBuyer) {
        println((sum.toInt() * 0.99).toInt())
    } else {
        println(sum)
    }
}

