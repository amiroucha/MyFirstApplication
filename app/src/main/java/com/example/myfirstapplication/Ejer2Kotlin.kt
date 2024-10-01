package com.example.myfirstapplication
/* Pedir un numero entero positivo
    * 1: Indicar si es compuesto o primo
    * 2: indicar si es par o impar
    * 3: Indicar si el numro es cuadratico
    * Utilizar una funcion para cada una de las comprobaciones
    * */
fun main()
{
    println("Introduce un numero entero positivo")
    val numero : Int
    try {
        numero = readln().toInt() //si no haces la conversion te salta excepcion
        //try catch para evitar la excepcion de los decimales!!!!
        if (numero<0)
        {
            println("Debe de ser un numero positivo")
        }else
        {
            esPrimo(numero)
            esPar(numero)
            esCuadratico(numero)
        }


    }catch (e: NumberFormatException)
    {
        println("Error: Debe de ser un numero positivo")
    }

}

fun esPrimo(x:Int)
{
    //dividir entre los numeros 1 y x/2
    var div : Int = 1
    while (div<=x/2)
    {
        if (x % div == 0)
        {
            return println("$x NO es primo");
        }
        div++;
    }
    return  println("$x es primo")
}

fun esPar(x: Int)
{
    if (x %2 == 0)
        return println("$x es par")
    return println("$x es impar")
}

fun esCuadratico(num: Int)
{
    for (x in 1..num/2)
    {
        if (x*x == num)
        {
            return println("$num es cuadratico")
        }
    }
    println("$num No es cuadratico")
}