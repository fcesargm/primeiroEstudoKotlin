import  java.util.*

fun main(args: Array<String>){

    println("Digite um palpite:")
    val palpite = readln()?.toInt()!!

    val random = Random()
    val dado = random.nextInt(6) + 1

    /*if (palpite == dado){
        println("Parabéns! Você acertou o número")
            }else{
                println("O número informado não é o correto!")
    }
    println(dado)*/

    when(palpite == dado){
        true -> println("Parabéns! Você acertou o número")
        false -> println("O número informado não é o correto!")
    }
    println(dado)

}