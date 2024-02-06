package app

/*
 ** ABSTRACT PROPERTIES: properties pada sebuah abstract class
 ** ABSTRACT FUNCTION: function pada sebuah abstract class
    > Menggunakan kata kunci abstract
    > Default abstract properties dan function adalah open
    > Baik abstract properties maupun function hanya bisa dibuat pada abstract class
    > Deklarasi value abstract properties hanya bisa dilakukan pada class child
    > Deklarasi body abstract functions hanya bisa dilakukan pada class child
    > Class child harus membuat overriding dari abstract pro maupun func dari abstract class parent
*/
fun main() {
    abstract class Animal {
//        abstract var name: String = "Fish" //Error karena tidak boleh dideklarasi value pada abstract class
        abstract var name: String

//        abstract fun printName() {} //Error karena tidak ada body func pada abstract class
        abstract fun printName()
    }

    class Fish: Animal() {
        override var name: String = "Fish" //Harus dioverrides dan diberi value
        override fun printName() {
            println("Class Animal object ${this.name}") //Harus dioverrides dan diberi body program
        }
    }

    class Cat: Animal() {
        override var name: String = "Cat"

        override fun printName() {
            println("Class Animal object Cat")
        }
    }

    val fish = Fish()
//    fish.name = "Yeay" //Tidak perlu dideklarasi ulang karena sudah dilakukan di class-nya
    fish.printName()

    val cat = Fish()
    cat.printName()
}