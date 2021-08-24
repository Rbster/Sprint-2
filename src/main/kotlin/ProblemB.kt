class ProblemB {
    fun main() {
        var t: Int
        var n: Int
        var k: Int
        var char = 'a'
        var resultBuilder: StringBuilder
        fun min(a: Int, b: Int) = if (a > b) b else a

        t = readInt()

        for (i in 1..t) {
            resultBuilder = StringBuilder()
            n = readInt()
            k = readInt()
            for (j in 0 until min(n, k)) {
                resultBuilder.append((char.toInt() + j % 26).toChar())
            }
            println(resultBuilder.toString())
        }
        //ваша реализация в методе main

    }

}