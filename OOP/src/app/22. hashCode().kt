package app

import app

/*
 ** hasCode(): function yang merepresentasikan number pada sebuah object
    > Sangat berguna ketika ingin me-konversi data String ke number
    > Hasil hasCode berbentuk kode unik seperti alamat penyimpanan
*/
fun main() {
    class Customer(name: String) {
        override fun hashCode(): Int {
            return name.hasCode()
        }
    }
}