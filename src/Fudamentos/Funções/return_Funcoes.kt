package Fudamentos.Funções
//Função com retorno multiplo
fun main() {
    println(retornaNumeroPorExtenso(40))
}

fun retornaNumeroPorExtenso(numero: Int): String{
    if (numero == 1){
        return "Um"
    }else if(numero == 2){
        return "Dois"
    }else if (numero == 40){
        return "Quarenta"
    }else{
        return "Numero não mapeado"
    }
}
