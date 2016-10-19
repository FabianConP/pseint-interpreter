Proceso sin_titulo
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