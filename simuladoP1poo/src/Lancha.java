public class Lancha extends VeiculoAquatico {
    private int qtdePassageiros; //get e set

    public Lancha (int anoFabricacao) {
        super(anoFabricacao);
    }

    @Override
    public double retornarPrecoDeVenda(int anoCorrente) {
        int anosDeUso = anoCorrente - this.anoFabricacao;
        return (this.valorVeiculoNovo + (this.valorVeiculoNovo * anosDeUso * 0.05));
    }
}
