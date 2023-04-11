public class Carro {
    public static final String VERMELHO = "Vermelho";
    public static final String CHASSI = "2H2XS59BWDY987665";
    public static final String PLACA = "NPB6594";
    private Integer quantidadeDePneus;
    private Integer quantidadeDeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer numeroDePortas;
    private String chassi;
    private String cor;
    private Integer anoFabricacao;
    private Integer combustivel;
    private String placa;
    public Carro (Integer quantidadeDePneus, Integer anoFabricacao, Integer combustivel){
        setQuantidadeDePneus(quantidadeDePneus);
        setAnoFabricacao(anoFabricacao);
        setCombustivel(combustivel);
    }
    public Integer getQuantidadePneus(){
        return quantidadeDePneus +1;
    }
    public void setQuantidadeDePneus(Integer quantidadeDePneus){
        quantidadeDeCalotas = quantidadeDePneus;
        quantidadeParafusosPneus = quantidadeDePneus *4;
        numeroDePortas = quantidadeDePneus;
        this.quantidadeDePneus = quantidadeDePneus;
    }
    public Integer getQuantidadeDeCalotas() {
        return quantidadeDeCalotas;
    }
    public void setQuantidadeDeCalotas(Integer quantidadeDeCalotas) {
        this.quantidadeDeCalotas = quantidadeDeCalotas;
    }
    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;
    }
    public void setQuantidadeParafusosPneus(Integer quantidadeParafusosPneus) {
        this.quantidadeParafusosPneus = quantidadeParafusosPneus;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }
    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public Integer getAnoFabricacao() {
        return anoFabricacao ;
    }
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public Integer getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(Integer combustivel) {
        this.combustivel = combustivel;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void imprimiValores(){
        System.out.println("Quantidades de Pneus " + getQuantidadePneus());
        System.out.println("Quantidades de Calotas " + getQuantidadeDeCalotas());
        System.out.println("Quantidade de Parafusos " + getQuantidadeParafusosPneus());
        System.out.println("Cor do veículo " + getCor());
        System.out.println("Número de portas " + getNumeroDePortas());
        System.out.println("Número do chassi " + getChassi());
        System.out.println("Ano de fabricação " + getAnoFabricacao());
        System.out.println("Nível do combustivel " + getCombustivel() + " Litros");
        System.out.println("Placa do Veículo " + getPlaca());
    }
}