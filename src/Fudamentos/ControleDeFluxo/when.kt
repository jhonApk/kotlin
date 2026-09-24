package Fudamentos.ControleDeFluxo

fun main() {
    whenSemArgumento()
}


fun menu(){
    println("""
        1 - Continuar
        2 - Novo Jogo
        3 - Configurações
    """.trimIndent())
    val opcaoMenu = readln().toInt()

    when (opcaoMenu){
        1 -> println("Entrando no server...")
        2 -> println("Logando...")
        3 -> println("Abrindo configurações")
        else-> println("Opção não disponivel no menu!")
    }
}

fun whenSemArgumento(){
    val estoqueBolos = 0
    val fornoLigado = false

    val aviso = when{
        estoqueBolos == 0  && fornoLigado -> "Assando nova fornada!"
        estoqueBolos == 0 -> "Atenção, Vitrine Vazia "
        else -> "Temos bolos para entraga"
    }
    println(aviso)
}
