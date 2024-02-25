package app

/*
 ** TYPE PROJECTION: kemampuan untuk melakukan pengecekan ketika melakukan manipulasi data pada class generic
    > Terkadang, kita ingin melakukan manipulasi data dari class generic
      Namun akan sedikit menyulitkan apabila diset default (invariant) karena tidak bisa subtitusi sehingga untuk manipulasi data harus sama tipe datanya, misal String ya sama String
      Maka, kita bisa melakukan type projection di mana memaksa generic class berubah menjadi covariant dan contravariant Any agar saat manipulasi dapat dilakukan subtitusi
*/

class TypeProjection<T>(var data: T)

//Kasus 1: Masih menggunakan invariant
fun copyCase1(from: TypeProjection<Any>, to: TypeProjection<Any>) {
    to.data = from.data
}

fun copyCase2(from: TypeProjection<out Any>, to: TypeProjection<Any>) {
    to.data = from.data
}

fun main() {
    val typePro1 = TypeProjection("Kotlin")
    val typePro2 = TypeProjection("Iqbra")

    //Result Kasus 1
//    copyCase1(typePro1, typePro2)
    /* Kenapa error?
       Hal ini disebabkan karena pada typePro1 dan typePro2 telah menjadi generic String.
       Sedangkan pada parameter function copyCase1, tipe genericnya berupa Any
       Karena memiliki konsep invariant (tidak bisa subtitusi child ke parent dan sebaliknya, sehingga terjadi error)
       Tetap bisa dilakukan, apabila tipe generic pada func copyCase1 dirubah String/disesuaikan dengan set awal
       Namun akan menyulitkan apabila harus memastikan tipe genericnya sama, maka dari itu menggunakan type projection
    */

    //Result Kasus 2
    val typePro3= TypeProjection<Any>("Iqbra")
    copyCase2(typePro1, typePro3)
    /* Kenapa tidak error?
       Karena pada typePro1 telah dilakukan covariant (diset out, sehingga bisa dari child: String ke parent: Any)
    */
    println(typePro1.data)
    println(typePro3.data)
}