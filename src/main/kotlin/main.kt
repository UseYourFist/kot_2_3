fun main() {
    val oldPurchase = 12_000
    val newPurchase = 1000
    val regularBuyer = true
    val sum = if (oldPurchase in 1..1000) {
        if (regularBuyer) {
            newPurchase * 0.99
        } else {
            newPurchase
        }
    } else if (oldPurchase in 1001..10_000) {
        if (regularBuyer) {
            (newPurchase - 100) * 0.99
        } else {
            newPurchase - 100
        }
    } else {
        if (regularBuyer) {
            (newPurchase * 0.95) * 0.99
        } else {
            newPurchase * 0.95
        }
    }
    println(sum)
}

