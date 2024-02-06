package app

/*
 ** INTERFACE: blueprint/cetakan/prototipe yang ada di Kotlin (sama dengan Class)
    > Interface sangat mirip dengan abstract class
    > Default interface adalah abstract dan open
    > Interface biasa digunakan untuk kontrak-class. Juga biasanya digunakan ketika ada class dari Java
    > Interface dapat menggunakan super keyword

  * CONCRETE FUNCTION: kemampuan abstract function pada interface untuk dapat memiliki body
    > Dengan ini, kelas child tidak wajib me-overriding function dari interface

  * Inheritance
    1. Interface hanya bisa memiliki class parent berupa interface, tidak bisa class
    2. Interface/class turunan/child bisa memiliki lebih dari 1 parent/super interface
       > Caranya cukup menambahkan koma (,) pada extend ketika membuat class inheritance
    3. Sebuah class bisa memiliki parent class dan interface, tapi tetap hanya bisa 1 parent class

  * Konflik
    Apabila dua interface memiliki function dengan nama yang sama
    > Cara mengatasinya:
      1. Melakukan overriding pada child
*/

interface Interaction {
    val name: String
    /* Kondisi tanpa concrete func */
//    fun sayHello(name: String)
    fun sayHello(name: String) { //Concrete func, menyebabkan tidak harus overriding func pada class child
        println("Hello, $name! My name is ${this.name}")
    }
}

class Human(override val name: String): Interaction {
    /* Kondisi tanpa concrete func */
//    override fun sayHello(name: String) {
//        println("Hello, $name! My name is ${this.name}")
//    }
}

//class HumanMultipleInheritance(override val name: String) : Go, Interaction //Ketika Go tidak extend Interaction
class HumanMultipleInheritance(override val name: String) : Go, Sapa(), KonflikA, KonflikB { //Kenapa hanya Go? Karena interface Go extend Interaction, sehingga tidak langsung class ini sudah extend ke interface Interaction
    override fun konflik() {
        /* Over 1: Ubah semua func konflik */
        println("Overriding function konflik")
        /* Over 2: Memakai super keyword */
//        super.konflik() //Error karena identik sistem akan bingung
        super<KonflikA>.konflik() //super<namaInterface>.namaFunction()
        super<KonflikB>.konflik()
        //Hasil akan dipanggil semua sesuai yang ada dalam scope func overriding
    }
}
//interface Go { //Tanpa extend, maka HumanMultipleInheritance perlu menulis extend Go, Interaction
interface Go : Interaction{ //Interface Go extend interaction
    fun runGo() {
        println("Interface Go run!!!")
    }
}

interface KonflikA {
    fun konflik() {
        println("Konflik A")
    }
}

interface KonflikB {
    fun konflik() {
        println("Konflik B")
    }
}

open class Sapa {
    open val name: String = ""
    fun sapaPagi(name: String) {
        println("Selamat Sagi, $name! Ini ${this.name}")
    }
    fun sapaSiang(name: String) {
        println("Selamat Siang, $name! Ini ${this.name}")
    }
    fun sapaMalam(name: String) {
        println("Selamat Malam, $name! Ini ${this.name}")
    }
}

fun main() {
    val human = Human("Iqbra")
    human.sayHello("Kotlin")

    val humanMultiple = HumanMultipleInheritance("Landa")
    humanMultiple.runGo()
    humanMultiple.sayHello("World")
    humanMultiple.sapaPagi("Python")
//    humanMultiple.konflik() //Akan ada 2 pilihan jika tidak dioverriding
    humanMultiple.konflik() //Jika dioverriding akan memanggil func konflik pada class object humanMultiple

}