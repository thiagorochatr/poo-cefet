public abstract class VeiculoTerrestre extends Veiculo {
    protected String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public VeiculoTerrestre(int anoFabricacao) {
        super(anoFabricacao);
    }



    @Override
    public double retornarPrecoDeVenda(int anoCorrente) {
        int anosDeUso = anoCorrente - this.anoFabricacao;
        return (this.valorVeiculoNovo + (this.valorVeiculoNovo * anosDeUso * 0.02));
    }
}
