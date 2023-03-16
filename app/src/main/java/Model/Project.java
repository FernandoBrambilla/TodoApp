package Model;

import java.util.Date;

public class Project {
    private int id;
    private String name;
    private String description;
    private Date creationDate;
    private Date updateDate;

    public Project(int id, String name, String description, Date creationDate, Date updateDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }
    
    public Project(){
        
    }

    public Project( String name, String description) {
       
        this.name = name;
        this.description = description;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", creationDate=" + creationDate + ", updateDate=" + updateDate + '}';
    }
    
    
}
