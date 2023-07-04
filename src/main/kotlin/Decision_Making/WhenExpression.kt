package Decision_Making

fun main(args: Array<String>) {
    println("choose your prize: ")
    var num:Int = readln().toInt()

    when(num) {
        1 -> println("car")
        2 -> println("motor")
        3 -> println("house")
        4 -> println("boat")
        else -> println("junk")
    }
}
