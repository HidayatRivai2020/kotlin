package oop

abstract class ImageObject {
    abstract fun draw(obj: String)
    abstract fun resize()
}

class Photo : ImageObject() {
    override fun draw(obj: String) {
        println("Drawing $obj")
    }

    override fun resize() {
        println("Resizing the Image")
    }

}

fun main() {
    var photo = Photo()
    photo.draw("Cube")
    photo.resize()
}