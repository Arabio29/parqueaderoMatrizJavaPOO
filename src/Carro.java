public class Carro {

        //Atributos de la clase carro
        private String placa;
        private String marca;
        private String modelo;
        private int numHorasParqueado;

        //Contructor de la clase carro
        public Carro(String placa, String marca, String modelo, int numHorasParqueado){
                this.placa = placa;
                this.marca = marca;
                this.modelo = modelo;
                this.numHorasParqueado = numHorasParqueado;
        }

        //Getters
        public String getPlaca(){
                return placa;
        }

        public String getMarca() {
                return marca;
        }

        public String getModelo() {
                return modelo;
        }

        public int getNumHorasParqueado() {
                return numHorasParqueado;
        }

        //Metodo para mostrar informacion
        public void mostrarInfoCarro() {
                System.out.println("El Carro " + getMarca()+ " con modelo "+ getModelo()+ " y placa "+ getPlaca() + " estuvo parqueado " + getNumHorasParqueado() + " horas.");
        }
}
