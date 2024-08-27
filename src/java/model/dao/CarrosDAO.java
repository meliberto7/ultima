
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Carros;


public class CarrosDAO {
    
    public List<Carros> listar() {
        
        List<Carros> list = new ArrayList();
        
        try{
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM carros");
            ResultSet rs = stmt.executeQuery();
            int colunas = 0;
            
            while(rs.next()) {
                
                Carros carro = new Carros();
                carro.setId_carro(rs.getInt("id_carro"));
                carro.setMarca(rs.getString("marca"));
                carro.setModelo(rs.getString("modelo"));
                carro.setAno(rs.getInt("ano"));
                carro.setPlaca(rs.getString("placa"));
                carro.setPreco_diaria(rs.getFloat("preco_diaria"));
                colunas++;
                carro.setColunas(colunas);
                
                list.add(carro);
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
    
}
