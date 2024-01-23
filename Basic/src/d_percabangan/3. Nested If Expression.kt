package d_Percabangan

/* NESTED IF: IF di dalam IF, mengecek suatu kondisi dengan variable/value berbeda
   -> Dipakai untuk melakukan percabangan lebih kompleks dari ELSE IF

if (kondisi){
    if (kondisi){
        kode program
    } else {
        kode program
    }
} else {
    kode program
}
*/

fun main() {
    val ujian = 79
    val projek = 90

    if (ujian>80 && ujian<=100){
        if (projek>85 && projek<=100){
            println("LULUS Ujian dan LULUS Projek")
        } else {
            println("LULUS Ujian dan TIDAK LULUS Projek")
        }
    } else if (projek>85 && projek<=100){
        println("TIDAK LULUS Ujian dan LULUS Projek")
    } else {
        println("TIDAK LULUS Ujian dan TIDAK LULUS Projek")
    }
}