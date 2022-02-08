package com.example.guiapracticasemana3

fun main() {

    val test1 = matriz(2)
    val test2 = matriz(3)
    val test3 = matriz(4)
    val test4 = matriz(5)
    val test5 = matriz(6)
    val test6 = matriz(7)
    val test7 = matriz(8)
    val test8 = matriz(9)
    val test9 = matriz(10)
    val test10 = matriz(1)

    //    Test
    //    test1 = [[2, 2], [2, 2], [8]]
    println("Test1 Passed ${test1==test1}")

    //    test2 = [[3, 3, 3], [3, 3, 3], [3, 3, 3], [27]]
    println("Test2 Passed ${test2==test2}")

    //    test3 = [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [64]]
    println("Test3 Passed ${test3==test3}")

    //    test4 = [[5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [125]]
    println("Test4 Passed ${test4==test4}")

    //    test5 = [[6, 6, 6, 6, 6, 6], [6, 6, 6, 6, 6, 6], [6, 6, 6, 6, 6, 6], [6, 6, 6, 6, 6, 6], [6, 6, 6, 6, 6, 6], [6, 6, 6, 6, 6, 6], [216]]
    println("Test5 Passed ${test5==test5}")

    //    test6 = [[7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [7, 7, 7, 7, 7, 7, 7], [343]]
    println("Test6 Passed ${test6==test6}")

    //    test7 = [[8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [8, 8, 8, 8, 8, 8, 8, 8], [512]]
    println("Test7 Passed ${test7==test7}")

    //    test8 = [[9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [9, 9, 9, 9, 9, 9, 9, 9, 9], [729]]
    println("Test8 Passed ${test8==test8}")

    //    test9 = [[10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [10, 10, 10, 10, 10, 10, 10, 10, 10, 10], [1000]]
    println("Test9 Passed ${test9==test9}")

    //    test10 = [[1], [1]]
    println("Test10 Passed ${test10==test10}")
}

fun matriz(number : Int) : List<List<Int>> {

    val arrayDataSumTotalArray = List(1){(number*number*number)}
    var arrayInitial = List(number){number}

    for (i in 0 until number){
        arrayInitial = List(number){number}
    }

    val finalyArray = MutableList(number){arrayInitial}
    finalyArray.add(number,arrayDataSumTotalArray)

    return finalyArray
}