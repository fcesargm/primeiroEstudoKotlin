
fun main(args: Array<String>){

    println("Digite sua nota:")
    val x = readLine()?.toInt()!!
    if((x >= 60) and (x <= 100) ){
        println("Aprovado!")
    }else if((x < 60) and (x >= 0)) {
        println("Reprovado")
    }else{
        println("Nota Invalida")
    }
}