fun main(){

    val postTest = 90
    val attendance = 80

    val passPostTest = postTest > 80
    val passAttendance = attendance > 75

    val pass = passPostTest && passAttendance
    println(pass)

    val jumlahTotal = 70
    val nilaiSikap = 60

    val passJumlahTotal = jumlahTotal > 75
    val passNilaiSikap = nilaiSikap > 75

    val fail = passJumlahTotal && passNilaiSikap
    println(fail)
}