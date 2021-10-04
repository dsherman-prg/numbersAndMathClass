import java.text.DecimalFormat

fun main() {
    // Initialize variables
    val tax = .025
    val tip = .175
    var costs = 0

    val roundTwoDigits = DecimalFormat ("$###,###,###,###.00")

    // Inform the user how this works
    println("Please enter the cost of items and enter 0 when you are done.")
    do {
        // Get user input and add it to the rolling total
        val userInput = readLine()!!.toInt()
        costs += userInput

    // Exit when 0 is entered
    }while (userInput != 0)

    // Round out the values
    val roundedCost = roundTwoDigits.format(costs)
    val roundedTax = roundTwoDigits.format(costs * tax)
    val roundedTotal = roundTwoDigits.format(costs + (costs * tax))
    val roundedTip = roundTwoDigits.format(costs * tip)

    // Print the values to the user
    println("Cost: $roundedCost")
    println("Tax: $roundedTax")
    println("Total Cost: $roundedTotal")
    println("Recommended Tip: $roundedTip")
}
