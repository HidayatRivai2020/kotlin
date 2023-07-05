package OOP

open class Animal() {
    var name:String = ""
    private var color:String = ""
    protected var numLegs:Int = 0
    constructor(name: String, numLegs: Int) : this() {
        this.name = name
        this.numLegs = numLegs
    }

    fun IntroWithColor() {
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

    fun Intro() {
        println("${this.name} has ${this.numLegs} legs")
    }
}

fun main() {
    var animal = Animal("Jerry", 2)
    animal.setColor("Blue")
    animal.IntroWithColor()
    var cat = Cat("Tom", 2)
    cat.Intro()
}