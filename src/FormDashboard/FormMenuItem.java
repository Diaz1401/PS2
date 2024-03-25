/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormDashboard;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Diaz Nuraji
 */
public class FormMenuItem extends javax.swing.JPanel {

    public ArrayList<FormMenuItem> getSubMenu() {
        return subMenu;
    }

    private final ArrayList<FormMenuItem> subMenu = new ArrayList<>();
    private ActionListener act;

    /**
     * Creates new form MenuItem
     */
    public FormMenuItem(Icon icon, Icon iconSub, boolean sbm, String menuName, ActionListener act, FormMenuItem... subMenu) {
        initComponents();
        pnMainMenu.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:12;" // Sudut
                + "background:$Login.background");
        lbIcon.setIcon(icon);
        lbMenu.setText(menuName);
        lbIconSub.setIcon(iconSub);
        lbIconSub.setVisible(sbm);

        if (act != null) {
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 55));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 55));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 55));
        for (FormMenuItem subMenus : subMenu) {
            subMenus.setVisible(false);
            this.subMenu.add(subMenus);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMainMenu = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbIconSub = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 48));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lbMenu.setText("Menu Item . . .");

        javax.swing.GroupLayout pnMainMenuLayout = new javax.swing.GroupLayout(pnMainMenu);
        pnMainMenu.setLayout(pnMainMenuLayout);
        pnMainMenuLayout.setHorizontalGroup(
            pnMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbIconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        pnMainMenuLayout.setVerticalGroup(
            pnMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainMenuLayout.createSequentialGroup()
                .addGroup(pnMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbIconSub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = true;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (showing) {
            hideMenu();
        } else {
            showMenu();
        }
        if (act != null) {
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbIconSub;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JPanel pnMainMenu;
    // End of variables declaration//GEN-END:variables

    private void hideMenu() {
        new Thread(() -> {
            for (int i = subMenu.size() - 1; i >= 0; i--) {
                sleep(20);
                subMenu.get(i).setVisible(false);
            }
            getParent().repaint();
            getParent().revalidate();
            showing = false;
        }).start();
    }

    private void showMenu() {
        new Thread(() -> {
            for (int i = 0; i < subMenu.size(); i++) {
                sleep(20);
                subMenu.get(i).setVisible(true);
            }
            getParent().repaint();
            getParent().revalidate();
            showing = true;
        }).start();
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }
}
