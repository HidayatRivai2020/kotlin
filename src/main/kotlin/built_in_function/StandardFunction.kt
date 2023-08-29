package built_in_function

fun main(args: Array<String>) {
    print("inline - ")
    println("new line -")

    var test = readln()
    println(test)

    var arrOf = arrayOf(1, 3, 5, "test")
    println(arrOf)

    var names = listOf<String>("Jack", "James", "John", "Jimmy")
    println(names)

    var anotherNames = mutableListOf<String>("Karen", "Elli", "Marie", "Ann")
    println(anotherNames)

}