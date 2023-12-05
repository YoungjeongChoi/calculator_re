package com.example.calculator_re


class DevideOperation: AbstractOperation() {
    @Throws (ArithmeticException::class)
    override fun operate(num1: Double, num2: Double):Double {
        require(num2 != 0.0) {
            ArithmeticException("Devide by Zero")
        }
        return String.format("%.3f", (num1/num2)).toDouble()

    }
}