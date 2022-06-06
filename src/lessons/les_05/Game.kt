package lessons.les_05

import java.awt.Choice

fun main() {
    val option = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(option)
    // Вызов функции getUserChoice
    val userChoice = getUserChoice(option)
    printResult(userChoice, gameChoice)
}


fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    // Эта переменая будет показывать, ввел ли пользователь допустимый вариант
    var isValidChoice = false
    var userChoice = ""
    // Выпольнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {

        // Запросить у пользователя его выбор
        print("Пожалуйста введите одно слово из предложенных: ")
        for (item in optionsParam) print(" $item")
        print(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        // Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            // если ввод пользователя прошел проверку, цикл прерывается
            isValidChoice = true
            userChoice = userInput
        }
        // если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("Ты ввел неправельное слово")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //определить результат
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Камень" && gameChoice == "Ножницы") ||
        (userChoice == "Бумага" && gameChoice == "Камень") ||
        (userChoice == "Ножницы" && gameChoice == "Бумага")) result = "Ты победил!"
    else result = "Ты проиграл!"
    //вывести результат
    println("Ты загадал $userChoice. Я загадал $gameChoice. $result")
}