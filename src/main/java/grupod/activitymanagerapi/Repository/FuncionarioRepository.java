package grupod.activitymanagerapi.Repository;

import grupod.activitymanagerapi.Entities.Funcionario;
import grupod.activitymanagerapi.Configuration.DBConfig;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author iego_
 */
public class FuncionarioRepository {
    public List<Funcionario> listarFuncionarios() throws Exception {
        List<Funcionario> lista = new ArrayList<>();
        
        Connection conexao = DBConfig.getConnection();
        
        String sql = "SELECT * FROM funcionario";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        
        while (rs.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setApelido(rs.getString("apelido"));
            funcionario.setFoto(rs.getByte("foto"));
            funcionario.setCorFavorita(rs.getString("cor_favorita"));
            funcionario.setDataNascimento(rs.getDate("data_nascimento"));
            funcionario.setAtivo(rs.getBoolean("ativo"));
            
            lista.add(funcionario);
            
        }
        
        return lista;
    }
    
    public Funcionario buscarFuncionarioPorId (int idFuncionario) throws Exception {
        Funcionario funcionario = null;
        
        Connection conexao = DBConfig.getConnection();
        
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, idFuncionario);
        ResultSet rs = statement.executeQuery();
        
        if (rs.next()) {
            funcionario = new Funcionario();
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setApelido(rs.getString("apelido"));
            funcionario.setFoto(rs.getByte("foto"));
            funcionario.setCorFavorita(rs.getString("cor_favorita"));
            funcionario.setDataNascimento(rs.getDate("data_nascimento"));
            funcionario.setAtivo(rs.getBoolean("ativo"));
        }
        
        return funcionario;
    }
    
    public void addFuncionario (Funcionario funcionario) throws Exception {
        Connection conexao = DBConfig.getConnection();
        
        String sql = "INSERT INTO funcionario (nome, apelido, foto, cor_favorita, data_nascimento, ativo) VALUES ( ?, ?, ?, ?, ?, ? )";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, funcionario.getNome());
        statement.setString(2, funcionario.getApelido());
        statement.setByte(3, funcionario.getFoto());
        statement.setString(4, funcionario.getCorFavorita());
        statement.setDate(5, (Date) funcionario.getDataNascimento());
        statement.setBoolean(6, funcionario.isAtivo());
        
        statement.execute();
    }
    
    public void editarFuncionario (Funcionario funcionario, long idFuncionario) throws Exception {
        Connection conexao = DBConfig.getConnection();
        
        String sql = "UPDATE funcionario SET nome = ?, apelido = ?, foto = ?, cor_favorita = ?, data_nascimento = ?, ativo = ? WHERE id = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, funcionario.getNome());
        statement.setString(2, funcionario.getApelido());
        statement.setByte(3, funcionario.getFoto());
        statement.setString(4, funcionario.getCorFavorita());
        statement.setDate(5, (Date) funcionario.getDataNascimento());
        statement.setBoolean(6, funcionario.isAtivo());
        statement.setLong(7, idFuncionario);
        
        statement.execute();
    }
    
    public void removerFuncionario (int idFuncionario) throws Exception {
        Connection conexao = DBConfig.getConnection();
        
        String sql = "UPDATE funcionario SET ativo = false WHERE id = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, idFuncionario);
        
        statement.execute();
    }
}