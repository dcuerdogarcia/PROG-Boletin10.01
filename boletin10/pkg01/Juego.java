//Write by Seijas
package boletin10.pkg01;

import javax.swing.JOptionPane;

public class Juego {
    int numero;
    int intentos;
    
    //Introducir o numero a adiviñar polo segundo xogador
    public void pedirAdiviña(){
        int numeroI = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número a adiviñar para o segundo xogador"));
        Validar valido = new Validar();
        numero = valido.validar(numeroI);
    }
    public void intetos(){
        int inten = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero e intentos"));
        Validar valido = new Validar();
        intentos = valido.positivo(inten);
    }
    
    //Que comience el juego
    public void xogo(){
        JOptionPane.showMessageDialog(null, "Adiviñe un numero maior que 0, pero menor que 50 (ambolos dous incluidos)");
        int a=0;
        for(int contador = 0; contador < intentos; contador++){
            
            byte numeroA = Byte.parseByte(JOptionPane.showInputDialog("Introduza un numero"));
            
            if(numeroA>numero){
                JOptionPane.showMessageDialog(null, "O numero buscado e menor");
            }else{
                if(numeroA<numero){
                    JOptionPane.showMessageDialog(null, "O numero buscado e MAIOR");
                }else{
                    if(numeroA==numero){
                        JOptionPane.showMessageDialog(null, "Felicidades!! a encontrado el numero en " + contador + " intentos");
                        contador = intentos;
                        a = 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Error");
                        contador=contador-1;
                    }
                }
            }
        }
        if(a!=1){
            JOptionPane.showMessageDialog(null, "lo siento no has encontrado el numero, YOU LOSE!");
        }
    }  
}
//created by Seijas
//To my lovers