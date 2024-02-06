package app

/*
 ** ABSTRACT CLASS: class yang tidak bisa dibuat sebuah object, hanya bisa diturunkan
    > Menggunakan kata kunci abstract
    > Biasa digunakan untuk class parent
    > Default dari abstract class adalah open

*/

fun main() {
    abstract class Location(name: String)

    class City(name: String) : Location(name)

    class Country(name: String) : Location(name)

//    val lokasi = Location("Washington DC") //Error karena abstract class hanya bisa diturunkan

    val yogyakarta = City("Yogyakarta")
    val indonesia = Country("Indonesia")
}
