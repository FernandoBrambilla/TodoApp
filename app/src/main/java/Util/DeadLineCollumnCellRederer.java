package Util;

import Model.Task;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class DeadLineCollumnCellRederer extends DefaultTableCellRenderer{
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel jLabel = (JLabel) super.getTableCellRendererComponent(table, value, 
                    isSelected, hasFocus, row, column);
        jLabel.setHorizontalAlignment(CENTER);
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasksList().get(row);
        if(task.getDeadline().after(new Date())){
            jLabel.setBackground(Color.GREEN);
        }
        else{
           jLabel.setBackground(Color.RED);
        }
        return jLabel;
    }
}
