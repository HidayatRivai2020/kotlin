package oop_normal_class

open class Animal() {
    var name:String = ""
    var nickname:String = "" // redundant public modifier
    private var color:String = ""
    protected var numLegs:Int = 0
    constructor(name: String, numLegs: Int, nickname: String) : this() {
        this.name = name
        this.nickname = nickname
        this.numLegs = numLegs
    }

    fun introWithColor() {
        println("${this.name} has ${this.color} and ${this.numLegs} legs")
        showOnlyName()
        callMyName()
    }

    private fun callMyName() {
        println("Hello, you can call me ${this.nickname}")
    }

    protected fun showOnlyName() {
        println("Hello, my name is ${this.nickname}")
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
        println("${this.name} has ${this.numLegs} legs") // can't show color because it is private
        showOnlyName() // can call showOnly name because it is protected, inherited from animal class
        // calMyName can't be called because it is private
    }
}

fun main() {
    var animal = Animal("Jerry", 2, "Jer")
    animal.setColor("Blue")
    animal.introWithColor()

    var cat = Cat("Tom", 2)
    cat.nickname = "Thomas"
    cat.intro()
}