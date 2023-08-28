package oop_normal_class

fun main(args: Array<String>) {
    welcome()
    sayName("Beast")
    var my_age = getMyAge(1995)
    println("I am $my_age years old")
    println(inlineMethod())
}

// function with return
fun getMyAge(year: Int): Int {
    return 2023 - year
}

// function without return
fun sayName(name: String) {
    println("Hello, My name is $name")
}

// function without parameter
fun welcome() {
    println("Welcome To My Application")
}

// inline function
fun inlineMethod() = "This is an inline method"