package e_perulangan

/* Perulangan
   1. For Loops: untuk melakukan perulangan iterasi dari data iterator (array, range, dll)
*/

fun main() {
    /* FOR Array */
    val bahasa = arrayOf("Python", "Kotlin", "Java", "C++", "PHP")
    var total = 0
    for (i in bahasa){
        println(i)
        total++
    }
    println("Total perulangan = $total")

    /* FOR Range */
    total = 0
    for (i in 0..10){
        print("$i ")
        total++
    }
    println("\nTotal perulangan = $total")

    total = 0
    for (i in 15 downTo 0 step 3){
        print("$i ")
    }
    println("\nTotal perulangan = $total")

    /* FOR Range dengan Array */
    val ukuranArray = bahasa.size-1
    for (i in 0..ukuranArray){
        println("Indeks ke-$i = ${bahasa.get(i)}")
    }

}

