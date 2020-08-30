package challenge.vbola
import java.util.*
import kotlin.math.PI

fun main()
{
    val reader = Scanner(System.`in`)
    print("Masukkan Jari jari : ")

    val jari = reader.nextDouble()
    val volumepi: Double
    volumepi = bolavol(jari)
    val vbo = String.format("%.2f", volumepi)
    println("________________________________________")
    println("Jadi Volume Bola = $vbo")
    println("Tekan 1 untuk menghitung lagi")
    when (reader.nextInt()) {
        1 -> {
            challenge.menu.main()
        }
    }
}

fun bolavol (jari: Double) : Double
{
    return jari * jari * jari * 4 / 3 * PI
}