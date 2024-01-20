package a_Variabel

/* Constant: variabel bersifat global (dapat diakses di manapun) dan immutable (val)
   -> Biasanya memakai UPPER CASE untuk nama variable constant
*/

const val PROGRAM = "Basic Kotlin"
const val VERSION = "1.1.0"

fun main() {
    println("Hey menn, welcome to $PROGRAM $VERSION")
    println("I know you can do it!!!")
}