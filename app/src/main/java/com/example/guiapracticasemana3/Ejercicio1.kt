package com.example.guiapracticasemana3

fun main(){

    val test1= sumarCollection(arrayListOf<Int?>(null, null, null))
    val test2= sumarCollection(arrayListOf<Int?>())
    val test3= sumarCollection(arrayListOf<Int?>(2,4,6))
    val test4= sumarCollection(arrayListOf<Int?>(null,8,6))
    val test5= sumarCollection(arrayListOf<Int?>(7,8,9))
    val test6= sumarCollection(arrayListOf<Int?>(6,8,4))
    val test7= sumarCollection(arrayListOf<Int?>())
    val test8= sumarCollection(arrayListOf<Int?>(20,50,100))
    val test9= sumarCollection(arrayListOf<Int?>(15,null,30))
    val test10= sumarCollection(arrayListOf<Int?>(3,14,16))

    //Test
    println("Test1 Passed ${test1==-2}")
    println("Test2 Passed ${test2==-1}")
    println("Test3 Passed ${test3==12}")
    println("Test4 Passed ${test4==-2}")
    println("Test5 Passed ${test5==24}")
    println("Test6 Passed ${test6==18}")
    println("Test7 Passed ${test7==-1}")
    println("Test8 Passed ${test8==170}")
    println("Test9 Passed ${test9==-2}")
    println("Test10 Passed ${test10==33}")

}

fun sumarCollection(arr : ArrayList<Int?>): Int{
    var res=0
    if(arr.contains(null)){
        res=-2
    }else if(arr.isEmpty()){
        res=-1
    }else{
        for(number in arr){
            if (number != null) {
                res+= number
            }
        }
    }
    return res
}