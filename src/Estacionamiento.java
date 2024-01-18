public class Estacionamiento {

    int tarifaHora = 2000;

    public static void main(String[] args) {
        //Declaro variables que almacenan el tamaño de mi matriz
        int filas = 5;
        int columnas = 4;


        //Creé matriz de objetos tipo Carro que es la clase que quiero almacenar
        Carro[][] matrizEstacionamiento = new Carro[filas][columnas];

        // Inicialicé la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matrizEstacionamiento[i][j] = null; // Representa un espacio vacío
            }
        }
    }

    // Método para estacionar un carro en una posición específica
    public static void parquearCarro(Carro[][] estacionamiento, Carro carro, int fila, int columna) {
        if (fila >= 0 && fila < estacionamiento.length && columna >= 0 && columna < estacionamiento[0].length) {
            if (estacionamiento[fila][columna] == null) {
                estacionamiento[fila][columna] = carro;
                System.out.println("Carro estacionado con éxito en la fila " + fila + ", columna " + columna);
            } else {
                System.out.println("¡Espacio ocupado! No se puede estacionar el carro en la fila " + fila + ", columna " + columna);
            }
        } else {
            System.out.println("Posición inválida para estacionar el carro");
        }
    }





}
