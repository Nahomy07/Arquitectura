package org.nahomy;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Binarios
{

    public void suma()
    {
        JOptionPane.showMessageDialog(null, "La suma es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Suma\n" + "Ingrese un numero binario: "), 2) + Integer.parseInt(JOptionPane.showInputDialog("Suma\n" + "Ingrese otro numero binario: "),2 )));
    }

    public void resta()
    {
        JOptionPane.showMessageDialog(null, "La resta es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Resta\n" + "Ingrese un numero binario: "), 2) - Integer.parseInt(JOptionPane.showInputDialog("Resta\n" + "Ingrese otro numero binario: "), 2)));
    }

    public void multiplicacion()
    {
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Multiplicacion\n" + "Ingrese un numero binariio: "), 2) * Integer.parseInt(JOptionPane.showInputDialog("Multipliacion\n" + "Ingrese otro numero binario: "), 2)));
    }

    public void division()
    {
        JOptionPane.showMessageDialog(null, "La division es: " + Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Division\n" + "Ingrese un numero binario: "), 2) / Integer.parseInt(JOptionPane.showInputDialog("Division\n" + "Ingrese otro numero binario: "), 2)));
    }
}

