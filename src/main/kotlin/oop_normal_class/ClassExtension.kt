package oop_normal_class

fun String.removeFirstAndLast(): String = this.substring(1, this.length - 1)
val String.newProperties: String
    get() = "this is new properties"

fun String.checkThisOut() {
    println("Yo Yo Yo! Check this out")
    println("this text ($this) is cool")
}

fun String.getSecondChar(): Char {
    return this[1]
}

fun main() {
    var text = "-Hello World-"
    println(text)
    println(text.removeFirstAndLast())
    println(text.removeFirstAndLast())

    text.checkThisOut()

    println(text.getSecondChar())
    println(text.newProperties)

}