package app

/*
 ** ENUM CLASS: class yang merepresentasikan nilai yang sudah baku/tetap
    > Cara membuatnya dengan memberi kata kunci enum di depan class
    > Contohnya data jenis kelamin, arah mata angin
    > Tidak dapat membuat sebuah object dari enum class, namun dapat dideklarasikan langsung object yang tersedia pada enum class
    > Dapat memiliki properties dan function
    > Apabila enum class memiliki constructor, maka saat membuat object enum pada class wajib diisi
    > Apabila terdapat abstract function, wajib dioverride pada saat pembuatan object enum

    >> Hasil keluaran dari enum class adalah berupa Array String

  * Pembuatan: pilih opsi enum ketika membuat file
*/

enum class Gender{
    MALE,
    FEMALE
}

enum class GenderCons(val description: String) {
//    MALE,
//    FEMALE //Error karena harus diisi cons

    MALE("Male"),
    FEMALE("Female");

    fun printDesc() {
        println(this.description)
    }
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val genderArray: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(genderArray)
    println(genderArray.toList())

    val manCons = GenderCons.MALE
    manCons.printDesc()

}

