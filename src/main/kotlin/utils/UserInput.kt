package ie.setu.utils

fun readIntNotNull() = readlnOrNull()?.toIntOrNull()

fun readNextInt(prompt: String?): Int {
    do {
        try {
            print(prompt)
            return readln().toInt()
        } catch (e: NumberFormatException) {
            System.err.println("\tEnter a number please.")
        }
    } while (true)
}

fun readNextChar(prompt: String?): Char {
    do {
        try {
            print(prompt)
            return readln().first()
        } catch (e: NumberFormatException) {
            System.err.println("\tEnter a character please.")
        }
    } while (true)
}

fun readNextDouble(prompt: String?): Double {
    do {
        try {
            print(prompt)
            return readln().toDouble()
        } catch (e: NumberFormatException) {
            System.err.println("\tEnter a double please. ")
        }
    } while (true)
}