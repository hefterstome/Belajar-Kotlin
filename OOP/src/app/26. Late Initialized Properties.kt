package app

/*
 ** LATE INITIALIZED PROPERTIES: kemampuan untuk dapat tidak memberi value ketika membuat sebuah properties
    > Memakai kata kunci lateinit
    > Dalam Kotlin, kita harus memberi value ketika membuat sebuah variabel. Dengan late init kita bisa memberi value setelah deklarasi variabel, seperti di Java
    > Hanya bisa dilakukan pada variabel mutable (var)
    > Ketika ingin print variabel late init, harus diset value dahulu agar tidak error
*/
fun main() {
    class Television {
        lateinit var name: String

        fun initSetTelevision() {
            this.name = "Smasung"
        }

        fun initTelevision(name: String) {
            this.name = name
        }
    }

    val tv = Television()
//    println(tv.name) //UninitializedPropertyAccessException: error karena lateinit properties belum diinisialisasi/diberi value

    /* Inisialisasi 1: Memanggil func yang set value */
    tv.initSetTelevision()
    println(tv.name)

    /* Inisialisasi 2: Memanggil func yang set value memakai parameter */
    tv.initTelevision("Polytron")
    println(tv.name)

    /* Inisialisasi 3: Manipulasi properties */
    tv.name = "Sharp"
    println(tv.name)
}