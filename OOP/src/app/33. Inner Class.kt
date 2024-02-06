package app

/*
 ** INNER CLASS: kemampuan sebuah class di dalam class untuk mengakses properties dan function
    > Memakai kata kunci inner
    > Class di dalam class bernama inner class, sedangkan yang membungkusnya bernama outer class
    > Dalam Kotlin, bisa membuat class di dalam class
      Namun dengan kondisi tersebut tidak membuat class tersebut saling terikat atau dapat saling mengakses
      Meskipun class di dalam class, hal itu tetap membuat kedua class berdiri sendiri
      Hanya saja, untuk membuat object dari inner class, diperlukan nama outer classnya
    > Menggunakan inner class, class di dalamnya akan dapat mengakses object dari outer
    > Dari inner class untuk mengakses data outer memakai this.@namaClass.namaData
*/
fun main() {
    class Manager(val name: String) {
        inner class Pegawai(val name: String) {
            fun sayHi(name: String) {
                println("Hai, $name! Saya ${this.name} adalah pegawai dari manager ${this@Manager.name}")
            }
        }
    }

    /* Membuat object dari inner class */
    //1. Membuat object dari outer class dahulu
    val manager1 = Manager("Iqbra")
    //2. Membuat object inner dari object outer
    val pegawai1 = manager1.Pegawai("Karyawan Yeaa")
    pegawai1.sayHi("Kotlin")

}
