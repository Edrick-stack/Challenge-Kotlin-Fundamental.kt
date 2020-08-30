package challenge.menu
import java.util.*

fun main()
{
    val reader = Scanner(System.`in`)
    println("___________________________________________")
    println("Pilih bangunan yang ingin dihitung : ")
    println("1.Balok")
    println("2.Bola")
    println("3.Selesai")
    println("___________________________________________")
    when (reader.nextInt()) {
        1 -> {
            challenge.vbalok.main()
        }
        2 -> {
            challenge.vbola.main()
        }
        3 -> {

        }
    }
}