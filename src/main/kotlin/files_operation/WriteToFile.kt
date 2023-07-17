package files_operation

import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    writeToFile("Hello World")
    writeToFile("Another Hello World")

    appendToFile("Hello World")
    appendToFile("Another Hello World")
}

fun writeToFile(message: String) {
    try {
        var writer = FileWriter("message.txt")
        writer.write(message)
        writer.close()
    } catch (ex: Exception) {
        println("Exception: $ex")
    }
}

fun appendToFile(message: String) {
    try {
        var writer = FileWriter("message2.txt", true)
        writer.write(message + "\n")
        writer.close()
    } catch (ex: Exception) {
        println("Exception: $ex")
    }
}