fun main() {
    val size = 5
    val matrix = Array(size) { IntArray(size) }

    println("Введите элементы массива 5x5:")
    for (i in 0 until size) {
        for (j in 0 until size) {
            print("matrix[$i][$j] = ")
            matrix[i][j] = readln().toInt()
        }
    }

    println("\nВведенный массив:")
    printMatrix(matrix)

    val isSymmetric = checkSymmetry(matrix)

    if (isSymmetric) {
        println("✓ Массив симметричен относительно главной диагонали")
    } else {
        println("✗ Массив НЕ симметричен относительно главной диагонали")
    }
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
}

fun checkSymmetry(matrix: Array<IntArray>): Boolean {
    for (i in matrix.indices) {
        for (j in i + 1 until matrix[i].size) {
            if (matrix[i][j] != matrix[j][i]) {
                return false
            }
        }
    }
    return true
}