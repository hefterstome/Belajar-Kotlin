package app

/*
 * Di Kotlin, kita dapat memberi properties pada primary cons secara langsung
   > Hal ini akan mempersingkat kode, dan memudahkan saat ingin membuat properties dimana ingin memasukkan data lewat cons
   > Properties bisa var ataupun val
   > Properties hanya bisa pada primary, secondary cons tidak bisa
*/
fun main() {
    class User(var username: String, var password: String = "123")

    val admin = User("admin","admin123")
    val member = User("member")
    println(member.password)

    /* Manipulasi data properties */
    member.password = "member123"
    println(member.password)
}