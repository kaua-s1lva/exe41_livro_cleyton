package builder;

import java.util.ArrayList;
import java.util.List;

import decorator.Ingrediente;
import decorator.Lanche;
import singleton.EstoqueSingleton;

public class AmericanoBuilder extends LancheBuilder {

    @Override
    public void addLanche() {
        lanche = new Lanche("Americano", 0.3);
    }

    @Override
    public void addCarne() {
        List<String> carnes = new ArrayList<>();
        carnes.add("ovo");
        carnes.add("presunto");
        
        for (String carne : carnes) {
            lanche = new Ingrediente(lanche, carne, EstoqueSingleton.getInstancia().getIngredientes().get(carne));
        }
    }

    @Override
    public void addLaticineo() {
        String laticineo = "mussarela";
        lanche = new Ingrediente(lanche, laticineo, EstoqueSingleton.getInstancia().getIngredientes().get(laticineo));
    }

    @Override
    public void addFolha() {
        String folha = "alface";
        lanche = new Ingrediente(lanche, folha, EstoqueSingleton.getInstancia().getIngredientes().get(folha));
    }

    @Override
    public void addLegume() {
        List<String> legumes = new ArrayList<>();
        legumes.add("tomate");

        for (String legume : legumes) {
            lanche = new Ingrediente(lanche, legume, EstoqueSingleton.getInstancia().getIngredientes().get(legume));
        }
    }

    @Override
    public void addMaionese() {
        String maionese = "maionese";
        lanche = new Ingrediente(lanche, maionese, EstoqueSingleton.getInstancia().getIngredientes().get(maionese));
    }
}
