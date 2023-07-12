package OOP

class CompanionObject {
    companion object {
        fun companionObjectWithoutName() = println("call this method without creating an object")
    }
}

class AnotherCompanionObject {
    companion object AnotherCompanion {
        fun companionObjectWithName() = println("Using Another Companion, call this method without creating an object")
    }
}

fun main() {
    CompanionObject.companionObjectWithoutName()
    AnotherCompanionObject.companionObjectWithName()
}