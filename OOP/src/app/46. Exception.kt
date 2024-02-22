package app

/*
 ** EXCEPTION: error yang terjadi akibat eksekusi sebuah program
    > Menggunakan kata kunci throw
    > Semua tipe error pada Kotlin merupakan kelas turunan dari Throwable
    > Pemanggilan exception dengan throw diikuti nama object erornya
*/

// Membuat Exception sendiri
class ValidationException(message: String) : Throwable(message)
fun sayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank") //throw disini merujuk pada exception ValidationException
    }
    println("Hello, $name")
}

fun main() {
    //Result 1: Membuat Exception
    sayHello("Kotlin")
//    sayHello("")

    /* TRY CATCH: kemampuan di Kotlin untuk mencoba melakukan sesuatu dan bila terjadi error akan ditangkap dan memberi reaksi yang diinginkan
       > Multiple catch: catch tidak terbatas apabila merujuk pada masing-masing Exception
    */
    //Result 2: Try Catch
    try {
        sayHello("Kotlin")
        sayHello("")
        sayHello("Program") //Baris ini tidak akan dieksekusi karena terjadi error dan eksekusi catch
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    }

    //Result 3: Multiple Catch
    try {
        sayHello("Kotlin")
        sayHello("")
        sayHello("Program") //Baris ini tidak akan dieksekusi karena terjadi error dan eksekusi catch
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    } catch (error: NullPointerException) {
        println("Terjadi error ${error.message}")
    }

    /* FINALLY: adalah blok kode yang akan selalu dieksekusi setelah eksekusi try catch
       > Meskipun terjadi error pada try catch, blok kode finally akan tetap dieksekusi
    */
    //Result 4: Finally
    try {
        sayHello("Kotlin")
        sayHello("")
        sayHello("Program") //Baris ini tidak akan dieksekusi karena terjadi error dan eksekusi catch
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    } catch (error: NullPointerException) {
        println("Terjadi error ${error.message}")
    } finally {
        println("Ini adalah finally")
    }

}
