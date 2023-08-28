package oop_normal_class

open class Animal() {
    var name:String = ""
    private var color:String = ""
    protected var numLegs:Int = 0
    constructor(name: String, numLegs: Int) : this() {
        this.name = name
        this.numLegs = numLegs
    }

    fun introWithColor() {
        println("${this.name} has ${this.color} and ${this.numLegs} legs")
    }

    fun setColor(color: String) {
        this.color = color
    }
}

class Cat : Animal {
    constructor(name: String, numLegs: Int): super() {
        this.name = name
        this.numLegs = numLegs
    }

    fun intro() {
        println("${this.name} has ${this.numLegs} legs")
    }
}

fun main() {
    var animal = Animal("Jerry", 2)
    animal.setColor("Blue")
    animal.introWithColor()
    var cat = Cat("Tom", 2)
    cat.intro()
}