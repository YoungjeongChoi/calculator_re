package com.example.calculator_re



fun main(){


    println("계산할 첫번째 숫자 입력")
    var num1 = readLine()!!.toInt()

    println("더하기는 add, 빼기는 sub, 곱하기는 mul, 나누기는 div 입력")
    var whatOp = readLine()

    println("계산할 두번째 숫자 입력")
    var num2 = readLine()!!.toInt()


    if(whatOp == "add") {
        val addOp = Calculate(AddOperation())
        println("$num1 더하기 $num2 결과는 : ${addOp.operate(num1, num2)}")
    }else if(whatOp == "sub") {
        val subOp = Calculate(SubstractOperation())
        println("$num1 빼기 $num2 결과는: ${subOp.operate(num1, num2)}")
    }else if(whatOp == "mul") {
        val multOp = Calculate(MultiplyOperation())
        println("$num1 곱하기 $num2 결과는 : ${multOp.operate(num1, num2)}")
    }else if(whatOp == "div") {
        val divOp = Calculate(DevideOperation())
        println("$num1 나누기 $num2 결과는 : ${divOp.operate(num1, num2)}")
    }else {
        println("연산 종류를 다시 입력")
    }






}

//class calculator (num1: Int, num2: Int, operator: String) {
//    var sum = 0
//    init {
//        println("cal")
//    }
//
//    constructor (_num1: Int, _num2: Int, _operator: String) {
//        if(_operator == "+") {
//            sum = _num1 + _num2
//        }else if(_operator == "-") {
//            sum = _num1 - _num2
//        }
//        println("$sum")
//        return sum
//    }
//
//}