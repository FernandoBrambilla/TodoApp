
package Controller;

import Model.Task;
import Util.DataBaseConnection;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    
    public void save(Task task){
        String querySave = " INSERT INTO TASKS ("
                + "IDPROJECT, "
                + "NAME, "
                + "DESCRIPTION, "
                + "STATUS, "
                + "NOTES, "
                + "DEADLINE, "
                + "CREATIONDATE, "
                + "UPDATEDATE) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(querySave);
            pstmt.setInt(1, task.getIdProject());
            pstmt.setString(2, task.getName());
            pstmt.setString(3, task.getDescription());
            pstmt.setBoolean(4, task.getStatus());
            pstmt.setString(5, task.getNotes());
            pstmt.setDate(6, new Date(task.getDeadline().getTime()));
            pstmt.setDate(7, new Date(task.getCreationDate().getTime()));
            pstmt.setDate(8, new Date(task.getUpdateDate().getTime()));
            pstmt.execute();
        }
        catch (Exception e) {
            throw new RuntimeException("Erro ao salvar tarefa."
                    +  e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
    
    public void update(Task task){
        String queryUpdate = " UPDATE TASKS SET "
                + "IDPROJECT = ?, "
                + "NAME = ?, "
                + "DESCRIPTION = ?, "
                + "STATUS = ?, "
                + "NOTES = ?, "
                + "DEADLINE = ?, "
                + "CREATIONDATE = ?, "
                + "UPDATEDATE = ? "
                + "WHERE ID = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryUpdate);
            pstmt.setInt(1, task.getIdProject());
            pstmt.setString(2, task.getName());
            pstmt.setString(3, task.getDescription());
            pstmt.setBoolean(4, task.getStatus());
            pstmt.setString(5, task.getNotes());
            pstmt.setDate(6, new Date(task.getDeadline().getTime()));
            pstmt.setDate(7, new Date(task.getCreationDate().getTime()));
            pstmt.setDate(8, new Date(task.getUpdateDate().getTime()));
            pstmt.setInt(9, task.getId());
            pstmt.execute();
        } 
        catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa."
                    + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
    
    public void removeById(int taskId){
        String queryDelete = "DELETE FROM TASKS WHERE ID = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryDelete);
            pstmt.setInt(1, taskId);
            pstmt.execute();
        } 
        catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa."
                    + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
    
    public List<Task> getAll(int idProject) throws SQLException{
        String queryGetAll = "SELECT * FROM TASKS WHERE IDPROJECT = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;
        List<Task> tasksList = new ArrayList<>();
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryGetAll);
            pstmt.setInt(1, idProject);
            result = pstmt.executeQuery();
            while(result.next()){
                Task task = new Task();
                task.setId(result.getInt("ID"));
                task.setIdProject(result.getInt("IDPROJECT"));
                task.setName(result.getString("NAME"));
                task.setDescription(result.getString("DESCRIPTION"));
                task.setNotes(result.getString("NOTES"));
                task.setStatus(result.getBoolean("STATUS"));
                task.setDeadline(result.getDate("DEADLINE"));
                task.setCreationDate(result.getDate("CREATIONDATE"));
                task.setUpdateDate(result.getDate("UPDATEDATE"));
                tasksList.add(task);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Erro ao inserir a tarefa."
                    + e.getMessage(), e);
        }
         finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
            if(result != null){
                result.close();
            }
        }
        return tasksList;
    }
}
