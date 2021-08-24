class ProblemA {

    fun main() {
        var a: Long
        var b: Long
        var k: Long
        var position:Long
        var listLong: List<Long>

        val t = readInt()

        for (i in 1..t) {
            listLong = readListLong()
            a = listLong[0]
            b = listLong[1]
            k = listLong[2]
            position = 0L
            for (j in 1..k) {
                position = if ((j - 1L) % 2L == 0L) position + a else position - b
            }
            println(position)
        }

    }

}