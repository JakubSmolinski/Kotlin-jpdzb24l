package Lista1ZJP

import kotlin.math.sqrt

/**
 * Funkcja obliczająca pole trójkąta za pomocą wzoru Herona.
 * @author Jakub Smoliński.
 * @param a Długość boku trójkąta.
 * @param b Długość boku trójkąta.
 * @param c Długość boku trójkąta.
 * @return Pole trojkąta
 * @throws IllegalArgumentException jeśli z podanych boków nie można utworzyć trójkąta.
 */

fun main() {
    try {
        heron(23.0, 22.0, 23.0)
        heron(50.0, 22.0, 23.0)
        heron(-1.0, -1.0, -1.0)
    } catch (ex: IllegalArgumentException) {
        println("${ex.message}")
    }
}
fun heron(a: Double, b: Double, c:Double){
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a ){
        throw IllegalArgumentException("Z podanych boków nie można utworzyć trójkąta")
    }
    val p = (a+b+c)/2
    val S = sqrt(p*(p-a)*(p-b)*(p-c))
    println("Trójkąt o bokach $a, $b, $c ma pole równe $S")
}



