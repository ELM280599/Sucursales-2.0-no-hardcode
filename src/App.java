import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Metodos mt = new Metodos();

        boolean salir = false;
        int opcion;
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1.Mostrar Sucursales y meses: ");
            System.out.println("2.Total de ventas de la empresa: ");
            System.out.println("3.Total de ventas de una sucursal en todo el año: ");
            System.out.println("4.Total de ventas en un mes de todas las sucursales:  ");
            System.out.println("5.Sucursal que más vendió: ");
            System.out.println("6.Sucursal que menos vendió: ");
            System.out.println("7.Mes en que se vendió más : ");
            System.out.println("8.Mes en que se vendió menos: ");
            System.out.println("---------------------------------------------------------------------");

            System.out.println("0. Salir");
            System.out.println("Elije una opcion");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de sucursales a registrar:");
                    int sucursales = entrada.nextInt();
                    mt.cargarSucursales(sucursales);
                    if (mt.cargarSucursales(sucursales) == true) {
                        System.out.println("Sucursales cargadas con exito!");
                    } else {
                        System.out.println("Ingrese una cantidad valida!");
                    }
                    mt.mostrarMatriz();
                    break;
                case 2:
                    System.out.println("El total de ventas es de: $" + mt.totalVentas());
                    break;
                case 3:
                    System.out.println("Ingrese de que sucursal quiere ver las ventas:");
                    int sucursal = entrada.nextInt();
                    System.out.println("Las ventas de la sucursal son de: $");
                    System.out.print(mt.ventaSucursal(sucursal));
                    break;
                case 4:
                    System.out.println("Ingrese el 1mes del que quiere ver las ventas:");
                    int mes = entrada.nextInt();
                    System.out.println("Las ventas del mes son de: $");
                    System.out.print(mt.ventaMes(mes));
                    break;
                case 5:
                    System.out.println("La sucursal con mayor ventas es la: " + mt.sucursalMayor());
                    System.out.println("Con un total de: $" + mt.ventaMayorSucursal());
                    break;
                case 6:
                    System.out.println("La sucursal con menor ventas es la: " + mt.sucursalMenor());
                    System.out.println("Con un total de: $" + mt.ventaMenorSucursal());
                    break;
                case 7:
                    System.out.println("El mes con mayor ventas es el: " + mt.MayorMes());
                    System.out.println("Con un total de: $" + mt.ventasMayorMes());
                    break;
                case 8:
                    System.out.println("El mes con menor ventas es el: " + mt.MenorMes());
                    System.out.println("Con un total de: $" + mt.ventasMenorMes());
                    break;
                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Ingrese una opcion valida!");

            }
        } while (!salir);

        entrada.close();
    }
}
