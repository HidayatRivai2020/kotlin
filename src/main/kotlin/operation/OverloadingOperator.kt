package operation

fun main() {
    val point1 = Point(10, -4)
    val point2 = Point(3, 8)

    val sum = point1 + point2
    println("Sum: ${sum.x}, ${sum.y}")

    val anotherSum = point1.plus(point2)
    println("Another Sum: ${anotherSum.x}, ${anotherSum.y}")
}

class Point(val x:Int = 0, val y: Int = 12) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }
}