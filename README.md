# Construir-Escalas-Musicales

## LÓGICA

```
T -> 1 Tono
s -> 0.5 Tono / 1 semitono

C -> DO
D -> RE
E -> MI
F -> FA
G -> SOL
A -> LA
B -> SI
```

ESCALA MAYOR
```
C - D - E - F - G - A - B - C
  T   T   s   T   T   T   s
```
  
ESCALA MENOR
Natural
```
    A - B - C - D - E - F - G - A
      T   s   T   T   s   T   T
```

La armónica y melódica son iguales a la escala menor natural pero añadiendo semitonos en la subtónica y submediante.

Armónica
```
    A - B - C - D - E - F - G(+1s) - A  
```
    
Melódica
```
    A - B - C - D - E - F(+1s) - G(+1s) - A 
```

## CONTRUCCIÓN
_Pasos para construir una escala_

### Paso 1. Asociar un número
Para construir una escala nos basamos en el un número asociado a su nota tónica. Este número indica cuantos sostenidos o bemoles tiene.
Un numero negativo indica bemoles y uno positivo sostenidos. 
Una forma de recordar este número es visualizando el circulo de quintas.

```
F -> -1
C -> 0
G -> 1
D -> 2
A -> 3
E -> 4
B -> 5
```
* C mayor ->  0  -> no tiene alteraciones.
* E mayor ->  4  -> tiene 4 sostenidos.
* F mayor ->  -1 -> tiene 1 bemol.

### Paso 2. Alteraciones # y b
Para calcular las alteraciones en caso se ser # o b sumamos y restamos 7 respectivamente
* C# mayor ->  0 + 7 = 7  -> tiene 7 sostenidos
* Eb mayor ->  4 - 7 = -3 -> tiene 3 bemoles
* F# mayor ->  -1 + 7 = 6 -> tiene 6 sostenidos
* D# mayor ->  2 + 7 = 9  -> tiene 9 sostenidos

### Paso 3. Mayor o Menor
Para calcular la escala en caso de que sea ,menor restamos al numero anterior 3.
* C# menor ->  0 + 7 - 3 = 4   -> tiene 4 sostenidos
* Eb menor ->  4 - 7 - 3 = -6  -> tiene 6 bemoles
* F# menor ->  -1 + 7 - 3 = 3  -> tiene 3 sostenidos
* D# menor ->  2 + 7 - 3 = 6   -> tiene 6 sostenidos
* Fb menor -> -1 - 7 -3 = -11  -> tiene 11 bemoles
* C menor -> 0 - 3 = -3 -> tiene 3 bemoles
* F menor -> -1 -3 = -4 -> tiene 4 bemoles 

### Paso 4. Colocar sostenidos y bemoles
Colocar las alteraciones se hace en un orden concreto.
Se puede utilizar el círculo de quintas para poder calcular el orden.
```
Sotenidos -> F C G D A E B
Bemoles   -> B E A D G C F
```

En caso de que haya mas de 7 alteraciones se vuelven a añadir desde el principio siguiendo el mismo orden. En estos casos,algunas notas terminan con doble sostenido (##) o doble bemol (bb). La notación del doble sostenido es una especie de X.
```
## -> x
```

### Paso 5. Alterar en funcion de la escala Menor
Una vez construida la escala menor, hay que alterarla en función de la escala menor.
Como se ha indicado antes, la armónica y melódica alteran la 6º y 7º nota de la escala.
 * Menor -> se queda igual
 * M.Armónica -> se sube un semitono a la 7º
 * M.Melódica -> se sube un semitono a la 6º y 7º
 
# EJEMPLOS
 
## C# Mayor
 
### Paso 1
  C -> 0 
### Paso 2
  C# -> 0 + 7 = 7 sostenidos
### Paso 3
  C# mayor -> se queda como está -> 7(#)
### Paso 4
Vamos colocando los sostenidos en orden
  * F -> C D E F# G A B C
  * C -> C# D E F# G A B C#
  * G -> C# D E F# G# A B C#
  * D -> C# D# E F# G# A B C#
  * A -> C# D# E F# G# A# B C#
  * E -> C# D# E# F# G A# B C#
  * B -> C# D# E# F# G# A# B# C#
### Paso 5
Como es escala mayor este paso no es necesario

```
C# Mayor -> C# D# E# F# G# A# B# C#
```

## Eb menor
 
### Paso 1
  E -> 4 
### Paso 2
  Eb -> 4 - 7 = -3 bemoles
### Paso 3
  Eb menor -> -3 - 3 = -6 -> 6(b)
### Paso 4
Vamos colocando los bemoles en orden
  * B -> E F G A Bb C D E
  * E -> Eb F G A Bb C D Eb
  * A -> Eb F G Ab Bb C D Eb
  * D -> Eb F G Ab Bb C Db Eb
  * G -> Eb F Gb Ab Bb C Db Eb
  * C -> Eb F Gb Ab Bb Cb Db Eb

### Paso 5
Como es escala menor natural este paso no es necesario

```
Eb menor -> Eb F Gb Ab Bb Cb Db Eb
```
