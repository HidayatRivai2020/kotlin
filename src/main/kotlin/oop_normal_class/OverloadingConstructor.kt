package oop_normal_class

open class Vehicle() {
    var id: Int? = null;
    var name: String? = null;
    var tire: Int? = null;

    constructor(id: Int, name: String, tire: Int): this() {
        this.name = name
        this.id = id
        this.tire = tire
    }

    constructor(name: String, tire: Int): this() {
        this.name = name
        this.id = 0
        this.tire = tire
    }

    fun Intro() {
        println("This ${this.name} with id ${this.id} has ${this.tire} tires")
    }
}

fun main() {
    var car = Vehicle(1, "car", 4)
    var car2 = Vehicle("Toy", 8)

    car.Intro()
    car2.Intro()
}