package c_Operator

/* Bitewise: operasi yang prosesnya memakai kode binary
   -> Cara kerja, value akan dikonversi ke bilangan biner, kemudian baru dilakukan operasi

** Operasi
   1. and   : dan
   2. or    : atau
   3. xor   : esklusif or (false jika true-true)
   4. inv   : invers, kebalikan dari nilai binernya
   5. shr   : shift right, menambahkan biner 0 dari kanan
   5. shl   : shift left, menambahkan biner 0 dari kiri
 */

fun main() {
    val numb = 11

    /* Merubah ke biner */
    val binerNumb = String.format("%8s",Integer.toBinaryString(numb)).replace(oldChar = ' ', newChar = '0')
    println("$binerNumb  = $numb")

    /* Invers */
    val inversNumb = numb.inv()
    println("Invers $numb = $inversNumb")

    /* Operasi Shift Right */
    val shrNumb = numb.shr(2)
    val shrNumbB = String.format("%8s",Integer.toBinaryString(shrNumb)).replace(oldChar = ' ', newChar = '0')
    println("$binerNumb shr(2) = $shrNumbB {$shrNumb}")

    /* Operasi XOR */
    val numb2 = 19
    val hasil = numb xor numb2
    val binerNumb2 = String.format("%8s",Integer.toBinaryString(numb2)).replace(oldChar = ' ', newChar = '0')
    val binerHasil = String.format("%8s",Integer.toBinaryString(hasil)).replace(oldChar = ' ', newChar = '0')

    println()
    println("$binerNumb  = $numb")
    println("$binerNumb2  = $numb2")
    println("================ XOR")
    println("$binerHasil  = $hasil")




}