package singleton;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueSingleton {
    private static EstoqueSingleton instancia;
    private Map<String, Double> ingredientes;

    private EstoqueSingleton () {
        ingredientes = new HashMap<>();
        setIngredientes();
    }

    public static EstoqueSingleton getInstancia() {
        if (instancia == null) {
            instancia = new EstoqueSingleton();
        }
        return instancia;
    }

    public Map<String, Double> getIngredientes() {
        return Collections.unmodifiableMap(ingredientes);
    }

    private void setIngredientes() {
        ingredientes.put("presunto", 1.3);
        ingredientes.put("queijo", 1.7);
        ingredientes.put("ovo", 0.2);
        ingredientes.put("alface", 0.15);
        ingredientes.put("tomate", 0.2);
        ingredientes.put("maionese", 1.5);
        ingredientes.put("pão", 1.8);
        ingredientes.put("rosbife", 2.3);
        ingredientes.put("carne moída", 3.0);
        ingredientes.put("salsicha", 0.75);
        ingredientes.put("mussarela", 0.9);
    }

}
