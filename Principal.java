import builder.AmericanoBuilder;
import builder.Diretor;
import decorator.Componente;
public class Principal {
    public static void main(String[] args) {
        /*
        Componente americano = new Lanche("americano", 0);
        americano = new Ingrediente(americano, "carne de boi", 3.5);
        americano = new Ingrediente(americano, "ovo", 0.75);

         */
        Diretor diretor = new Diretor();
        Componente lanchonete = diretor.build(new AmericanoBuilder());
        
        System.out.println(lanchonete);
    }
}
