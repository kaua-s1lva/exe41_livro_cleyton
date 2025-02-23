package decorator;
public abstract class Decorador extends Componente{
    protected Componente elementoDecorado;

    public Decorador(Componente elementoDecorado, String descricao, double valor) {
        super(descricao, valor);
        this.elementoDecorado = elementoDecorado;
    }
}
