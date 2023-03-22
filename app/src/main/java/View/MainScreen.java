package View;

import Controller.ProjectController;
import Controller.TaskController;
import Model.Project;
import Model.Task;
import Util.ButtomCollorCellRederer;
import Util.DeadLineCollumnCellRederer;
import Util.TaskTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class MainScreen extends javax.swing.JFrame {
    
    ProjectController projectController;
    TaskController taskController;
    DefaultListModel projectsModel;
    TaskTableModel tasksModel;

    public MainScreen() {
        initComponents();
        initDataControler();
        initComponentsModel();
        decorateTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        SubTitle = new javax.swing.JLabel();
        ProjectPanel = new javax.swing.JPanel();
        labelProject = new javax.swing.JLabel();
        labelProjectAdd = new javax.swing.JLabel();
        TaskPanel = new javax.swing.JPanel();
        labelTasks = new javax.swing.JLabel();
        labelTasksAdd = new javax.swing.JLabel();
        ProjectList = new javax.swing.JPanel();
        projects = new javax.swing.JScrollPane();
        projectsList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollTasks = new javax.swing.JScrollPane();
        tableTasks = new javax.swing.JTable();
        emptyList = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelSubltitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        Header.setBackground(new java.awt.Color(0, 153, 102));

        Title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        Title.setText("TodoApp");

        SubTitle.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        SubTitle.setForeground(new java.awt.Color(255, 255, 255));
        SubTitle.setText("Anote tudo, não esqueça de nada!");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(489, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProjectPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelProject.setBackground(new java.awt.Color(0, 153, 102));
        labelProject.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelProject.setForeground(new java.awt.Color(0, 153, 102));
        labelProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProject.setText("Projetos");

        labelProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        labelProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProjectPanelLayout = new javax.swing.GroupLayout(ProjectPanel);
        ProjectPanel.setLayout(ProjectPanelLayout);
        ProjectPanelLayout.setHorizontalGroup(
            ProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProjectAdd)
                .addContainerGap())
        );
        ProjectPanelLayout.setVerticalGroup(
            ProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(ProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelProjectAdd)
                    .addComponent(labelProject, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        TaskPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelTasks.setBackground(new java.awt.Color(0, 153, 102));
        labelTasks.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTasks.setForeground(new java.awt.Color(0, 153, 102));
        labelTasks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTasks.setText("Tarefas");

        labelTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        labelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TaskPanelLayout = new javax.swing.GroupLayout(TaskPanel);
        TaskPanel.setLayout(TaskPanelLayout);
        TaskPanelLayout.setHorizontalGroup(
            TaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTasksAdd)
                .addContainerGap())
        );
        TaskPanelLayout.setVerticalGroup(
            TaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(TaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTasksAdd)
                    .addComponent(labelTasks))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProjectList.setBackground(new java.awt.Color(255, 255, 255));
        ProjectList.setLayout(new java.awt.BorderLayout());

        projectsList.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        projectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectsList.setFixedCellHeight(30);
        projectsList.setSelectionBackground(new java.awt.Color(0, 153, 102));
        projectsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsListMouseClicked(evt);
            }
        });
        projects.setViewportView(projectsList);

        ProjectList.add(projects, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollTasks.setBackground(new java.awt.Color(255, 255, 255));

        tableTasks.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTasks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableTasks.setRowHeight(30);
        tableTasks.setSelectionBackground(new java.awt.Color(0, 153, 102));
        tableTasks.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableTasks.setShowGrid(false);
        tableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTasksMouseClicked(evt);
            }
        });
        jScrollTasks.setViewportView(tableTasks);

        jPanel5.add(jScrollTasks, java.awt.BorderLayout.PAGE_START);

        emptyList.setBackground(new java.awt.Color(255, 255, 255));

        labelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        labelTitle.setBackground(new java.awt.Color(0, 153, 102));
        labelTitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 153, 102));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Nenhuma tarefa por aqui   :D");

        labelSubltitle.setBackground(new java.awt.Color(0, 153, 102));
        labelSubltitle.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        labelSubltitle.setForeground(new java.awt.Color(153, 153, 153));
        labelSubltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubltitle.setText("Clique no botão + para adicionar uma tarefa");

        javax.swing.GroupLayout emptyListLayout = new javax.swing.GroupLayout(emptyList);
        emptyList.setLayout(emptyListLayout);
        emptyListLayout.setHorizontalGroup(
            emptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSubltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(emptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emptyListLayout.setVerticalGroup(
            emptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyListLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(labelSubltitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(emptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(TaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelProjectAddMouseClicked
      ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
      projectDialogScreen.setVisible(true);
      projectDialogScreen.addWindowListener(new WindowAdapter(){
          public void windowClosed(WindowEvent e) {
              loadProjects();
          }
      });
      
    }//GEN-LAST:event_labelProjectAddMouseClicked

    private void labelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTasksAddMouseClicked
       TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
       int projecIndex = projectsList.getSelectedIndex();
       Project project = (Project) projectsModel.get(projecIndex);
       taskDialogScreen.setProject(project);
       taskDialogScreen.setVisible(true);
       taskDialogScreen.addWindowListener(new WindowAdapter() {
           public void windowClosed(WindowEvent e){
               int projectIndex = projectsList.getSelectedIndex();
               Project project = (Project) projectsModel.get(projectIndex);
               loadTasks(project.getId());
             }
       });
        
    }//GEN-LAST:event_labelTasksAddMouseClicked

    private void tableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTasksMouseClicked
        int rowIndex = tableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = tableTasks.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasksList().get(rowIndex);
        switch(columnIndex){
            case 3:
                
                taskController.update(task);
                break;
            case 4:
                
                break;
             case 5:
                taskController.removeById(task.getId());
                tasksModel.getTasksList().remove(task);
                int projectIndex = projectsList.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                 loadTasks(project.getId());
                        
                break;
            case 6:
                
                break;
                
        }
        
    }//GEN-LAST:event_tableTasksMouseClicked

    private void projectsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsListMouseClicked
        int projectIndex = projectsList.getSelectedIndex();
        Project project = (Project)projectsModel.get(projectIndex);
        loadTasks(project.getId());
       
        
    }//GEN-LAST:event_projectsListMouseClicked
    private void showJTableTasks (boolean hasTasks){
        if (hasTasks){
            if(emptyList.isVisible()){
               emptyList.setVisible(false);
               jPanel5.remove(emptyList);
            }
            jPanel5.add(jScrollTasks);
            jScrollTasks.setVisible(true);
            jScrollTasks.setSize(jPanel5.getWidth(), jPanel5.getHeight());
            }
            else{
                if(jScrollTasks.isVisible()){
                    jScrollTasks.setVisible(false);
                    jPanel5.remove(jScrollTasks);
                }
            jPanel5.add(emptyList);
            emptyList.setVisible(true);
            emptyList.setSize(jPanel5.getWidth(), jPanel5.getHeight());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                MainScreen mainScreen = new MainScreen();
                mainScreen.setVisible(true);
                mainScreen.setExtendedState(MainScreen.MAXIMIZED_BOTH);
                
              
              
            }
        });
    }
        
    public void decorateTable(){
        tableTasks.getTableHeader().setFont(new Font("UBUNTU", Font.PLAIN, 16));
        tableTasks.getTableHeader().setBackground(new Color(0,153,102));
        tableTasks.getTableHeader().setForeground(new Color(255,255,255));
        tableTasks.setAutoCreateRowSorter(true);
        tableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadLineCollumnCellRederer());
        tableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtomCollorCellRederer("edit"));
        tableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtomCollorCellRederer("delete"));
    }
    
    public void initDataControler(){
        projectController = new ProjectController();
        taskController = new TaskController();
    }

    public void initComponentsModel(){
        projectsModel = new DefaultListModel();
        loadProjects();
        tasksModel = new TaskTableModel();
        tableTasks.setModel(tasksModel);
        if(!projectsModel.isEmpty()){
            projectsList.setSelectedIndex(0);
            Project project = (Project) projectsModel.get(0);
            loadTasks(project.getId());
        }    
        
      
    }
    
    public void loadTasks(int idProject){
        try{
            List<Task> tasksList = taskController.getAll(idProject);
            tasksModel.setTasksList(tasksList);
            showJTableTasks(! tasksList.isEmpty());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(ProjectPanel,e.getMessage());
        }
    }
    
    public void loadProjects (){
        try{
            List<Project> projects = projectController.getAll();
            projectsModel.clear();
            for(int i=0; i<projects.size();i++){
                Project project = projects.get(i);
                projectsModel.addElement(project);
            }
            projectsList.setModel(projectsModel);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(ProjectPanel, "Erro ao Carregar projetos." + e.getMessage());
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ProjectList;
    private javax.swing.JPanel ProjectPanel;
    private javax.swing.JLabel SubTitle;
    private javax.swing.JPanel TaskPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel emptyList;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollTasks;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelProject;
    private javax.swing.JLabel labelProjectAdd;
    private javax.swing.JLabel labelSubltitle;
    private javax.swing.JLabel labelTasks;
    private javax.swing.JLabel labelTasksAdd;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JScrollPane projects;
    private javax.swing.JList<String> projectsList;
    private javax.swing.JTable tableTasks;
    // End of variables declaration//GEN-END:variables
}
