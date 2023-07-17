package oop

class ClassNoConstructor() {
    var name: String? = null
    var size: Int? = null
    var alias: String? = null
}

class ClassWithConstructor(no: Int, name: String, isUpdated: Boolean) {
    var no: Int? = null
    var name: String? = null
    var isUpdated: Boolean? = null

    init {
        this.no = no
        this.name = name
        this.isUpdated = isUpdated
    }
}

fun main() {
    var myClass = ClassNoConstructor()
    myClass.name = "Box"
    myClass.size = 20
    myClass.alias = "cube"
    println("Result: ${myClass.name}, ${myClass.size}, ${myClass.alias}")

    var anotherClass = ClassWithConstructor(1, "Phone", false)
    println("Result: ${anotherClass.no}, ${anotherClass.name}, ${anotherClass.isUpdated}")

}