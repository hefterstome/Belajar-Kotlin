package d_Percabangan

/* Percabangan: mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

   4. WHEN Expression: untuk melakukan pengecekan pada kondisi satu variable/value
      -> Dalam Java disebut SWITCH CASE
      -> Jika semua tidak terpenuhi akan masuk ke ELSE
*/
fun main() {
    /* WHEN Expression */
    var indeks = 'D'

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

    /* WHEN Multiple Option: untuk mempersingkat kode apabila suatu value memiliki blok kode IF yang akan dijalankan sama */
    when (indeks) {
        'A','B','C' -> println("LULUS")
        else -> {
            println("TIDAK LULUS")
        }
    }

    /* WHEN Expression IN: untuk mengecek apakah value ada pada array
       -> in, !in
    */
    indeks = 'G'
    val indeksLulus = arrayOf('A','B','C')

    when (indeks){
        in indeksLulus -> println("LULUS")
//        else -> println("TIDAK LULUS")
        !in indeksLulus -> println("TIDAK LULUS")
    }

    /* WHEN Expression IS: untuk mengecek apakah tipe data dari value
   -> is, !is
    */
    val value1 = 2
    when (value1){
        is Int -> println("Ya, $value1 adalah integer")
        !is Int -> println("No, $value1 bukan integer")
    }
    val value2 = "Iqbra"
    when (value2){
        is String -> println("Ya, $value2 adalah character")
        else -> println("No, $value2 bukan character")
    }
    /* Error jika tidak sesuai, artinya when exp is harus memiliki tipe data tyang sama */
//    val value3 = 10.2F
//    when (value3){
//        is Double -> println("Ya, $value3 adalah double")
//        else -> println("No, $value3 bukan double")
//    }
    val value4 = 2L
    when (value4){
        is Long -> println("Ya, $value4 adalah long")
        !is Long -> println("No, $value4 bukan long")
    }

    /* WHEN Sebagai Pengganti IF ELSE
       -> Diperlukan apabila pengecekan tidak terfokus pada kondisi 1 variabel/value
       -> Tidak diperlukan variable when
    */
    val nilai = 67
    when {
        nilai == 100 -> println("A+")
        nilai >90 -> println('A')
        nilai > 80 -> println("B+")
        nilai > 70 -> println('B')
        nilai > 55 -> println('C')
        nilai > 40 -> println('D')
        else -> println("MENGULANG")
    }

}