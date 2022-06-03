package lessons.les_05

fun main() {
    val option = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(option)
    // Вызов функции getUserChoice
    val userChoice = getUserChoice(option)
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