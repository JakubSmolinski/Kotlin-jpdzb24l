package Lista1ZJP

/**
 * Funkcja wypisująca wszystkie podzbiory zbioru 4-elementowego.
 * @author Jakub Smoliński.
 * @param array1 zbiór 4-elementowy.
 * @return Wszystkie podzbiory zbiory 4-elementowego.
 */

fun main(){
    val array1 = arrayOf(2,4,6,8)
    podzbiory(array1)
}

fun podzbiory(array1: Array<Int>){
    val n = array1.size
    for (i in 0 until (1 shl n)){ //podane pętle zostały napisane na podstawie źródła
        //https://www.programiz.com/kotlin-programming/bitwise
        val result = StringBuilder()
        for (j in 0 until n){
            if ((i and (1 shl j)) > 0) {
                result.append(array1[j])
                if (j < n - 1) {
                    result.append(", ")
                }
            }
        }
        println(result)
    }
}

