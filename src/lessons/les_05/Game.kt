package lessons.les_05

fun main() {
    val option = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(option)
}


fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]