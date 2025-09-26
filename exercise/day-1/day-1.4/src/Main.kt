//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    soal 1
    var scoreList = arrayOf(70, 85, 90, 60, 75)
    var total = 0
    for(i in scoreList){
        total+=i
    }

    println(total)

//    soal 2
    var numberList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in numberList){
        if(i%2 !=0) continue
        println(i)
    }
    println()

//    soal 3
    var fruitList = listOf<String>("Apple", "Banana", "Mango", "Orange", "Grapes")
    for(i in fruitList){
        if(i.equals("Mango")) {
            println("Mango ditemukan!")
            break
        }
    }

//    soal 4
    var index = 10
    while(index >= 1){
        println(index)
        index--
    }
    println("Selesai!")

//    soal 5
    var studentList = listOf<String>("Andi", "Budi", "Cici", "Dedi")
    for((index, s) in studentList.withIndex()){
        println("${index + 1}. $s")
    }

}