/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

import com.formdev.flatlaf.*;
import javax.swing.*;
import static main.Main.ThemeListener;
import static main.Main.Detector;

/**
 *
 * @author Diaz Nuraji
 */
public class FormDashboardFrame extends javax.swing.JFrame {

    private static FormDashboardPanel formPanel;
    private static FormDashboardFrame formFrame;

    /**
     * Creates new form FormDashboardFrame
     */
    public FormDashboardFrame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        formPanel = new FormDashboardPanel();
        setContentPane(formPanel);
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

    /**
     * @param args the command line arguments
     */
    public static void Form() {
        ThemeListener = isDark -> {
            SwingUtilities.invokeLater(() -> {
                if (!isDark) {
                    FlatLightLaf.setup();
                } else {
                    FlatDarkLaf.setup();
                }
                if (formFrame != null) {
                    SwingUtilities.updateComponentTreeUI(formFrame);
                } else {
                    formFrame = new FormDashboardFrame();
                    formFrame.setVisible(true);
                }
            });
        };
        ThemeListener.accept(Detector.isDark());
        Detector.registerListener(ThemeListener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}