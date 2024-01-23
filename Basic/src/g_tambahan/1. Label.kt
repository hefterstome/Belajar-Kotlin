package g_tambahan

import java.awt.Stroke

/* LABEL: sebagai penanda pada kode program.
    > Semua ekspresi bisa dipakaikan label
   -> Cara membuatnya dengan menambahkan karaketer at (@) setelah nama label
      Contoh: iniLabel@
    > Tidak dianjurkan dipakai ketika tidak mendesak
*/
fun main() {
    /* Contoh Label */
    loopI@ for (i in 1..5){
        loopJ@ for (j in 1..5){
            println("$i * $j = ${i*j}")
        }
    }
    println("End program \n")

    /* Penggunaan pada BREAK */
    loopI@ for (i in 1..5){
        loopJ@ for (j in 1..5){
            if (j == 3){
//                break //Break terjadi pada loop J, dan loop I akan tetap berjalan
                break@loopI //Break terjadi pada loop I sehingga semua perulangan berhenti
            }
            println("$i * $j = ${i*j}")
        }
    }
    println("End program \n")

    /* Penggunaan pada CONTINUE */
    loopI@ for (i in 1..5){
        loopJ@ for (j in 1..5){
            if (j == 3){
//                continue //Continue terjadi pada loop J
                continue@loopI //Continue terjadi pada loop I sehingga melanjutkan ke perulangan selanjutnya
            }
            println("$i * $j = ${i*j}")
        }
    }
    println("End program \n")

    /* Penggunaan pada RETURN */
    fun labelReturn(value: String, parameter: (String) -> Unit): Unit {
        parameter(value)
    }
    labelReturn("Iqbra") labelReturn@{
        if (it == "iqbra") {
            return@labelReturn
        } else {
            println("Return else")
        }
    }
}
