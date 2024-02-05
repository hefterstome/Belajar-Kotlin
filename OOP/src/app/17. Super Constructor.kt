package app

/*
 ** SUPER CONS: keyword super yang digunakan untuk memanggil constructor class parent di class child
    > Harus mengakses lewat constructor class child, tidak bisa di function
    > Pada cons class child harus ada yang menyambung ke primary cons class parent
*/

fun main() {
    open class Customer(val name: String, val type: String, val balance: Long) {
        constructor(name: String, type: String) : this(name, type, 0)
        constructor(name: String) : this (name, "Standart")
    }

//    class PremiumCustomer() : Customer() {} //Kondisi ini memerlukan adanya primary cons, ditandai kurung buka tutup () pada PremiumCustomer
    class PremiumCustomer : Customer {
        constructor(name: String) : super(name, "Premium")
        constructor(name: String, balance: Long) : super(name, "Premium", balance)
    }

    //Apabila class child menggunakan primary cons, artinya constructor miliknya harus memanggil primary. Dengan kasus ini, maka super cons tidak cocok digunakan karena akan memakai this keyword
    class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance) {
        constructor(name: String) : this(name, 0)
//        constructor(name: String) : super(name, "Premium") //Error
    }

    val iqbra = PremiumCustomer("Iqbra",1000000000)
    println(iqbra.type)

    val landa = ExecutiveCustomer("Landa")
    println(landa.type)
    println(landa.balance)

}