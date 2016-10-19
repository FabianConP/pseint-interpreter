Proceso sin_titulo
    Definir a,i,j,k,ans Como Real;
    Dimension a[10,10,10];
    
    para i<-0 hasta 9 Hacer
        para j<-0 hasta 9 Hacer
            para k<-0 hasta 9 Hacer
                a[i,j,k] <- 4*i+3*j+k*2;
                //Escribir a[i,j,k];
            FinPara
        FinPara
    FinPara
    
    ans <- 0;
    
    para i<-0 hasta 9 Hacer
        para j<-0 hasta 9 Hacer
            para k<-0 hasta 9 Hacer
                ans <- ans + a[i,j,k];
            FinPara
        FinPara
    FinPara
    
    Escribir ans;
    
    Definir b,aux Como Real;
    Dimension b[10];
    
    para i<-0 hasta 9 Hacer
        b[i] <- 100-i;
        Escribir b[i];
    FinPara
    
    Escribir "***********";
    
    para i<-0 hasta 9 Hacer
        para j<-0 hasta 9-i-1 Hacer
            si b[j] > b[j+1] Entonces
                aux <- b[j];
                b[j] <- b[j+1];
                b[j+1] <- aux;
            FinSi
        FinPara
    FinPara
    
    para i<-0 hasta 9 Hacer
        Escribir b[i];
    FinPara




FinProceso
