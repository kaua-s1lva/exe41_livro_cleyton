package decorator;
public abstract class Componente {
    protected String descricao;
    protected double valor;

    public Componente(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "Descrição: " + getDescricao() + 
                "\nValor: " + getValor()
        ;
    }

    public abstract String getDescricao();
    public abstract double getValor();
}