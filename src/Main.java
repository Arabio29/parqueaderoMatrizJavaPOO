public class Main {
    public static void main(String[] args) {
        double tarifaCarros = 2000;
        Estacionamiento miEstacionamiento = new Estacionamiento(tarifaCarros, 5, 4);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");
        Carro carro3 = new Carro("DAN899", "Ferrari", "GT - 90");

        miEstacionamiento.parquear(carro1, 2, 1);
        miEstacionamiento.parquear(carro2, 3, 2);
        miEstacionamiento.parquear(carro3, 0, 3);

        System.out.println("Estado actual del estacionamiento:");
        miEstacionamiento.mostrarEstacionamiento();

        System.out.println("\nInformación de los carros estacionados:");
        carro1.mostrarInfoCarro();
        carro2.mostrarInfoCarro();
        carro3.mostrarInfoCarro();

    }
}
