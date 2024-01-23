package e_perulangan

/* CONTINUE: untuk keluar/menghentikan perulangan yang sedang berjalan dan melanjutkan ke perulangan selanjutnya */
fun main() {
    for (i in 0..25){
        if (i % 2 == 0){
            continue
        }
        println("Loop $i")
    }
    println("Program berakhir")
}