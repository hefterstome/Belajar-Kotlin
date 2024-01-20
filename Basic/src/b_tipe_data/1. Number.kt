package b_Tipe_Data

fun main() {
    /*  INTEGER: untuk bilangan bulat */
    val byte: Byte = 1 //Ditetapkan sebagai byte
    val short: Short = 500 //Ditetapkan sebagai short
    val integer = 20
    val longA =  1000000000000 //Long, karena melebihi nilai max integer
    val longB = 20L //Long, karena penambahan L

    /*  FLOATING: untuk bilangan koma */
    val phi = 3.14
    val double = 3.666
    val float = 3.666F //Float, karena penambahan F

    /*  UNDERSCORE: untuk memudahkan dalam pencacahan/melihat angka manual*/
    val umur: Byte = 2_0
    val tinggi: Short = 1_7_0
    val nilai = 8_0
    val uang = 1_000_000_000L
    val juta = 1_000_000
    val nim = 22_31_73_0011

    /*  LITERAL: untuk mengidentifikasi bilangan komputer */
    val decimalLiteral = 100
    val hexadecimalLiteral = 0xFF
    val binaryLiteral = 0b0011

    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    /*  CONVERSION: untuk melakukan konversi tipe data */
    val number = 100
    val numberByte = number.toByte()
    val numberShort = number.toShort()
    val numberLong = number.toLong()
    val numberFloat = number.toFloat()
    val numberDouble = number.toDouble()

    println(numberFloat)

}
