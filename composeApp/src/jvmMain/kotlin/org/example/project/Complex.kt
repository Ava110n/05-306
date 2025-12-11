package org.example.project

import kotlin.math.sqrt

class Complex {
    val x: Float
    val y: Float

    constructor(x: Float, y: Float) {
        this.x = x
        this.y = y
    }

    constructor(cartesian: Cartesian) {
        this.x = cartesian.x
        this.y = cartesian.y
    }

    operator fun plus(c: Complex): Complex {
        return Complex(this.x + c.x, this.y + c.y)
    }

    operator fun times(c: Complex): Complex {
        return Complex(
            this.x * c.x - this.y * c.y,
            this.x * c.y + this.y * c.x
        )
    }

    fun abs() = sqrt(this.x * this.x + this.y * this.y)
}