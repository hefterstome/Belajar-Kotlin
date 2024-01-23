package f_function

/* High order funcion memiliki kelemahan jika dilakukan berulang-ulang dalam jumlah banyak akan menyebabkan performa turun.
   > Hal ini dikarenakan dalam Java, saat compile ke binary akan membuat objek berulang-ulang.
   > Hal ini dapat diatasi dengan inline function

   INLINE FUNCTION: function yang memiliki kemampuan ketika compile, objek akan diduplikat.
    > Ketika menggunakan inline func, objek saat compile akan diduplikat sehingga saat runtime tidak akan membuat objek lagi
   -> Tidak ada syarat khusus untuk menjadikan inline
   -> Cara membuatnya dengan menambahkan kata inline sebelum fun
   -> Penggunaan inline perlu diperhatikan karena akan menambah kapasitas binary code meskipun performa akan semakin bagus
    > Ketika proses yang berjalan sederhana, tidak akan memiliki efek besar
    > Mirip konsep dengan recursive dan tail recursive

   ** Cara mengecek
      Tools > Kotlin > Show kotlin bytecode > Decompile
*/
inline fun helloInlineFunc(value: () -> String): String {
//fun helloInlineFunc(value: () -> String): String {
    return "Hello ${value()}"
}

/* NOINLINE: kunci yang digunakan agar parameter tidak menjadi inline
    > Jika menggunakan inline, maka semua akan diduplikat
    > Dengan menambahkan noinlin, maka objek tersebut akan tetap dibuat objek berulang-ulang dan tidak diduplikat
*/
inline fun helloNoinline(namaAwal: () -> String,
                         noinline namaAkhir: () -> String): String {
    return "Hello, ${namaAwal()} ${namaAkhir()}"
}
fun main() {
    println(helloInlineFunc { "Iqbra" })
    println(helloInlineFunc { "Kotlin" })

    for (i in 0..100){
        println(helloInlineFunc { "Inline" })
    }

    for (i in 0..100){
        println(helloNoinline({"Iqbra"},{"Kurniawan"}))
    }
}
