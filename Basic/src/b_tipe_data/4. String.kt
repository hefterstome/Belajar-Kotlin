package b_Tipe_Data

/* String (String): tipe data yang berisikan sekumpulan karakter atau biasa disebut teks.
   -> Satu baris memakai petik dua (" ")
   ->1 baris memakai petik dua tiga kali (""" """)
*/
fun main() {
    /*  INTEGER */
    val namaAwal = "Iqbra"
    val namaAkhir = "Kurniawan"
    val alamat = """
        Jalan Intellij No. 1,
        Kota Kotlin,
        Provinsi JetBrains
    """
    println(alamat)

    /*  Trim Margin
        -> Digunakan untuk menghapus jarak/spasi yang ada dikarenakan memakai petik dua 3x
        -> Default (Menambahkan char |)
    */
    val trimMargin1 = """
        |Hei, yo!
        |I'm an engineer, nice to meet you.
        |Can I help you, dude?
    """.trimMargin()
    println(trimMargin1)

    /*  Trim Margin pakai Simbol Sendiri */
    val trimMargin2 = """
        *Hei, yo!
        *I'm an engineer, nice to meet you.
        *Can I help you, dude?
    """.trimMargin(marginPrefix = "*")
    println(trimMargin2)

    /*  Menggabungkan String */
//    val subjek = "Iqbra"
//    val predikat = "is"
//    val objek = "an engineer"
//    val kalimat = subjek+" "+predikat+" "+objek
//    println(kalimat)

    /*  String Template
        -> Digunakan untuk mengakses data dari luar teks String.
        -> Disimbolkan dengan data $
        -> Jika terdapat ekspresi komplek menggunakan ${isi ekspresi}
    */
    val subjek = "Iqbra"
    val predikat = "is"
    val objek = "an engineer"
    val kalimat = "$subjek $predikat $objek"
    println(kalimat)
    //Ekpresi kompleks
    val panjangKalimat = "Total char '$kalimat' = ${kalimat.length}" //Kenapa ${kalimat.length}? Karena kode ini membutuhkan 2 proses, yaitu fungsi ekspresi dan fungsi lenght
    println(panjangKalimat)
}
