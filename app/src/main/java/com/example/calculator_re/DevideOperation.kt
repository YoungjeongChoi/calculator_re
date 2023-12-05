package com.example.calculator_re

import kotlin.math.round

class DevideOperation: AbstractOperation() {
    @Throws (ArithmeticException::class)
    override fun operate(num1: Double, num2: Double):Double {
        require(num2 != 0.0) {
            ArithmeticException("Devide by Zero")
        }
        return round((num1 * 100)/num2) /100
    }
}