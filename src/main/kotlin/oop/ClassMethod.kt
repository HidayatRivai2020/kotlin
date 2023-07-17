package oop

class Person(name: String) {
    var name: String? = null;

    init {
        this.name = name
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

fun main() {
    var person = Person("Zack")
    person.sayHello()
    person.sayHelloTo("Elli")

    var myAge = person.countMyAge(1995)
    println("I am $myAge Years Old")
}