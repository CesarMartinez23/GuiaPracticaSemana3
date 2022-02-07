package com.example.guiapracticasemana3

fun main() {
    val test1 = readArrayCollection(listOfNotNull<Int>(null,null,null))
    val test2 = readArrayCollection(listOfNotNull<Int>(20,12,18))
    val test3 = readArrayCollection(listOfNotNull<Int>())
    val test4 = readArrayCollection(listOfNotNull<Int>(4,5,6))
    val test5 = readArrayCollection(listOfNotNull<Int>(null,null,null))
    val test6 = readArrayCollection(listOfNotNull<Int>(50,60,80))
    val test7 = readArrayCollection(listOfNotNull<Int>(3,4,6))
    val test8 = readArrayCollection(listOfNotNull<Int>(9,10,7))
    val test9 = readArrayCollection(listOfNotNull<Int>())
    val test10 = readArrayCollection(listOfNotNull<Int>(1,8,9))

    //Test
    println("Test1 Passed ${test1.toList().isEmpty()}")
    println("Test2 Passed ${test2 ==listOfNotNull<Int>(20,18,12)}")
    println("Test3 Passed ${test3.toList().isEmpty()}")
    println("Test4 Passed ${test4 ==listOfNotNull<Int>(6,5,4)}")
    println("Test5 Passed ${test5.toList().isEmpty()}")
    println("Test6 Passed ${test6 ==listOfNotNull<Int>(80,60,50)}")
    println("Test7 Passed ${test7 ==listOfNotNull<Int>(6,4,3)}")
    println("Test8 Passed ${test8 ==listOfNotNull<Int>(10,9,7)}")
    println("Test9 Passed ${test9.toList().isEmpty()}")
    println("Test10 Passed ${test10 ==listOfNotNull<Int>(9,8,1)}")
}

fun readArrayCollection(arrayCollection: List<Int>) : List<Int> {

    var newArrayReturn = listOfNotNull<Int>()

    if (arrayCollection.isEmpty()) else newArrayReturn = arrayCollection.sortedDescending()

    return newArrayReturn
}