package pattern;


public class Atrasada implements State{
    private final String nome = "Atrasada";
    private Context tarefa;
    
    public Atrasada(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atradasa() {
         System.out.println("Já está atrasada!");
    }

    @Override
    public void conluida() {
         tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void petende() {
        System.out.println("Já esta atrasada");
    }

    @Override
    public String toString() {
        return "Novo estado: " + nome;
    }
    
    
    
}
