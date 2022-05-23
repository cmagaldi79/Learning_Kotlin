/* DataTypes.kt:
   O objetivo deste programa é o de demonstrar a
   declaração de variáveis de todos os tipos de
   dados tratados pelo Kotlin.

   Autor:
   Carlos E. M. Magaldi */

// Função principal...
fun main() {
    // Declaração de variáveis...
    val myChar: Char
    val myString: String
    val myMinByte: Byte
    val myMaxByte: Byte
    val myMinShort: Short
    val myMaxShort: Short
    val myMinInt: Int
    val myMaxInt: Int
    val myMinLong: Long
    val myMaxLong: Long
    // val myFloat: Float ( O tipo de dados "Float" se demonstrou inconsistente ).
    val myDouble: Double
    val myBooleanTrue: Boolean
    val myBooleanFalse: Boolean

    // Atribuição de valores as variáveis...
    myChar = 'S'
    myString = "Carlos Eduardo Moço Magaldi"
    myMinByte = -128
    myMaxByte = 127
    myMinShort = -32768
    myMaxShort = 32767
    myMinInt = -2147483648
    myMaxInt = 2147483647
    myMinLong = -9223372036854775807
    myMaxLong = 9223372036854775806
    // myFloat = 0.48 ( O tipo de dados "Float" se demonstrou inconsistente ).
    myDouble = 76.47864656575765
    myBooleanTrue = true
    myBooleanFalse = false

    // Exibição dos valores das variáveis...
    println("myChar = $myChar")
    println("myString = $myString")
    println("myMinByte = $myMinByte")
    println("myMaxByte = $myMaxByte")
    println("myMinShort = $myMinShort")
    println("myMaxShort = $myMaxShort")
    println("myMinInt = $myMinInt")
    println("myMaxInt = $myMaxInt")
    println("myMinLong = $myMinLong")
    println("myMaxLong = $myMaxLong")
    // println("myFloat = $myFloat") ( O tipo de dados "Float" se demonstrou inconsistente ).
    println("myDouble = $myDouble")
    println("myBooleanTrue = $myBooleanTrue")
    println("myBooleanFalse = $myBooleanFalse")
}