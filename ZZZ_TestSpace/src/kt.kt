const val MOD = 1000000007
fun main(args: Array<String>) {
    val s = `in`.nextLine()
    val c = s[0]
    var flag = false
    for (i in 1 until s.length) {
        if (c != s[i]) {
            flag = true
        }
    }
    if (flag) {
        println("Yes")
    } else {
        println("No")
    }
}

fun next(): String {
    return readLine()!!
}

fun nextInt(): Int {
    return next().toInt()
}

fun nextDouble(): Double {
    return next().toDouble()
}

fun nextLong(): Long {
    return next().toLong()
}

fun nextIntArray(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = nextInt()
    }
    return array
}

fun nextDoubleArray(n: Int): DoubleArray {
    val array = DoubleArray(n)
    for (i in 0 until n) {
        array[i] = nextDouble()
    }
    return array
}

fun nextLongArray(n: Int): LongArray {
    val array = LongArray(n)
    for (i in 0 until n) {
        array[i] = nextLong()
    }
    return array
}

fun nextLineArray(n: Int): Array<String?> {
    val array = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        array[i] = next()
    }
    return array
}

fun nextIntMatrix(n: Int, m: Int): Array<IntArray> {
    val matrix = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrix[i][j] = nextInt()
        }
    }
    return matrix
}

fun nextDoubleMatrix(n: Int, m: Int): Array<DoubleArray> {
    val matrix = Array(n) { DoubleArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrix[i][j] = nextDouble()
        }
    }
    return matrix
}

fun nextLongMatrix(n: Int, m: Int): Array<LongArray> {
    val matrix = Array(n) { LongArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrix[i][j] = nextLong()
        }
    }
    return matrix
}


}
