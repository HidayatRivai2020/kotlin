package oop_special_class

class Auth<T>(user: T, pass: T) {
    init {
        println("User:$user and Pass: $pass")
    }
}

fun main() {
    var auth1 = Auth<String>("Stu", "Dent")
    var auth2 = Auth<Int>(1, 2)
    var auth3 = Auth<Boolean>(true, false)
}