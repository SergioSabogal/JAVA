import javax.swing.*;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil automovilHonda  = new Automovil(1, "Honda", "Civic", "Blanco", 2.5, true, 2010, 100000, 40);
        Automovil camionetaSuzuki  = new Automovil(2, "Suzuki", "Vitara live", "Azul", 2.0, true, 2021, 200000,90 );
        Automovil automovilSuzuki  = new Automovil(3, "Suzuki", "Desing", "Negro", 0.8, true, 2022, 150000,110 );
        Automovil automovilRenault  = new Automovil(4, "Renault", "Logan", "Gris", 1.4, true, 2019, 90000,60 );


        System.out.println(automovilHonda.detail());
        System.out.println("****************************************\n\n\n");
        System.out.println(camionetaSuzuki.detail());
        System.out.println("****************************************\n\n\n");
        System.out.println(automovilSuzuki.detail());
        System.out.println("****************************************\n\n\n");
        System.out.println(automovilRenault.detail());
        System.out.println("****************************************\n\n\n");


        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del automovil a seleccionar"));
        int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia a recorer en km"));

        switch (entrada){
            case 1:
                System.out.println(automovilHonda.consumption(km));
                System.out.println(automovilHonda.priceConsumption(km));
                System.out.println(automovilHonda.total());
                System.out.println("****************************************\n\n\n");
                System.out.println(automovilHonda.detail());
                break;
            case 2:
                System.out.println(camionetaSuzuki.consumption(km));
                System.out.println(camionetaSuzuki.priceConsumption(km));
                System.out.println(camionetaSuzuki.total());
                System.out.println("****************************************\n\n\n");
                System.out.println(camionetaSuzuki.detail());
                break;
            case 3:
                System.out.println(automovilSuzuki.consumption(km));
                System.out.println(automovilSuzuki.priceConsumption(km));
                System.out.println(automovilSuzuki.total());
                System.out.println("****************************************\n\n\n");
                System.out.println(automovilSuzuki.detail());
                break;
            case 4:
                System.out.println(automovilRenault.consumption(km));
                System.out.println(automovilRenault.priceConsumption(km));
                System.out.println(automovilRenault.total());
                System.out.println("****************************************\n\n\n");
                System.out.println(automovilRenault.detail());
                break;
            default:
                System.out.println("Valor no valido.");

        }

    }
}
