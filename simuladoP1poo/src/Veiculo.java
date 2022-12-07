public abstract class Veiculo {
    protected String descricao; //get e set
    protected double valorVeiculoNovo;//get e set
    protected int anoFabricacao;//get e set

    public Veiculo(int anoFabricacao) {
        this.setAnoFabricacao(anoFabricacao);
    }

    public abstract double retornarPrecoDeVenda(int anoCorrente);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorVeiculoNovo() {
        return valorVeiculoNovo;
    }

    public void setValorVeiculoNovo(double valorVeiculoNovo) {
        this.valorVeiculoNovo = valorVeiculoNovo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}