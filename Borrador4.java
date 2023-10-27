import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Borrador4 {
    public static void main(String[] args) {
        Borrador4 letraNum = new Borrador4();
        Scanner num = new Scanner(System.in);
        Scanner teclado=new Scanner(System.in);
        String monto;     
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");
    int respuesta, ticket, comida, ryp, croi, cha, dg, pn, pq, pf, rc, cm, bebida, moll, hugg, chil, om, cs, burr, ef, hambre, cafe, op, mocha, express, ame, tev, ten, tet, cho, lim, nan, pago;
    double costo, cambio,nuevoc=0,contador,contador1,contador2,contador3,contador4,contador5,contador6,contador7,contador8,contador9,contador10,
contador11,contador12,contador13,contador14,contador15,contador16,contador17,contador18,contador19, contador20,contador21,contador22,contador23,contador24,contador25;
    int tc=0, tm=0, tex=0, ta=0, tE=0, tN=0, tLim=0, tNan=0,tT=0,tCho=0, tmoll=0,thugg=0, tchil=0, tom=0,tcs=0, tburr=0, tef=0, tham=0, tcroi=0,tcha=0,tdg=0,tpn=0,tpq=0,fpf=0,frc=0,tcm=0,tpro=0;
    double tc1=0,tm1=0, tex1=0,ta1=0,tE1=0,tN1=0,tLim1=0,tNan1=0,tT1=0, tCho1=0, tb=0, tdg1=0,tcha1=0, tcroi1=0, tham1=0, tef1=0, tburr1=0, tcs1=0, tom1=0, tchil1=0, thugg1=0, tmoll1=0, tpn1=0, tpq1=0, fpf1=0, frc1=0, tcm1=0, tp=0;
    final double caf=25.00, mocha1=28.00, Expr=26.00, amer=40.00, teve=30.00, tene=35.00, tetem=70.00, choco=30.00, limon=25.00, 
    naranja=28.00, molle=35.00, huevo=40.00, chila=35.00, omellet1=35.00, clubS=40.00, burri=25.00, EnS=30.00, Hamb=40.00, chi1=50.00, 
    chapa=50.00, donaG=15.00, PdN=40.00, PQ=40.00, PasF=35.00,RollC=30.00,CherrM=20.00;
    String nombre;
    System.out.println("Cafetería London\nDirección: Plaza Town Center, Av. Rosario 1025, El rosario, \nAzcapotzalco, Planta 4, Local 25\nCorreo: cafelondon.rosario@gmail.com"); 
    do {
    System.out.println("Bienvenido a tu cafetería London, te presentamos nuestra carta\n\033[36m1. Bebidas\n2. Comida\n3. Repostería y panadería\033[0m");
    respuesta=teclado.nextInt();
    ticket=0;
    switch (respuesta) {
        case 1 : 
        System.out.println("\033[36mBebidas\033[0m\n1. Café\t\t\t\033[32m$25.00\033[0m\n2. Mocha\t\t\033[32m$28.00\033[0m\n3. Expresso\t\t\033[32m$26.00\033[0m\n4. Americano\t\t\033[32m$40.00\033[0m\n5. Té verde\t\t\033[32m$30.00\033[0m\n6. Té negro\t\t\033[32m$35.00\033[0m\n7. Té de temporada\t\033[32m$70.00\033[0m\n8. Chocolate\t\t\033[32m$30.00\033[0m\n9. Limonada\t\t\033[32m$25.00\033[0m\n10. Naranjada\t\t\033[32m$28.00\033[0m");
        bebida=teclado.nextInt();
        if (bebida==1) {
            System.out.println("¿Cuántos cafés vas a querer?");
            cafe=teclado.nextInt();
            tc=cafe+tc;
            tc1=tc*caf;
        }
         if (bebida==2) {
            System.out.println("¿Cuántos mochas vas a querer?");
            mocha=teclado.nextInt();
            tm=mocha+tm;
            tm1=tm*mocha1;
        }
          if (bebida==3) {
            System.out.println("¿Cuántos Expressos vas a querer?");
            express=teclado.nextInt();
            tex=express+tex;
            tex1=tex*Expr;
            
        }
          if (bebida==4) {
            System.out.println("¿Cuántos Americanos vas a querer?");
            ame=teclado.nextInt();
            ta=ame+ta;
            ta1=ta*amer;
            
        }
         if (bebida==5) {
            System.out.println("¿Cuántos Tés Verdes vas a querer?");
            tev=teclado.nextInt();
            tE=tev+tE;
            tE1=tE*teve;
        }
         if (bebida==6) {
            System.out.println("¿Cuántos Tés Negros vas a querer?");
            ten=teclado.nextInt();
            tN=tN+ten;
            tN1=tN*tene;
        }
          if (bebida==7) {
            System.out.println("¿Cuántos Tés de temporada vas a querer?");
            tet=teclado.nextInt();
            tT=tet+tT;
            tT1=tT*tetem;
         
        }
         if (bebida==8) {
            System.out.println("¿Cuántos Chocolates vas a querer?");
            cho=teclado.nextInt();
            tCho=cho+tCho;
            tCho1=tCho*choco;
        }
          if (bebida==9) {
            System.out.println("¿Cuántas limonadas vas a querer?");
            lim=teclado.nextInt();
            tLim=lim+tLim;
            tLim1=tLim*limon;
        }
          if (bebida==10) {
            System.out.println("¿Cuántas naranjadas vas a querer?");
            nan=teclado.nextInt();
            tNan=nan+tNan;
            tNan1=tNan*naranja;
        }
        
        break;
        case 2: System.out.println("\033[36mComidas\033[0m\n1. Molletes\t\t\t\033[32m$35.00\033[0m\n2. Huevos al gusto\t\t\033[32m$40.00\033[0m\n3. Chilaquiles\t\t\t\033[32m$35.00\033[0m\n4. Omellett de espinacas\t\033[32m$35.00\033[0m\n5. Club Sandwich\t\t\033[32m$40.00\033[0m\n6. Burrito\t\t\t\033[32m$25.00\033[0m\n7. Ensalada Fresca\033[32m\t\t$30.00\033[0m\n8. Hamburguesa\t\t\t\033[32m$40.00\033[0m");
        comida=teclado.nextInt();
        if (comida==1) {
            System.out.println("¿Cuántas ordenes de Molletes vas a querer?");
            moll=teclado.nextInt();
            tmoll=moll+tmoll;
            tmoll1=tmoll*molle;
        }
        if (comida==2) {
            System.out.println("¿Cuántos huevos al gusto vas a querer?");
            hugg=teclado.nextInt();
            thugg=hugg+thugg;
            thugg1=thugg*huevo;
        }
        if (comida==3) {
            System.out.println("¿Cuántas ordenes de Chilaquiles vas a querer?");
            chil=teclado.nextInt();
            tchil=chil+tchil;
            tchil1=tchil*chila;
        }
        if (comida==4) {
            System.out.println("¿Cuántas ordenes de Omellet de espinacas vas a querer?");
            om=teclado.nextInt();
            tom=om+tom;
            tom1=tom*omellet1;
        }
        if (comida==5) {
            System.out.println("¿Cuántos Club Sandwich vas a querer?");
            cs=teclado.nextInt();
            tcs=cs+tcs;
            tcs1=tcs*clubS;
        }
        if (comida==6) {
            System.out.println("¿Cuántos Burritos vas a querer?");
            burr=teclado.nextInt();
            tburr=burr+tburr;
            tburr1=tburr*burri;
        }
        if (comida==7) {
            System.out.println("¿Cuántas ensaladas frscas vas a querer?");
            ef=teclado.nextInt();
            tef=ef+tef;
            tef1=tef*EnS;
        }
        if (comida==8) {
            System.out.println("¿Cuántas Hamburguesas vas a querer?");
            hambre=teclado.nextInt();
            tham=hambre+tham;
            tham1=tham*Hamb;
        }
        break;
        case 3: System.out.println("\033[36mRepostería y panadería\033[0m\n1. Croissant\t\t\033[32m$50.00\033[0m\n2. Chapata\t\t\033[32m$50.00\033[0m\n3. Dona glaseada\t\033[32m$15.00\033[0m\n4. Pay de nuez\t\t\033[32m$40.00\033[0m\n5. Pay de queso\t\t\033[32m$40.00\033[0m\n6. Pastel de fresa\t\033[32m$35.00\033[0m\n7. Rollo de canela\t\033[32m$30.00\033[0m\n8. Cherry Muffin\t\033[32m$20.00\033[0m");
        ryp=teclado.nextInt();
        if (ryp==1) {
            System.out.println("¿Cuántos Croissant vas a querer?");
            croi=teclado.nextInt();
            tcroi=croi+tcroi;
            tcroi1=tcroi*chi1;
        }
        if (ryp==2) {
            System.out.println("¿Cuántas Chapatas vas a querer?");
            cha=teclado.nextInt();
            tcha=cha+tcha;
            tcha1=tcha*chapa;
        }
        if (ryp==3) {
            System.out.println("¿Cuántas donas glaseadas vas a querer?");
            dg=teclado.nextInt();
            tdg=dg+tdg;
            tdg1=tdg*donaG;
        }
        if (ryp==4) {
            System.out.println("¿Cuántos pays de nuez vas a querer?");
            pn=teclado.nextInt();
            tpn=pn+tpn;
            tpn1=tpn*PdN;
        }
        if (ryp==5) {
            System.out.println("¿Cuántos pays de queso vas a querer?");
            pq=teclado.nextInt();
            tpq=pq+tpq;
            tpq1=tpq*PQ;
        }
        if (ryp==6) {
            System.out.println("¿Cuántos pasteles de fresa vas a querer?");
            pf=teclado.nextInt();
            fpf=pf+fpf;
            fpf1=fpf*PasF;
        }
        if (ryp==7) {
            System.out.println("¿Cuántos rollos de canela vas a querer?");
            rc=teclado.nextInt();
            frc=rc+frc;
            frc1=frc*RollC;
        }
        if (ryp==8) {
            System.out.println("¿Cuántos cherry muffin vas a querer?");
            cm=teclado.nextInt();
            tcm=cm+tcm;
            tcm1=tcm*CherrM;
        }
        break;
    } 
    ticket++;

    System.out.println ("¿Se le ofrese algo más?\n1. Si\t2.No");
    op=teclado.nextInt();
}while(op==1);
    tb=tc1+tm1+tex1+ta1+tE1+tN1+tT1+tCho1+tLim1+tNan1+tmoll1+thugg1+tchil1+tom1+tcs1+tburr1+tef1+tham1+tcroi1+tcha1+tdg1+tpn1+tpq1+fpf1+frc1+tcm1;
    System.out.println("Su total a pagar es de: \033[32m$" +tb +"0\033[0m");
    tpro=tc+tm+tex+ta+tE+tN+tLim+tNan+tT+tCho+tmoll+thugg+tchil+tom+tcs+tburr+ tef+tham+tcroi+tcha+tdg+tpn+tpq+fpf+frc+tcm;
 System.out.println("Metodo de pago: \n1. Tarjeta\n2. Efectivo\n3. Cancelar");
 pago=teclado.nextInt();
 switch (pago) {
    case 1:
    long numerw;
    int PIn;
    System.out.println("Nombre del propietario: ");
    nombre=teclado.nextLine();
        nombre=teclado.nextLine();
    System.out.println("Número de tarjeta: ");
    numerw=teclado.nextLong();
    System.out.println("CVV: ");
    PIn=teclado.nextInt();
    System.out.println("Pago realizado con exito\nLos gastos se han cargado a tu tarjeta ✓\nProcesando....");
        System.out.println("___________________________________________________________________\n\033[36mCafetería London\033[0m\n\t\t\tCASA MARTE\nPlaza Town Center, Av. Rosario 1025, El rosario, Azcapotzalco, \nPlanta 4, Local 25\nEmail:cafelondon.rosario@gmail.com\nTel.:72.89.00.56.93\nEl rosario, Azcapotzalco\nDistrito Federal, 09800, México\nSucursal:Town Center Rosario\nNo. Ticket: DECO00" +ticket +"\tFecha: " +dtf2.format(LocalDateTime.now()) +"\nNo. Terminal: AZCO\tHora: " +dtf3.format(LocalDateTime.now())+"\nCajero: Fernando Iturbide Amador\nMesera: Fernanda De León Rojas\nCliente: "+nombre+"\n\n********************Venta********************\n\033[0m---------------------------------------------\nProducto y Descripción\t\tPrecio\tTOTAL\n---------------------------------------------");
        
    for (contador=1;contador<=tc;contador++)
       {System.out.println("\tCafé \t\t\t\033[32m$"+caf+"\033[0m\t  1");
       }
       
    
    for (contador1=1;contador1<=tm;contador1++) {System.out.println("\tMocha\t\t\t\033[32m$"+mocha1+"\033[0m\t  1");
    }

       
    for (contador2=1;contador2<=tex;contador2++)
{System.out.println("\tExpresso\t\t\033[32m$"+Expr+"\033[0m\t  1");}

   
        for (contador3=1;contador3<=ta;contador3++)
{System.out.println("\tAmericano\t\t\033[32m$" + amer+"\033[0m\t  1");}

   
    for (contador4=1;contador4<=tE;contador4++) {System.out.println("\tTé Verde\t\t\033[32m$" +teve+"\033[0m\t  1");}
    
       
       for (contador5=1;contador5<=tN;contador5++) {System.out.println("\tTé Negro\t\t\033[32m$" +tene+"\033[0m\t  1");}
    
           
           for (contador6=1;contador6<=tT;contador6++) {System.out.println("\tTé de Temporada\t\t\033[32m$" +tetem+"\033[0m\t  1");}
         
           for (contador7=1;contador7<=tCho;contador7++) {System.out.println("\tChocolate\t\t\033[32m$" +choco+"\033[0m\t  1");
}
           
           for (contador8=1;contador8<=tLim;contador8++) {System.out.println("\tLimomada\t\t\033[32m$" +limon+"\033[0m\t  1");
}
               
               for (contador9=1;contador9<=tNan;contador9++) {System.out.println("\tNaranjada\t\t\033[32m$" +naranja+"\033[0m\t  1");
}
              
               for (contador10=1;contador10<=tmoll;contador10++) {System.out.println("\tMolletes\t\t\033[32m$" +molle+"\033[0m\t  1");
}
             
                   for (contador11=1;contador11<=thugg;contador11++) {System.out.println("\tHuevo al gusto\t\t\033[32m$" +huevo+"\033[0m\t  1");
 }
               
                   for (contador12=1;contador12<=tchil;contador12++) {System.out.println("\tChilaquiles\t\t\033[32m$" +chila+"\033[0m\t  1");
 }
                
                   for (contador13=1;contador13<=tom;contador13++) {System.out.println("\tOmellet\t\t\t\033[32m$" +omellet1+"\033[0m\t  1");
}
            
                   for (contador14=1;contador14<=tcs;contador14++){System.out.println("\tClub Sandwich\t\t\033[32m$" +clubS+"\033[0m\t  1");
}
                 
                   for (contador15=1;contador15<=tburr;contador15++) {System.out.println("\tBurrito\t\t\t\033[32m$" +burri+"\033[0m\t  1");
}
               
                   for (contador16=1;contador16<=tef;contador16++){System.out.println("\tEnsalada fresca\t\t\033[32m$" +EnS+"\033[0m\t  1");
}
                 
                   for (contador17=1;contador17<=tham;contador17++){System.out.println("\tHamburguesa\t\t\033[32m$" +Hamb+"\033[0m\t  1");
}
                
                   for (contador18=1;contador18<=tcroi;contador18++){System.out.println("\tCroissant\t\t\033[32m$" +chi1+"\033[0m\t  1");
}
              
                   for (contador19=1;contador19<=tcha;contador19++){System.out.println("\tChapata\t\t\t\033[32m$" +chapa+"\033[0m\t  1");
 }
             
                   for (contador20=1;contador20<=tdg;contador20++){System.out.println("\tDona Glaseada\t\t\033[32m$" +donaG+"\033[0m\t  1");
}
                
                   for (contador21=1;contador21<=tpn;contador21++){System.out.println("\tPay de Nuez\t\t\033[32m$" +PdN+"\033[0m\t  1");
  }
                 
                   for (contador22=1;contador22<=tpq;contador22++){System.out.println("\tPay de queso\t\t\033[32m$" +PQ+"\033[0m\t  1");
}
              
                   for (contador23=1;contador23<=fpf;contador23++){System.out.println("\tPastel de fresa\t\t\033[32m$" +PasF+"\033[0m\t  1");
  }
                
                   for (contador24=1;contador24<=frc;contador24++){System.out.println("\tRollo de canela\t\t\033[32m$" +RollC+"\033[0m\t  1");
   }
             
                   for (contador25=1;contador25<=tcm;contador25++){System.out.println("\tCherry muffin\t\t\033[32m$" +CherrM+"\033[0m\t  1");
  }
      System.out.print("---------------------------------------------\nTotal de productos:\t\t\t  "+tpro +"\nTotal: \t\t\t\t\t\033[32m$" +tb+"0\033[0m\n\nTarjeta: " +numerw+"\n\n\t  \"¿Cómo te atendimos?\"\n\twww.cafeteríalondonmx.com");
        
    break;
    case 2:
            try {
            System.out.println("Dinero Recibido: ");
            monto = num.nextLine();
            double dinero=Double.parseDouble(monto);
            costo=dinero;
            cambio=costo-tb;

            double nuevocd=0;
               while (costo<tb){
               	System.out.println("Dinero insuficiente\nAgregue más dinero"); 
            nuevoc=teclado.nextInt();
            nuevocd=nuevoc+nuevocd;
            costo=dinero+nuevocd;
            }
                        String letras = Double.toString(costo);
                      String Convertir = letraNum.Convertir(letras, true);
                        cambio=costo-tb;
    if (costo>=tb){
    System.out.println("___________________________________________________________________\n\033[36mCafetería London\033[0m\n\t\t\tCASA MARTE\nPlaza Town Center, Av. Rosario 1025, El rosario, Azcapotzalco, \nPlanta 4, Local 25\nEmail:cafelondon.rosario@gmail.com\nTel.:72.89.00.56.93\nEl rosario, Azcapotzalco\nDistrito Federal, 09800, México\nSucursal:Town Center Rosario\nNo. Ticket: DECO00" +ticket +"\tFecha: " +dtf2.format(LocalDateTime.now()) +"\nNo. Terminal: AZCO\tHora: " +dtf3.format(LocalDateTime.now())+"\nCajero: Fernando Iturbide Amador\nMesera: Fernanda De León Rojas\n\n********************Venta********************\nDinero Recibido: \t\t\t\033[32m$"+costo+"\n\033[0m---------------------------------------------\nProducto y Descripción\t\tPrecio\tTOTAL\n---------------------------------------------");
 
    for (contador=1;contador<=tc;contador++)
       {System.out.println("\tCafé \t\t\t\033[32m$"+caf+"\033[0m\t  1");
       }
       
    
    for (contador1=1;contador1<=tm;contador1++) {System.out.println("\tMocha\t\t\t\033[32m$"+mocha1+"\033[0m\t  1");
    }

       
    for (contador2=1;contador2<=tex;contador2++)
{System.out.println("\tExpresso\t\t\033[32m$"+Expr+"\033[0m\t  1");}

   
        for (contador3=1;contador3<=ta;contador3++)
{System.out.println("\tAmericano\t\t\033[32m$" + amer+"\033[0m\t  1");}

   
    for (contador4=1;contador4<=tE;contador4++) {System.out.println("\tTé Verde\t\t\033[32m$" +teve+"\033[0m\t  1");}
    
       
       for (contador5=1;contador5<=tN;contador5++) {System.out.println("\tTé Negro\t\t\033[32m$" +tene+"\033[0m\t  1");}
    
           
           for (contador6=1;contador6<=tT;contador6++) {System.out.println("\tTé de Temporada\t\t\033[32m$" +tetem+"\033[0m\t  1");}
         
           for (contador7=1;contador7<=tCho;contador7++) {System.out.println("\tChocolate\t\t\033[32m$" +choco+"\033[0m\t  1");
}
           
           for (contador8=1;contador8<=tLim;contador8++) {System.out.println("\tLimomada\t\t\033[32m$" +limon+"\033[0m\t  1");
}
               
               for (contador9=1;contador9<=tNan;contador9++) {System.out.println("\tNaranjada\t\t\033[32m$" +naranja+"\033[0m\t  1");
}
              
               for (contador10=1;contador10<=tmoll;contador10++) {System.out.println("\tMolletes\t\t\033[32m$" +molle+"\033[0m\t  1");
}
             
                   for (contador11=1;contador11<=thugg;contador11++) {System.out.println("\tHuevo al gusto\t\t\033[32m$" +huevo+"\033[0m\t  1");
 }
               
                   for (contador12=1;contador12<=tchil;contador12++) {System.out.println("\tChilaquiles\t\t\033[32m$" +chila+"\033[0m\t  1");
 }
                
                   for (contador13=1;contador13<=tom;contador13++) {System.out.println("\tOmellet\t\t\t\033[32m$" +omellet1+"\033[0m\t  1");
}
            
                   for (contador14=1;contador14<=tcs;contador14++){System.out.println("\tClub Sandwich\t\t\033[32m$" +clubS+"\033[0m\t  1");
}
                 
                   for (contador15=1;contador15<=tburr;contador15++) {System.out.println("\tBurrito\t\t\t\033[32m$" +burri+"\033[0m\t  1");
}
               
                   for (contador16=1;contador16<=tef;contador16++){System.out.println("\tEnsalada fresca\t\t\033[32m$" +EnS+"\033[0m\t  1");
}
                 
                   for (contador17=1;contador17<=tham;contador17++){System.out.println("\tHamburguesa\t\t\033[32m$" +Hamb+"\033[0m\t  1");
}
                
                   for (contador18=1;contador18<=tcroi;contador18++){System.out.println("\tCroissant\t\t\033[32m$" +chi1+"\033[0m\t  1");
}
              
                   for (contador19=1;contador19<=tcha;contador19++){System.out.println("\tChapata\t\t\t\033[32m$" +chapa+"\033[0m\t  1");
 }
             
                   for (contador20=1;contador20<=tdg;contador20++){System.out.println("\tDona Glaseada\t\t\033[32m$" +donaG+"\033[0m\t  1");
}
                
                   for (contador21=1;contador21<=tpn;contador21++){System.out.println("\tPay de Nuez\t\t\033[32m$" +PdN+"\033[0m\t  1");
  }
                 
                   for (contador22=1;contador22<=tpq;contador22++){System.out.println("\tPay de queso\t\t\033[32m$" +PQ+"\033[0m\t  1");
}
              
                   for (contador23=1;contador23<=fpf;contador23++){System.out.println("\tPastel de fresa\t\t\033[32m$" +PasF+"\033[0m\t  1");
  }
                
                   for (contador24=1;contador24<=frc;contador24++){System.out.println("\tRollo de canela\t\t\033[32m$" +RollC+"\033[0m\t  1");
   }
             
                   for (contador25=1;contador25<=tcm;contador25++){System.out.println("\tCherry muffin\t\t\033[32m$" +CherrM+"\033[0m\t  1");
  }
    
    System.out.print("---------------------------------------------\nTotal de productos:\t\t\t  "+tpro +"\nTotal: \t\t\t\t\t\033[32m$" +tb+"0\033[0m\nEfectivo: \033[32m\t\t\t\t$" +costo +"\033[0m\nCambio      \t\t\t(Efectivo)\033[32m$" +cambio +"\033[0m\n\n"+Convertir+"\n\n\t  \"¿Cómo te atendimos?\"\n\twww.cafeteríalondonmx.com");
            } 

            } catch (Exception e) {
            System.out.print(e);
       }
    break;
    case 3: System.out.println("Lamentamos no ser de ayuda, vuelva pronto");
 }//switch

    }
private final String[] UNIDADES = {"", "un ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
private final String[] DECENAS = {"diez ", "once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ",
"diecisiete ", "dieciocho ", "diecinueve", "veinte ", "treinta ", "cuarenta ",
"cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
private final String[] CENTENAS = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ",
"setecientos ", "ochocientos ", "novecientos "};

public String Convertir(String numero, boolean mayusculas) {
String literal = "";
String parte_decimal;    
numero = numero.replace(".", ",");
if(numero.indexOf(",")==-1){
    numero = numero + ",00";
}
if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {
    String Num[] = numero.split(",");            
    parte_decimal = Num[1] + "/100 M.N.";
    if (Integer.parseInt(Num[0]) == 0) {
        literal = "cero ";
    } else if (Integer.parseInt(Num[0]) > 999999) {
        literal = getMillones(Num[0]);
    } else if (Integer.parseInt(Num[0]) > 999) {
        literal = getMiles(Num[0]);
    } else if (Integer.parseInt(Num[0]) > 99) {
        literal = getCentenas(Num[0]);
    } else if (Integer.parseInt(Num[0]) > 9) {
        literal = getDecenas(Num[0]);
    } else {
        literal = getUnidades(Num[0]);
    }
    if (mayusculas) {
        return (literal + parte_decimal).toUpperCase();
    } else {
        return (literal + parte_decimal);
    }
} else {
    return literal = null;
}
}
private String getUnidades(String numero) {
String num = numero.substring(numero.length() - 1);
return UNIDADES[Integer.parseInt(num)];
}

private String getDecenas(String num) {                       
int n = Integer.parseInt(num);
if (n < 10) {
    return getUnidades(num);
} else if (n > 19) {
    String u = getUnidades(num);
    if (u.equals("")) { 
        return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8];
    } else {
        return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8] + "y " + u;
    }
} else {
    return DECENAS[n - 10];
}
}

private String getCentenas(String num) {
if( Integer.parseInt(num)>99 ){
    if (Integer.parseInt(num) == 100) {
        return " cien ";
    } else {
         return CENTENAS[Integer.parseInt(num.substring(0, 1))] + getDecenas(num.substring(1));
    } 
}else{
    return getDecenas(Integer.parseInt(num)+"");            
}        
}

private String getMiles(String numero) {
String c = numero.substring(numero.length() - 3);
String m = numero.substring(0, numero.length() - 3);
String n="";
if (Integer.parseInt(m) > 0) {
    n = getCentenas(m);           
    return n + "mil " + getCentenas(c);
} else {
    return "" + getCentenas(c);
}

}

private String getMillones(String numero) { 
String miles = numero.substring(numero.length() - 6);
String millon = numero.substring(0, numero.length() - 6);
String n = "";
if(millon.length()>1){
    n = getCentenas(millon) + "millones ";
}else{
    n = getUnidades(millon) + "millon ";
}
return n + getMiles(miles);        
}
}