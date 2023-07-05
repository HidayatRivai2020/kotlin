package Operations

fun main(args: Array<String>) {
    var firstName = "Jack"
    var lastName = "Night"
    var fullName = firstName + lastName
    println(fullName)
    var newString = "My Name is $firstName $lastName"
    println(newString)

    var anotherString = "You can call me ${firstName.uppercase()}"
    println(anotherString)
}