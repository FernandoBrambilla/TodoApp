package Util;

import Model.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TaskTableModel extends AbstractTableModel{
    String[] colunms = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasksList = new ArrayList();
  
    @Override
    public int getRowCount() {
       return tasksList.size();
    }

    @Override
    public int getColumnCount() {
        return colunms.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunms[columnIndex];       
    }

    public boolean isCellEditable (int rowIndex, int columnIndex){
       return columnIndex==3;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(tasksList.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    @Override
    public void setValueAt (Object value, int rowIndex, int columnIndex){
        tasksList.get(rowIndex).setStatus((boolean)value);
        
        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return tasksList.get(rowIndex).getName();
            case 1:
                return tasksList.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dtFormat.format(tasksList.get(rowIndex).getDeadline());
            case 3:
                return tasksList.get(rowIndex).getStatus();
            case 4:
                return "";
            case 5:
                return "";
            default:
            return "Dado não encontrado";
        }
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public String[] getColunms() {
        return colunms;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }
    
    
}


