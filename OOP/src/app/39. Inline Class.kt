package app

/*
 ** INLINE CLASS: kemampuan sebuah class untuk menjadi sebuah variable biasa ketika proses compile
    > Menggunakan kata kunci inline
    > Hal ini untuk mengurangi penggunaan memori, dikarenakan pengggunaan memory pada sebuah class itu lebih besar dari sebuah variabel String
    > Hanya boleh memiliki 1 properties, kurang atau lebih akan error
    > Pengecekannya dapat melalui decompile
*/

inline class NameInline(val name: String) {
    fun toUpper(): String = name.uppercase()
}

fun main() {
    val name = NameInline("Kotlin")
    println(name.toUpper())
}