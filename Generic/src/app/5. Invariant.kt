package app

import data.Invariant

/*
 ** INVARIANT: artinya tidak boleh disubtitusi dengan subtype (clid) ataupun supertype (parent)
    > Misal kita membuat object Data<String> dan Data<Any>
      Dua Data di atas berbeda, meskipun dalam polymorphism berkaitan karena class child dan parent
    > Pada dasarnya saat kita membuat parameter type, sifat parameter tersebut adalah invariant
*/

fun main() {
    val variantString = Invariant<String>("Data String")
//    val variantAny: Invariant<Any> = variantString //Dalam polymorphism, ini bisa dilakukan. Karena Any merupakan parent dari String segingga bisa diturunkan
//    variantAny.data = 100 //Hal ini bahaya, kenapa? Karena awalnya Invariant diset String. Inilah kenapa defaultnya invariant
}