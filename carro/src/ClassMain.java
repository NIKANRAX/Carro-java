public class ClassMain {
    public static void main(String[] args) {
       Carro carro = new Carro(4, 2017, 44);

       carro.setCor(Carro.VERMELHO);
       carro.setChassi(Carro.CHASSI);
       carro.setPlaca(Carro.PLACA);
       
       carro.imprimiValores();
    }
}