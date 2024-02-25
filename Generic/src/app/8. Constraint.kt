package app

import data.Constraint.Employee
import data.Constraint.Manager
import data.Constraint.VicePresident
import data.Constraint.Company
import data.Constraint.String

/*
 ** CONSTRAINT: digunakan untuk membatasi jenis parameter type
    > Default dari parameter type adalah Any, inilah yang menyebabkan kita dapat mengirim tipe apapun ke generic class
    > Jika telah diset constraint, maka hanya bisa memasukkan object itu sendiri dan kelas turunannya saja
    > Hanya bisa memiliki 1 tipe
*/

fun main() {
    //Pada kondisi ini, Company memiliki constraint Employee. Sehingga hanya object Employee dan turunannya yang bisa dimasukkan pada Company
    val constraint1 = Company(Employee())
    val constraint2 = Company(Manager())
    val constraint3 = Company(VicePresident())
//    val constraint4 = Company("String") //Error, karena diset const berupa Employee. Artinya hanya bisa memasukkan class Employee dan turunannya saja
    val constraint5 = String("Kotlin")
}