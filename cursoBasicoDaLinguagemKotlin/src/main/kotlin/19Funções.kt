
fun main(args: Array<String>){

    val soma = somar(10,10)
    println("Resultado = $soma")


}

fun somar(x: Int, y: Int) /*: Int*/ = x+y /*{
    val soma = x+y
    return soma
    return x + y
}*/

fun multiplicar(x: Int, y:Int) = x*y
fun dividir(x: Int, y:Int) = x/y
fun subtrair(x: Int, y:Int) = x-y
