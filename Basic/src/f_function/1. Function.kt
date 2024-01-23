package f_function

/* FUNCTION: blok kode yang dibuat untuk dapat digunakan secara berulang-ulang
   -> Cara menggunakannya dengan menuliskan nama functionnya pada blok main untuk dieksekusi
    > Dalam kotlin, nama function tidak bisa sama ketika dalam 1 package yang sama, meskipun berbeda file

   ** PENULISAN
   fun namaFunction (){
       kode program
   }
*/
fun engineerPhilosophy(){
    println("If it works, don't touch!")
}
fun helloWorld(){
    println("Hello World")
}
fun main() {
    engineerPhilosophy()
    helloWorld()
}