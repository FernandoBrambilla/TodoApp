package Controller;

import Model.Project;
import Util.DataBaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {
    
    public void save(Project project){
        String querySave = "INSERT INTO PROJECTS ("
                + "NAME, "
                + "DESCRIPTION, "
                + "CREATIONDATE, "
                + "UPDATEDATE) "
                + "VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement pstmt = null;
        
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(querySave);
            pstmt.setString(1, project.getName());
            pstmt.setString(2, project.getDescription());
            pstmt.setDate(3, Date.valueOf(LocalDate.now()));
            pstmt.setDate(4, Date.valueOf(LocalDate.now()));
            pstmt.execute();
                 
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar projeto."
                    + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
              
     public void update(Project project){ 
        String queryUpdate = "UPDATE PROJECTS SET "
                + "NAME = ?, "
                + "DESCRIPTION = ?, "
                + "CREATIONDATE = ?, "
                + "UPDATEDATE = ? "
                + "WHERE ID = ? ";
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryUpdate);
            pstmt.setString(1, project.getName());
            pstmt.setString(2, project.getDescription());
            pstmt.setDate(3, new Date(project.getCreationDate().getTime()));
            pstmt.setDate(4, new Date(project.getUpdateDate().getTime()));
            pstmt.setInt(5, project.getId());
            pstmt.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o projeto."
                      + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
    
    public void removeById(int projectId){
        String queryRemove = "DELETE FROM PROJECTS WHERE ID = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryRemove);
            pstmt.setInt(1, projectId);
            pstmt.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar projeto. "
                      + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
        }
    }
    
    public List<Project> getAll() throws SQLException{
        String queryGetAll = "SELECT * FROM PROJECTS";
        List<Project> projectList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            connection = DataBaseConnection.getConnection();
            pstmt = connection.prepareStatement(queryGetAll);
            result = pstmt.executeQuery();
            while(result.next()){
                Project project = new Project();
                project.setId(result.getInt("ID"));
                project.setName(result.getString("NAME"));
                project.setDescription(result.getString("DESCRIPTION"));
                project.setCreationDate(result.getDate("CREATIONDATE"));
                project.setUpdateDate(result.getDate("UPDATEDATE"));
                projectList.add(project);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar os projetos"
                    + e.getMessage(), e);
        }
        finally{
            DataBaseConnection.closeConnection((com.mysql.jdbc.Connection) connection, (com.mysql.jdbc.PreparedStatement) pstmt);
            if(result != null){
                result.close();
            }
        }
    return projectList;
    }
}