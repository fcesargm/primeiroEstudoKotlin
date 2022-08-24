import javax.swing.JOptionPane

fun main(args: Array<String>){

    val nome = JOptionPane.showInputDialog("Digite seu nome:")
    println("Seja bem vindo, $nome !")
    val saida = String.format("%s %s", "Bem vindo", nome)
    JOptionPane.showMessageDialog(null, saida)
}