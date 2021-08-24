class ProblemB {
    fun main() {
        var n: Int
        var k: Int
        var resultBuilder: StringBuilder

        val char = 'a'
        val t = readInt()
        fun min(a: Int, b: Int) = if (a > b) b else a

        for (i in 1..t) {
            resultBuilder = StringBuilder()
            n = readInt()
            k = readInt()
            for (j in 0 until min(n, k)) {
                resultBuilder.append((char.code + j % 26).toChar())
            }
            println(resultBuilder.toString())
        }
        //ваша реализация в методе main

    }

}