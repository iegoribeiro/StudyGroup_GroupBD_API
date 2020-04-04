package grupod.activitymanagerapi.Controller;

import grupod.activitymanagerapi.Repository.FuncionarioRepository;
import grupod.activitymanagerapi.Entities.Funcionario;
import grupod.activitymanagerapi.Model.FuncionarioModel;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author iego_
 */
@Path("/funcionario")
public class FuncionarioController {
    
    private FuncionarioRepository funcionarioRepository;
    
    @PostConstruct
    private void init() {
        funcionarioRepository = new FuncionarioRepository();
    }
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Funcionario> listarFuncionarios() {
        try {
            FuncionarioModel model = new FuncionarioModel();
            return model.listarFuncionarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario funcionario(@PathParam("idFuncionario") int idFuncionario){
        Funcionario funcionario = null;
        try {
            funcionario = funcionarioRepository.buscarFuncionarioPorId(idFuncionario);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionario;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String editarFuncionario(Funcionario funcionario, @PathParam("idFuncionario") long idFuncionario){
        String msg = "";
        
        System.out.println(funcionario.getNome());
        
        try {
            funcionarioRepository.editarFuncionario(funcionario, idFuncionario);
            
            msg = "Funcionário editado com sucesso!";
        } catch (Exception e) {
            msg = "Erro ao editar o funcionário!";
            e.printStackTrace();
        }
        
        return msg;
    } 
    
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String removerFuncionario(@PathParam("idFuncionario") int idFuncionario){
        String msg = "";
        
        try {
            funcionarioRepository.removerFuncionario(idFuncionario);
            
            msg = "Funcionário removido com sucesso!";
        } catch (Exception e) {
            msg = "Erro ao remover o funcionário!";
            e.printStackTrace();
        }
        
        return msg;
    }   
}
