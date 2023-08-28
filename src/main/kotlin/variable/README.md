# [Variable](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable)
- The place where we can store information 
- The container for data or value
- variables:
  - `var`: Changeable (mutable)
  - `val`: Read Only (Immutable)

## Naming Convention
- can contain letters (a-zA-z), digits (0-9), and underscores
- can't start with a number
- must start with a letter or underscores
- can't be reserved words
- don't use words that have special meanings or already defined
- use camelCase for variable names
- use UPPERCASE for constant variable names


## [Var](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarDefinition.kt)
- `var variableName = variableValue`: declare var with value
- `var variableName:variableType? = null`: declare var without specific value
- The value of var can be changed
- The type of var can't be changed
- use `"\"` when need an escape-character in the value

## [Val](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/ValDefinition.kt)
- `val variableName = variableValue`: declare val with value
- The value and type of val can't be changed
- use `"\"` when need an escape-character in the value

### [Constants Val](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/ValDefinition.kt)
- `const val VARIABLE_NAME = variableValue`: declare constant val with value
- The value and type of val can't be changed
- Using keyword `const`
- Top level - declared outside of function
- Convention: UPPERCASE

## [Variable Type](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- the type for variable that created
- optional if the variable declared with value
- mandatory if the variable declared without value or with null

### [String](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- Text (sequence of character) data-type
- Using double quotes --> `""`

### [Integer](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- Number without decimal point data-type
- Can store the number from -2147483648 to 2147483647

### [Float](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- Number with decimal point data-type
- Can store the number up to 7 decimal digit
- Need to add `F` after decimal point

### [Double](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- Number with decimal point data-type
- Can store the number up to 15 decimal digit

### [Boolean](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- data-type that can only take the values `true` or `false`
- mostly used for conditional testing

### [Char](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/VarType.kt)
- Single Character data-type
- Using single quotes = `''`

## [Type Conversion](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/TypeConversion.kt)
- convert variables data-type into another data-type
- Using function:
  - `.toString()` --> convert data-type into String
  - `.toFloat()` --> convert data-type into Float
  - `.toDouble()` --> convert data-type into Double
  - `.toInt()` --> convert data-type into Integer
  - `.toBoolean()` --> convert data-type into Boolean
  - `.toChar()` --> convert data-type into Char

## [Read Input](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/variable/UserInput.kt)
- Variable declaration with read input
- Using method read-line = `readln()`
- `var newVariable = readln()`
- default type of readln() is string