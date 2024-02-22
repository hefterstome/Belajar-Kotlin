package app

/*
 ** DELEGATION: kemampuan untuk meneruskan properties maupun function ke object lain
    > Dapat secara manual/dioverride semua
    > Jika ingin otomatis menggunakan kata kunci by base
      Menggunakan by base akan membuat semua member didelegate
      Agar tidak didelegate semuanya, perlu dioverride sesuai kebutuhan
*/

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

// Kasus 1: Class extend interface
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello, $name")
    }

    override fun sayGoodbye(name: String) {
        println("Bye, $name")
    }
}

// Kasus 2: Delegation secara manual
class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        println("Bye, $name")
    }
}

//Kasus 3: Deletagation secara otomatis - Menggunakan kata kunci base
class MyBaseDelegationAut(val base: Base) : Base by base {
    override fun sayGoodbye(name: String) {
        println("Override - Goodbye, $name")
    }
}

fun main() {
    val my_base = MyBase() //Membuat object dari class MyBase
    my_base.sayHello("Kotlin")

    val delegate_my_base = MyBaseDelegate(my_base) //Membuat object dari class MyBaseDelegate dengan mengirim object my_base sebagai param
    delegate_my_base.sayHello("Java") //Konsepnya sayHello di sini akan merujuk pada my_base
}