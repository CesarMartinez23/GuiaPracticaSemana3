package com.example.guiapracticasemana3

fun main(){

    val test1= sumarCollection(arrayListOf<Int?>(null, null, null))

    //Test
    println("Test1 Passed ${test1==-2}")

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