import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class cobro extends JFrame implements ActionListener, ChangeListener{
    private JRadioButton trjeta, efectivo;
    private ButtonGroup group1;
    private JButton cancelar, siguiente;
    private JLabel titulo, metodoPago;
    private JTextArea aTextArea;
    private JScrollPane scrollPane23;
    private JTextField jTextField1;
    double ToPagar=0, dinero=0;
    String ToPagar1="";
    public cobro(){
        setLayout(null);

        setTitle("Pago");
        getContentPane().setBackground(new Color(0,35,53));
        setIconImage(new ImageIcon(getClass().getResource("images/ivono.png")).getImage());
        Ticket tickett= new Ticket();
        ToPagar=tickett.ToPrecs;
        ToPagar1=tickett.precs;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        

        group1=new ButtonGroup();
        titulo =new JLabel("Total: ");
        titulo.setBounds(20,5,100,30);
        titulo.setFont(new Font("Andale Mono", 1, 18));
        titulo.setForeground(new Color(255, 255, 255));
        add(titulo);
        
        aTextArea=new JTextArea();
        aTextArea.setEditable(false);
        aTextArea.setBackground(new Color(224, 224, 224));
        aTextArea.setFont(new Font("Andale Mono", 1, 18));
        aTextArea.setForeground(new Color(0, 143, 57));
        aTextArea.setText(ToPagar1);
        scrollPane23 = new JScrollPane(aTextArea);
        scrollPane23.setBounds(130,5,130,30);
        add(scrollPane23);
        

        metodoPago =new JLabel("Elige el metodo de pago: ");
        metodoPago.setBounds(20,35,300,30);
        metodoPago.setFont(new Font("Andale Mono", 1, 18));
        metodoPago.setForeground(new Color(255, 255, 255));
        add(metodoPago);

        trjeta = new JRadioButton("Tarjeta de credito");
        trjeta.setBounds(20,75,245,30);
        trjeta.addChangeListener(this);
        add(trjeta);
        group1.add(trjeta);

        efectivo=new JRadioButton("Efectivo");
        efectivo.setBounds(20, 115, 245, 30);
        efectivo.addChangeListener(this);
        add(efectivo);
        group1.add(efectivo);

        siguiente=new JButton("Siguiente");
        siguiente.setBounds(180, 310,120,30);
        siguiente.addActionListener(this);
        siguiente.setVisible(false);
        add(siguiente);

        JTextField jTextField1=new JTextField();
        jTextField1.setBounds(100,180,200,40);
        jTextField1.setBackground(new Color(224, 224, 224));
        jTextField1.setFont(new Font("Andale Mono", 1, 18));
        jTextField1.setForeground(new Color(0, 143, 57));
        jTextField1.setVisible(true);
        add(jTextField1);
    }
    public void stateChanged(ChangeEvent e) { 
        if(efectivo.isSelected()){
            setSize(500,400);
            efectivo.setBounds(20, 115, 445, 30);
            trjeta.setBounds(20,75,445,30);
            siguiente.setVisible(true);
            
            
        }
        if (trjeta.isSelected()){
            setSize(600,500);
            trjeta.setBounds(20,75,545,30);
            efectivo.setBounds(20, 115, 545, 30);
            
        }
        if (siguiente.isSelected()) {
            dinero+=Double.valueOf(jTextField1.getText());
            if (dinero<ToPagar) {
                double debe=ToPagar-dinero;
                JOptionPane.showMessageDialog(null, "Dinero insuficiente, debe: "+debe);
            }else{
                
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancelar){
            this.setVisible(false);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        
        cobro cobro1Cobro=new cobro();
        cobro1Cobro.setBounds(400,150,300,220);
        cobro1Cobro.setVisible(true);
        cobro1Cobro.setResizable(false);
        
    }
}
