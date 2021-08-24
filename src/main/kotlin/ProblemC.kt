class ProblemC {

    fun main() {
        val n = readInt()
        val studentArray = readIntArray(n)
        var result = 0

        studentArray.sort()
        for (j in 1 until n step 2) {
            result += studentArray[j] - studentArray[j - 1]
        }
        println(result)


        //ваша реализация в методе main

    }

}