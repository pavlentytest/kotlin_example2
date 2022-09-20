import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello world!")
    }

    fun test1() {
        //Задача №315. Сумма квадратов
        val `in` = Scanner(System.`in`)
        val n = `in`.nextInt()
        var s = 0
        for (i in 1..n) {
            s += i * i
        }
        println(s)
    }

    fun test2() {
        // Задача №254. Ладья
        val sc = Scanner(System.`in`)
        val x1 = sc.nextInt()
        val y1 = sc.nextInt()
        val x2 = sc.nextInt()
        val y2 = sc.nextInt()
        if (x1 == x2 || y1 == y2) {
            println("YES")
        } else {
            println("NO")
        }
    }
}