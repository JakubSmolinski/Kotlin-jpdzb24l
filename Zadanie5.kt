package Lista1ZJP

/**
 * Funkcja zwracająca elementy ciągu.
 * @author Jakub Smoliński.
 * @param c0 pierwszy wyraz ciągu.
 * @return ciąg Collatza.
  * @throws IllegalArgumentException jeśli c0 nie jest liczbą naturalną.
 */

fun main() {
    try {
        collatz(18)
    } catch (ex: Exception) {
        println("${ex.message}")
    }
}
//Źródło dla funkcji collatz w języku Java: https://www.geeksforgeeks.org/program-to-print-collatz-sequence/
//Funkcja została zamieniona przeze mnie na język Kotlin.
fun collatz(c0: Int) {
    if (c0 <= 0) {
        throw IllegalArgumentException("c0 musi być liczbą naturalną")
    }
    var n = c0
    while (n != 1) {
        print("$n,")
        if (n and 1 == 1) {
            n = 3 * n + 1
        } else {
            n /= 2
        }
    }
    print(n)
}

