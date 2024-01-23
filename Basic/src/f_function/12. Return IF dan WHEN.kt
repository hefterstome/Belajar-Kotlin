package f_function

/* Return IF dan WHEN: kemampuan dalam menuliskan kode return 1x.
   > Terkadang sebuah function memiliki percabangan, dimana pada percangan tersebut memiliki nilai return yang berbeda.
   > Biasanya, return akan ditulis di masing-masing blok. Namun kotlin mendukung fitur return if dan when sehingga hanya perlu menulis 1x
   > Penulisan ini akan menyingkat kode dan menghindari pengulangan kata return berkali-kali
*/
fun sayHello(value: String = ""): String {
    /* Tidak Menerapkan */
//    if (value == "") {
//        return "Hello, dude!"
//    } else {
//        return "Hello, $value!"
//    }
    /* Menerapkan */
    return if (value == "") {
        "Hello, dude!"
    } else {
        "Hello, $value!"
    }
}
fun main() {
    println(sayHello())
    println(sayHello("Kotlin"))
}