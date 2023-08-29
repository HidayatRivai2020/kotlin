# [Data Structure](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure)

## [Array](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/Array.kt)
- Used to store multiple values in a single variable
- Can be accessed by index
- Index start from 0
- `var myArray = Array(5){0}`
  - `var` : variable keyword
  - `myArray` : array name
  - `Array` : array keyword
  - `(5)` : array size
  - `{0}` : initial value
- `myArray[index]` : get the array by its index
- `.indices` : property to get the index of array
- `.size` : property to get the length of array
- `arrayOf(params)` : create an array from parameter

## [Array List](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/ArrayList.kt)
- Used to create dynamic array
- Can be accessed by index
- Index start from 0
- Using keyword `ArrayList`
- `myArrayList[index]` : get the array list by its index
- `listOf(params)` : create immutable array list
- `mutableListOf(params)` : create mutable array list

### [Array List Method](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/ArrayListMethod.kt)
- `.add(value)` : add new value into array list
- `.contains(value)` : return true if the value has the specific words
- `.get(index)` : return the value of array list at index
- `.remove(index)` : delete the value of array list at index
- `.set(index, newValue)` : update the value of array list at index with new value

## [Hashmap](https://github.com/HidayatRivai2020/kotlin/blob/main/src/main/kotlin/data_structure/Hashmap.kt)
- Used to store `key => value` properties
- Using keyword `Hashmap`
- Using keyword `put(key, value)` to add new value
- `.keys` : get all key from the hashmap
- `.values` : get all values from the hashmap
- `myHashMap[key]` : get the hashmap values by its key
- `mapOf(key1 to value1, key2 to value2)` : create a map from parameter
- 