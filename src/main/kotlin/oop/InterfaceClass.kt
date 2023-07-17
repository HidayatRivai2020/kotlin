package oop

interface Tech {
    fun clicked();
    fun powerOff();
    fun powerOn();
}

class GameStation: Tech {
    override fun clicked() {
        println("Button Clicked")
    }

    override fun powerOff() {
        println("Turn Off")
    }

    override fun powerOn() {
        println("Turn On")
    }
}

class Computer: Tech {
    override fun clicked() {
        println("Keypad Clicked")
    }

    override fun powerOff() {
        println("Shut Down")
    }

    override fun powerOn() {
        println("Turn On")
    }
}

fun main() {
    var game = GameStation()
    game.clicked()

    var computer = Computer()
    computer.powerOn()
}