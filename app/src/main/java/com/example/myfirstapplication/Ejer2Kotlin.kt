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
    val numero = readln().toInt() //si no haces la conversion te salta excepcion
//try catch para evitar la excepcion de los decimales!!!!
    while (numero < 0)
    {
        println("Debe de ser un numero positivo")
    }
}

fun Apart1()
{

}