public class Concessionaria {
    private int anoCorrente; //get e set
    private double valorTotalEmVeiculos; // só get

    public Concessionaria(int anoCorrente) {
        this.anoCorrente = anoCorrente;
    }

    public void acumularValorTotal(Veiculo v) {
        this.valorTotalEmVeiculos += v.retornarPrecoDeVenda(this.anoCorrente);
    }
}
