package oop_special_class

enum class Cards {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

fun main() {
    var card = Cards.DIAMONDS
    println("your card is is $card")
    println("your card is is ${card.name}")
    println("your card is is ${card.ordinal}")
    println("your card is is ${card.declaringClass}")
}