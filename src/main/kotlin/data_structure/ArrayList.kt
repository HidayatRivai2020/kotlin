package data_structure

fun main(args: Array<String>) {
    var myArrayList = ArrayList<String>()
    myArrayList.add("test")
    myArrayList.add("hello")
    myArrayList.add("world")

    println("value in index 1: ${myArrayList[1]}")
    for (a in myArrayList) {
        println("name: $a")
    }

    println("----------------------------")
    // immutable list
    var names = listOf("Jack", "James", "John", "Jimmy")
    for (a in names) {
        println("name: $a")
    }
    println(names[0])

    println("----------------------------")
    // mutable list
    var anotherNames = mutableListOf("Karen", "Elli", "Marie", "Ann")
    anotherNames.add(5, "Popuri")
    anotherNames[2] = "Mary"
    for (a in anotherNames) {
        println("name: $a")
    }

}