package f_function

/* HIGH ORDER FUNC: function yang memiliki parameter berupa function dan dapat mengembalikan nilai berupa function
   >
*/

/*
fun namaFunction (========= PARAMETER ==========): RETURN { BODY }
                            === namaLambda: (tipe) -> return
*/
fun toUpperFunc(value: String, lamdaParam: (String) -> String): String {
    //return "$value => ${lamdaParam(value)}"
    return lamdaParam(value)
}
fun main() {
    //val lambda1: (String) -> String = {value: String -> value.uppercase()}
    //val lambda1: (String) -> String = { it.uppercase() }
    val lambda1 = {value: String -> value.uppercase()}
    println(toUpperFunc("Kotlin",lambda1))
    println(toUpperFunc("Kotlin",{value: String -> value.uppercase()}))

    /* TRAILING LAMBDA: kemampuan dalam menulis kode parameter lambda agar memudahkan pemahaman
       -> Syarat: parameter lambda harus berada di akhir dari parameter function
       -> Cara penulisan, value lambda tidak harus masuk ke kurung buka antar parameter function ketika menjalankan function
    */
    val trailLambdaA = toUpperFunc("Kotlin") { value: String -> value.uppercase()}
    val trailLambdaB = toUpperFunc("Kotlin") { value: String ->
        value.uppercase()
    }


}