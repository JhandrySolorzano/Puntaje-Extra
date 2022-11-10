/* Mapeo */
/* def es par(k:Int): Int=(k % 2)coincidencia{
    caso 0 =>1
    caso _ =>1
}
def contarEven(s: List[Int]):Int= s.map(isEven).sum
 */
/* def contarEven(s: List[Int]):Int={
    def esPar(k:Int):Int =(k % 2)coincidencia{
        caso 0 =>1
        caso _ =>0
    }
    s.map(esPar).sum
} */
def  contarEven ( s : Lista [ Int ]) : Int = {
    val  es par = (k : Int ) => (k %  2 ) partido {
        caso  0  => 1
        caso _ => 0
    }
    s.map(esPar).sum
}


/* Mapear una lista de cadenas de texto a lista de enteros que representan la longitud del texto */
val  nombres  :  Lista [ String ] = Lista ( " Leo " , " Sergio " , " Patricio " , " P " , " Leo " )
nombres.mapa(_.longitud)

/* Dada una lista de enteros, desarrollar las funciones necesarias que le permitan contar cuantos elementos de la lista son numeros primos: */
val  numeros1 =  Lista ( 3 , 4 , 5 , 6 , 7 )
val  esPrimo = (nro : Int ) => ( 2 a nro - 1 ).forall(nro % _ != 0 )
numeros1.mapa(esPrimo(_) partido {
    caso  verdadero  => 1
    caso   falso  => 0
}).suma
/* Filtrar y truncar secuencias
Otras operaciones
-suma
-producto
-mapa
-forall------------>devuelve true si y solo si el predicado devuelve true para todos los valores de la lista
-max
-min
-Talla
-sale-------------> devuelve verdadero o falso
-filtro------------> devuelve verdadero o falso
-takeWhile---------> devuelve verdadero o falso */

val  números  =  Lista ( 6 , 6 , 6 , 78 , 6 , 45 )
numeros.max
números.min
números.tamaño


/* Para Todo y Existe */
def  isPrime1 (nro : Int ) : Boolean  = ( 2 hasta nro).forall(nro % _ != 0 )

/* existe */
/* def isPrime80(nro:Int):Booleano =!(2 hasta nro).exists(nro %_==0) */


/* Filter devuelve una lista que únicamente contiene los valores que cumplen el predicado */
Lista ( 1 , 2 , 3 , 4 , 5 ).filtro(k => k % 3 != 0 )

/* takeWhile-> trunca la lista cuando encuentra un valor que no cumple con el predicado */
Lista ( 1 , 2 , 3 , 4 , 5 ).takeWhile(k => k % 3 != 0 )


/* Mapear/reducir
Transformar una funcion toma una lista y devuelve otra
funciones: mapa, filtro, etc.
agregar, tomar una lista y devuelve un unico valores
funciones:Max,suma,etc
Escribir programas que concatenan Transformaciones y agregaciones se conocen   */

val  numerosEje =  Lista ( 3 , 4 , 5 , 6 , 7 )
val  isPrimeEje = (nro : Int ) => ( 1 hasta nro).filter(div => nro % div == 0 )
esPrimeEje( 8 )


val  numerosEje2 =  Lista ( 3 , 4 , 5 , 6 , 7 )
val  sumDiv = (nro : Int ) => ( 1 hasta nro).filter(div => nro % div == 0 ).sum
numerosEje2.filtro(nro => nro == sumDiv(nro)).tamaño

val  sumDiv1 = (nro : Int ) => ( 1 hasta nro).filter(div => nro % div == 0 ).sum
numerosEje2.filter(nro => nro > sumDiv(nro)).tamaño

val  sumDiv5 = (nro : Int ) => ( 1 hasta nro).filter(div => nro % div == 0 ).sum
numerosEje2.filter(nro => nro < sumDiv(nro)).tamaño

(n : Int ) => ( 1 hasta n).filtro (div => n % div == 0 )
// factoriales
def  factorialEscalonado (n : Int ) :  Int = {
    n % 2  partido {
       caso  0  => ( 2 a n por 2 ). producto
       caso _ => ( 1 a n por 2 ). producto

    }
}
factorialEscalonado( 2 )

val  numero8  = ( 1 a 20 ).toList
/* Contar los pares */
numero8.filtro(nro => nro % 2 == 0 ).tamaño
numeros.contar(nro => nro % 2 == 0 )
/* Contar los impares   */
numero8.filtro(nro => nro % 2 != 0 ).tamaño
numeros.contar(nro => nro % 2 == 0 )

/* Contar primos */

def  contarPrimos ( nros : List [ Int ]) : Int = {
    val  isPrime843  = (n : Int ) => ( 2 hasta n). para todos(n % _ != 0 )
    nros.filter(isPrime843).tamaño
}
contarPrimos(numbers)

// Presentar 3 factores
def  tresFactores (nros : Lista [ Int ]) : Lista [ Int ] = {
    val  factores  = (n : Int ) => ( 2 hasta n ).filter(n % _ == 0 )
    nros.filter(nros => factores(nros).tamaño == 3 )
}
tresFactores(nros = ( 1 a 1000 ).aLista)