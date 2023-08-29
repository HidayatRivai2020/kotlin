package oop_normal_class

open class Parent() {
    var id: Int? = null;
    var name: String? = null;

    constructor(id: Int, name: String): this() {
        println("Scan the Identity")
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

    fun intro() {
        println("Hello, my name is ${this.name}")
        println("I have ${this.brothers} and ${this.sisters}")
    }
}

class Son(id: Int, name: String, toys: Int) : Parent(id, name) {
    var toys: Int = 0

    init {
        this.toys = toys
        println("Hello, my name is ${this.name}")
        println("I have ${this.toys} Toys")
    }
}

class Daughter : Parent {

    init {
        println("I don't have toy")
    }

    constructor(id: Int, name: String) : super(id, name) {
        println("Hmm mm..")
    }
}

fun main() {
    var parent = Parent()
    parent.id = 1
    parent.name = "Zack"
    parent.sayHello()
    println("-----------------")

    var child = Child()
    child.id = 2
    child.name = "Mary"
    child.intro()
    child.sayHelloTo("Stu")
    println("I am ${child.countMyAge(2005)} years old")
    println("-----------------")

    var parent2 = Parent(3, "mayor")
    parent2.sayHello()
    println("-----------------")

    var son = Son(3, "stu", 5)
    son.sayHello()
    println("-----------------")

    var daughter = Daughter(3, "Aja")
    daughter.sayHello()
}