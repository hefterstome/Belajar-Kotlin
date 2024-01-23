package f_function

/* FUNCTION SCOPE: ruang lingkup sebuah function
   > Kita bisa mengakses sebuah function pada file lain yang masih 1 package, itulah mnegapa tidak bisa adanya duplikat function dalam 1 package
   > Untuk mengatasi hal tersebut, bisa memasukkan function ke dalam main.

   > Jika sebuah berada dalam functionB, hanya functionB tersebut yang bisa menggunakannya
   > Jika function memiliki sejajar, itu bisa digunakan oleh function lain yang sejajar
*/
/* Kasus 1 */
//fun functionA(){
//    functionB()
//}
//fun functionB(){
//    functionC()
//}
//fun functionC(){
//    functionA()
//}
//fun main() {
//    functionA()
//    functionB()
//    functionC()
//}

/* Kasus 2 */
fun functionB(){
    functionC()
}
fun functionC(){
//    functionA() //Error karena functionA berada dalam function lain
}
fun main() {
    fun functionA(){
        functionB()
    }

    functionA()
    functionB()
    functionC()
}
