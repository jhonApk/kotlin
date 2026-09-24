package Fudamentos.EstruturaDecisao

import java.awt.print.Printable

fun main() {
    when01()
}


fun when01(){
    val x = 4

    when (x){
        1 -> println("Um")
        2 -> println("Dois")
        3 -> println("Tres")

        else -> println("Numero não mapeado")
    }
}


fun opcoes(){
    val opcao = 0

    when(opcao){
        1 -> println("Inicio de jogo")
        2 -> println("Salvando")
        3 -> println("Exit")
    }
}

//Retornando valor a partir do when
//conseguimos verificar seu tipo tbm