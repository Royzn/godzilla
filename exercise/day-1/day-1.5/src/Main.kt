//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    soal 1
    fun calculateRectangleArea(length: Int, width: Int): Int{
        return length * width
    }

    println(calculateRectangleArea(8, 5))

//    soal 2
    fun checkEvenOdd(number: Int): String{
        return if(number%2 == 0) "Genap" else "Ganjil"
    }

    println(checkEvenOdd(7))

//    soal 3
    fun sayHi(name: String = "Guest"){
        println("Hi, $name!")
    }

    sayHi(); sayHi("Udin")

//    soal 4
    fun square(n: Int) = n * n
    println(square(9))

//    soal 5
    fun sumList(numbers: List<Int>): Int{
        var total = 0
        for(i in numbers){
            total+= i
        }
        return total
    }

    print(sumList(listOf(1,2,3,4,5)))
}