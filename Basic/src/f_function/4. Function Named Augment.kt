package f_function

/* FUNCTION NAMED AUGMENT: function ketika pemanggilan menuliskan nama parameternya.
    > Cocok untuk function yang memiliki banyak parameter
   -> Dalam pemanggilannya, menuliskan nama parameter sebelum value dengan posisi tidak wajib urut
*/
fun namaNamedAugmented(namaAwal: String, namaTengah: String? = "", namaAkhir: String? = "") {
    println("Nama lengkap = $namaAwal $namaTengah $namaTengah")
}
fun main() {
    /* Non Named Augmented */
    namaNamedAugmented("Iqbra", "Kurniawan", "Lecter")

    /* Named Augmented */
    namaNamedAugmented(namaAkhir = "Lecter",
                     namaAwal = "Iqbra",
                     namaTengah = "Kurniawan")
    namaNamedAugmented(namaAwal = "Iqbra")

    /* Campuran */
//    namaNamedAugmented(namaAwal = "Iqbra",
//                    "Lecter",
//                     namaTengah = "Kurniawan") //Tidak urut => error
    namaNamedAugmented(namaAwal = "Iqbra",
                     namaTengah = "Kurniawan",
            "Lecter") //Urut => bisa
}