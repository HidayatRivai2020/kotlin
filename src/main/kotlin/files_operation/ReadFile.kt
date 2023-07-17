package files_operation

import java.io.FileReader
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    readFile("message2.txt")
    println("\n" + "-----------------------")
    readFromFiles("message2.txt")
}

fun readFile(path: String) {
    var reader = FileReader(path)
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        } while (char != -1)
    } catch (ex: Exception) {
        println("Exception: ${ex.message}")
    }
}

fun readFromFiles(path: String) {
    val stream = Files.newInputStream(Paths.get(path))
    stream.buffered().reader().use {
        reader -> println(reader.readText())
    }

}
