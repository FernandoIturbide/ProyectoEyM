import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticket extends JFrame implements ActionListener, ItemListener{
    private JMenuBar mb;
    private JMenu menuOpciones,menuAcercaDe,menuColorFondo;
    private JMenuItem miRojo,miNegro,miMorado,Original,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo, labelBienvenido, labelinstruccion, labelcantidad, labeltipo,labelfooter, precio, labelCanComida, labelCanReposteria, labelTipoComida, labelTipoReposteria, labelprecio2, labelprecio3;
    private JButton sacarticket, guardar,borrar;
    private JComboBox comboproductos, comboComida, comboReposteria;
    private JTextField numDeProductos, numDeComida, numDeReposteria;
    private JScrollPane scrollpane1,scrollpane,scrollPane2, scrollPane3; 
    private JTextArea textarea,textarea1,textarea2, textarea3;
    int contadorBebidas=0, contadorComidas=0, contadorPostres=0,repet=0;
    int cajaBebidas[]=new int[10];
    int cajaComidas[]=new int[10];
    int cajaPostres[]=new int[10];
    double precioBebidas[]=new double[10];
    double precioComida []=new double[10];
    double precioPostres[]=new double[10];
    double totalprecios [][]=new double[4][10];
    String nomAdmin="", cadenaCafe="", textoAcomulado="";
    public static double ToPrecs=0;
    public static String precs="";
    public Ticket (){
        precioBebidas[9]=28;
        precioBebidas[8]=25;
        precioBebidas[7]=30;
        precioBebidas[6]=70;
        precioBebidas[5]=35;
        precioBebidas[4]=30;
        precioBebidas[3]=40;
        precioBebidas[2]=26;
        precioBebidas[1]=28;
        precioBebidas[0]=25;
        precioComida[7]=40;
        precioComida[6]=30;
        precioComida[5]=25;
        precioComida[4]=40;
        precioComida[3]=35;
        precioComida[2]=35;
        precioComida[1]=40;
        precioComida[0]=35;
        precioPostres[0]=50;
        precioPostres[1]=50;
        precioPostres[2]=15;
        precioPostres[3]=40;
        precioPostres[4]=40;
        precioPostres[5]=35;
        precioPostres[6]=30;
        precioPostres[7]=20;

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(0,35,53));
        setIconImage(new ImageIcon(getClass().getResource("images/ivono.png")).getImage());
        Interfaz1 interfaz12=new Interfaz1();
        nomAdmin=interfaz12.text;

        mb = new JMenuBar();
      mb.setBackground(new Color(255, 0, 0));
      setJMenuBar(mb);

      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(255, 0, 0));
      menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      menuOpciones.setForeground(new Color(255, 255, 255));
      mb.add(menuOpciones);

      menuAcercaDe = new JMenu("Acerca de");
      menuAcercaDe.setBackground(new Color(255, 0, 0));
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      menuAcercaDe.setForeground(new Color(255, 255, 255));
      mb.add(menuAcercaDe);

      menuColorFondo = new JMenu("Color de fondo");
      menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
      menuColorFondo.setForeground(new Color(255, 0, 0));
      menuOpciones.add(menuColorFondo);

      Original=new JMenuItem("Defecto");
      Original.setFont(new Font ("Andale Mono",1,14));
      Original.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(Original);
      Original.addActionListener(this);

      miRojo = new JMenuItem("Rojo");
      miRojo.setFont(new Font("Andale Mono", 1, 14));
      miRojo.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(miRojo);
      miRojo.addActionListener(this);

      miNegro = new JMenuItem("Negro");
      miNegro.setFont(new Font("Andale Mono", 1, 14));
      miNegro.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(miNegro);
      miNegro.addActionListener(this);

      miMorado = new JMenuItem("Morado");
      miMorado.setFont(new Font("Andale Mono", 1, 14));
      miMorado.setForeground(new Color(255, 0, 0));
      menuColorFondo.add(miMorado);
      miMorado.addActionListener(this);

      miNuevo = new JMenuItem("Nuevo");
      miNuevo.setFont(new Font("Andale Mono", 1, 14));
      miNuevo.setForeground(new Color(255, 0, 0));
      menuOpciones.add(miNuevo);
      miNuevo.addActionListener(this);

      miElCreador = new JMenuItem("El creador");
      miElCreador.setFont(new Font("Andale Mono", 1, 14));
      miElCreador.setForeground(new Color(255, 0, 0));
      menuAcercaDe.add(miElCreador);
      miElCreador.addActionListener(this);

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Andale Mono", 1, 14));
      miSalir.setForeground(new Color(255, 0, 0));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);

      ImageIcon imagen = new ImageIcon("images/logo3.png");
      labelLogo = new JLabel(imagen);  
      labelLogo.setBounds(5,5,250,100);
      add(labelLogo);

      labelBienvenido = new JLabel("Bienvenido " +nomAdmin);  
      labelBienvenido.setBounds(250,30,400,50);
      labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
      labelBienvenido.setForeground(new Color(255, 255, 255));
      add(labelBienvenido);

      labelinstruccion = new JLabel("Datos de la cantidad de productos vendidos");
      labelinstruccion.setBounds(65,100,500,25);
      labelinstruccion.setFont(new Font("Andale Mono", 0, 24));
      labelinstruccion.setForeground(new Color(255, 255, 255));
      add(labelinstruccion);


      labelcantidad = new JLabel("Cantidad de bebidas:");
      labelcantidad.setBounds(25,135,180,25);
      labelcantidad.setFont(new Font("Andale Mono", 1, 12));
      labelcantidad.setForeground(new Color(255, 255, 255));
      add(labelcantidad);

      numDeProductos = new JTextField();
      numDeProductos.setBounds(25,160,150,25);
      numDeProductos.setBackground(new java.awt.Color(224, 224, 224));
      numDeProductos.setFont(new java.awt.Font("Andale Mono", 1, 14));
      numDeProductos.setForeground(new java.awt.Color(255, 0, 0));
      add(numDeProductos);

      labelCanComida=new JLabel("Cantidad de comida: ");
      labelCanComida.setBounds(25,200,180,25);
      labelCanComida.setFont(new Font("Andale Mono", 1, 12));
      labelCanComida.setForeground(new Color(255, 255, 255));
      add(labelCanComida);

      numDeComida= new JTextField();
      numDeComida.setBounds(25,225,150,25);
      numDeComida.setBackground(new java.awt.Color(224, 224, 224));
      numDeComida.setFont(new java.awt.Font("Andale Mono", 1, 14));
      numDeComida.setForeground(new java.awt.Color(255, 0, 0));
      add(numDeComida);

      labelCanReposteria=new JLabel("Cantidad de reposteria: ");
      labelCanReposteria.setBounds(25,265,180,25);
      labelCanReposteria.setFont(new Font("Andale Mono", 1, 12));
      labelCanReposteria.setForeground(new Color(255, 255, 255));
      add(labelCanReposteria);

      numDeReposteria= new JTextField();
      numDeReposteria.setBounds(25,290,150,25);
      numDeReposteria.setBackground(new java.awt.Color(224, 224, 224));
      numDeReposteria.setFont(new java.awt.Font("Andale Mono", 1, 14));
      numDeReposteria.setForeground(new java.awt.Color(255, 0, 0));
      add(numDeReposteria);

      labeltipo = new JLabel("Selecciona el tipo de bebida: ");
      labeltipo.setBounds(220,135,180,25);
      labeltipo.setFont(new Font("Andale Mono", 1, 12));
      labeltipo.setForeground(new Color(255, 255, 255));
      add(labeltipo);

      comboproductos = new JComboBox();
      comboproductos.setBounds(220,160,220,25);
      comboproductos.setBackground(new java.awt.Color(224, 224, 224));
      comboproductos.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboproductos.setForeground(new java.awt.Color(255, 0, 0));
      add(comboproductos);
      comboproductos.addItem("");
      comboproductos.addItem("Cafe");
      comboproductos.addItem("Mocha");
      comboproductos.addItem("Expresso");
      comboproductos.addItem("Americano");
      comboproductos.addItem("Te verde");
      comboproductos.addItem("Te negro");
      comboproductos.addItem("Te de temporada");
      comboproductos.addItem("Chocolate");
      comboproductos.addItem("Limonada");
      comboproductos.addItem("Naranjada");
      comboproductos.addItemListener(this);

      labelTipoComida = new JLabel("Selecciona el tipo de comida: ");
      labelTipoComida.setBounds(220,200,180,25);
      labelTipoComida.setFont(new Font("Andale Mono", 1, 12));
      labelTipoComida.setForeground(new Color(255, 255, 255));
      add(labelTipoComida);

      comboComida = new JComboBox();
      comboComida.setBounds(220,225,220,25);
      comboComida.setBackground(new java.awt.Color(224, 224, 224));
      comboComida.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboComida.setForeground(new java.awt.Color(255, 0, 0));
      add(comboComida);
      comboComida.addItem("");
      comboComida.addItem("Molletes");
      comboComida.addItem("Huevos al gusto");
      comboComida.addItem("Chilaquiles");
      comboComida.addItem("Omellett de espinacas");
      comboComida.addItem("Club sandwich");
      comboComida.addItem("Burrito");
      comboComida.addItem("Ensalada fresca");
      comboComida.addItem("Hamburguesa");
      comboComida.addItemListener(this);

      labelTipoReposteria = new JLabel("Selecciona el tipo de reposteria: ");
      labelTipoReposteria.setBounds(220,265,200,25);
      labelTipoReposteria.setFont(new Font("Andale Mono", 1, 12));
      labelTipoReposteria.setForeground(new Color(255, 255, 255));
      add(labelTipoReposteria);

      comboReposteria = new JComboBox();
      comboReposteria.setBounds(220,290,220,25);
      comboReposteria.setBackground(new java.awt.Color(224, 224, 224));
      comboReposteria.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboReposteria.setForeground(new java.awt.Color(255, 0, 0));
      add(comboReposteria);
      comboReposteria.addItem("");
      comboReposteria.addItem("Croissant");
      comboReposteria.addItem("Chapata");
      comboReposteria.addItem("Dona glaseada");
      comboReposteria.addItem("pay de nuez");
      comboReposteria.addItem("Pay de queso");
      comboReposteria.addItem("Pastel de fresa");
      comboReposteria.addItem("Rollo de canela");
      comboReposteria.addItem("Cherry Muffin");
      comboReposteria.addItemListener(this);

      precio=new JLabel("Precio: ");
      precio.setBounds(485,135,100,25);
      precio.setFont(new Font("Andale Mono", 1, 12));
      precio.setForeground(new Color(255, 255, 255));
      add(precio);

      textarea = new JTextArea();
      textarea.setEditable(false);
      textarea.setBackground(new Color(224, 224, 224));
      textarea.setFont(new Font("Andale Mono", 1, 14));
      textarea.setForeground(new Color(0, 143, 57));
      scrollpane1 = new JScrollPane(textarea);
      scrollpane1.setBounds(485,160,110,25);
      add(scrollpane1); 

      labelprecio2=new JLabel("Precio: ");
      labelprecio2.setBounds(485,200,100,25);
      labelprecio2.setFont(new Font("Andale Mono", 1, 12));
      labelprecio2.setForeground(new Color(255, 255, 255));
      add(labelprecio2);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224, 224, 224));
      textarea1.setFont(new Font("Andale Mono", 1, 14));
      textarea1.setForeground(new Color(0, 143, 57));
      scrollpane = new JScrollPane(textarea1);
      scrollpane.setBounds(485,225,110,25);
      add(scrollpane); 

      labelprecio2=new JLabel("Precio: ");
      labelprecio2.setBounds(485,265,100,25);
      labelprecio2.setFont(new Font("Andale Mono", 1, 12));
      labelprecio2.setForeground(new Color(255, 255, 255));
      add(labelprecio2);

      textarea2 = new JTextArea();
      textarea2.setEditable(false);
      textarea2.setBackground(new Color(224, 224, 224));
      textarea2.setFont(new Font("Andale Mono", 1, 14));
      scrollPane2 = new JScrollPane(textarea2);
      scrollPane2.setBounds(485,290,110,25);
      textarea2.setForeground(new Color(0, 143, 57));
      add(scrollPane2); 
      
      textarea3=new JTextArea();
      textarea3.setEditable(false);
      textarea3.setBackground(new Color(224, 224, 224));
      textarea3.setFont(new Font("Andale Mono", 1, 14));
      scrollPane3 = new JScrollPane(textarea3);
      scrollPane3.setBounds(25,375,570,60);
      textarea3.setForeground(new Color(0,0,0));
      textarea3.setText("Aqui apareceran los productos vendidos");
      add(scrollPane3); 

      labelfooter = new JLabel("@2022 The WAPYJ Company | Todos los derechos reservados");
      labelfooter.setBounds(135,440,500,30);
      labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      labelfooter.setForeground(new java.awt.Color(255, 255, 255));
      add(labelfooter);

      guardar =new JButton("Guardar");
      guardar.setBounds(50,330,100,30);
      guardar.setBackground(new Color(255,255,255));
      guardar.setFont(new Font("Andale Mono", 1, 14));
      guardar.setForeground(new Color(0,35,53));
      guardar.addActionListener(this);
      add(guardar);

      sacarticket=new JButton("Cobrar");
      sacarticket.setBounds(255,330,150,30);
      sacarticket.setBackground(new Color(255,255,255));
      sacarticket.setFont(new Font("Andale Mono", 1, 14));
      sacarticket.setForeground(new Color(0,35,53));
      sacarticket.addActionListener(this);
      sacarticket.setEnabled(false);
      add(sacarticket);

      borrar=new JButton("Borrar");
      borrar.setBounds(485,330,110,30);
      borrar.setBackground(new Color(255,255,255));
      borrar.setFont(new Font("Andale Mono", 1, 14));
      borrar.setForeground(new Color(0,35,53));
      borrar.addActionListener(this);
      add(borrar);


    }
    public void itemStateChanged(ItemEvent e) {
        if (cajaBebidas[0]>0||cajaBebidas[1]>0||cajaBebidas[2]>0||cajaBebidas[3]>0||cajaBebidas[4]>0||cajaBebidas[4]>0||cajaBebidas[5]>0||cajaBebidas[6]>0||cajaBebidas[7]>0||cajaBebidas[8]>0||cajaBebidas[9]>0||cajaComidas[0]>0||cajaComidas[1]>0||cajaComidas[2]>0||cajaComidas[3]>0||cajaComidas[4]>0||cajaComidas[5]>0||cajaComidas[6]>0||cajaComidas[7]>0||cajaPostres[0]>0||cajaPostres[1]>0||cajaPostres[2]>0||cajaPostres[3]>0||cajaPostres[4]>0||cajaPostres[5]>0||cajaPostres[6]>0||cajaPostres[7]>0) {

            textarea3.setText(textoAcomulado);
            
        } else {
            textarea3.setText("Aqui apareceran los productos vendidos");
        }
        
        
        
        if (e.getSource()==comboproductos) {
            String opcion1=comboproductos.getSelectedItem().toString();

            if (opcion1.equals("")) {
                textarea.setText("");
                contadorBebidas=0;
                
            }
            if (opcion1.equals("Cafe")) {
                textarea.setText("$25.00");
                contadorBebidas=1;
                
            }
            if (opcion1.equals("Mocha")) {
                textarea.setText("$28.00");
                contadorBebidas=2;
                
            }
            if (opcion1.equals("Expresso")) {
                textarea.setText("$26.00");
                contadorBebidas=3;
                
            }
            if (opcion1.equals("Americano")) {
                textarea.setText("$40.00");
                contadorBebidas=4;
               
            }
            if (opcion1.equals("Te verde")) {
                textarea.setText("$30.00");
                contadorBebidas=5;
                
            }
            if (opcion1.equals("Te negro")) {
                textarea.setText("$35.00");
                contadorBebidas=6;
                
            }
            if (opcion1.equals("Te de temporada")) {
                textarea.setText("$70.00");
                contadorBebidas=7;
                
            }
            if (opcion1.equals("Chocolate")) {
                textarea.setText("$30.00");
                contadorBebidas=8;
               
            }
            if (opcion1.equals("Limonada")) {
                textarea.setText("$25.00");
                contadorBebidas=9;
               
            }
            if (opcion1.equals("Naranjada")) {
                textarea.setText("$28.00");
                contadorBebidas=10;
                
            }
        }
        if (e.getSource()==comboComida) {
            String opcion2=comboComida.getSelectedItem().toString();
            if (opcion2.equals("")){
                textarea1.setText("");
                contadorComidas=0;
                
            }
            if (opcion2.equals("Molletes")){
                textarea1.setText("$35.00");
                contadorComidas=1;
                
            }
            if (opcion2.equals("Huevos al gusto")){
                textarea1.setText("$40.00");
                contadorComidas=2;
                
            }
            if (opcion2.equals("Chilaquiles")){
                textarea1.setText("$35.00");
                contadorComidas=3;
                
            }
            if (opcion2.equals("Omellett de espinacas")){
                textarea1.setText("$35.00");
                contadorComidas=4;
                
            }
            if (opcion2.equals("Club sandwich")){
                textarea1.setText("$40.00");
                contadorComidas=5;
                
            }
            if (opcion2.equals("Burrito")){
                textarea1.setText("$25.00");
                contadorComidas=6;
                
            }
            if (opcion2.equals("Ensalada fresca")){
                textarea1.setText("$30.00");
                contadorComidas=7;
               
            }
            if (opcion2.equals("Hamburguesa")){
                textarea1.setText("$40.00");
                contadorComidas=8;
                
            }
        }
        if (e.getSource()==comboReposteria) {
            String opcion3=comboReposteria.getSelectedItem().toString();
            if (opcion3.equals("")){
                textarea2.setText("");
                contadorPostres=0;
            }
            if (opcion3.equals("Croissant")){
                textarea2.setText("$50.00");
                contadorPostres=1;
                
            }
            if (opcion3.equals("Chapata")){
                textarea2.setText("$50.00");
                contadorPostres=2;
                
            }
            if (opcion3.equals("Dona glaseada")){
                textarea2.setText("$15.00");
                contadorPostres=3;
                
            }
            if (opcion3.equals("pay de nuez")){
                textarea2.setText("$40.00");
                contadorPostres=4;
                
            }
            if (opcion3.equals("Pay de queso")){
                textarea2.setText("$40.00");
                contadorPostres=5;
                
            }
            if (opcion3.equals("Pastel de fresa")){
                textarea2.setText("$35.00");
                contadorPostres=6;
                
            }
            if (opcion3.equals("Rollo de canela")){
                textarea2.setText("$30.00");
                contadorPostres=7;
                
            }
            if (opcion3.equals("Cherry Muffin")){
                textarea2.setText("$20.00");
                contadorPostres=8;
                
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miRojo){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0));
        }
    	if (e.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (e.getSource() == Original){
            getContentPane().setBackground(new Color(0,35,53));
        }
        if (e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null, "Desarrollado por WAPYJ \n        www.wapyj.com");
        }
        if (e.getSource()==guardar) {
            if (contadorBebidas==0) {
            }
            if (contadorBebidas==1) {
                cajaBebidas[0]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[0]>0){
                    textoAcomulado+="Cafes vendidos: "+cajaBebidas[0]+"\n";
                    
                }
            }
            if (contadorBebidas==2) {
                cajaBebidas[1]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[1]>0){
                    textoAcomulado+="Mochas vendidos: "+cajaBebidas[1]+"\n";
                    
                }
            }
            if (contadorBebidas==3) {
                cajaBebidas[2]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[2]>0){
                    textoAcomulado+="Expressos vendidos: "+cajaBebidas[2]+"\n";
                    
                }
            }
            if (contadorBebidas==4) {
                cajaBebidas[3]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[3]>0){
                    textoAcomulado+="Americanos vendidos: "+cajaBebidas[3]+"\n";
                    
                }
            }
            if (contadorBebidas==5) {
                cajaBebidas[4]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[4]>0){
                    textoAcomulado+="Tes verdes vendidos: "+cajaBebidas[4]+"\n";
                   
                }
            }
            if (contadorBebidas==6) {
                cajaBebidas[5]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[5]>0){
                    textoAcomulado+="Tes negros vendidos: "+cajaBebidas[5]+"\n";
                   
                }
            }
            if (contadorBebidas==7) {
                cajaBebidas[6]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[6]>0){
                    textoAcomulado+="Tes de temporada vendidos: "+cajaBebidas[6]+"\n";
                   
                }
            }
            if (contadorBebidas==8) {
                cajaBebidas[7]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[7]>0){
                    textoAcomulado+="Chocolates vendidos: "+cajaBebidas[7]+"\n";
                    
                }
            }
            if (contadorBebidas==9) {
                cajaBebidas[8]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[8]>0){
                    textoAcomulado+="Limonadas vendidas: "+cajaBebidas[8]+"\n";
                    
                }
            }
            if (contadorBebidas==10) {
                cajaBebidas[9]+=Integer.parseInt(numDeProductos.getText());
                if (cajaBebidas[9]>0){
                    textoAcomulado+="Naranjadas vendidas: "+cajaBebidas[9]+"\n";
                    
                }
            }
            

            //comidas

            if (contadorComidas==0) {
            }
            if (contadorComidas==1) {
                cajaComidas[0]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[0]>0) {
                    textoAcomulado+="Molletes vendidos: "+cajaComidas[0]+"\n";
                   
                }
            }
            if (contadorComidas==2) {
                cajaComidas[1]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[1]>0) {
                    textoAcomulado+="Huevos al gusto vendidos: "+cajaComidas[1]+"\n";
                   
                }
            }
            if (contadorComidas==3) {
                cajaComidas[2]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[2]>0) {
                    textoAcomulado+="Chilaquiles vendidos: "+cajaComidas[2]+"\n";
                  
                }
            }
            if (contadorComidas==4) {
                cajaComidas[3]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[3]>0) {
                    textoAcomulado+="Omelletts de espinacas vendidos: "+cajaComidas[3]+"\n";
                  
                }
            }
            if (contadorComidas==5) {
                cajaComidas[4]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[4]>0) {
                    textoAcomulado+="Clubs sandwich vendidos: "+cajaComidas[4]+"\n";
                   
                }
            }
            if (contadorComidas==6) {
                cajaComidas[5]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[5]>0) {
                    textoAcomulado+="Burritos vendidos: "+cajaComidas[5]+"\n";
                    
                }
            }
            if (contadorComidas==7) {
                cajaComidas[6]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[6]>0) {
                    textoAcomulado+="Ensaladas frescas vendidos: "+cajaComidas[6]+"\n";
                    
                }
            }
            if (contadorComidas==8) {
                cajaComidas[7]+=Integer.parseInt(numDeComida.getText());
                if (cajaComidas[7]>0) {
                    textoAcomulado+="Hamburguesas vendidos: "+cajaComidas[7]+"\n";
                    
                }
            }

            //postres

            if (contadorPostres==0) {
            }
            if(contadorPostres==1){
                cajaPostres[0]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[0]>0) {
                    textoAcomulado+="Croissants vendidos: "+cajaPostres[0]+"\n";
                   
                    
                }
            }
            if(contadorPostres==2){
                cajaPostres[1]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[1]>0) {
                    textoAcomulado+="Chapatas vendidas: "+cajaPostres[1]+"\n";
                   
                    
                }
            }
            if(contadorPostres==3){
                cajaPostres[2]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[2]>0) {
                    textoAcomulado+="Donas glaseadas vendidas: "+cajaPostres[2]+"\n";
                   
                    
                }
            }
            if(contadorPostres==4){
                cajaPostres[3]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[3]>0) {
                    textoAcomulado+="Pays de nuez vendidos: "+cajaPostres[3]+"\n";
                  
                    
                }
            }
            if(contadorPostres==5){
                cajaPostres[4]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[4]>0) {
                    textoAcomulado+="Pays de queso vendidos: "+cajaPostres[4]+"\n";
                   
                    
                }
            }
            if(contadorPostres==6){
                cajaPostres[5]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[5]>0) {
                    textoAcomulado+="Pasteles de fresa vendidos: "+cajaPostres[5]+"\n";
                   
                    
                }
            }
            if(contadorPostres==7){
                cajaPostres[6]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[6]>0) {
                    textoAcomulado+="Rollos de canela vendidos: "+cajaPostres[6]+"\n";
                   
                    
                }
            }
            if(contadorPostres==8){
                cajaPostres[7]+=Integer.parseInt(numDeReposteria.getText());
                if (cajaPostres[7]>0) {
                    textoAcomulado+="Cherry Muffins vendidos: "+cajaPostres[7]+"\n";
                   
                    
                }
            }
            ToPrecs=0;
            
            totalprecios[1][0]=cajaBebidas[0]*precioBebidas[0];
            ToPrecs=totalprecios[1][0]+ToPrecs;

            totalprecios[1][1]=cajaBebidas[1]*precioBebidas[1];
            ToPrecs=totalprecios[1][1]+ToPrecs;

            totalprecios[1][2]=cajaBebidas[2]*precioBebidas[2];
            ToPrecs=totalprecios[1][2]+ToPrecs;

            totalprecios[1][3]=cajaBebidas[3]*precioBebidas[3];
            ToPrecs=totalprecios[1][3]+ToPrecs;

             totalprecios[1][4]=cajaBebidas[4]*precioBebidas[4];
            ToPrecs=totalprecios[1][4]+ToPrecs;

            totalprecios[1][5]=cajaBebidas[5]*precioBebidas[5];
            ToPrecs=totalprecios[1][5]+ToPrecs;

            totalprecios[1][6]=cajaBebidas[6]*precioBebidas[6];
            ToPrecs=totalprecios[1][6]+ToPrecs;

            totalprecios[1][7]=cajaBebidas[7]*precioBebidas[7];
            ToPrecs=totalprecios[1][7]+ToPrecs;

            totalprecios[1][8]=cajaBebidas[8]*precioBebidas[8];
            ToPrecs=totalprecios[1][8]+ToPrecs;

            totalprecios[1][9]=cajaBebidas[9]*precioBebidas[9];
            ToPrecs=totalprecios[1][9]+ToPrecs;

            totalprecios[2][0]=cajaComidas[0]*precioComida[0];
            ToPrecs=totalprecios[2][0]+ToPrecs;

            totalprecios[2][1]=cajaComidas[1]*precioComida[1];
            ToPrecs=totalprecios[2][1]+ToPrecs;

            totalprecios[2][2]=cajaComidas[2]*precioComida[2];
            ToPrecs=totalprecios[2][2]+ToPrecs;

            totalprecios[2][3]=cajaComidas[3]*precioComida[3];
            ToPrecs=totalprecios[2][3]+ToPrecs;

            totalprecios[2][4]=cajaComidas[4]*precioComida[4];
            ToPrecs=totalprecios[2][4]+ToPrecs;

            totalprecios[2][5]=cajaComidas[5]*precioComida[5];
            ToPrecs=totalprecios[2][5]+ToPrecs;

            totalprecios[2][6]=cajaComidas[6]*precioComida[6];
            ToPrecs=totalprecios[2][6]+ToPrecs;

            totalprecios[2][7]=cajaComidas[7]*precioComida[7];
            ToPrecs=totalprecios[2][7]+ToPrecs;

            totalprecios[3][0]=cajaPostres[0]*precioPostres[0];
            ToPrecs=totalprecios[3][0]+ToPrecs;

            totalprecios[3][1]=cajaPostres[1]*precioPostres[1];
            ToPrecs=totalprecios[3][1]+ToPrecs;

            totalprecios[3][2]=cajaPostres[2]*precioPostres[2];
            ToPrecs=totalprecios[3][2]+ToPrecs;

            totalprecios[3][3]=cajaPostres[3]*precioPostres[3];
            ToPrecs=totalprecios[3][3]+ToPrecs;

            totalprecios[3][4]=cajaPostres[4]*precioPostres[4];
            ToPrecs=totalprecios[3][4]+ToPrecs;

            totalprecios[3][5]=cajaPostres[5]*precioPostres[5];
            ToPrecs=totalprecios[3][5]+ToPrecs;

            totalprecios[3][6]=cajaPostres[6]*precioPostres[6];
            ToPrecs=totalprecios[3][6]+ToPrecs;

            totalprecios[3][7]=cajaPostres[7]*precioPostres[7];
            ToPrecs=totalprecios[3][7]+ToPrecs;
            precs=Double.toString(ToPrecs);
            textoAcomulado+=ToPrecs;

            if (ToPrecs>0) {
                sacarticket.setEnabled(true);
            }

            
            comboproductos.setSelectedIndex(0);
            comboReposteria.setSelectedIndex(0);
            comboComida.setSelectedIndex(0);
            numDeProductos.setText("");
            numDeComida.setText("");
            numDeReposteria.setText("");
        }
        if (e.getSource()==borrar) {
            cajaBebidas[0]=0;
            cajaBebidas[1]=0;
            cajaBebidas[2]=0;
            cajaBebidas[3]=0;
            cajaBebidas[4]=0;
            cajaBebidas[5]=0;
            cajaBebidas[6]=0;
            cajaBebidas[7]=0;
            cajaBebidas[8]=0;
            cajaBebidas[9]=0;
            cajaComidas[0]=0;
            cajaComidas[1]=0;
            cajaComidas[2]=0;
            cajaComidas[3]=0;
            cajaComidas[4]=0;
            cajaComidas[5]=0;
            cajaComidas[6]=0;
            cajaComidas[7]=0;
            cajaComidas[8]=0;
            cajaPostres[0]=0;
            cajaPostres[1]=0;
            cajaPostres[2]=0;
            cajaPostres[3]=0;
            cajaPostres[4]=0;
            cajaPostres[5]=0;
            cajaPostres[6]=0;
            cajaPostres[7]=0;
            cajaPostres[8]=0;
            textoAcomulado="";
            ToPrecs=0.0;
            textarea3.setText("Aqui apareceran los productos vendidos");
            comboproductos.setSelectedIndex(0);
            comboReposteria.setSelectedIndex(0);
            comboComida.setSelectedIndex(0);
            numDeProductos.setText("");
            numDeComida.setText("");
            numDeReposteria.setText("");
            sacarticket.setEnabled(false);
        }
        if (e.getSource()==miSalir) {
            Interfaz1 interfaz11 = new Interfaz1();
            interfaz11.setBounds(0,0,350,450);
            interfaz11.setVisible(true);
            interfaz11.setResizable(false);
            interfaz11.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource()==sacarticket){
            cobro cobro1Cobro=new cobro();
            cobro1Cobro.setBounds(400,150,300,220);
            cobro1Cobro.setVisible(true);
            cobro1Cobro.setResizable(false);
            
            
        }
    }
    public static void main(String[] args) {
        Ticket ticket1 =new Ticket();
        ticket1.setBounds(0,0,640,535);
        ticket1.setVisible(true);
        ticket1.setResizable(false);
        ticket1.setLocationRelativeTo(null);
    }
}
