package oop

open class Parent() {
    var id: Int? = null;
    var name: String? = null;

    constructor(id: Int, name: String): this() {
        this.name = name
        this.id = id
    }

    fun sayHello() {
        println("Hello, my name is ${this.name}")
    }

    fun sayHelloTo(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    fun countMyAge(year: Int): Int {
        return 2023 - year
    }
}

class Child(): Parent() {
    var brothers: Int? = null
    var sisters: Int? = null

    fun Intro() {
        println("Hello, my name is ${this.name}")
        println("I have ${this.brothers} and ${this.sisters}")
    }
}

fun main() {
    var parent = Parent()
    parent.id = 1
    parent.name = "Zack"

    parent.sayHello()

    var child = Child()
    child.id = 2
    child.name = "Mary"

    child.Intro()
    println("I am ${child.countMyAge(2005)} years old")
}