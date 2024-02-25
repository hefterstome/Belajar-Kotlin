package data

class Constraint {
    open class Employee

    class Manager: Employee()

    class VicePresident: Employee()

//    class company<T>(val value: T) //Karena T, maka dapat menerima object apapun
    class Company<T: Employee>(val value: T) //Karena T diset Employee, maka class company hanya bisa dikirim object itu sendiri (Employee) dan kelas turunannya (Manager, VicePresident)

    class String<T: kotlin.String>(val value: T)
}