
package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
    double contador=1,resultado=0;
        while(contador!=0){
        
            double primeironum = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro numero"));
            String operador= JOptionPane.showInputDialog("informe o operador");
             double segundonum = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo numero"));
        
             switch(operador){
                case "+":
                    resultado = primeironum + segundonum; 
                    break;
                case "-":
                    resultado = primeironum - segundonum; 
                    break;
                case "*":
                    resultado = primeironum * segundonum; 
                    break;
                 case "/":
                    resultado = primeironum / segundonum; 
                    break;
                            
       }
       JOptionPane.showMessageDialog (null, "O resultado de sua operacao e : "+resultado);
       int opcao= JOptionPane.showConfirmDialog(null,"Deseja Efetuar outra operacao?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    
        if(opcao==0){
            
            JOptionPane.showMessageDialog(null,"Informe a proxima operação!");
        }
        else{
            contador=0;
            JOptionPane.showMessageDialog(null,"Programa Finalizado com Sucesso! ");
        }
            
        }
    }
}