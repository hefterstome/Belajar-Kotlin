package f_function

/* ANONYMOUS FUNC: function yang mirip dengan lambda
    > Perbedaan dengan lambda: dapat menangani proses kompleks.
      Contoh kasus if else yang memiliki return berbeda tidak dapat diselesaikan dengan lambda
   -> Pembuatannya mirip dengan lambda, hanya saja tetap memakai kata fun
*/
fun main() {
    fun toUpperFunc(value: String, anonymousParam: (String) -> String): String {
        //return "$value => ${anonymousParam(value)}"
        return anonymousParam(value)
    }

    val anonymousParam = fun(value: String): String {
        if (value == "") {
            return "Upss"
        }
        return value.uppercase()
    }

    println(toUpperFunc("kotlin",anonymousParam))

    /* Dimasukkan langsung ke parameter */
    println(toUpperFunc("kotlin",fun(value: String): String {
        if (value == "") {
            return "Upss"
        }
        return value.uppercase()
    }))
    println(toUpperFunc("kotlin",fun(value: String): String{
        return value.uppercase()
    }))

}