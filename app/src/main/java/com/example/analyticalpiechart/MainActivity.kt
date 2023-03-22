package com.example.analyticalpiechart

/**
 * @author Alex-tech-it
 * Github - https://github.com/Alex-tech-it
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.analyticalpiechart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.analyticalPieChart1.setDataChart(
            listOf(Pair(4, "Свои проекты"), Pair(6, "Соместные проекты"), Pair(6, "Проекты поддержанные группой людей"), Pair(2, "Неизвестные проекты"))
        )
        binding.analyticalPieChart1.startAnimation()

        binding.analyticalPieChart2.setDataChart(
            listOf(Pair(60000, "Доходы"), Pair(25000, "Расходы"))
        )
        binding.analyticalPieChart2.startAnimation()

        binding.analyticalPieChart3.setDataChart(
            listOf(Pair(6, "Олени долгожители России"), Pair(2, "Медведи"), Pair(2, "Краснокнижные медоеды"))
        )
        binding.analyticalPieChart3.startAnimation()

        binding.analyticalPieChart4.setDataChart(
            listOf(Pair(100, "Упакованно товаров"), Pair(200, "Отказ от товара компании"), Pair(300, "Брак на производстве"))
        )
        binding.analyticalPieChart4.startAnimation()

        binding.analyticalPieChart5.setDataChart(
            listOf(
                Pair(1, "Товар 1"),
                Pair(2, "Товар 2"),
                Pair(3, "Товар 3"),
                Pair(3, "Товар 4"),
                Pair(8, "Товар 5"),
                Pair(2, "Товар 6"),
                Pair(8, "Товар 7"),
                Pair(5, "Товар 8"),
                Pair(8, "Товар 9"),
                Pair(12, "Товар 10")
            )
        )
        binding.analyticalPieChart5.startAnimation()

        binding.analyticalPieChart6.setDataChart(
            listOf(
                Pair(145234, "Убытки в сфере менеджмента и корпоративного взаимодействия"),
                Pair(4215689, "Убытки в сфере производства, планирования и реализации"),
                Pair(653125, "Убытки в репутационной сфере"),
                Pair(952124, "Другие убытки")
            )
        )
        binding.analyticalPieChart6.startAnimation()

        binding.analyticalPieChart7.setDataChart(listOf(Pair(145, "За"), Pair(42, "Против")))
        binding.analyticalPieChart7.startAnimation()

        binding.analyticalPieChart8.setDataChart(listOf(Pair(15, "Голос"), Pair(92, "Нет голоса")))
        binding.analyticalPieChart8.startAnimation()

        binding.analyticalPieChart9.setDataChart(listOf(Pair(0, "Убрать"), Pair(61, "Добавить")))
        binding.analyticalPieChart9.startAnimation()
    }
}