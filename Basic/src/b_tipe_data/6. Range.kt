package b_Tipe_Data

/* Range: tipe data yang dipakai ketika ingin membuat array dengan data terurut.
   -> Range 0 sampai 100 => 0..100

** Operasi Range
   1. count()            : mendapat total data di range
   2. contains(value)    : mengecek apakah value ada di range
   3. first              : mendapat nilai pertama dari range
   4. last               : mendapat nilai terakhir dari range
   5. step               : mendapat nilai setiap kenaikan/beda
*/
fun main() {
    /* Range sederhana */
    val range = 0..100
    println(range)

    /* Range sederhana terbalik */
    val rangeTerbalik = 100 downTo 0
    println(rangeTerbalik)

    /* Range dengan step */
    val rangeStep5 = 0..100 step 5
    val rangeStep3 = 100 downTo 0 step 3
    println(rangeStep5)
    println("${rangeStep5.count()}")
    println("${rangeStep5.first()}")
    println("${rangeStep5.last()}")
    println("${rangeStep5.step}")
    println("${rangeStep5.contains(11)}")

}
