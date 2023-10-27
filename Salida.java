
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JScrollPane;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Salida extends JFrame{
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");
    private JTextArea area1;
    private JScrollPane scrollPane4;
    int respuesta, ticket, comida, ryp, croi, cha, dg, pn, pq, pf, rc, cm, bebida, moll, hugg, chil, om, cs, burr, ef, hambre, cafe, op, mocha, express, ame, tev, ten, tet, cho, lim, nan, pago;
    double costo, cambio,nuevoc=0,contador,contador1,contador2,contador3,contador4,contador5,contador6,contador7,contador8,contador9,contador10,
contador11,contador12,contador13,contador14,contador15,contador16,contador17,contador18,contador19, contador20,contador21,contador22,contador23,contador24,contador25;
    int tc=0, tm=0, tex=0, ta=0, tE=0, tN=0, tLim=0, tNan=0,tT=0,tCho=0, tmoll=0,thugg=0, tchil=0, tom=0,tcs=0, tburr=0, tef=0, tham=0, tcroi=0,tcha=0,tdg=0,tpn=0,tpq=0,fpf=0,frc=0,tcm=0,tpro=0;
    double tc1=0,tm1=0, tex1=0,ta1=0,tE1=0,tN1=0,tLim1=0,tNan1=0,tT1=0, tCho1=0, tb=0, tdg1=0,tcha1=0, tcroi1=0, tham1=0, tef1=0, tburr1=0, tcs1=0, tom1=0, tchil1=0, thugg1=0, tmoll1=0, tpn1=0, tpq1=0, fpf1=0, frc1=0, tcm1=0, tp=0;
    final double caf=25.00, mocha1=28.00, Expr=26.00, amer=40.00, teve=30.00, tene=35.00, tetem=70.00, choco=30.00, limon=25.00, naranja=28.00, molle=35.00, huevo=40.00, chila=35.00, omellet1=35.00, clubS=40.00, burri=25.00, EnS=30.00, Hamb=40.00, chi1=50.00, chapa=50.00, donaG=15.00, PdN=40.00, PQ=40.00, PasF=35.00,RollC=30.00,CherrM=20.00;
    public Salida(){
      area1 = new JTextArea();
      area1.setEditable(false);
      area1.setBackground(new Color(0,0, 0));
      area1.setFont(new Font("Andale Mono", 1, 11));
      area1.setForeground(new Color(255, 255, 255));
      area1.setText("Cafeteria London\nDireccion: Plaza Town Center, Av. Rosario 1025, El rosario, \nAzcapotzalco, Planta 4, Local 25\nCorreo: cafelondon.rosario@gmail.com");
      scrollPane4 = new JScrollPane(area1);
      scrollPane4.setBounds(10,10,330,490);
      add(scrollPane4); 
    }
    public static void main(String[] args) {
        
        Salida salida =new Salida();
        salida.setBounds(0,0,350,510);
        salida.setVisible(true);
        salida.setResizable(false);
        salida.setLocationRelativeTo(null);
    }
}
