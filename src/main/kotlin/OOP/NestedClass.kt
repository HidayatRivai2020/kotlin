package OOP

class OuterClass {
    val myString = "Outside variable"

    class NestedClass {
        var newString = "Inside Nested Class"
        fun callInside() = "Function called from inside nested class"
    }

}

fun main() {
    var outerClass = OuterClass()
    var nestedClass = OuterClass.NestedClass()

    println(outerClass.myString)
    println(nestedClass.newString)
    println(nestedClass.callInside())
}