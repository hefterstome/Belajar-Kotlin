package app

/*
 ** INHERITANCE: konsep dimana sebuah class dapat menurunkan ke class lain
    > Menggunakan kata kunci open
    > Sangat cocok digunakan pada struktur class hirarki
    > Dalam kotlin, --> class child hanya bisa memiliki 1 class parent
                    --> class parent bisa memiliki banyak class child
    > Class child akan mewarisi semua properties dan function dari class parent
    > Dianjurkan digunakan apabila sebuah class memiliki kemampuan yang sama agar meringkas dan memudahkan kode

   *) Dalam pembuatan class di Kotlin memiliki default final
      Final di sini boleh ditulis boleh tidak
      Contoh: final class Manager
*/
fun main() {
    open class Employee(var name: String) {
        fun sayHello(name: String) {
            println("Hello, $name! My name is ${this.name}")
        }
    }

    //class Manager() : Employee() //Erorr jika tidak ada kata open/akan menjadi default final
    //class Manager() : Employee() //Error karena class Employee ada primary cons
    //class Manager() : Employee("Iqbra") //Bisa, tapi hal ini akan membuat semua value properties name adalah "Iqbra"
    //class Manager(var nameParam: String) : Employee(nameParam) //Bisa, tapi var tidak perlu ditulis ulang karena sudah mewarisi
    class Manager(nameParam: String) : Employee(nameParam) //Memasukkan nameParam ke primary cons class Employee
    class CEO(name: String) : Employee(name) //Memasukkan name dari class CEO ke primary cons class Employee

    val manager = Manager("Iqbra")
    println(manager.name) //Class Manager akan mewarisi properties dari parent
    manager.name = "Hans" //Dapat pula dimanipulasi
    println(manager.name)
    manager.sayHello("Kotlin") //Class Manager akan mewarisi func dari parent

    val ceo = CEO("John Doe")
    ceo.sayHello("Bitch")
}