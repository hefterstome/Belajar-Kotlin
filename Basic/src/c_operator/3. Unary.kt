package c_Operator

/* Unary: operator untuk melakukan pertambahan atau pengurangan yang bernilai 1
   1. (++) => Tambah 1
   2. (--) => Kurang 1
   3. (+)  => Menunjukkan bilangan positif, tidak perlu dilakukan karena sudah default positif
   4. (-)  => Menunjukkan bilangan negatif
   5. (!)  => Negasi/untuk membalikkan value tipe boolean
*/
fun main() {
    var unary = 10
    unary--
    println(unary)
    unary++
    println(unary)

    var unary2 = -9
    println(unary2++) //Tidak bisa dilakukan
    unary2++
    println(unary2)

    var unaryBoolean = false
    println(!unaryBoolean)

}