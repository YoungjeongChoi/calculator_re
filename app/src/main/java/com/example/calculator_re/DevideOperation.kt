package com.example.calculator_re

import com.example.calculator_re.AbstractOperation
import kotlin.math.round

class DevideOperation: AbstractOperation() {
    @Throws (ArithmeticException::class)
    override fun operate(num1: Int, num2: Int):Double {
        require(num2 != 0) {
            ArithmeticException("Devide by Zero")
        }
        return round((num1.toDouble() * 100)/num2.toDouble())/100
    }
}