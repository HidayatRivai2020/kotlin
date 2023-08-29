package oop_normal_class

// primary constructor
class House(type:String, price: Double, color: String) {
    init {
        println("Type: $type")
        println("Price: $price")
        println("Color: $color")
    }
}

// primary and secondary constructor
class Phone() {
    constructor(type: String, color: String) : this() {
        println("Type: $type")
        println("Color: $color")
    }
}

class Persona(name: String) {

    init {
        println("Hi, my name is $name")
    }
    constructor(realName: String, anotherName: String) : this(realName) {
        println("but you can call me $anotherName")
    }
}

// secondary constructor
class Computer {
    constructor(type: String, color: String) {
        println("Type: $type")
        println("Color: $color")
    }
}


fun main(){
    var myHouse = House("A", 1200000.0, "white")
    var myPhone = Phone("Android", "white")
    var myPersona = Persona("Jack", "Night")
    var myComputer = Computer("Gaming", "Black")
}