package app

/*
 ** SUPER KEYWORD: kata kunci yang digunakan untuk mengakses function ataupun properties yang sudah dibuat ulang/overriding oleh class child
    > Jika suatu class parent telah dilakukan overriding oleh class child, dapat mengakses/mengambil function asal overriding dari class parent
    > Menggunakan kata kunci super
    > Super keyword digunakan untuk: 1. Properties
                                     2. Function
*/

fun main() {
    open class Shape() {
        open val corner: Int = 0

        open fun printName() {
            println("Class Shape")
        }
    }

    open class Rectangle() : Shape() {
        override val corner: Int = 4
        val cornerSuperRectangle: Int = super.corner

        override fun printName() {
            println("Class Rectangle")
            super.printName()
        }
    }

    class Triangle() : Rectangle() {
        override val corner: Int = 3
        val cornerSuperTriangle: Int = super.corner

        override fun printName() {
            println("Class Triangle")
            super.printName()
        }
    }

    val shape1 = Rectangle()
    shape1.printName()
    println("Corner ---> ${shape1.corner}")
    println("Corner super ---> ${shape1.cornerSuperRectangle}")

    val shape2 = Triangle()
    shape2.printName()
    println("Corner ---> ${shape2.corner}")
    println("Corner super ---> ${shape2.cornerSuperTriangle}")
}