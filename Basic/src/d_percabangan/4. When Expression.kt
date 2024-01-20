package d_Percabangan

/* Percabangan: mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

   4. WHEN Expression: untuk melakukan pengecekan pada konsisi satu variable/value
      -> Dalam Java disebut SWITCH CASE
      -> Jika semua tidak terpenuhi akan masuk ke ELSE
*/
fun main() {
    /* WHEN Expression */
    val indeks = 'D'

    when (indeks) {
        'A' -> {
            println("Kok keren luh!!??")
        }
        'B' -> println("B AJAHHH")
        'C' -> println("CONTEKAN LU SALAH LOL!")
        'D' -> println("DO AJA LU, GA NIAT!!")
        'Z' -> println("GILA Z APA WOY!!?")
        else -> println("INPUT YANG BENER!!!")
    }

    /* WHEN Multiple Option: digunakan untuk mempersingkat kode apabila suatu value memiliki blok kode IF yang akan dijalankan sama */
    when (indeks) {
        'A','B' -> println("Okeehh, boleh lulus lu")
        'C', 'D', 'E' -> println("Yaaaa, no komen dah guwee")
        else -> println("MAU GUWE TABOK!? INPUT YG BENER G JLS")
    }
}