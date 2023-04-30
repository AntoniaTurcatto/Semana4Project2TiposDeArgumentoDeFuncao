fun main() {
    println(soma(1,3,2))

    val array1 = arrayOf(1,23,52,12,54,3,2,5,9)
    println(arrayMoreThanNumber(array1, 10))
    println(arrayIntTransformation(array1,{element1: Int -> element1+1 }))

    val arrayOfStrings = arrayOf<String>("Diego", "Márcio", "Felps", "Lara", "Fernanda")
    println(startsWith(arrayOfStrings, 'L'))

    print(multiplePositions(array1, 2))
}

//1 - Crie uma função que receba um número variável de argumentos do tipo Int. e
//retorne a soma dos mesmos.
fun soma(vararg numbers:Int):Int{
    var result = 0
    for(i in 0..numbers.lastIndex){
        result+=numbers[i]
    }
    return result
}

//2 - Crie uma função que receba um array de números inteiros e um número inteiro n
//como argumentos e retorne uma nova lista contendo apenas os elementos do array
//que são maiores do que n.
fun arrayMoreThanNumber(array: Array<Int>, n : Int): MutableList<Int>{
    val intList = mutableListOf<Int>()
    val arrayFun = array
    val nFun = n
    for (i in 0..arrayFun.lastIndex) {
        if(arrayFun[i]>nFun){
            intList.add(arrayFun[i])
        }
    }
    return intList
}

//3 - Crie uma função que receba uma função de transformação como argumento, um
//array de números inteiros e retorne uma nova lista contendo os elementos do array
//transformados pela função de transformação.
fun arrayIntTransformation( numberArray:Array<Int>, function : ( element1:Int ) -> Int ):MutableList<Int>{
    var intList = mutableListOf<Int>()
    val numberArrayFun=numberArray
    val functionFun=function
    for (i in 0..numberArrayFun.lastIndex){
        intList.add(functionFun(numberArrayFun[i]))
    }
    return intList
}

//4 - Crie uma função que receba um array de strings e um caractere como argumentos e
//retorne uma nova lista contendo apenas as strings que começam com o caractere
//informado.
fun startsWith(array : Array<String>, character : Char):MutableList<String>{
    val stringList = mutableListOf<String>()
    val arrayString = array
    val characterFun = character
    for (i in 0..arrayString.lastIndex){
        if(arrayString[i][0]==characterFun){
            stringList.add(arrayString[i])
        }
    }
    return stringList
}

//5 - Crie uma função que receba um array de números inteiros e um número inteiro n
//como argumentos e retorne uma nova lista contendo apenas os elementos do array
//que estão nas posições múltiplas de n.
fun multiplePositions(array: Array<Int>, num : Int): MutableList<Int>{
    val intList = mutableListOf<Int>()
    val arrayFun = array
    val number = num
    for (i in 0..arrayFun.lastIndex){
        if(i%number==0 && i>0){
            intList.add(arrayFun[i])
        }
    }
    return intList
}