import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //Automovil  bmw = new Automovil ();
        Automovil bmw = new Automovil("BMW", "i320", "Negro", 3);
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        /*bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);*/

        String marca = JOptionPane.showInputDialog("Marca: ");
        JOptionPane.showMessageDialog(null, "Muy buena marca");

        String var1;
        System.out.print("Modelo: ");
        var1 = br.readLine();
        System.out.println("");
        bmw.setModelo(var1);
        System.out.println("bmw.getModelo(): "+ var1);

        int var2;
        System.out.print("Cilindraje: ");
        var2 = Integer.parseInt(br.readLine());
        System.out.println("");
        bmw.setModelo(String.valueOf(String.valueOf(var2)));
        System.out.println("bmw.getCilindraje(): "+ var1);

        /*int var3;
        System.out.println("Color");
        var3 = br.readLine();
        bmw.setColor(var3);
        JOptionPane.showMessageDialog();*/




        System.out.println("bmw.getMarca() = " + bmw.getMarca());

         System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(80) = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,0.7f));
        System.out.println("bmw.capacidadTanque(40, 100) = " + bmw.capacidadTanque(40, 100));
        
    }
}