package f_function

/* SINGLE EXPRESSION FUNC: function yang memiliki 1 baris kode saja.
   > Biasanya function-function yang sederhana
   -> Memakai tanda sama dengan (=) untuk pemisah function dan kode programnya
*/
fun powerSingleExp(a: Int, b: Int): Int = a*b
fun helloSingleExp(value: String): Unit = println("Hello $value")
fun main() {
    val hasil = powerSingleExp(4,5)
    println(hasil)
    helloSingleExp("Kotlin")
}