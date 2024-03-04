import java.lang.IllegalArgumentException

// 1.função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário.
fun parOuNao (valor : Int): Boolean {
    return valor % 2 == 0
}

// 2.função que receba um array de inteiros e retorne o maior número.
fun qualMaior (inteiros: Array<Int>): Int {
    var maior = Int.MIN_VALUE
    for (numeros in inteiros){
        if (numeros > maior){
            maior = numeros
        }
    }
    return maior
}

// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome".
class Pessoa(val nome : String, val idade : Int)
val Pessoas = arrayOf(Pessoa("Jorge", 23), Pessoa("Cleber", 34), Pessoa("Adrien", 50), Pessoa("Juliane", 20))



// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente).
fun palindromoCheck(texto: String): Boolean {
    val textoTratado = texto.replace("//S+".toRegex(), "").lowercase()
    return textoTratado == textoTratado.reversed()
}


// 5. Implemente uma função lambda que retorne o maior valor entre dois números.
fun lambda(valor1: Int, valor2: Int): Int {
        return if (valor1 > valor2) valor1 else valor2
}

//5 alternativo
val compare = {a: Int, b: Int ->  if (a > b) a else b}

// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente".
class ContaBancaria(var saldo: Double, val limite: Double) {
    fun saque(valor: Double): String {
        if (valor > saldo) {
            throw IllegalArgumentException("Saldo Insuficiente!")
        }

        var saldonovo = saldo - valor
        val msg = "Saque de $valor R$ realizado, antigo saldo de $saldo R$ agora é de $saldonovo R$"
        return msg

    }
}


// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.
fun maiorString (strings: Array<String>): String? {
    return strings.maxByOrNull { it.length }
}


// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário.
class Funcionario (val nome: String, val idade: Int, var salario: Double)
val funcionarios = arrayOf(Funcionario("Cleber", 23, 345.50),Funcionario("Josiane", 20, 560.60),Funcionario("Gleison", 30, 450.40),Funcionario("Roberto", 21, 1090.05),Funcionario("Maria", 23, 1900.43),Funcionario("Julia", 20, 1900.45))
fun maiorSalario(arrayfuncionario: Array<Funcionario>): String {
    val maiorSalario = arrayfuncionario.maxByOrNull { it.salario }
    val msg = "O maior salário é: ${maiorSalario?.salario} de ${maiorSalario?.nome}"
    return msg
}


// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.
fun ordenarlist(listaint: List<Int>): List<Int> {
    val listaOrdenada = listaint.toMutableList()
    val tamanhoList = listaOrdenada.size
    var trocou: Boolean

    do {
        trocou = false
        for (i in 0 until tamanhoList - 1) {
            if(listaOrdenada[i] > listaOrdenada[i + 1]) {
                val temp = listaOrdenada[i]
                listaOrdenada[i] = listaOrdenada[i + 1]
                listaOrdenada[i + 1] = temp
                trocou = true
            }
        }
    } while (trocou)

    return listaOrdenada
}


// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula e retorna a área do triângulo.
class Triangulo(val base: Double, val altura: Double) {
    fun areadotriangulo(): Double{

        val area = (base * altura) / 2

        return area
    }
}

// 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra "A", em ordem alfabética.

fun listadeA(aLista: List<String>): List<String> {
    return aLista.filter {it.startsWith("A", ignoreCase = true)}
        .sorted()
}

// 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.
val dicionario = mapOf(
    "Apple" to "Maça",
    "Strawberry" to "Morango",
    "Hello" to "Olá",
    "Goodbye" to "Adeus"
)


// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda. A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado. Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão. Use a função de ordem superior para realizar essas operações com diferentes pares de números.
fun operacaoMatematica(valor1: Int, valor2: Int, operacao: (Int, Int) -> Int) : Int {
    return operacao (valor1,valor2)
}
val soma = operacaoMatematica(5,3) {valor1,valor2 -> valor1 + valor2}
val subtracao = operacaoMatematica(5,3) {valor1, valor2 -> valor1 - valor2}
val multiplicacao = operacaoMatematica(5,3) {valor1, valor2 -> valor1 * valor2}
val divisao = operacaoMatematica(10, 5) {valor1, valor2 -> valor1 / valor2}

//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo. A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas). Em seguida, use essa função para verificar se algumas palavras são palíndromos.
fun String.isPalindromo (): Boolean {
    val textoLimpo = this.replace("\\s".toRegex(),"").lowercase()
    return textoLimpo == textoLimpo.reversed()
}
//15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros. Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra e retorna apenas os números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array; somarValores: Uma função que calcula a soma de todos os valores no array. Em seguida, crie um array de números inteiros e utilize as funções de alta ordem para realizar essas operações.
fun interface IntPredicado {
    operator fun invoke(valor: Int): Boolean
}

fun filtrarPares(numeros: List<Int>, predicado: IntPredicado): List<Int> {
    val resultado = mutableListOf<Int>()
    for (numero in numeros) {
        if (predicado(numero)) {
            resultado.add(numero)
        }
    }
    return resultado
}

fun dobrarValores(numeros: List<Int>, mapper: (Int) -> Int): List<Int> {
    val resultado = mutableListOf<Int>()
    for (numero in numeros) {
        resultado.add(mapper(numero))
    }
    return resultado
}

fun somarValores(numeros: List<Int>, initial: Int, operacao: (acc: Int, Int) -> Int): Int {
    var acumulador = initial
    for (numero in numeros) {
        acumulador = operacao(acumulador, numero)
    }
    return acumulador
}


//Teste

fun main() {
    println("=====================================")
    println("Exercicios Kotlin na Mão!")
    println("Selecione o exercício a ser usado (de 1 a 15):")
    println("=====================================")
    val ex1 = parOuNao(4)
    val ex2 = qualMaior(arrayOf(1, 2, 3, 4, 5, 10, 7, 8))

    //ex3
    val Pessoas = arrayOf(Pessoa("Jorge", 23), Pessoa("Cleber", 34), Pessoa("Adrien", 50), Pessoa("Juliane", 20))
    val ex3 = Pessoas.sortedBy {it.nome}

    //ex4
    val outrotexto = "socorrammesubinoonibusemmarrocos"
    val texto = "abacaxi"

    //ex5
    val numero1 = 5
    val numero2 = 10
    val maiorvalor = lambda(numero1,numero2)

    //ex6
    val conta = ContaBancaria(100.0, 50.0)

    //ex7
    val arraydestrings = arrayOf("maçã", "Chocolate", "Mamão", "laranja", "paralelepipedo")
    val maiorstring = maiorString(arraydestrings)

    //ex8
    val ex8 = maiorSalario(funcionarios)

    //ex9
    val listaex9 = listOf(3, 1, 1, 4, 5,5,10,3,5,6,3,2,1,34,6)
    val lista9Ordenada = ordenarlist(listaex9)

    //ex10
    val meutriangulo = Triangulo(10.0, 5.0)
    val areadotriangulo = meutriangulo.areadotriangulo()

    //ex11
    val listadeAs = listOf("Maçã", "Abobora", "Abacaxi", "Mexilhão", "Chocolate", "Amendoa", "Amendoim", "Amora", "Antilope", "Asa", "Asinha", "Cereja")
    val somenteA = listadeA(listadeAs)

    //ex12
    val appletranslate = dicionario["Apple"]
    val strawberry = dicionario["Strawberry"]

    //ex13 está junto do codigo 13

    //ex14
    val palavras = listOf("arara", "Ame a ema", "Reviver", "Teste", "socorram me subi no onibus em marrocos")

    //ex15
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = filtrarPares(numbers) { it % 2 == 0 }


    val dobrados = dobrarValores(numbers) { it * 2 }


    val somas = somarValores(numbers, 0) { acc, value -> acc + value }


    //seletor
    val seletor = readLine()
    when(seletor) {
        "1" ->
            println("O valor é Par?  R: $ex1")
        "2" ->
            println("O maior valor dentro do Array é $ex2")

        "3" ->
            for (nomes in ex3) {
                println("Lista de nomes:${nomes.nome}")
            }
        "4" ->
            println("$texto e $outrotexto são palíndromos? o primeiro é: ${palindromoCheck(texto)} o segundo é: ${palindromoCheck(outrotexto)}")
        "5" ->
            println("O maior valor entre $numero1 e $numero2 é $maiorvalor")
        "6" ->
            try {
                println(conta.saque(1000.0))
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        "7" ->
            println("Maior string é $maiorstring")
        "8" ->
            println(ex8)
        "9" ->
            println("Lista Ordenada: $lista9Ordenada")
        "10" ->
            println("Área do triangulo: $areadotriangulo")
        "11" ->
            println(somenteA)
        "12" ->
            println("Tradução de Apple: " + appletranslate + " e tradução de Strawbery: " + strawberry)
        "13" ->
            println("Soma: $soma " + "\nSubtracao: $subtracao " + "\nMultiplicação: $multiplicacao" + "\nDivisao: $divisao ")
        "14" ->
            for (palavra in palavras) {
                val resultado = if (palavra.isPalindromo()) "é" else "não é"
                println("A palavra '$palavra' $resultado um palíndromo.")
            }
        "15" ->
            println("Números pares: $pares" + "\nNúmeros dobrados: $dobrados" + "\nSoma dos números: $somas")

        else ->
            println("Insire um valor de 1 a 15")

    }
}

