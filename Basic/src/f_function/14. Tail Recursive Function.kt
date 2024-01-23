package f_function

/* TAIL RECURSIVE FUNC: teknik mengubah recursive func agar ketika dijalankan menjadi looping biasa
   > Digunakan untuk mengatasi recursive func terkena stack overflow
   > Stack overflow karena recursive pasti ada di semua bahasa yang menganut OOP

   ** STACK OVERFLOW REC
      > Konsep recursive func: pemanggilan func itu sendiri akan terus berjalan sampai berakhir, baru dilakukan operasi.
          Contoh faktorial 5
          faktorial(5)
          faktorial(5) => 5 * faktorial(4)
          faktorial(5) => 5 * faktorial(4) => 4 * faktorial(3)
          faktorial(5) => 5 * faktorial(4) => 4 * faktorial(3) => 3 * faktorial(2)
          faktorial(5) => 5 * faktorial(4) => 4 * faktorial(3) => 3 * faktorial(2) => 2 * faktorial(1)
          faktorial(5) => 5 * faktorial(4) => 4 * faktorial(3) => 3 * faktorial(2) => 2 * faktorial(1) => 1
      > Yang terjadi adalah, akan terjadi recursive sampai bawah, setelah berakhir, baru akan dilakukan operasi ke atas satu-persatu
      > Apabila ada recursive 1 juta kali, tentunya akan membuat recursive atas sendiri menunggu hingga selesai, hal ini yang menjadi pemicu stack overflow

   ** Syarat
      1. Menambahkan tailrec sebelum fun
      2. Ketika melakukan recursive harus hanya memanggil dirinya sendiri tanpa adanya operasi dengan data/variabel lain
*/
tailrec fun recursiveDisplay(value: Int){
//fun recursiveDisplay(value: Int){
    println(value)
    if (value > 0) {
        recursiveDisplay(value-1)
    }
}
tailrec fun tailrecFaktorial(value: Int, total: Int =1): Int {
    return when (value) {
        1 -> total
        else -> (tailrecFaktorial(value-1,value*total))
    }
    /* BENTUK TAILREC FAKTORIAL
       tailrecFaktorial (5,1)
       tailrecFaktorial (4,5)
       tailrecFaktorial (3,20)
       tailrecFaktorial (2,60)
       tailrecFaktorial (1,120)
       120
    */
}
fun main() {
//    recursiveDisplay(100000) //Tanpa tail akan terkena stack overflow
    println(tailrecFaktorial(5))
}