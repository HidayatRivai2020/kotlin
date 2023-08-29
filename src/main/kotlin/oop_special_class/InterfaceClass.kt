package oop_special_class

interface Tech {
    var series: Int

    fun clicked();
    fun powerOff();
    fun powerOn();

    fun showSeries() {
        println("The series: $series")
    }
}

class GameStation: Tech {
    override var series: Int = 1

    override fun clicked() {
        println("Button Clicked. computer series $series")
    }

    override fun powerOff() {
        println("Turn Off")
    }

    override fun powerOn() {
        println("Turn On")
    }

}

class Computer: Tech {
    override var series: Int = 12
    override fun clicked() {
        println("Keypad Clicked. computer series {$series} ")
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
    computer.showSeries()
}