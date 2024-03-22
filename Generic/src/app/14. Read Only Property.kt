package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
 ** READ ONLY PROPERTY: interface generic yang bisa digunakan sebagai delegate
    > Bersifat immutable (val)
    > Karena read only dapat didelegate sehingga memungkinkan untuk mengubah value variable sebelum direturn meskipun berdifat val
*/

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperties(param) //val name akan mendelegate class logreadonly, sehingga secara otomatis class readonly akan juga dieksekusi
}

class LogReadOnlyProperties(val data: String) : ReadOnlyProperty<Any, String> { //Any digunakan untuk siapa saja yang mengakses, string untuk tipe datanya
    var counter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with vale $data")
        counter++
        return data.uppercase() + counter
    }
}

fun main() {
    val obj1 = NameWithLog("Iqbra Kurniawan")
    println(obj1.name)
    println(obj1.name)
}

