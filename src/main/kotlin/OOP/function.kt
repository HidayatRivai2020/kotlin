package OOP

fun main(args: Array<String>) {
    welcome()
    sayName("Beast")
    var my_age = getMyAge(1995)
    println("I am $my_age years old")
}

fun getMyAge(year: Int): Int {
    return 2023 - year
}

fun sayName(name: String) {
    println("Hello, My name is $name")
}

fun welcome() {
    println("Welcome To My Application")
}