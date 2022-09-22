
package pattern;


public class Concluida implements State{
    
    private final String nome = "Concluida";
    private Context tarefa;
    
    public Concluida(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atradasa() {
        System.out.println("Já está concluida!");
    }

    @Override
    public void conluida() {
         System.out.println("Já está conluída!");
    }

    @Override
    public void petende() {
        tarefa.setEstado(new Pendente(tarefa));
        
    }

    @Override
    public String toString() {
        return "novo estado: " + nome;
    }
    
    
}
