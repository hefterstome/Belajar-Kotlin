package app

/* FUNC OVERRIDING: kemampuan membuat function ulang yang sudah ada di class parent
   > Di Python, disebut overrides
   > Menggunakan kata kunci open pada func asal dan override pada func overriding
   > Func overriding harus sama persis, dari nama func, nama parameter, return type. Yang boleh beda adalah blok kode program pada body

   *) Default dalam pembuatan function dalam Kotlin adalah final
*/
fun main() {
    open class Employee(var name: String) {
        //fun sayHello(name: String) {
        open fun sayHello(name: String) {
            println("Hello, $name! My name is ${this.name}")
        }
    }

//    class Manager(nameParam: String) : Employee(nameParam) {
    open class Manager(nameParam: String) : Employee(nameParam) {
//        override fun sayHello(name: String) { //Dapat di-overriding oleh class child karena default open
        final override fun sayHello(name: String) { //Tidak dapat di-overriding oleh class child
            println("Hello, $name! My name is ${this.name} and I'm a manager.")
        }
    }

    /* Konsep func overriding ini bisa diturunkan ke class child lain
       Misal di sini membuat class ViceManager dengan class parent Manager

       *) Default dari func overriding adalah open, bukan final seperti class dan function biasa
          > Sehingga ViceManager dapat melakukan overriding func dari class Manager, jika tidak menghendaki ini pada func overriding asal (Manager) dapat diberi kata kunci final
    */
    class ViceManager(nameParam: String) : Manager(nameParam) {
//        override fun sayHello(name: String) { //Bisa jika tidak ada kata kunci final
//            println("Hello, $name! My name is ${this.name} and I'm a vice manager.")
//        }
    }
}