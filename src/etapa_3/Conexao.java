
package etapa_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConexao() {
        try {
           
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/viva_bem", "root", "rg070510");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}

