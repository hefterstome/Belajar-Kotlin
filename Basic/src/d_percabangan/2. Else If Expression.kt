package d_Percabangan

/* Percabangan: mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

   3. ELSE IF Expression: akan mengecek kembali suatu kondisi
      -> Jika semua tidak terpenuhi akan masuk ke ELSE

   if (kondisi){
       kode program
   } else if (kondisi) {
        kode program
   } else {
        kode program
   }
*/

fun main() {
    /* ELSE IF Expression */
    val nilaiUjian = 80

    if (nilaiUjian > 95){
        println("Nyontekk banget ini mah!")
    } else if (nilaiUjian > 80){
        println("Hokkyy banget lu!")
    } else if (nilaiUjian > 65){
        println("Contekan lu salah kalii!")
    } else {
        println("Belum beruntung kawanqyuuuh!")
    }
}