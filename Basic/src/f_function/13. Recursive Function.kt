package f_function

/* RECURSIVE FUNC: function yang memanggil function dirinya sendiri.
   > Contoh kasus yang lebih mudah menggunakan recursive adalah faktorial
   > Kekurangan recursive adalah memungkinkan terkena eror stack overflow apabila pemanggilan dirinya sendiri terlalu dalam
*/

fun loopFaktorial(value: Int): Int {
    var total = 1
    for (i in value downTo 1){
        total *= i
    }
    return total
}
fun recursiveFaktorial(value: Int): Int {
    return when (value){
        1 -> 1
        else -> value * (recursiveFaktorial(value - 1))
    }
}
fun main() {
    println(loopFaktorial(5))
    println(recursiveFaktorial(5))
}