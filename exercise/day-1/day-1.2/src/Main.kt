//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //bagian 1

    var length = 7
    var width = 4

    println("Luas Persegi Panjang: ${length*width}")

    var radius = 10
    println("Keliling Lingkaran: ${2 * 3.14 * radius}")

    println("Sisa Pembagian: ${200%7}")

//    bagian 2
    var x = 100
    var y = 200

    println("X lebih kecil dari Y: ${x < y}")

    var temp = 36.5
    println("Apakah suhu 37: ${temp == 37.0}")

    var a = 50; var b = 50
    println("Apakah A dan B sama: ${a == b}")

//    bagian 3
    var isSunny = true; var isRaining = false

    println("Is it sunny?: ${isSunny && !isRaining}")

    var hasMoney = true; var isStoreOpen = false
    println("Can we go shop?: ${hasMoney && isStoreOpen}")

    var isWeekend = true; var isHoliday = false
    println("Is it free day-off?: ${isWeekend || isHoliday}")
//    bagian 4
    var num = 8
    num += 5
    num *= 2
    num -= 3
    num /= 5
    println(num)

    var price = 1000
    price -= price * 20/100
    println(price)

//    bagian 5
    var counter = 10
    counter++;counter++
    counter--;counter--;counter--
    println(counter)

    var points = 0
    points++;points++;points++;points++;points++
    points--
    println(points)
}