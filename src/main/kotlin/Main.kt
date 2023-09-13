fun main() {
//Challenge 1
    val letter: Char = 'a';
    val name: String = "Evan";
    val money: Float = 25.55F;
    val temp: Short = 12;

    /* To me a type is essentially what a variable is. We name and declare types of variables
       for use in our code. The type truly defines what we want and defines the way a variable
       behaves and interacts */

//Challenge 1 printed
    println("Letter: $letter");
    println("My Name: $name");
    println("Money: $money");
    println("Temperature: $temp");

//Challenge 2
    var age = 28;
    var changeAmt = 2.45;
    var gradeScores = intArrayOf(45, 34, 23);

//Challenge 2 Printed
    println("My age: $age");
    println("Change due: $changeAmt");
    println("Report Card Scores: $gradeScores");


//Challenge 3
    val operand1 = 25;
    val operand2 = 100;

    val sum = operand1 + operand2;
    val difference = operand1 - operand2;
    val product = operand1 * operand2;
    val quotient = operand1 / operand2;

//    Challenge 3 Printed
    println("Sum: $sum");
    println("Difference: $difference");
    println("Product: $product");
    println("Quotient: $quotient");

//Challenge 4
    val language = "Javascript";

    fun printPreferredLanguage() {
        if (language.isNotEmpty()) {
            println("I Love $language");
        }
    }
     /* In order to do this challenge I had to do a bit of research on an appropriate function to use
     to check if the string is not empty. isNotEmpty works perfectly in this case as it was requested
     that the function not print if the string was empty. I found my info on the notEmpty function here
     https://www.techiedelight.com/check-if-string-is-empty-or-null-kotlin/#:~:text=Using%20isEmpty()%20function,
     preceded%20by%20a%20null%20check.&text=To%20check%20for%20the%20opposite,use%20the%20isNotEmpty()%20function.
     As far as writing the function itself, it just took some educated guesses. */

//Challenge 4 Printed
    printPreferredLanguage();

}
