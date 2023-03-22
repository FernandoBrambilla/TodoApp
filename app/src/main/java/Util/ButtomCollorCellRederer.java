
package Util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ButtomCollorCellRederer extends DefaultTableCellRenderer{
    private String buttonType;

    public ButtomCollorCellRederer(String buttonType){
        this.buttonType = buttonType;
        
    }
    
    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column){
        JLabel jlabel = (JLabel) super.getTableCellRendererComponent(table, value, 
                    isSelected, hasFocus, row, column);
        jlabel.setHorizontalAlignment(CENTER);
        jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+ 
                    buttonType+".png")));
       return jlabel;
    }
}
