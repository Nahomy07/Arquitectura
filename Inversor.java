package org.nahomy;

import javax.swing.*;

public class Inversor

{




    public void binario()
    {
        JOptionPane.showMessageDialog(null, "La notacion binaria es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Binario\n" + "Ingrese un numero: " ),2 )));
    }

    public void decimal()
    {
        JOptionPane.showMessageDialog(null, "La notacion decimal es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Decimal\n" + "Ingrese un numero: "), 2)));
    }

    public void octal()
    {
            JOptionPane.showMessageDialog(null, "La notacion optal es: " + Integer.toOctalString(Integer.parseInt(JOptionPane.showInputDialog("Octal\n" + "Ingrese un numero: "), 8)));
    }

    public void hexadecimal()
    {
        JOptionPane.showMessageDialog(null, "La notacion hexadecimal es: " + Integer.toHexString(Integer.parseInt(JOptionPane.showInputDialog("Hexadecimal\n" + "Ingrese un numero: "), 16)));
    }

}

    //System.out.println(Integer.toBinaryString(sumar(numeroX,numeroY,2)));
    //System.out.println(sumar(numeroX,numeroY,10));