//Write by Seijas
package boletin10.pkg01;

import javax.swing.JOptionPane;

public class Validar {
    
    public int validar(int numero){
                
        if(numero<=50 && numero>=0){
            return numero;
        }else{
            //numero = Integer.parseInt(JOptionPane.showInputDialog("O número introducido non é valido. \nIntroduza un numero entre 0 e 50"));
            
            while(numero<0 || numero>50){
                numero = Integer.parseInt(JOptionPane.showInputDialog("O número introducido non é valido. \nIntroduza un numero entre 0 e 50"));
            }
            return numero;
        }
    }
    
    public int positivo(int numero){
        
        if(numero>0){
            return numero;
        }
        while(numero<=0){
            if(numero==0){
                JOptionPane.showMessageDialog(null, "No seas malo, deja intentarlo al menos una vez");
            }else{
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor positivo"));
            }
        }
        return numero;
    }
    
}
//Created by Seijas