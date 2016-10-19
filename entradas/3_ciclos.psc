Proceso sin_titulo

    Escribir "Ciclo for";
    Definir i Como entero;
    Para i<- 0-10 Hasta 1+1 Con Paso 1 Hacer
        Escribir i^3;
    FinPara

    Escribir "Ciclo mientras";
	i<-1000;
	Mientras i > 1 Hacer
		Escribir i;
		si i mod 2 = 1 Entonces
			i <- (i-1)/2;
		sino 
			i <- i/2;
		FinSi
	FinMientras
	
	
	Escribir "Ciclo repetir-hasta";
	i <- 2;
	Repetir
		Escribir i;
		i <- i*2;
	Hasta Que i>1000;
	

FinProceso
