package f_function

/* CLOSURE: kemampuan function, lambda, atau anonymous untuk berinteraksi dengan data-data dalam 1 scope yang sama.
    > Contoh func main punya data a, maka function di dalam main dapat mengakses data a
   -> Penggunaan closure sangat tidak dianjurkan karena dapat merubah data dengan tidak sengaja
*/
fun main() {
    var counter = 0

    /* FUNCTION */
    fun closureFunction() {
        counter++
        println("Function counter  ----> $counter")
    }

    /* LAMBDA */
    val closureLambda = {
        counter++
        "Lambda counter    ----> $counter"
    }

    /* ANONYMOUS */
    val closureAnonymous = fun() {
        counter++
        println("Anonymous counter ----> $counter")
    }

    println(closureFunction())
    println(closureLambda())
    println(closureAnonymous())
    println(closureFunction())
    println(closureLambda())
    println(closureAnonymous())
    println(closureFunction())
    println(closureLambda())
    println(closureAnonymous())
    println(closureFunction())
    println(closureLambda())
    println(closureAnonymous())
    println("\nLast counter ----> $counter")
}