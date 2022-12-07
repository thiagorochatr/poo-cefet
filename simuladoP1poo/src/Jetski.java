public class Jetski extends VeiculoAquatico {
    public Jetski (int anoFabricacao) {
        super(anoFabricacao);
    }

    @Override
    public double retornarPrecoDeVenda(int anoCorrente) {
        int anosDeUso = anoCorrente - this.anoFabricacao;
        return (this.valorVeiculoNovo + (this.valorVeiculoNovo * anosDeUso * 0.03));
    }
}
