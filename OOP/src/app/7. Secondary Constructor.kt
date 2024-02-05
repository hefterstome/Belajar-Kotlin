package app

/*
 ** SECONDARY CONS: constructor tambahan dari primary constructor.
    > Jumlah secondary cons dalam class tidak terbatas
    > Perbedaan secondary cons lebih mirip dengan function daripada initizalizer
    > Secondary cons dapat diberi kode program seperti init
    > Dengan memakai multiple secondary cons, kita bisa memilih constructor yang akan dipanggil ketika membuat sebuah object

  * Syarat:
    1. Jumlah parameter constructor dengan constructor lainnya harus bebeda
    2. Secondary cons harus memanggil primary cons dengan kata kunci this

  * Cara Kerja:
    1. Ketika memiliki secondary cons lebih dari 1, secondary1 dapat memanggil primary sedangakan secondary cons lain boleh memanggil secondary cons1
       -> Dengan demikian, akan menimbulkan konsep recursive. Di mana secondary cons lain akan memanggil secondary cons1 (secondary cons1 memanggil primary cons)
       -> Secara konsep primary tetap dipanggil meskipun secondary cons lain tidak memanggilnya (memanggil secondary cons1)
       -> Urutan eksekusi akan tetap dari primary terlebih dahulu (this akan dieksekusi dahulu, baru constructornya)
*/
fun main() {
    class Car(brandParam: String, nameParam: String, yearParam: Int) { //Primary cons
        init {
            println("Car $nameParam dibuat")
        }

        constructor(brandParam: String, nameParam: String): this(brandParam,nameParam,2024) { //This memanggil primary
            println("Secondary constructor 1")
        }

        constructor(brandParam: String): this(brandParam,"") { //This memanggil secondary cons1
            println("Secondary constructor 2")
        }
    }

    val avanza = Car("Toyota","Avanza")
    val almaz = Car("Wuling")
}
