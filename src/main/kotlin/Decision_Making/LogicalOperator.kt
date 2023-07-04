package Decision_Making

fun main(args: Array<String>) {
    println("Set the value: ")
    var num: Int = readln().toInt()

    println("Set the value 2: ")
    var num2: Int = readln().toInt()

    println("Set the value 3: ")
    var num3: Int = readln().toInt()

    if (num > num2 && num > num3) {
        println("$num is the biggest value")
    } else {
        println("$num is not the biggest value")
    }

    if (num > num2 || num > num3) {
        println("$num is not the smallest value")
    } else {
        println("$num is the smallest value")
    }

    if (!(num == num2 && num == num3)) {
        println("the three numbers have different values")
    } else {
        println("the three numbers have the same values")
    }


}