package app

/*
 ** GETTER: function untuk mengambil/melihat sebuah data
 ** SETTER: function untuk mengubah sebuah data
  * FIELD: kata kunci yang merepresentasikan suatu properties pada sebuah class
    > Apabila properties bersifat immutable (val) maka hanya bisa menggunakan GETTER
    > Diusahakan memakai pengecekan kondisi string kosong di saat setter
    > Penggunaan setter dan getter tidaklah wajib
    > Kita boleh mendeklarasikan salah satu, setter atau getter saja
*/

fun main() {
    class Note(title: String) {
        var title: String = title
//            get() {
//                return field
//            }
            get() = field //Field mengacu pada properties

//            set(value) { //Menggunakan setter tanpa pengecekan
//                field = value
//            }
            set(value) {
                if(value.isNotBlank()) {
                    field = value
                }
            }
    }

    /* Contoh ketika hanya menggunakan getter */
    class BigNote(val title: String) {
        val bigTitle: String
            get() = title.uppercase()
    }

    val note = Note("Belajar Kotlin")
    println(note.title)
    note.title = ""
    println(note.title)

    val bigNote = BigNote("Saya bisa Kotlin")
    println(bigNote.bigTitle)
}