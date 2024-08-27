
package model.dao;


import conexao.Conexao;
import global.GlobalUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Usuarios;


public class UsuarioDAO {
    
    public boolean logar(String usuario, String senha) {
        
        boolean very = false;
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND senha = ?");
            
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                very = true;
                GlobalUser.setId_usuario(rs.getInt("id_usuario"));
                GlobalUser.setNome(rs.getString("nome"));
                GlobalUser.setEmail(rs.getString("email"));
                GlobalUser.setEmail(rs.getString("senha"));
                GlobalUser.setTelefone(rs.getString("telefone"));
                GlobalUser.setVery(true);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return very;
    }
    
    public void cadastrar(Usuarios usuario) {
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO usuarios(nome,email,senha,telefone) VALUES(?,?,?,?)");
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getTelefone());
            
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
