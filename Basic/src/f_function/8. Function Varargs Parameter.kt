package f_function

/* FUNC VARARGS PARAMETER: function yang memiliki parameter bersifat dinamis.
   > Jumlah data yang akan dimasukkan ke paramater function akan dinamis sesuai kebutuhan dari user
   > Func ini memudahkan karena kita tidak harus menentukan jumlah parameter pada saat membuat function
   > Tempat parameter varargs harus berada paling akhir parameter function

   ** Memiliki konsep mirip dengan parameter Array
   > Yang membedakan ketika menggunakan array, perlu membuat array terlebih dahulu baru memasukkan ke parameter function
*/
fun hitungRerata(nama: String, vararg nilai: Int): String {
    var total = 0
    for (i in nilai) {
        total += i
    }
    val rerata = total/nilai.size-1
    return "Nilai rerata $nama = $rerata"
}
fun hitungRerataArray(nama: String, nilai: Array<Int>): String {
    var total = 0
    for (i in nilai) {
        total += i
    }
    val rerata = total/nilai.size-1
    return "Nilai rerata $nama = $rerata"
}
fun main() {
    println(hitungRerata("Iqbra",78,37,43,23))

    /* Pakai Array */
    val arrayNilai = arrayOf(78,37,43,23)
    println(hitungRerataArray("Iqbra",arrayNilai))
}