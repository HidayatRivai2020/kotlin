package oop

class Outer() {
    val myString = "this is String from Outer Class"

    inner class InnerClass() {
        fun getString() = "$myString and called from innerclass"
    }
}

fun main() {
    val outer = Outer()
    println(outer.myString)

    val innerClass = Outer().InnerClass()
    println(innerClass.getString())
}