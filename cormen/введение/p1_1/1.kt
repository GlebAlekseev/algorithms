package cormen.введение.p1_1

fun main(){
    val arrayExample = arrayOf(31,41,59,26,41,58)
    println(arrayExample.toList())
    insertionSort(arrayExample)
    println(arrayExample.toList())

}



fun insertionSort(array: Array<Int>){
    for (j in 1 until array.size){
        val key = array[j]
        var i = j-1
        while (i >= 0 && array[i] > key){
            array[i+1] = array[i]
            i--
        }
        array[i+1] = key
    }
}