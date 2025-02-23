package builder;

import java.util.ArrayList;
import java.util.List;

import decorator.Componente;
import decorator.Ingrediente;
import singleton.EstoqueSingleton;

public abstract class LancheBuilder {
    protected Componente lanche;
    protected List<String> paes = new ArrayList<>();
    protected List<String> carnes = new ArrayList<>();
    protected List<String> legumes = new ArrayList<>();
    protected List<String> folhas = new ArrayList<>();
    protected List<String> laticineos = new ArrayList<>();

    public void addPao() {
        addIngredientes(paes);
    }

    public void addCarne() {
        addIngredientes(carnes);
    }

    public void addLegume() {
        addIngredientes(legumes);
    }

    public void addFolha() {
        addIngredientes(folhas);
    }

    public void addLaticineo() {
        addIngredientes(laticineos);
    }
    public void addMaionese() {}

    public Componente getLanche() {
        return lanche;
    }

    public abstract void addLanche();

    private void addIngredientes(List<String> ingredientes) {
        for (String ingrediente : ingredientes) {
            lanche = new Ingrediente(lanche, ingrediente, EstoqueSingleton.getInstancia().getIngredientes().get(ingrediente));
        }
    }
}
