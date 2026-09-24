package Fudamentos.ControleDeFluxo

import java.util.Scanner

fun main() {
 scanner()

}

fun scanner(){
    //Usado quando temos entrada de varios dados na mesma linha separado por espaço, pois o scanner separa cada tipo diretmente
    val scanner = Scanner(System.`in`)

    println("Digite seu nome é sua idade: ")
    println("Nome: ")
    val nome = scanner.next()
    println("Idade: ")
    val idade = scanner.nextInt()

    if (idade >= 18){
        println("Seja bem-vindo ${nome}")
    }else{
        println("Desculpe ${nome}, Estrada não autorizada")
    }

}


fun readline(){
    println("Informe sua idade: ")
    val entrada =  readln().toInt()

    println("está acomanhado com responsavel? ")
    val acompanhado = readln().lowercase()

    if (entrada >= 18){
        println("Entrada Permitida")
    }else if(entrada < 18 && acompanhado == "sim"){
        println("Entrada permitida com responsável")
    }else {
        println("Entrada negada!!")
    }
}