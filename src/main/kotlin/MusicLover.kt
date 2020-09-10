package ru.netology

const val discount1 = 100
const val discount2 = 0.95
const val discount3 = 0.99


fun main() {

    val amountPreviousPurchases = 99000
    val amountPurchases = 1000
    val regularCustomer = true

    val cost = when (amountPreviousPurchases) {
        in 0..1000 -> if (regularCustomer) amountPurchases * discount3 else amountPurchases
        in 1001..10000 -> if (regularCustomer) (amountPurchases - discount1) * discount3 else amountPurchases - discount1
        else -> if (regularCustomer) amountPurchases * discount2 * discount3 else amountPurchases * discount2
    }

    println(cost)

}
