package app

/*
 ** EXTENSION FUNC: function yang ditambah pada tipe data tertentu
    > Pada OOP extension func bisa ditambah di sebuah class
    > Konsep extension func di class adalah bukan masuk ke scope class, namun harus di luar class
      Dengan hal ini, maka modifier tipe private ataupun protected tidak bisa digunakan ketika membuat extension func
    > Extension func di OOP hanya sebagai helper func

  * EXTENSION NULLABLE FUNC: extension func yang bisa memiliki data null
    > Menggunakan kata kunci tanda tanya (?)
    > Secara standart di Kotlin tidak disarankan null

*/

class Student(val name: String, val age: Int)
fun main() {
//    class Student(val name: String, private val age: Int) //Jika private atau protected akan menyebabkan extension func tidak bisa mengakses object pada class
//    class Student(val name: String, val age: Int)
//
//    fun Student.sayHello(name: String) {
//        println("Hello, $name! My name is ${this.name} and I'm ${this.age} y.o")
//    }
//
//    val siswa = Student("Iqbra",13)
//    siswa.sayHello("Kotlin")

    /* Kondisi Nullable 1 */
//    class StudentNull(val name: String, val age: Int)
//    fun StudentNull?.sayHello(name: String?) {
//        println("Hello, $name! My name is ${this?.name} and I'm ${this?.age} y.o")
//    }
//    val siswaNull = StudentNull("Iqbra",13)
//    siswaNull.sayHello(null)

    /* Kondisi Nullable 2: Memakai pengecekan */
    class StudentNull(val name: String, val age: Int)
    fun StudentNull?.sayHello(name: String) {
        if (this != null) {
            println("Hello, $name! My name is ${this.name} and I'm ${this.age} y.o")
        }
    }
    val siswaNull = StudentNull("Iqbra",13)
    siswaNull.sayHello("Kotlin")

}