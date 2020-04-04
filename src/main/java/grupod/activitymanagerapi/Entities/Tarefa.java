package grupod.activitymanagerapi.Entities;

import Enums.DificuldadeEnum;
import java.util.Date;

/**
 *
 * @author iego_
 */
public class Tarefa {
    private long id;
    private String titulo;
    private DificuldadeEnum dificuldade;
    private float complexidade;
    private Date prazo;
    private int estimativa_horas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DificuldadeEnum getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(DificuldadeEnum dificuldade) {
        this.dificuldade = dificuldade;
    }

    public float getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(float complexidade) {
        this.complexidade = complexidade;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public int getEstimativa_horas() {
        return estimativa_horas;
    }

    public void setEstimativa_horas(int estimativa_horas) {
        this.estimativa_horas = estimativa_horas;
    }
    
}
