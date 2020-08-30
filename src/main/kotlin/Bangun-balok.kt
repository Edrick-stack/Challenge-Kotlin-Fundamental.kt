package challenge.vbalok
import java.util.*

fun main ()
{
    val reader = Scanner(System.`in`)
    print("Masukan panjang : ")

    val length = reader.nextDouble()
    print("Masukan lebar : ")

    val width = reader.nextDouble()
    print("Masukan Tinggi : ")

    val height = reader.nextDouble()
    val volume : Double
    volume = rectangularvol(length, width, height)
    val vba = String.format("%.2f", volume)
    println("__________________________________")
    println("Volume Balok $vba")
    println("Tekan 1 untuk ulangi")
    when (reader.nextInt()){
        1 -> {
            challenge.menu.main()
        }
    }
}

fun rectangularvol (length: Double, width: Double, height: Double): Double
{
    return length * width * height
}