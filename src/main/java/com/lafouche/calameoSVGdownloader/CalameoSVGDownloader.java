package com.lafouche.calameoSVGdownloader;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Matthieu Foucher
 */
public class CalameoSVGDownloader {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            try {
                    // Set cross-platform Java L&F (also called "Metal")
                UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
                                            
                //ApplicationFrame.setDefaultLookAndFeelDecorated(true);
                JFrame application = new ApplicationFrame();
                application.setLocationRelativeTo(null);
                application.setVisible(true);
            } 
            catch (UnsupportedLookAndFeelException 
                    | ClassNotFoundException 
                    | InstantiationException
                    | IllegalAccessException e) {
               // handle exception
            }
            
        });
    }
}
