package Lista1ZJP

/**
 * Funkcja wypisująca część wspołną z dwóch zbiorów liczb całkowitych.
 * @author Jakub Smoliński.
 * @param array1 zbiór pierwszy.
 * @param array2 zbiór drugi.
 * @return Częśc wspólna zbiorów.
 * @throws IllegalArgumentException jeśli jeden ze zbiorów jest pusty.
 */

fun main() {
    try {
        println(wspolne(arrayOf(1, 3, 6, 9), arrayOf(1, 2, 3, 4, 5, 6, 7, 8)))
        println(wspolne(arrayOf(), arrayOf(1, 2, 3, 4, 5, 6, 7, 8)))
    } catch (ex: IllegalArgumentException) {
        println("${ex.message}")
    }
}

fun wspolne(array1: Array<Int>, array2: Array<Int>): MutableList<Int>{
    if (array1.isEmpty() || array2.isEmpty()) {
        throw IllegalArgumentException("Jedna z tablic jest pusta.")
    }
    val result = mutableListOf<Int>()
    for (i in array1) {
        for (j in array2) {
            if (i == j){
                result.add(i)
                break
            }
        }
    }
    return result
}