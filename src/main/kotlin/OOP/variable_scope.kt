package OOP

var myVar = "this is global variable"

fun main() {
    myLocal("this is local variable")
    myGlobal()
}

fun myGlobal() {
    println(myVar)
}

fun myLocal(myVar: String) {
    println(myVar)
}