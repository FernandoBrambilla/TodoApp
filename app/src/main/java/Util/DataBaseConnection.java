
package Util;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
   
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }    
    }
    
    public static void closeConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }    
        catch(SQLException e){
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }
    
     public static void closeConnection(Connection connection, PreparedStatement statement){
        try{
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
        }    
        catch(SQLException e){
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }
}
