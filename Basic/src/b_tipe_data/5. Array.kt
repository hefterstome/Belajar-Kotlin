package b_Tipe_Data

/* Array: tipe data yang berisikan sekumpulan data dengan tipe data yang sama
   -> Pada Kotlin, Array tidak bisa memiliki beda tipe data
   -> Array pada Kotlin bersifat fiks ukurannya, jika ingin array dinamis pada kotlin namanya list
   -> Dipresentasikan dengan Array

** Indeks pada Array dimulai dari 0. Tidak seperti di Python, jika indeks melebihi length array akan eror, jadi tidak ada -1,-2,...

** Operasi Array
   1. size               :mendapatkan panjang array
   2. get(index)         :mendapatkan data di posisi index
   3. [index]            :mendapatkan data di posisi index
   4. set(index,value)   :mengubah data di posisi index
   5. [index]=value      :mengubah data di posisi index

** Array Nullable: digunakan ketika ada data pada array bersifat null.
   -> Array nullable sangat tidak dianjurkan pada kotlin
   -> Menggunakan tanda tanya (?)
*/

fun main() {
    /* Membuat Array */
    val bahasa: Array<String> = arrayOf("Python", "C++", "Java", "Kotlin", "JavaScript")
    println(bahasa)
    val tahun = arrayOf(19_89, 19_83, 19_91, 20_11, 19_95)
    val nilai: Array<Byte> = arrayOf(85,80,90,90,85)

    /* Operasi Array */
    val bahasa1: String = bahasa[0]
    val bahasa2 = bahasa[1]
    val bahasa3 = bahasa.get(2)
    println(bahasa1)
    println(bahasa2)
    println(bahasa3)

    bahasa.set(0,"PHP")
    val bahasa1ubah = bahasa[0]
    println(bahasa1ubah)

    //Error over length
//    val bahasa7 = bahasa[6]

    /* Array Nullable */
    val arrayNullable: Array<String?> = arrayOfNulls(5)
    arrayNullable.set(0, "Python")
    arrayNullable.set(2, "Kotlin")
    arrayNullable.set(4, "Java")
    arrayNullable.set(3, null)
    arrayNullable.set(1, null)

    println("$arrayNullable[0]")
    val arrayNullable1 = arrayNullable[0]
    val arrayNullable2 = arrayNullable[1]
    val arrayNullable3 = arrayNullable[2]
    val arrayNullable4 = arrayNullable[3]
    val arrayNullable5 = arrayNullable[4]

    println(arrayNullable1)
    println(arrayNullable2)
    println(arrayNullable3)
    println(arrayNullable4)
    println(arrayNullable5)

}