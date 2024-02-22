package app

import kotlin.properties.Delegates

/*
 ** OBSERVABLES PROPERTIES: kemampuan delegeting di Kotlin untuk bisa melihat perubahan value pada sebuah properties
*/
fun main() {
    class Account(description: String = "Kotlin") {
        val name: String by lazy {
            println("Lazy called")
            "Iqbra"
        }

        var description: String by Delegates.observable(description) { property, oldValue, newValue ->
            println("${property.name} is changed from $oldValue to $newValue ")
        }
    }

    val akun = Account()
    akun.description = "Java"
    akun.description = "Python"
    akun.description = "Dart"
}