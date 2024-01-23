package e_perulangan

/* WHILE LOOP: perulangan yang bersifat fleksibel dengan melakukan pengecekan suatu kondisi
   -> Jika bernilai true akan menjalankan blok while dan akan terus berputar sampai kondisi while bernilai false
*/

fun main() {
    var i = 0

    while (i < 5){
        println("While loop ke-${i+1}")
        i++
    }
}