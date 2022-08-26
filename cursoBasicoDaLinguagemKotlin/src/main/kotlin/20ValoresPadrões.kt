fun main(args: Array<String>){

    var resultado = soma(y=6)
    println(resultado)

    resultado = soma(y=9)
    println(resultado)

}

fun soma(x: Int = 10, y:Int) = x+y