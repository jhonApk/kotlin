package Fudamentos.Repetição

fun main() {
    inicioFim(10, 20)
}

fun printa1a10(){
    for (numero in 1..10){
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