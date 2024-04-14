package org.nahomy;

import javax.swing.*;

public class App
{
    public static void main(String[] args )
    {

        Binarios numBin = new Binarios();
        Inversor conNota = new Inversor();

        int menuOp = 0;
        int menuCon = 0;
        int menuPrin = 0;
        int eleccion = 0;
        int Numero = 0;

        
        do {
            menuCon = Integer.parseInt(JOptionPane.showInputDialog("\t\n*************** Menu conversor ***************\n" +
                    "\n1.Binario\n" + "2.Decimal\n" + "3.Octal\n" + "4.Hexadecimal\n" + "5.Salir\n" + "Ingresa una opcion: "));

            switch (menuCon) {
                case 1:
                    conNota.binario();
                    break;

                case 2:
                    conNota.decimal();
                    break;

                case 3:
                    conNota.octal();
                    break;

                case 4:
                    conNota.hexadecimal();
                    break;

                case 5:
                    JOptionPane.showInputDialog(null,"::::: Saliendo :::::");
                    break;

            }


            do {
                menuOp = Integer.parseInt(JOptionPane.showInputDialog("\t\n*************** Operaciones aritmeticas ***************\n" +
                        "\n1.Suma\n" + "2.Resta\n" + "3.Multiplicacion\n" + "4.Division\n" + "5.Salir\n" + "Ingresa una opcion: "));

                switch (menuOp) {
                    case 1:
                        numBin.suma();
                        break;

                    case 2:
                        numBin.resta();
                        break;

                    case 3:
                        numBin.multiplicacion();
                        break;

                    case 4:
                        numBin.division();
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "::::: Saliendo ::::: ");
                        break;
                }
            }

            while (menuOp != 5);


        }

        while (menuCon != 5);

    }

}


