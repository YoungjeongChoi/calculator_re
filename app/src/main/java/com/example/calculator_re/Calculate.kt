package com.example.calculator_re


open class Calculate(private val operator: AbstractOperation) {
    open fun operate(num1: Double, num2: Double): Double {
        return operator.operate(num1, num2)
    }
}