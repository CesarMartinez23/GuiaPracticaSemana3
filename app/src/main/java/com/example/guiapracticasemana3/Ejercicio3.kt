package com.example.guiapracticasemana3

fun main() {

    val test1 = searchData(arrayListOf(5,80,90),10)
    val test2 = searchData(arrayListOf(5,80,90),90)

    //Test
    println("Test1 Passed ${test1=="The entered data does not exist"}")
    println("Test2 Passed ${test2=="2"}")
}

fun searchData(arrayCollection : List<Int>, data : Int): String {
    var res = ""
    if (arrayCollection.contains(data)){
        res = arrayCollection.indexOf(data).toString()
    }else{
        res = "The entered data does not exist"
    }
    return res
}