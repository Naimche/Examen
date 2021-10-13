
// #####################################
// TABLAS DE MULTIPLICAR
// #####################################
fun remain():Boolean{
    main()
    return true
}//Vuelve a ejecutar el programa
private fun tabla(factor: Int) {
    println("************")
    println("TABLA DEL $factor")
    println("************")
    for (i in 1..10) {
        println("$factor * $i = ${factor * i}")
    }
}
fun main() {
    // Declaración de variables
    val nombre = "Naim Cheddi Elkhattabi"
    val listaEntrada: List<String>
    val edad: Byte
    val mes: Byte
    // Leo desde teclado la edad del alumno y el mes actual
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    val entrada: String = readLine() ?: ""
    listaEntrada = entrada.split(",")

    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $nombre")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    } else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {
            listaEntrada[0].trim().toByte()
        } catch (_: Exception) {
            -1
        }
        mes = try {
            listaEntrada[1].trim().toByte()
        } catch (_: Exception) {
            -1
        }

        if (edad <= 0) // Si alguno es menor que -1 o no existe el mes
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        }else if (mes !in 1..12){
            println("Como es lógico el mes tiene que estar entre el 1 y el 12")
        }
        else
        {
            when (edad) {
                in 6..8 -> if (mes % 2 == 0) {
                    tabla(2)
                    tabla(4)

                } else {
                    //Mayores de 6 hasta 8 incluido.
                    tabla(1)
                    tabla(3)
                    tabla(5)
                }
                in 9..10 -> if (mes % 2 == 0) // Mayores del 8 hasta el 10 incluido
                {
                    tabla(6)
                    tabla(8)
                    tabla(10)
                } else {
                    tabla(7)
                    tabla(9)
                }
                in 11..12 -> {
                    tabla(11)
                    tabla(12)
                    tabla(13)
                }
                else -> {
                    println("No existen alumnos con esa edad en este instituto :D")}
            }
                    println("La edad es $edad y el mes es $mes")

                    // Linea final cabecera
                    println("_".repeat(80))

                // Linea final de programa
                println("*".repeat(80))

        }}
    println("Quiere volver a calcularlo? Y/N")
    val y = "Y"
    val respuesta: String = readLine()!!.uppercase()
    if (y == respuesta){
        remain()
    }else{
        println("Gracias por usar el programa att: Naim")
    }

}

