
package TodoApp;

import View.MainScreen;


public class App {
    
    public static void main(String[] args){
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                MainScreen mainScreen = new MainScreen();
                mainScreen.setVisible(true);
                mainScreen.setExtendedState(MainScreen.MAXIMIZED_BOTH);
                
              
              
            }
        });
       
        
    }
}