public class Estacionamiento {

    private Carro[][] carros = new Carro[5][4];
    private Carro carro;
    private double tarifaCarros;

    public Estacionamiento(double tarifaCarros, int filas, int columnas) {
        this.tarifaCarros = tarifaCarros;
        this.carros = carros;
    }
    public boolean parquear(Carro carro, int fila, int columna){
        if(carros[fila][columna] == null){
            carros[fila][columna] = carro;
            System.out.println("El vehiculo de placas " + carro.getMarca() + " se ha estacionado correctamente en la fila: " + fila + " columna: " + columna + ".");
            return true;
        }else{
            System.out.println("El vehiculo no se pudo estacionar en la pocición indicada o la pocicion no existe.");
            return false;
        }
    }
    public void mostrarEstacionamiento() {
        System.out.println("Ocupación actual del parqueadero.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (carros[i][j] == null) {
                    System.out.print("["+"]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println(" ");
        }
    }

    public double calcularTarifaPagar(int horas, Carro carro) {
        System.out.println("El tiempo a pagar por " + horas + " horas es: ");
        return horas * tarifaCarros;
    }
}
