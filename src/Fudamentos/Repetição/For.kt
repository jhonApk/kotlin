package Fudamentos.Repetição

import Fudamentos.NullSafety23.saudarCliente
import kotlin.concurrent.thread

fun main() {
    percorreLista()
}

fun printa1a10(){
    for (numero in 1..10){
        println(numero)
    }
}

fun excluiNumeroFinal(){
    for (numero in 1 until 10){
        println(numero)
    }
}

fun printa10a1(){
    for (numero in 10 downTo 1){
        println(numero)
    }
}

fun pularNumeros(){
    for (numero in 1..10 step  2){
        println(numero)
    }
}

fun inicioFim(inicio: Int, fim: Int){
    for (numero in inicio..fim){
        println(numero)
    }
}

fun conteagemRegressiva(){
    for (i in 10 downTo 0 ){
        println(i)
        Thread.sleep(1000)
    }

}



fun percorreLista() {
    val sabores = listOf("Chocolate", "Morando", "Cenoura")

    for (sabor in sabores){
        println("Preparando a massa $sabor")
        Thread.sleep(1000)
    }
}
