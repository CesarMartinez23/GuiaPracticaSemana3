package com.example.guiapracticasemana3

fun main() {

    val test1 = searchData(arrayListOf(5,80,90),10)
    val test2 = searchData(arrayListOf(5,80,90),90)
    val test3 = searchData(arrayListOf(10,15,30),10)
    val test4 = searchData(arrayListOf(7,18,22),22)
    val test5 = searchData(arrayListOf(3,5,7),5)
    val test6 = searchData(arrayListOf(8,12,14),8)
    val test7 = searchData(arrayListOf(14,70,60),50)
    val test8 = searchData(arrayListOf(10,19,20),19)
    val test9 = searchData(arrayListOf(6,8,10),6)
    val test10 = searchData(arrayListOf(1,2,3),4)

    //Test
    println("Test1 Passed ${test1=="The entered data does not exist"}")
    println("Test2 Passed ${test2=="2"}")
    println("Test3 Passed ${test3=="0"}")
    println("Test4 Passed ${test4=="2"}")
    println("Test5 Passed ${test5=="1"}")
    println("Test6 Passed ${test6=="0"}")
    println("Test7 Passed ${test7=="The entered data does not exist"}")
    println("Test8 Passed ${test8=="1"}")
    println("Test9 Passed ${test9=="0"}")
    println("Test10 Passed ${test10=="The entered data does not exist"}")
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