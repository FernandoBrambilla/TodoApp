package View;

import Controller.TaskController;
import Model.Project;
import Model.Task;
import Util.TaskTableModel;
import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;
    Task task;
    
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new TaskController();
    }

    public JFormattedTextField getFieldDeadline() {
        return fieldDeadline;
    }

    public void setFieldDeadline(JFormattedTextField fieldDeadline) {
        this.fieldDeadline = fieldDeadline;
    }

    public JTextArea getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(JTextArea fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    public JTextField getFieldName() {
        return fieldName;
    }

    public void setFieldName(JTextField fieldName) {
        this.fieldName = fieldName;
    }

    public JTextArea getFieldNotes() {
        return fieldNotes;
    }

    public void setFieldNotes(JTextArea fieldNotes) {
        this.fieldNotes = fieldNotes;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    

    public Font fontEdit(){
       Font font = new Font("UBUNTU", Font.BOLD, 16);
        return font;
    }
    
    public void editTask(Task task){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fieldName.setText(task.getName());
        fieldName.setForeground(Color.GRAY);
        fieldName.setFont(fontEdit());
        fieldDescription.setText(task.getDescription());
        fieldDescription.setForeground(Color.GRAY);
        fieldDescription.setFont(fontEdit());
        fieldDeadline.setValue(dateFormat.format(task.getDeadline()));
        fieldDeadline.setForeground(Color.GRAY);
        fieldDeadline.setFont(fontEdit());
        fieldNotes.setText(task.getNotes());
        fieldNotes.setForeground(Color.GRAY);
        fieldNotes.setFont(fontEdit());
    }
    
        
    public boolean fieldsIsEmpty(){
        return this.fieldName.getText().isEmpty() && this.fieldDeadline.getText().isEmpty();
    }

    public  Border notValidBorder(String title){
        title = title + "          *Campo Obrigatório";
        Border lineBorder = BorderFactory.createLineBorder(RED);
        Font titleFont = new Font("UBUNTU", Font.PLAIN, 16);
        TitledBorder titleBorder = BorderFactory.createTitledBorder(lineBorder,
                title,TitledBorder.LEFT, 0, titleFont, RED);
         return titleBorder;
        }
    
     
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        taskSave = new javax.swing.JLabel();
        TaskData = new javax.swing.JPanel();
        fieldName = new javax.swing.JTextField();
        panelDescription = new javax.swing.JScrollPane();
        fieldDescription = new javax.swing.JTextArea();
        fieldDeadline = new javax.swing.JFormattedTextField();
        panelNotes = new javax.swing.JScrollPane();
        fieldNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        Header.setBackground(new java.awt.Color(0, 153, 102));

        title.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Tarefas");
        title.setAutoscrolls(true);

        taskSave.setForeground(new java.awt.Color(255, 255, 255));
        taskSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        taskSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(taskSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(taskSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TaskData.setBackground(java.awt.Color.white);

        fieldName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        fieldName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N

        fieldDescription.setColumns(20);
        fieldDescription.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        fieldDescription.setRows(5);
        fieldDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N
        fieldDescription.setMinimumSize(new java.awt.Dimension(600, 400));
        fieldDescription.setPreferredSize(new java.awt.Dimension(200, 100));
        panelDescription.setViewportView(fieldDescription);

        fieldDeadline.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prazo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N
        try {
            fieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fieldNotes.setColumns(20);
        fieldNotes.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        fieldNotes.setRows(5);
        fieldNotes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N
        fieldNotes.setFocusTraversalPolicyProvider(true);
        fieldNotes.setPreferredSize(new java.awt.Dimension(200, 100));
        panelNotes.setViewportView(fieldNotes);

        javax.swing.GroupLayout TaskDataLayout = new javax.swing.GroupLayout(TaskData);
        TaskData.setLayout(TaskDataLayout);
        TaskDataLayout.setHorizontalGroup(
            TaskDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TaskDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldDeadline)
                    .addComponent(panelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(panelDescription)
                    .addComponent(fieldName, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        TaskDataLayout.setVerticalGroup(
            TaskDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TaskData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaskData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void taskSave(){
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            while (fieldName.getText().isEmpty()|| this.fieldDeadline.getValue()== null) {  
                fieldName.setBorder(notValidBorder("Nome"));
                fieldDeadline.setBorder(notValidBorder("Prazo"));
                return;
            }
            Task task = new Task();
            task.setIdProject(project.getId());
            task.setName(fieldName.getText());
            task.setDescription(fieldDescription.getText());
            Date deadline = null;
            task.setDeadline(deadline = dateFormat.parse(fieldDeadline.getText()));     
            task.setNotes(fieldNotes.getText());
            task.setStatus(false);
            controller.save(task);
            JOptionPane.showMessageDialog(null, "Tarefa salva com sucesso!");
            
            this.dispose();        
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    
    
    //botão salvar tarefa
    private void taskSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskSaveMouseClicked
          if(task.getId()){
              
              
              
          }
    }//GEN-LAST:event_taskSaveMouseClicked

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel TaskData;
    private javax.swing.JFormattedTextField fieldDeadline;
    private javax.swing.JTextArea fieldDescription;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextArea fieldNotes;
    private javax.swing.JScrollPane panelDescription;
    private javax.swing.JScrollPane panelNotes;
    private javax.swing.JLabel taskSave;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

