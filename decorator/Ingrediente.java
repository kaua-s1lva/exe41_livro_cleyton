package decorator;
public class Ingrediente extends Decorador {
    public Ingrediente(Componente elementoDecorado, String descricao, double valor) {
        super(elementoDecorado, descricao, valor);
    }

    @Override
    public String getDescricao() {
        if (elementoDecorado == null) return descricao;
        return elementoDecorado.getDescricao() + ", " + descricao;
    }

    @Override
    public double getValor() {
        if (elementoDecorado == null) return valor;
        return elementoDecorado.getValor() + valor;
    }
}
