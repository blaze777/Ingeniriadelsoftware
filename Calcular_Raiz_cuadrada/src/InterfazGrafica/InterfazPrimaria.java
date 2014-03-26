
package InterfazGrafica;

import Bussines_Logic.Raiz_Cuadrada;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfazPrimaria extends JFrame implements ActionListener {
Container c= new Container();//este objeto es para cambiar cosas como el color del jframe
private JLabel j1,j2;
private JButton Calcular;
private JTextField valor,resultado;
 
 public InterfazPrimaria(){
 setTitle("Calcular Raiz cuadrada");
 setLayout(null); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setBounds(0,0,300,300); 
 j1 = new JLabel("Valor"); 
 j1.setBounds(70,100,70,50);
 add(j1);
 j2= new JLabel("Resultado");
 j2.setBounds(70,150,70,50);
 add(j2);
 valor = new JTextField();
 valor.setBounds(150,110,50,30);
 add(valor);
 resultado = new JTextField();
 resultado.setBounds(150,150,50,30);
 add(resultado);
 Calcular = new JButton("Calcular");
 Calcular.setBounds(70,200,100,30);
 add(Calcular);
 }   
@Override
    public void actionPerformed(ActionEvent e) {
       Raiz_Cuadrada rc = new Raiz_Cuadrada();
        if(e.getSource()==Calcular){
    double valor1=Double.parseDouble(valor.getText());
     double resultado1=(rc.calcularRaiz(valor1));   
      resultado.setText(String.valueOf(resultado1));
       }
    }
    
}
