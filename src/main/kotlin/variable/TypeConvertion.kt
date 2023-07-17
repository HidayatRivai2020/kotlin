package variable

fun main(args: Array<String>) {
    var myInt = 2023
    println(myInt)

    var myString = myInt.toString()
    println(myString)

    var myFloat = myInt.toFloat()
    println(myFloat)

    var myDouble = myInt.toDouble()
    println(myDouble)

    var myNewInt = myDouble.toInt()
    println(myNewInt)
}