//faça um algoritmo que:
//delcara variaveis: inteira, real e String
//receba dois números inteiros usando interface com usuário (swing)
//mostre o quociente da divisão de um pelo outro, a potência do primeiro pelo segundo
//mostre essas informações na tela usando swing.

import javax.swing.*;

class Programa04 
{
    public static void main (String entrada[])
    {
        //declaração de variáveis
        int n1, n2, div;
        double pot;
        String msg="";
        
        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
        //processamento
        div = (int)n1/ (int)n2;
        pot = Math.pow(n1, n2);

        //saída de resultados
        msg = "O quociente da divisão de " + n1 + " por " + n2 + " é " + div + " \n";
        msg = "Potência de " + n1 + " elevado a " + n2 + " é " + pot + " \n";
        JOptionPane.showMessageDialog(null, msg);
        
        
        System.exit(0);
    }

    
}
