//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    soal 1

    fun calculateStats(numbers: List<Int>): Map<String, Any>{
        return mapOf(
            "Total" to numbers.sum(),
            "Rata-rata" to numbers.average(),
            "Nilai maksimum" to numbers.max(),
            "Nilai minimum" to numbers.min()
        )
    }

    println(calculateStats(listOf(70,85,90,60)))
    println()
//    soal 2

    fun trianglePattern(number: Int){
        for(i in 1..number){
            for(j in 1..i){
                print('*')
            }
            println()
        }
    }

    trianglePattern(5)
    println()

//    soal 3
    fun isPalindrome(text: String): Boolean{
        return text == text.reversed()
    }

    println(isPalindrome("level"))
    println()

//    soal 4
    fun secondLargest(numbers: List<Int>): Int{
        var max = -1
        var secondMax = -1
        for(i in numbers){
            if(i > max) max = i
            if(i > secondMax && max > i) secondMax = i
        }

        return secondMax
    }

    println(secondLargest(listOf(10,30,20,50,40)))
    println()

//    soal 5
    fun countWords(sentence: String): Int{
        if(!sentence.contains(' ')) return 1

        var count = 0
        for (i in sentence){
            if(i == ' ') count++
        }

        return count+1
    }

    println(countWords("Belajar Kotlin itu mudah"))
    println()

    fun sumMatrix(matrix_1: Array<IntArray>, matrix_2: Array<IntArray>): Array<IntArray>?{
        if(matrix_1.size != matrix_2.size || matrix_1[0].size != matrix_2[0].size) return null

        var result = Array(matrix_1.size){ IntArray(matrix_1[0].size) }

        for(i in 0 until matrix_1.size){
            for(j in 0 until matrix_1[0].size){
                result[i][j] = matrix_1[i][j] + matrix_2[i][j]
            }
        }

        return result
    }


    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val matrix2 = arrayOf(
        intArrayOf(7, 8, 9),
        intArrayOf(1, 2, 3)
    )

    val sum = sumMatrix(matrix1, matrix2)

    sum?.forEach { row ->
        println(row.joinToString(" "))
    } ?: println("Matrices have different dimensions.")
}