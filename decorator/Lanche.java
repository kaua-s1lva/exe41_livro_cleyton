package decorator;
public class Lanche extends Componente {

    public Lanche(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
