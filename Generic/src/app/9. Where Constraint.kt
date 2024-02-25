package app

import data.WhereConstraint.Employee
import data.WhereConstraint.Manager
import data.WhereConstraint.VicePresident
import data.WhereConstraint.Company
import data.WhereConstraint.SayHello

/*
 * WHERE CONTSTRAINT
   > Terkadang, kita memerlukan lebih dari satu tipe parameter type
   > Digunakan apabila ingin membuat tipe constraint yang lebih dari 1, karena defult contraint itu hanya satu tipe
   > Menggunakan kata kunci where
*/

fun main() {
    //Kondisi sekarang adalah company memiliki 2 tipe constraint, yaitu Employee dan SayHello. Artinya hanya bisa memasukkan object yang juga memiliki object Employee dan SayHello, jika hanya satu maka tidak bisa
//    val whereConstraint1 = Company(Employee()) //Error karena employee tidak memiliki SayHello
//    val whereConstraint2 = Company(Manager()) //Error karena manager tidak memiliki SayHello
    val whereConstraint3 = Company(VicePresident())
//    val whereConstraint4 = Company("String") //Error karena tidak sesuai constraint


}