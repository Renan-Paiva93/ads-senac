package pattern;

public final class Context { 
    
    private State estado; 

    public Context() {
        estado = new Pendente(this);
    }

    public State getEstado() {
        return estado;
    }

     void setEstado(State estado) {
        this.estado = estado;
         System.out.println(getEstado());
    }
    
     public void requisitarAtradasa() {
         estado.atradasa();
     }
     
     public void requisitarConcluida() {
         estado.conluida();
     }
     
     public void requisitarPendente() {
         estado.petende();
     }
     
}
