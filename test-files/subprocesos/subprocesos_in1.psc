SubProceso z <- f ( x )
    Definir z Como Real;
    z <- 2*x + 4 + g(x);
FinSubProceso

SubProceso z <- g ( x )
    Definir z Como Real;
    z <- 2*x*x;
FinSubProceso

Proceso sin_titulo
    Escribir "fog(2) = " , f(g(2));
FinProceso