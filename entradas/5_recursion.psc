SubProceso x <- gcd ( a,b )
    Definir x Como Entero;
    si b = 0 Entonces
        x <- a;
    Sino
        x <- gcd ( b , a mod b );
    FinSi
FinSubProceso

SubProceso x <- modPow (b,e,m)
    Definir x,z Como Entero;
    
    si e == 0 entonces
        x <- 1;
        
    sino
        si e mod 2 = 0 Entonces
            z <- modPow(b,e/2,m);
            x <- (z*z) mod m;
        Sino
            z <- modPow(b,(e-1)/2,m);
            x <- b*z*z mod m;
        FinSi
    FinSi
FinSubProceso


Proceso sin_titulo
    //Debe imprimir 25 (5^8897 mod 31) = 25
    escribir modPow(5,8897,31);
    //Debe imprimir 7
    Escribir modPow(8954,981212 ,87);
	
	Escribir modPow(51,86897, 101);
	
    //imprime 4
    Escribir gcd(412,49212);
    //imprime 1
    escribir gcd(418428,492127);
	
FinProceso
