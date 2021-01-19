# Construir-Escalas-Musicales

## LÓGICA

T -> 1 Tono
s -> 0.5 Tono / 1 semitono

C -> DO
D -> RE
E -> MI
F -> FA
G -> SOL
A -> LA
B -> SI

ESCALA MAYOR
C - D - E - F - G - A - B - C
  T   T   s   T   T   T   s
  
ESCALA MENOR
Natural
    A - B - C - D - E - F - G - A
      T   s   T   T   s   T   T

La armónica y melódica son iguales a la escala menor natural pero añadiendo semitonos en la subtónica y submediante.

Harmónica
    A - B - C - D - E - F - G(+1s) - A           
    
Melódica
    A - B - C - D - E - F(+1s) - G(+1s) - A 
    


Para construir una escala nos basamos en el un número asociado a cada nota. Este número indica cuantos sostenidos o bemoles tiene.
Un numero negativo indica bemoles y uno positivo sostenidos.

F -> -1
C -> 0
G -> 1
D -> 2
A -> 3
E -> 4
B -> 5


C mayor :sabemos que no tiene alteraciones.
E mayor :sabemos que tiene 4 sostenidos.
F mayor :sabemos que tiene 1 bemol.

Para calcular la escala menor restamos a ese número 3.
C menor -> ( 0 - 3 = -3 ) -> sabemos que tiene 3 bemoles
E menor -> ( 4 - 3 = 1 ) -> sabemos que tiene 1 sostenido
F mayor -> ( -1 - 3 = -4 ) -> sabemos que tiene 4 bemoles

Para calcular las alteraciones en caso se ser # o b sumamos y restamos 7 respectivamente
C# mayor -> ( 0 + 7 = 7 ) -> tiene 7 sostenidos
Eb mayor -> ( 4 - 7 = -3 ) -> tiene 3 bemoles
F# menor -> ( -1 + 7(#) - 3(menor) = 3 ) -> tiene 3 sostenidos
