//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Automovil  bmw = new Automovil ();
        Automovil bmw = new Automovil("BMW", "i320", "Negro", 3);
        /*bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);*/

        System.out.println("bmw.getMarca() = " + bmw.getMarca());

         System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar(80) = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40,0.7f));
        System.out.println("bmw.capacidadTanque(40, 100) = " + bmw.capacidadTanque(40, 100));
        
    }
}