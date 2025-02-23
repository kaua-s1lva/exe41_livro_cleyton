package builder;

import decorator.Componente;

public abstract class LancheBuilder {
    protected Componente lanche;

    public void addPao() {}
    public void addCarne() {}
    public void addLegume() {}
    public void addFolha() {}
    public void addLaticineo() {}
    public void addMaionese() {}

    public Componente getLanche() {
        return lanche;
    }

    public abstract void addLanche();
}
