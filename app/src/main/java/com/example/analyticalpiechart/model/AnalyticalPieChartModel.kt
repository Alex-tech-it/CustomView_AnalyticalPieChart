package com.example.analyticalpiechart.model

/**
 * @author Alex-tech-it
 * Github - https://github.com/Alex-tech-it
 */

import android.graphics.Color
import android.graphics.CornerPathEffect
import android.graphics.Paint

/**
 * Представляет собой модель хранения смежной информации о рисуемом объекте диаграммы.
 *
 * После добавления переменных в primary constructor, вызывается блок init {},
 * в котором переданные в модель значения ампроксимурются к значениям процента круговой диаграммы.
 *
 * Модель состоит и следующих параметров:
 * @property percentOfCircle - значение занимаемого процента круговой диаграммы.
 * @property percentToStartAt - значение положения на круговой диаграмме,
 * откуда должен начать отрисовываться объект.
 * @property colorOfLine - значение цвета для отрисовки линии объекта.
 * @property stroke - значение ширины линии объекта.
 * @property paint - объект кисти отрисовки
 * @property paintRound - закругление концов линии объекта.
 */
data class AnalyticalPieChartModel(
    var percentOfCircle: Float = 0F,
    var percentToStartAt: Float = 0F,
    var colorOfLine: Int = 0,
    var stroke: Float = 0F,
    var paint: Paint = Paint(),
    var paintRound: Boolean = true
) {
    /**
     * Блок, в котором значения преобразуются к приближенным значениям круговой диаграммы.
     * То есть в модель передается процент (от 0 до 100).
     */
    init {
        // Проверка на корректность переданного процента.
        if (percentOfCircle < 0 || percentOfCircle > 100) {
            percentOfCircle = 100F
        }

        // Расчет переданного значения на круговой диаграмме.
        percentOfCircle = 360 * percentOfCircle / 100

        // Проверка на корректность переданного процента.
        if (percentToStartAt < 0 || percentToStartAt > 100) {
            percentToStartAt = 0F
        }

        // Расчет переданного значения на круговой диаграмме.
        percentToStartAt = 360 * percentToStartAt / 100

        /** Установка своего цвета в случаи пропуска [colorOfLine]  */
        if (colorOfLine == 0) {
            colorOfLine = Color.parseColor("#000000")
        }

        // Инициализация кисти для отрисовки
        paint = Paint()
        paint.color = colorOfLine
        paint.isAntiAlias = true
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = stroke
        paint.isDither = true;

        // Проверка необходимости закругления концов линии объекта.
        if (paintRound){
            paint.strokeJoin = Paint.Join.ROUND;
            paint.strokeCap = Paint.Cap.ROUND;
            paint.pathEffect = CornerPathEffect(8F);
        }
    }
}