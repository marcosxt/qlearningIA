package qlearning;

/**
 *
 * @author Leo
 */
public class Estado {
    
    public float recompensa; //Valor de recompensa para el estado
    
    public Accion acciones;

    public float getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(float recompensa) {
        this.recompensa = recompensa;
    }
    
    
}
