package app

/*
 * Kita dapat membuat class dengan secondary cons tanpa primary cons
   > Hal ini tidak dianjurkan, sebisa mungkin tetap pakai primary, dikarenakan diperlukan men-set variabel 2x
   > Secondary cons tetap bisa memanggil secondary cons lain dengan kata kunci this

   Perbedaan:
   Kalau memakai primary, dapat mengambil parameter untuk dijadikan deklarasi properties.
   Sedangkan tanpa primary, properties harus memiliki nilai default
*/

fun main() {
    class Address {
        /* Kondisi properties tanpa primary: harus ada default */
        var street: String = ""
//        var street: String = streetParam //Error, karena streetParam masuk scope cons, jadinya hanya bisa digunakan pada lingkup cons
//        var street: String = //Harus memiliki default
        var city: String = ""
        var country: String = "Indonesia"

        constructor(streetParam: String, cityParam: String) {
            street = streetParam
            city = cityParam
        }
        constructor(streetParam: String, cityParam: String, countryParam: String)
            :this(streetParam,cityParam) {
                //Pada kondisi ini, tidak perlu men-set street dan city lagi karena cons ini memanggil secondary cons lain, dimana pada cons tersebut telah men-set city dan street
                country = countryParam
        }
    }

    val address1 = Address("Jalan Kotlin","Surabaya","Indonesia")
    val address2 = Address("Jalan Python","NYC")

    println(address1.country)
    println(address2.country )

}