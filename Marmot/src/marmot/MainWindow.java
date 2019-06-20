/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marmot;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Mateeusz
 */
public class MainWindow extends javax.swing.JFrame {

    private final JButton newGameButton;
    private final JButton authorButton;
    private final JButton recordButton;
    private final JButton helpButton;
    private final JButton exitButton;

    private final JLabel nameLabel;
    private final JTextField nameField;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setSize(500, 400);
        // <editor-fold defaultstate="collapsed" desc="Buttons">
        newGameButton = new JButton();
        newGameButton.setVisible(true);
        newGameButton.setText("NEW GAME");
        newGameButton.addActionListener(this::newGameButtonActionPerformed);
        add(newGameButton);
        
        recordButton = new JButton();
        recordButton.setVisible(true);
        recordButton.setText("RECORDS");
        recordButton.addActionListener(this::recordButtonActionPerformed);
        add(recordButton);
        
        helpButton = new JButton();
        helpButton.setVisible(true);
        helpButton.setText("HELP");
        helpButton.addActionListener(this::helpButtonActionPerformed);
        add(helpButton);
        
        authorButton = new JButton();
        authorButton.setVisible(true);
        authorButton.setText("AUTHOR");
        authorButton.addActionListener(this::authorButtonActionPerformed);
        add(authorButton);
        
        exitButton = new JButton();
        exitButton.setVisible(true);
        exitButton.setText("EXIT");
        exitButton.addActionListener(this::exitButtonActionPerformed);
        add(exitButton);
        
        newGameButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.05 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));      
        recordButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.24 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        helpButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.43 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        authorButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.62 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        exitButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.81 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        
        newGameButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        recordButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        helpButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        authorButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        exitButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        // </editor-fold> 
        
        nameLabel = new JLabel("Enter your name", SwingConstants.CENTER);
        nameLabel.setVisible(false);
        nameLabel.setBounds(0, (int) (0.2 * getUsableHeight()), (int) getUsableWidth(), (int) (0.20 * getUsableHeight()));
        nameLabel.setFont(new Font("Console", Font.PLAIN, (int) (0.15 * getUsableHeight())));
        add(nameLabel);
        
        nameField = new JTextField();
        nameField.setVisible(false);
        nameField.setBounds((int) (0.1 * getUsableWidth()), (int) (0.5 * getUsableHeight()), (int) (0.8 * getUsableWidth()), (int) (0.15 * getUsableHeight()));
        nameField.setFont(new Font("Console", Font.PLAIN, (int) (0.10 * getUsableHeight())));
        add(nameField);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                resetButtons();
            }        
        });
    }
    
    private void resetButtons() {
   //     System.out.println("" + (int) (0.2 * getWidth()) + " " + (int) (0.05 * getHeight()) + " " + (int) (0.6 * getWidth()) + " " + (int) (0.14 * getHeight()));
        newGameButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.05 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));      
        recordButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.24 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        helpButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.43 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        authorButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.62 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        exitButton.setBounds((int) (0.2 * getUsableWidth()), (int) (0.81 * getUsableHeight()), (int) (0.6 * getUsableWidth()), (int) (0.14 * getUsableHeight()));
        
        newGameButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        recordButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        helpButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        authorButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        exitButton.setFont(new Font("Console", Font.PLAIN, (int) (0.08 * getUsableHeight())));
        
        nameLabel.setBounds(0, (int) (0.2 * getUsableHeight()), (int) getUsableWidth(), (int) (0.20 * getUsableHeight()));
        nameLabel.setFont(new Font("Console", Font.PLAIN, (int) (0.15 * getUsableHeight())));
        nameField.setBounds((int) (0.1 * getUsableWidth()), (int) (0.5 * getUsableHeight()), (int) (0.8 * getUsableWidth()), (int) (0.15 * getUsableHeight()));
        nameField.setFont(new Font("Console", Font.PLAIN, (int) (0.10 * getUsableHeight())));
    }
    
    public int getUsableWidth() {
        return getWidth() - 22;
    }
    
    public int getUsableHeight() {
        return getHeight() - 42;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

    private void newGameButtonActionPerformed(ActionEvent evt) {
    newGameButton.setVisible(false);
    authorButton.setVisible(false);
    recordButton.setVisible(false);
    helpButton.setVisible(false);
    exitButton.setVisible(false);

    nameLabel.setVisible(true);
    nameField.setVisible(true);
    }
    
    private void recordButtonActionPerformed(ActionEvent evt) {
        System.out.println("Performowana");
    }
    
    private void helpButtonActionPerformed(ActionEvent evt) {
        System.out.println("Performowana");
    }
    
    private void authorButtonActionPerformed(ActionEvent evt) {
        System.out.println("Performowana");
    }
    
    private void exitButtonActionPerformed(ActionEvent evt) {
        exit(0);
    }
    
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
