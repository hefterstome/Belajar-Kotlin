package app

/* PROPERTIES OVERRIDING: kemampuan membuat properties ulang yang sudah ada di class parent
   > Memiliki konsep yang sama dengan function overriding
   > Di Python, disebut overrides
   > Menggunakan kata kunci open pada properties asal dan override pada properties overriding
   > Properties overriding harus sama tipe datanya

   *) Default dalam pembuatan properties dalam Kotlin adalah final
*/
fun main() {
    open class Shape {
        open val corner: Int = 0
    }
    open class Rectangle : Shape() {
        //final override var corner: Int = 4
        override var corner: Int = 4
    }
    class Triangle : Rectangle() {
        override var corner: Int = 3
    }

    val shape1 = Shape()
    println(shape1.corner)
    val shape2 = Rectangle()
    println(shape2.corner)
    val shape3 = Triangle()
    println(shape3.corner)

}