package data

class WhereConstraint {
    interface SayHello {
        fun printHello(name: String)
    }
    open class Employee

    class Manager: Employee()

    class VicePresident: Employee(), SayHello {
        override fun printHello(name: String) {
            println("Hello, $name! I'm Vice President")
        }
    }

    class Company<T>(val name: T) where T: Employee, T: SayHello
}