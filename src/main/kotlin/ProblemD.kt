class ProblemD {

    fun main() {
        val t = readInt()
        var n: Int
        var optimalIncome: Long
        var currentM: Long
        var currentIncome: Long
        var listOfA: List<Long>

        for (e in 1..t) {
            optimalIncome = 0L
            n = readInt()
            listOfA = readListLong()
            listOfA = listOfA.sorted()
            for (i in 0 until n) {
                currentM = listOfA[i]
                currentIncome = currentM * (n - i)
                if (optimalIncome < currentIncome) {
                    optimalIncome = currentIncome
                }
            }
            println(optimalIncome)
        }

    }

}