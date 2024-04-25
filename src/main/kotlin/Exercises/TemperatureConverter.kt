package Exercises

fun main() {
    printFinalTemperature(27.0,"Celcius","Fahrenheit") { ((9.0/ 5.0)*it + 32) }
    printFinalTemperature(350.0,"Kelvin","Celcius") { it - 273.14}
    printFinalTemperature(10.0,"Fahrenheit","Kelvin") { it*(5.0/9.0)-32 + 273.15 }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}