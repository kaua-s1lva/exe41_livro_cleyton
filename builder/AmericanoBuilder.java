package builder;

import decorator.Ingrediente;
import decorator.Lanche;
import singleton.EstoqueSingleton;

public class AmericanoBuilder extends LancheBuilder {

    @Override
    public void addLanche() {
        lanche = new Lanche("Americano", 0.3);
        this.carnes.add("ovo");
        this.carnes.add("presunto");
        this.laticineos.add("mussarela");
        this.folhas.add("alface");
        this.legumes.add("tomate");
    }

    @Override
    public void addMaionese() {
        String maionese = "maionese";
        lanche = new Ingrediente(lanche, maionese, EstoqueSingleton.getInstancia().getIngredientes().get(maionese));
    }
         
}
