
fun main(args:Array<String>){

    println("Digite o valor de x:")
    val x = readLine()?.toInt()!!
    println("Digite o valor de Y:")
    val y = readLine()?.toInt()!!
    val z = (x + y)

    println("Resultado = $z")
}