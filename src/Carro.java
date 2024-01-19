public class Carro {

        //Atributos de la clase carro
        private String placa;
        private String marca;
        private String modelo;

        //Contructor de la clase carro
        public Carro(String placa, String marca, String modelo){
                this.placa = placa;
                this.marca = marca;
                this.modelo = modelo;
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


        //Metodo para mostrar informacion
        public void mostrarInfoCarro() {
                System.out.println("El Carro " + getMarca()+ " con modelo "+ getModelo()+ " y placa "+ getPlaca() + " estuvo parqueado " + " horas.");

        }
}
