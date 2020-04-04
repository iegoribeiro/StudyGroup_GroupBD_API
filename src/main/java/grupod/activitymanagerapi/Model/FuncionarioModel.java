package grupod.activitymanagerapi.Model;

import com.google.gson.JsonArray;
import grupod.activitymanagerapi.Entities.Funcionario;
import grupod.activitymanagerapi.Repository.FuncionarioRepository;
import java.util.List;

/**
 *
 * @author iego_
 */
public class FuncionarioModel {
    
    public List<Funcionario> listarFuncionarios() throws Exception {
        
        List<Funcionario> response = null;

        FuncionarioRepository repository = new FuncionarioRepository();

        return repository.listarFuncionarios();
        
    }
}
