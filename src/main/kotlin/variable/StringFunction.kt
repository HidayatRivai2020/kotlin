package variable

fun main(args: Array<String>) {
    var tooManySpace = "    Test     "
    var helloGuys = "hello guys"
    println(tooManySpace)
    println(helloGuys)

    println("-----------------------------------------------------")

    var myTrim = tooManySpace.trim()
    print("\"$tooManySpace\".trim() = ")
    println(myTrim)

    // should be replaced with indexing varTrim[2]
    print("\"$myTrim\".get(2) = ")
    var myThirdChar = myTrim.get(2)
    println(myThirdChar)

    print("\"$helloGuys\".substring(3, 6) = ")
    var mySubString = helloGuys.substring(3, 6)
    println(mySubString)

    print("\"$helloGuys\".substring(3) = ")
    var mySubString2 = helloGuys.substring(3)
    println(mySubString2)

    print("\"$helloGuys\".uppercase() = ")
    var myUpperCase = helloGuys.uppercase()
    println(myUpperCase)

    print("\"$helloGuys\".lowercase() = ")
    var myLowerCase = myUpperCase.lowercase()
    println(myLowerCase)
}