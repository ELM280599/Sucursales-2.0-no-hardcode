
public class Metodos {
    int[][] matriz;
    int sucursales;

    // 1 Cargar las filas, osea la cantidad de sucursales

    public boolean cargarSucursales(int sucursales) {
        boolean aux = false;

        if (sucursales > 0) {
            matriz = new int[sucursales][12];
            aux = true;
        }

        return aux;
    }

    // 1.2 Mostrar matriz completa
    public int[][] mostrarMatriz() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------------");
        System.out.println("Ene \tFeb \tMar \tAbr \tMay \tJun \tJul \tAgo \tSep \tOct \tNov \tDic");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 5 + 1);

                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");

                }

            }
            System.out.println("   \t | Sucursal " + (i + 1));
            System.out.println(
                    "------------------------------------------------------------------------------------------------------------");

        }
        return matriz;
    }

    // punto 2 Devolver el total de ventas

    public int totalVentas() {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total = total + matriz[i][j];
            }
        }
        return total;
    }

    // punto 3, total de ventas de una sucursal en particular
    public int ventaSucursal(int sucursal) {
        int ventass = 0;
        if (sucursal < sucursales && sucursal > 0) {

            for (int j = 0; j < matriz[sucursal].length; j++) {

                ventass = ventass + matriz[sucursal - 1][j];
            }

        }
        return ventass;
    }
    // punto 4, total de ventas en un mes en particular

    public int ventaMes(int mes) {
        int ventas = 0;
        if (mes < 13 && mes > 0) {

            for (int i = 0; i < matriz.length; i++) {

                ventas = ventas + matriz[i][mes - 1];
            }

        }
        return ventas;

    }

    // punto 5, Sucursal que mas vendio
    int mayor = 0;

    public int sucursalMayor() {
        int indice = 0;
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];

                if (suma > mayor) {
                    mayor = suma;
                    indice = i + 1;
                }
            }
        }
        return indice;
    }

    public int ventaMayorSucursal() {
        return mayor;
    }

    // punto 6, Sucursal que menos vendio
    int menor = 0;

    public int sucursalMenor() {
        int indice = 0;
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {

                suma = suma + matriz[i][j];
                if (i == 0) {
                    menor = suma;
                    indice = i + 1;
                }

            }
            if (suma < menor) {
                menor = suma;
                indice = i + 1;
            }
        }
        return indice;
    }

    public int ventaMenorSucursal() {
        return menor;
    }

    // punto 7 mes en el que se vendio mas
    int mayormes = 0;

    public int MayorMes() {
        int indice = 0;
        int suma = 0;

        for (int j = 0; j < 12; j++) {
            suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma = suma + matriz[i][j];

                if (suma > mayormes) {
                    mayormes = suma;
                    indice = j + 1;
                }
            }
        }
        return indice;
    }

    public int ventasMayorMes() {
        return mayormes;
    }

    // punto 8 mes en el que se vendio menos
    int menormes = 0;

    public int MenorMes() {
        int indice = 0;
        int suma = 0;
        for (int j = 0; j < 12; j++) {
            suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma = suma + matriz[i][j];

                if (i == 0) {
                    menormes = suma;
                    indice = j + 1;
                }
                if (suma < menormes) {
                    menormes = suma;
                    indice = j + 1;
                }
            }

        }
        return indice;
    }

    public int ventasMenorMes() {
        return menormes;
    }
}
