class ProblemC {

    fun main() {
        var n: Int
        var studentArray: IntArray
        var result: Int

        val t = readInt()

        for (i in 1..t) {
            n = readInt()
            studentArray = readIntArray(n)
            studentArray.sort()
            result = 0
            for (j in 1 until n step 2) {
                result += studentArray[j] - studentArray[j - 1]
            }
            println(result)
        }

        //ваша реализация в методе main

    }

}