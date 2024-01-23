package f_function

/* FUNCTION RETURN TYPE: function yang mengambalikan nilai.
   -> Perlu menuliskan tipe data pengembalian 
   -> Perlu menuliskan pengembalian (return) yang disesuaikan dengan tipe data pengembalian pada blok kode program
   >  Return bisa dilakukan di beberapa blok kode program, misal pada if else
*/
fun returnIntFunc(a: Int, b: Int): Int {
    return a+b
}
fun returnStringFunc(nama: String): String {
    return "Yoo, $nama"
}
fun returnDoubleFunc(a: Double, b: Double): Double {
    return a*b
}
fun returnDivideFunc(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    } else {
        return a/b
    }
}
fun main() {
    println(returnIntFunc(2,4))
    println(returnStringFunc("Iqbra"))
    println(returnDoubleFunc(2.7, 3.5))
    println(returnDivideFunc(10,0)) //Bisa terkena error karena ZeroDivision
}