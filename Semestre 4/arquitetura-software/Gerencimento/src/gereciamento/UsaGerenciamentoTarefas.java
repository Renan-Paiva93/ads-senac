package gereciamento;

import pattern.Context;


public class UsaGerenciamentoTarefas {

    
    public static void main(String[] args) {
        Context tarefa = new Context();
        System.out.println(tarefa.getEstado());
        tarefa.requisitarAtradasa();
        tarefa.requisitarConcluida();
    }
    
}
