package data

class ComparableInterface(val name: String, val quantity: Int): Comparable<ComparableInterface> {
    override fun compareTo(other: ComparableInterface): Int { //Harus dioverride karena interface Comprable punya func compareTo
        return quantity.compareTo(other.quantity)
    }
}