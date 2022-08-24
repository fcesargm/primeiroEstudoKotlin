
fun main(args: Array<String>){

    println("Digite uma idade:")
    val idade = readLine()?.toInt()

    /*if(idade in 0..17){
        println("Criança")
    }else if(idade in 18..29){
        println("Jovem")
    }else if(idade in 30..59){
        println("Adulto")
    }else if (idade in 60..115){
        println("Idoso")
    }else{
        println("Idade Invalida")
    }*/

    when(idade){
        in 0..17 -> println("Criança")
        in 18..29 -> println("Jovem")
        in 30..59 -> println("Adulto")
        in 60..115 -> println("Idoso")
        else -> println("Idade Invalida")

    }
}
