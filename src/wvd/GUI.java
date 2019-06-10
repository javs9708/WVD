package wvd;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI extends javax.swing.JFrame {
    
    File file         = new File(".");
    int  width         = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int  height          = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    public GUI() {
        initComponents();
        
        JLabel bg_label;
        JButton bt_desktop;
        
        ImageIcon background   = new ImageIcon(file.getAbsolutePath()+"/build/classes/images/Buttons.jpg");
        ImageIcon sunrise_logo = new ImageIcon(file.getAbsolutePath()+"/build/classes/images/sunrise_logo.jpg");
        Icon background_icon   = new ImageIcon(background.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        
        bg_label = new JLabel(background_icon);
        bt_desktop  = new JButton();
        
        bg_label.setBounds(0,0,width,height);
        bt_desktop.setBounds(width/2-50, height/2-50, 100, 100);
        bt_desktop.setIcon(sunrise_logo);
        
        bt_desktop.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
              open_file(file.getAbsolutePath()+"/build/classes/files/user1.Lnk");
          }
        });
        
        this.add(bg_label);
        this.add(bt_desktop);
        
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    public void open_file(String file)
    {
     try 
     {
            File object_file = new File (file);
            Desktop.getDesktop().open(object_file);
     }catch (IOException ex) 
     {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
