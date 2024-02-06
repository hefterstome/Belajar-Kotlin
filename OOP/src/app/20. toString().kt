package app

/*
 ** toString(): function bawaan dari class Any
    > Untuk merepresentasikan String dari sebuah Object
    > Saat kita melakukan println() sebenarnya yang terjadi adalah kita memanggil func toString()
    > Secara default toString() akan mengembalikan kode unik/address penyimpanan dari sebuah objek
    > Kita dapat me-override toString() sesuai yang kita mau apabila ingin merubah representasi String dari Object kita
*/
fun main() {
    class User(var username: String, var password: String) {
        override fun toString(): String { //Menunjukkan class Any bersifat open secara default
            return "User dengan username = $username"
        }
    }

    val admin = User("admin","admin1")
//    println(admin.toString()) //Tidak perlu ditulis .toString() karena println akan memanggil func toString()
    println(admin) //Membuktikan bahwa println sebenarnya memanggil toString() dengan tidak ditulisnya toString()

//    println(admin) //Jika override dihapus, akan mengembalikan kode unik object
}