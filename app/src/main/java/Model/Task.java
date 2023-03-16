package Model;

import java.util.Date;

public class Task {
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private boolean status;
    private Date deadline;
    private Date creationDate;
    private Date updateDate;

    public Task(int id, int idProject, String name, String description, String notes, boolean status, Date deadline, Date creationDate, Date updateDate) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.status = status;
        this.deadline = deadline;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

 

    public Task(){
        this.creationDate = new Date();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", notes=" + notes + ", status=" + status + ", deadline=" + deadline + ", creationDate=" + creationDate + ", updateDate=" + updateDate + '}';
    }
    
    
    
}
