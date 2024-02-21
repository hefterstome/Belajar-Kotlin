package app

/*
 ** ANONYMOUS CLASS: kemampuan untuk membuat sebuah object dari class ataupun interface yang belum dideklarasikan dengan jelas properties dan functionnya
    > Menggunakan kata kunci object
    > Anonymous bisa disebut juga dengan class tanpa nama
*/

interface Action {
    fun action()
}

class SampleAction: Action {
    override fun action() {
        println("Ini override action dari sampleAction")
    }
}

fun fireAction(param: Action) {
    param.action()
}

fun main() {
    /* Pakai class */
    val coba = SampleAction()
    coba.action()

    /* Pakai function */
    fireAction(SampleAction())

    /* Pakai anonymous */
    fireAction(object : Action {
        override fun action() {
            println("Action 1")
        }
    })
    fireAction(object : Action {
        override fun action() = println("Action 2")
    })
}