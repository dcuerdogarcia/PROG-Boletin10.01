//Write by Seijas
package boletin10.pkg01;

import javax.swing.JOptionPane;

public class Juego {
    int numero;
    
    
    //Introducir o numero a adiviñar polo segundo xogador
    public void pedirAdiviña(){
        int numeroI = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número a adiviñar para o segundo xogador"));
        Validar valido = new Validar();
        numero = valido.validar(numeroI);
    }
    
    public void xogo(){
        byte numeroA=51;
        JOptionPane.showMessageDialog(null, "Adiviñe un numero maior que 0, pero menor que 50 (ambolos dous incluidos)");
        while (numeroA==numero){
            numeroA = Byte.parseByte(JOptionPane.showInputDialog("Introduza un numero"));
            if(numeroA>numero){
                JOptionPane.showMessageDialog(null, "O numero buscado e menor");
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
            if(numeroA<numero){
                JOptionPane.showMessageDialog(null, "O numero buscado e maior");
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        JOptionPane.showMessageDialog(null, "Felicidades!! a encontrado el numero");
    }
    
    
    
}
//created by Seijas
//To my lovers