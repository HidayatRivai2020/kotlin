package OOP

fun String.removeFirstAndLast(): String = this.substring(1, this.length - 1)

fun main() {
    var text = "-Hello World-"
    println(text)
    println(text.removeFirstAndLast())
    println(text.removeFirstAndLast())
}