fun main() {
    var murid : String? = null
    var muridLength = murid?.length ?: 23
    println(muridLength)

    var jumlah : String? = null
    var jumlahLength = jumlah?.length ?: "Banyak"
    println(jumlahLength)

    var kualitas : String? = null
    var kualitasLength = kualitas?.length ?: "Baik"
    println(kualitasLength)
}