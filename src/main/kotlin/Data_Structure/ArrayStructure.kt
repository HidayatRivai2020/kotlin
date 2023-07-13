package Data_Structure

fun main() {
    var myArray = Array<Int>(5){0}

    for (item in myArray) {
        println(item)
    }
    println("-------------------------")
    myArray[0] = 5
    myArray[1] = 6
    myArray[2] = 2
    myArray[3] = 3
    myArray[4] = 9

    for (index in myArray.indices) {
        println("Item in index $index is ${myArray[index]}")
    }
}