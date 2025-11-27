package org.example.project

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class SizeInfo(
    width: Float,
    height: Float,
    xMin: Float,
    xMax: Float,
    yMin: Float,
    yMax: Float,
) {
    var width by mutableStateOf(width)
    var height by mutableStateOf(height)
    var xMin by mutableStateOf(xMin)
    var xMax by mutableStateOf(xMax)
    var yMin by mutableStateOf(yMin)
    var yMax by mutableStateOf(yMax)

    fun ifChangedX() {
        val pix = width / (xMax - xMin)
        val y = height / pix
        val yMean = (yMax + yMin) / 2
        yMin = yMean - y/2
        yMax = yMean + y/2
    }

    fun ifChangedY() {
        val pix = width / (yMax - yMin)
        val x = height / pix
        val xMean = (xMax + xMin) / 2
        xMin = xMean - x/2
        xMax = xMean + x/2
    }

}
