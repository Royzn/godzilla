//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    soal 1
    var score = 85

    var result = if(score >= 90) "Nilai A" else if (score >= 75) "Nilai B" else if (score >= 60) "Nilai C" else "Tidak Lulus"
    println(result)

//    soal 2
    var input = 2
    println(if(input%2 == 0) "Genap" else "Ganjil")

//    soal 3
    var day = 2
    var dayName = when (day) {
        1 -> "Senin"      // Monday
        2 -> "Selasa"     // Tuesday
        3 -> "Rabu"       // Wednesday
        4 -> "Kamis"      // Thursday
        5 -> "Jumat"      // Friday
        6 -> "Sabtu"      // Saturday
        7 -> "Minggu"     // Sunday
        else -> "Hari tidak valid"
    }

    println(dayName)

//    soal 4
    var grade = 'B'
    println(
        when(grade){
            'A', 'B' -> "Lulus dengan baik"
            'C' -> "Lulus pas-pasan"
            'D', 'E' -> "Tidak lulus"
            else -> "Invalid Grade"
        }
    )

//    soal 5
    var month = 4
    println(
        when(month){
            12, 1, 2 -> "Musim Hujan"
            3,4,5 -> "Musim Semi"
            6,7,8 -> "Musim Panas"
            9,10,11 -> "Musim Gugur"
            else -> "Bulan tidak valid"
        }
    )
}