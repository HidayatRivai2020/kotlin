package data_structure

fun main(args: Array<String>) {
    var myArrayList = ArrayList<String>()

    // add
    myArrayList.add("test")
    myArrayList.add("hello")
    myArrayList.add("world")

    // contains
    if (myArrayList.contains("world")) {
        println("yes, the array list have 'world'")
    } else {
        println("no, the array list does not have 'world'")
    }

    // get
    println(myArrayList.get(1))

    // remove
    myArrayList.add("test")
    println(myArrayList[0])

    // set
    myArrayList.set(1, "new-value")
    println(myArrayList.get(1))


}