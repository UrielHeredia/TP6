/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TP6;

import TP6.modelo.Producto;
import java.util.TreeSet;

/**
 *
 * @author Uriel
 */
public class MenuGeneral extends javax.swing.JFrame {
    public static TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administracion = new javax.swing.JMenu();
        Productos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuNombre = new javax.swing.JMenuItem();
        MenuPrecio = new javax.swing.JMenuItem();
        MenuRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        Administracion.setText("Administracion");
        Administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracionActionPerformed(evt);
            }
        });

        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        Administracion.add(Productos);

        jMenuBar1.add(Administracion);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        MenuNombre.setText("Consulta por Nombre");
        MenuNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNombreActionPerformed(evt);
            }
        });
        jMenu2.add(MenuNombre);

        MenuPrecio.setText("Consulta por Precio");
        MenuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPrecio);

        MenuRubro.setText("Consulta por Rubro");
        MenuRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRubroActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministracionActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        GestionDeProducto verventana = new GestionDeProducto();
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_ProductosActionPerformed

    private void MenuRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRubroActionPerformed
        ListadoPorRubro verventana = new ListadoPorRubro();
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_MenuRubroActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
  
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MenuNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNombreActionPerformed
         ListadoPorNombre verventana = new ListadoPorNombre();
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_MenuNombreActionPerformed

    private void MenuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrecioActionPerformed
        ListadoPorPrecio verventana = new ListadoPorPrecio();
        Escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_MenuPrecioActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuNombre;
    private javax.swing.JMenuItem MenuPrecio;
    private javax.swing.JMenuItem MenuRubro;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
