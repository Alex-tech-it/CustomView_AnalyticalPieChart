package com.example.analyticalpiechart.extension

/**
 * @author Alex-tech-it
 * Github - https://github.com/Alex-tech-it
 */

import android.graphics.Canvas
import android.text.StaticLayout
import androidx.core.graphics.withTranslation

/**
 * StaticLayout Extension для удобства отрисовки текста.
 */
fun StaticLayout.draw(canvas: Canvas, x: Float, y: Float) {
    canvas.withTranslation(x, y) {
        draw(this)
    }
}