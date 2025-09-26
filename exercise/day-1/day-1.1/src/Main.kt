//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // bagian 1

    var studentName: String = "Royzen Anggatama"
    var age: Int = 21
    var temperature: Float = 36.7f
    var isGraduated: Boolean = false
    var grade: Char = 'A'

    println("Student Name: $studentName")
    println("Age: $age")
    println("Body Temperature: $temperature °C")
    println("Graduated: $isGraduated")
    println("Grade: $grade")

    //bagian 2

    var population: Long = 273_000_000
    var smallNumber: Short = 32000
    var tinyValue: Byte = 127
    println("Population: $population, small number: $smallNumber, tinyValue: $tinyValue")

    //bagian 3
    var nickname: String ?= null
    println("Nickname: $nickname")
    nickname = "roy"
    println("Nickname: $nickname")

    //bagian 4
    var numbers: Array<Int> = arrayOf(1,2,3,4,5)
    var listOfFruits: List<String> = listOf("Apple", "Banana", "Mango")
    var mutableListOfScores: MutableList<Int> = mutableListOf(80, 85, 90)
    mutableListOfScores.add(95)

    var setOfNumbers: Set<Int> = setOf(1,2,2,3,3,4)
    var mapOfStudent: Map<String, Int> = mapOf("Math" to 90, "Science" to 85)

    println("Array of numbers: ${numbers.joinToString()}")
    println("List of fruits: $listOfFruits")
    println("Mutable list of scores: $mutableListOfScores")
    println("Set of numbers (no duplicates): $setOfNumbers")
    println("Map of subjects and scores: $mapOfStudent")

    //bagian 5
    var city = "Jakarta"
    var year = 2025
    var pi = 3.14159
    println("City: $city, Year: $year, Pi: $pi")

    var isLoggedIn = false
    println(isLoggedIn)
    isLoggedIn = true
    println(isLoggedIn)

    var charList = arrayOf("R", "O", "Y", "Z", "E", "N")
    println(charList.joinToString(""))

    //bagian 6
    var studentInfo: MutableMap<String, Any> = mutableMapOf("name" to "Royzen", "age" to 21, "score" to 100)
    studentInfo["isGraduated"] = true
    println(studentInfo)

    var grades = arrayOf("A", "B", "C", "D", "E")
    println("First: ${grades[0]}, Last: ${grades[grades.lastIndex]}")

    var hobbies = mutableListOf<String>("Main", "Makan", "Jalan")
    hobbies.remove("Makan")
    println(hobbies)

}