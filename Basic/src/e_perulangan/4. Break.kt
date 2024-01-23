package e_perulangan

/* BREAK: untuk keluar/menghentikan seluruh perulangan
*/
fun main() {
    var i = 1
    while (true) {
        if (i == 10){
            break
        }
        println("Loop $i")
        i++
    }
    println("Program berakhir")
}