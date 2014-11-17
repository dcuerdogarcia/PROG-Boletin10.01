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
}
//Created by Seijas