package c_Operator

/* Logika: digunakan untuk membandingan dua value boolean
   -> Hasilnya akan tipe data boolean

** Operasi
   1. && : dan
   2. || : atau
   3. !  : negasi/kebalikan
*/
fun main() {
    val nilaiUjian = 97
    val nilaiAbsen = 20
    val nilaiProjek = 96

    val lulusUjian = nilaiUjian >= 85
    val lulusAbsen = nilaiAbsen >= 20
    val lulusProjek = nilaiProjek >= 80

    //Jika terdapat operator lebih dari 2, akan dieksekusi dari kiri
//    val lulusMK = lulusUjian && lulusAbsen
    val lulusMK = lulusUjian && lulusAbsen && lulusProjek
//    val lulusMK = lulusUjian && lulusAbsen || lulusProjek
//    val lulusMK = lulusUjian || lulusAbsen && lulusProjek
    println(lulusMK)

    val boolean = true
    println(!boolean)

}