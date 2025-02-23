package builder;

import decorator.Componente;

public class Diretor {
    public Componente build(LancheBuilder lanche) {
        lanche.addLanche();
        lanche.addPao();
        lanche.addLegume();
        lanche.addLaticineo();
        lanche.addFolha();
        lanche.addCarne();
        lanche.addMaionese();
        
        return lanche.getLanche();
    }
}
