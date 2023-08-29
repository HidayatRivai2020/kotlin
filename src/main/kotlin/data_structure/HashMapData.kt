package data_structure

fun main(args: Array<String>) {
    var hashMap = HashMap<String, Int>()
    hashMap.put("Jack", 1)
    hashMap.put("John", 5)
    hashMap.put("James", 9)
    hashMap.put("Jerry", 20)

    println(hashMap["james"])
    for (i in hashMap) {
        println("${i.key} ==> ${i.value}")
    }

    for (i in hashMap.keys) {
        println("$i ==> ${hashMap[i]}")
    }

    for (i in hashMap.values) {
        println("values : $i")
    }

    println("------------------------")
    var newHashMap = hashMapOf(1 to "Red", 5 to "Yellow", 10 to "green")
    for (i in newHashMap) {
        println("${i.key} ==> ${i.value}")
    }
}