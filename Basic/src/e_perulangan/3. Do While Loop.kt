package e_perulangan

/* DO WHILE LOOP: perulangan yang mirip dengan while loop, yang membedakan kode program berada sebelum pengecekan kondisi
   -> Akan menghasilkan setidaknya 1 kode program yang akan dieksekusi meskipun pengecekan pertama akan bernilai false
   > Perlu diperhatikan agar tidak terjadi infinity loop
*/
fun main() {
    var i = 11

    do {
        println("Do while loop ke-$i")
        i++
    } while (i < 10)
}