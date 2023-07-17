package decision_making

fun main(args: Array<String>) {
    println("Set the value: ")
    var num: Int = readln().toInt()

    if (num <= 10) {
        println("the value is $num")
    } else {
        println("invalid value")
    }

    if (num == 10) println("Perfect Score") else println("Nice Try")
}