package d_Percabangan

/* Percabangan: mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

   1. IF Expression
   2. ELSE Expression: akan berjalan/diproses apabila kodisi pada IF tidak terpenuhi

** IF
   if (kondisi){
       kode program
   }

** ELSE IF
   if (kondisi){
       kode program
   } else {
        kode program
   }

*/
fun main() {
    /* IF Expression */
    val nilaiUjian = 80

    if (nilaiUjian > 80){
        println("Good Job!!")
    } //Karena tidak terpenuhi, tidak menjalankan apapun

    /* IF ELSE Expression */
    if (nilaiUjian > 80){
        println("Nyontekk yaaa")
    } else {
        println("Belum beruntung kawanqyuuuh!")
    }
}