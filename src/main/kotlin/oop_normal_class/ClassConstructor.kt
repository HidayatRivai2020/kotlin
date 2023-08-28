package oop_normal_class

class House(type:String, price: Double, color: String) {
    init {
        println("Type: $type")
        println("Price: $price")
        println("Color: $color")
    }
}

fun main(){
    var myHouse = House("A", 1200000.0, "white")
}