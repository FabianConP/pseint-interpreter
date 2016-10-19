proceso mi_proceso
    Definir a como entero;
    Definir b como Real;
    Definir c como logico;
    Definir d como texto;

    b <- 3/2; //Correcto
    a <- 2*b; //Correcto, (2*b = 3) 
    a <- 2*(4^0.5); //Correcto, 4^0.5 = 2.
    b <- 3.1122^3.44223; //Correcto
    a <- 0.5 + 0.5; //Correcto (0.5 + 0.5) = 1
    c <- a < b; //Correcto.
    c <- a < 2 & 3 < 1; //Correcto.
    c <- "h" < "a"; //Correcto
	
    d <- "hola"; //Correcto
	a <- 3/2; //Error, el valor a asignar debe ser entero
finproceso