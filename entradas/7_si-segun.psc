Proceso sin_titulo
    si 3*1 < 5 & 12*4-12<0 | 31<902-12 Entonces
        Escribir "AC";
    FinSi
    
    si 3*1 < 5 & 12*4-12<0 | 31>902-12 Entonces
        Escribir "WA";
    FinSi
    
    si ((2^2)^2)^2 <> 2^(2^(2^2)) Entonces
        Escribir "AC2";
        si 3*1 < 5 & 12*4-12<0 | 31>902-12 Entonces
            Escribir "WA2";
        Sino
            Escribir "AC3";
        FinSi
    FinSi
    
    
    Definir a Como Entero;
    Dimension a[100];
    a[0] <- 10;
    
    //Solo se entra a la 
    //primera condicion que satisfaga!
    segun a[0] hacer
        caso a[0]+1-1:
            Escribir 3*2;
        caso 5*2:
            Escribir "Paradojico, verdad?";
        caso 10:
            Escribir "Si, verdad";
    FinSegun 
    
    
    
FinProceso
