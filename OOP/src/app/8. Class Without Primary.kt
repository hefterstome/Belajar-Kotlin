package app

/*
 * Kita 
 */

fun main() {
    class Address {
        var street: String = ""
        var city: String = ""
        var country: String = "Indonesia"

        constructor(streetParam: String, cityParam: String) {
            street = streetParam
            city = cityParam
        }
        constructor(streetParam: String, cityParam: String, countryParam: String)
            :this(streetParam,cityParam) {
                country = countryParam
            }
    }

    val address1 = Address("Jalan Kotlin","Surabaya","Indonesia")
    val address2 = Address("Jalan Python","NYC")

    println(address1.country)
    println(address2.country )

}