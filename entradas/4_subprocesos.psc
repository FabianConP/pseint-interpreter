SubProceso x <- aux (a)
    Definir x Como Logico;
    x <- a>0;
FinSubProceso


SubProceso f<-fact(a) 
    Definir f Como Entero;
    f <- 1;
    Mientras aux(a) Hacer
        f <- a*f;
        a <- a-1;
    FinMientras
FinSubProceso

Proceso pf
    Escribir fact(10);
    Escribir fact(5);
FinProceso
    