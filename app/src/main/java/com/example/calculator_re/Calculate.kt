package com.example.calculator_re


open class Calculate(val operator: AbstractOperation) {
    open fun operate(num1: Int, num2: Int): Double {
        return operator.operate(num1, num2)
    }
}