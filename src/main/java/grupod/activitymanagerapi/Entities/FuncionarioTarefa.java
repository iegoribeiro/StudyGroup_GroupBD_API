package grupod.activitymanagerapi.Entities;

import java.sql.Timestamp;

/**
 *
 * @author iego_
 */
public class FuncionarioTarefa {
    private long id;
    private long id_funcionario;
    private long id_tarefa;
    private Timestamp inicio;
    private Timestamp termino;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public long getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(long id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public Timestamp getInicio() {
        return inicio;
    }

    public void setInicio(Timestamp inicio) {
        this.inicio = inicio;
    }

    public Timestamp getTermino() {
        return termino;
    }

    public void setTermino(Timestamp termino) {
        this.termino = termino;
    }
    
    
}
