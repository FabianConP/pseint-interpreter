subproceso f <- fibo(x)
    Definir f como Entero;
    Si x <= 1 Entonces
        f <- 1;
    sino
        f <- fibo(x - 1) + fibo(x - 2);
    finsi
finsubproceso

Proceso main
    Definir i como Entero;
    Para i <- 0 Hasta 8 Hacer
        Escribir fibo(i);
    finpara
finproceso
