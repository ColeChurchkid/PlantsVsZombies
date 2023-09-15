/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvzgame;

import io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cole Chuchmach
 */
public class Level3Win extends javax.swing.JFrame {

    /**
     * Creates new form Level2Win
     */
    public Level3Win() {
        initComponents();
        this.setSize(797,600);        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nextLevel = new javax.swing.JLabel();
        menuBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/level3win.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        nextLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nextLevel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextLevelMouseClicked(evt);
            }
        });
        getContentPane().add(nextLevel);
        nextLevel.setBounds(320, 500, 160, 40);

        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mainMenuBtn.png"))); // NOI18N
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
        });
        getContentPane().add(menuBtn);
        menuBtn.setBounds(670, 10, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextLevelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLevelMouseClicked
        Level4 stage3 = new Level4();
    }//GEN-LAST:event_nextLevelMouseClicked

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked

        String text = "Level4";

        try {
            File file = new File("saveData.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }
            if (text == null) {
                file.delete();
            }
            else {
                FileHandler<String> handler = new FileHandler<>();
                handler.save(text, file);
            }
        }
        catch (IOException error) {
            System.out.println("Error in save method");
        }
        try {
            StartScreen stage1 = new StartScreen();
        } catch (IOException ex) {
            Logger.getLogger(Level1Win.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_menuBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JLabel nextLevel;
    // End of variables declaration//GEN-END:variables
}
