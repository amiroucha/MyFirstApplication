package com.example.myfirstapplication

fun main()
{
    //crea una constante que almacene la nota de 3 examenes
    val notas = arrayOf(5.2, 6.5, 5.0)

    //Muestra las tres notas usando el bucle que prefieras
    var suma : Double= 0.0
    var cont = 1
    for (num in notas)
    {
        println("Nota $cont: $num")
        suma += num
        cont++
    }

    //mostrar la media
    var media : Double = suma/notas.size
    println("Media de las notas: %.2f".format(media))

}