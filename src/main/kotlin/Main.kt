fun main() {
    println(" -- TH Parking Car -- ")
    print("Digite quantas horas deseja adquirir: ")
    val horasDiaria = readLine()!!.toInt();
    calculoDiaria(horasDiaria)
}

fun calculoDiaria(horas: Int) {
    val taxaHora = 1
    val taxaDia = 15
    val taxaExtra = 0.5
    var totalPagar = 0.0;

    if (horas <= 5) totalPagar = (horas * taxaHora).toDouble()
    else if (horas == 24) totalPagar += taxaDia
    else if (horas > 24) {
        val horasExed = horas - 24
        totalPagar = 15 + (horasExed * taxaExtra)
    } else {
        val horasExed = horas - 5
        totalPagar = 5 + (horasExed * taxaExtra)
    }

    return println("O total á pagar por $horas horas é R$$totalPagar")
}