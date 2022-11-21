//Funcion para calcular desviacion estandar

val nros = List(728.7, 1086.5, 1091.0, 1361.3, 1490.5, 1956.1)

def promedio(valores : List[Double]) : Double = valores.sum / valores.size

def desvEst(valores: List[Double]) : Double = {
    val avg = promedio(valores)

    def varianza(valores : List[Double]) : Double =
        valores.map(x => Math.pow(x - avg, 2)).sum  * (1.0 / (valores.size - 1))

    Math.sqrt(varianza(valores))
}

//Contar

def clasifica(valores: List[Double]) : Unit = {
    val s = desvEst(valores)
    val avg = promedio(valores)

    (1 to 3).foreach( i =>
        println(valores.filter(x => 
            x >= (avg - i * s) && x <= (avg + i * s )).size))
}

//Tuplas: contenedor de datos en donde cada elemento puede ser de diferente tipo

val par = (1, "Abad Ana")

// Se puede acceder a cada elemento de forma independiente, utilizando punto, guión bajo y un índice

println(par._1)
println(par._2)

//Declarar tipo

val student = (1, "Abad Ana")   
 //val student: Tuple2[Int, String]
val datos = ("jorgaf", 'M', 45, 95.2, true)  
 //val datos: Tuples5[String, Char, Int, Double, Boolena]

//Funciones
val student1 = (1, "Abad Ana") 
val (edad, nombre) = student1
print(edad)
print(nombre)

//lo invierte
student1.swap

//comparar con el parametro que se esta enviando 
student1.canEqual((1, "Abad Ana"))

//Estructura de Datos Funcionales 
//Listas Declaracion

val values = List(42, 31, 36, 40, 43)
val names = List("Jorge", "Rene", "Ma. del Carmen", "Nelson")

val fruit : List[String] = List("apple", "orange", "pears")
val nums : List[Int] = List(1, 2 ,3, 4)

//Operaciones en listas

val myList = List(10, 20, 30 , 40, 50, 60)
myList.isEmpty
myList.drop(2)
myList.dropWhile(_ < 25)
myList.slice(2, 4)
myList.tail
myList.take(3)
myList.takeWhile(_ < 30)
myList.sorted
myList.sorted(Ordering.Int.reverse)

//foldLeft: va de izquierda a derecha moviendo el valor actual

myList.foldLeft(0) ( (x,y) => x + y)
myList.foldLeft(0) (_ + _)

//foldRigth: va de derecha a izquierda 

myList.foldRight(0) ( (x, y) => x + y)
myList.foldRight(0) (_ + _)


// foldLeft ejemplo: calcular promedio de los elementos de una lista de numeros reales

def average(valores : List[Double]) : Double = {
    val t = valores.foldLeft((0.0, 0))((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
    t._1 / t._2
}

def average2(valores: List[Double]) : Double ={
    val t = valores.foldLeft((0.0 , 0)) { (acc, currVal) =>
        val sum = acc._1 + currVal
        val cont = acc._2 + 1
        printf("suma: %f - contador: %d%n" , sum, cont)
        (sum, cont)
    }
  t._1/t._2
}