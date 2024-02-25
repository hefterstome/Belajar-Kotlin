package app

import data.Covariant

/*
 ** COVARIANT: artinya kita bisa mensubtitusi object child ke parent
    > Menggunakan kata kunci out
    > Tidak bisa subtitusi parent ke child
    > Tidak semua class generic bisa menerapkan covariant, hanya class generic yang memiliki function generic parameter type dengan return type function
      Artinya tidak boleh menerima inputan dari parameter type, parameter type hanya boleh menjadi return value
      Anggap saya parameter type hanya bisa menjadi return value
    > Tidak boleh memiliki properties var, harus val
      Kenapa? Karena bahaya.
      Pada covariantString sudah diset String, jika pada covariantAny dimasukkan Int maka akan error. Hal ini karena T akan bernilai String, sedangkan saat subtitusi covariantAny bernilai Int. Perbedaan tipe saat return inilah yang membuat error
*/

fun main() {
    val covariantString = Covariant<String>("10")
    println(covariantString.getData())
    val covariantAny: Covariant<Any> = covariantString
    println(covariantAny.getData())
}