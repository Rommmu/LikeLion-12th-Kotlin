package lecture30

fun main() {
    var bitData: Int = 0b10000

    bitData = bitData or (1 shl 2)
    println(bitData.toString(2))

    var result = bitData and(1 shl 4)
    println(result.toString(2))

    println(result shr 4)

    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))
}