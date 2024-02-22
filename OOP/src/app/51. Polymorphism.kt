package app

/*
 ** PLYMORPHISM: kemampuan sebuah object berubah bentuk ke bentuk object yang lain
    > Dalam bahasa Yunani, polymorphism berarti banyak bentuk
    > Dalam bahasa oop static (Kotlin, Java) polymorphism mencapai puncak kesempurnaan ketika adanya inheritance
*/

fun main() {
    open class Employee(var name: String) {
        open fun sayHello(name: String) {
            println("Hello, $name! My name is ${this.name}")
        }
    }
    class Manager(nameParam: String) : Employee(nameParam) {
        override fun sayHello(name: String) {
            println("Hello, $name! My name is ${this.name} and I'm manager")
        }
    }
    class CEO(name: String) : Employee(name) {
        override fun sayHello(name: String) {
            println("Hello, $name! My name is ${this.name} and I'm CEO")
        }
    }

    var employee: Employee = Employee("Iqbra")
    employee.sayHello("Kotlin")

    employee = Manager("Iqbra") //Melakukan perubahan bentuk object dari employee ke manager
    employee.sayHello("Kotlin") //Meskipun sama, hasil akan berbeda karena terjadi perubahan bentuk object dimana setiap class override func sayHello

    employee = CEO("Iqbra") //Melakukan perubahan bentuk object dari manager ke ceo
    employee.sayHello("Kotlin")

}