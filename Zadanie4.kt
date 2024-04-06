package Lista1ZJP

/**
 * Funkcja wypisująca wyrazy ciągu Fibonacciego w zależności od n.
 * @author Jakub Smoliński.
 * @param n liczba wyrazów ciągu.
 * @return N początkowych wyrazów ciągu Fibonacciego.
 */

fun main() {
    var n: Int
    do {
        println("Podaj wartość n (liczba naturalna większa od zera):")
        val input = readLine()
        n = input?.toIntOrNull() ?: 0
    } while (n <= 0)
    printFibonacci1(n)
    printFibonacci2(n)
}
//Źródło metody 1: // https://www.baeldung.com/kotlin/fibonacci-series
fun fibonacci1(n: Int): Int{
    var F0 = 0
    var F1 = 1
    var tmp: Int
    for (i in 1.. n) {
        tmp = F0 + F1
        F0 = F1
        F1 = tmp
    }
    return F1
}
fun printFibonacci1(n: Int) {
    for (i in 0 until n) {
        println("Fibonacci1($i) = ${fibonacci1(i)}")
    }
}
//Źródło metody 2: // https://www.baeldung.com/kotlin/fibonacci-series
fun fibonacci2(n: Int): Int{
    return if (n <= 1) {
        n
    } else {
        fibonacci2(n- 1) + fibonacci2(n - 2)
    }
}
fun printFibonacci2(n: Int) {
    for (i in 0 until n) {
        println("Fibonacci2($i) = ${fibonacci2(i)}")
    }
}