package data_structure

fun main() {
    var myArray = Array(5){0}

    // print array from loop
    for (item in myArray) {
        println(item)
    }
    println("-------------------------")
    myArray[0] = 5
    myArray[1] = 6
    myArray[2] = 2
    myArray[3] = 3
    myArray[4] = 9

    // print array from index
    for (index in myArray.indices) {
        println("Item in index $index is ${myArray[index]}")
    }

    println("-------------------------")
    //create array from arrayOf
    var arrOf = arrayOf(1, 3, 5, "test")

    for (index in 0..arrOf.size) {
        println("Item in index $index is ${myArray[index]}")
    }
}