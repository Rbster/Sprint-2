class ProblemB {
    fun main() {
        var n: Int
        var k: Int
        var resultBuilder: StringBuilder
        var inputArray: IntArray

        val char = 'a'
        val t = readInt()
        fun min(a: Int, b: Int) = if (a > b) b else a

        for (i in 1..t) {
            resultBuilder = StringBuilder()
            inputArray = readIntArray(2)
            n = inputArray[0]
            k = inputArray[1]
            for (j in 0 until n) {
                resultBuilder.append((char.code + j % k).toChar())
            }
            println(resultBuilder.toString())
        }
        //ваша реализация в методе main

    }

}