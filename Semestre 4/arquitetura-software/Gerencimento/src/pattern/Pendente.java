package pattern;


public class Pendente implements State{
    private final String nome = "Pendente";
    private Context tarefa;

    public Pendente(Context tarefa) {
        this.tarefa = tarefa;
    }

    
 
    @Override
    public void atradasa() {
        //Atrasada a = new Atrasada();
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void conluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void petende() {
        System.out.println("Já está pendente");
    }

    @Override
    public String toString() {
        return "Novo estado" + nome; 
    }

    
    
}
