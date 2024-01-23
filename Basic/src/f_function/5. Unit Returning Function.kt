package f_function

/* Function terdiri dari 2: function yang mengembalikan dan function yang tidak mengembalikan

   UNIT: untuk penanda sebuah fungsi tidak mengembalikan apa-apa.
   > Secara default, ketika sebuah function tidak mengembalikan apa-apa, sebenarnya function tersebut mengembalikan data tipe data unit.
   > Unit tidak wajib ditulis, karena hanya sebagai penanda saja
*/
fun holla(nama: String): Unit {
//fun holla(nama: String){
    println("Holla, $nama")
}
fun main() {
    holla("Iqbra")
}