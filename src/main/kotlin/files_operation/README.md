# [Files Operation](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure)
- Write into file
- Read into file

## [Write into file](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/WriteToFile.kt)
- `FileWriter(path: String)` : use FileWriter class to write a file in the path
- `FileWriter(path: String, append: Boolean)` : use FileWriter class to append a string into file path if `append` is true
- `.write(message: String)` : write a message into file writer
- `.close()` : close connection of FileWriter

## [Read file](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/ReadFile.kt)
- `FileReader(path: String)` : use FileReader class to read a file from path
  - `read()` : read one character from the reader object
- `Files.newInputStream(path)` : use newInputStream from Files library