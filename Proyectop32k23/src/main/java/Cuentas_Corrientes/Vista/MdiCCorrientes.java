/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas_Corrientes.Vista;

import Cuentas_Corrientes.Vista.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class MdiCCorrientes extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiCCorrientes() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiCCorrientes.MAXIMIZED_BOTH);
        this.setTitle("Menu Gestión Cuentas Corrientes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1MdiVentas = new javax.swing.JMenuItem();
        jMenuItem2MdiVentas = new javax.swing.JMenuItem();
        jMenuItem4MdiVentas = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1MdiVentas = new javax.swing.JCheckBoxMenuItem();
        jMenu1MdiVentas = new javax.swing.JMenu();
        jDesktopPaneVentas = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        mnuGeneralVentas = new javax.swing.JMenuBar();
        mnuArchivoVentas = new javax.swing.JMenu();
        mnuSalirSistemaVentas = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogosVentas = new javax.swing.JMenu();
        mnuCatalogosMantenimientosVentas = new javax.swing.JMenu();
        MantenimientoTransacciones = new javax.swing.JCheckBoxMenuItem();
        MantenimientoCC = new javax.swing.JMenuItem();
        MantenimientoCCProv = new javax.swing.JMenuItem();
        MantenimientoProv = new javax.swing.JMenuItem();
        mnuProcesosVentas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuConsultasVentas = new javax.swing.JMenu();
        mnuReportesVentas = new javax.swing.JMenu();
        btnRptClientes = new javax.swing.JMenuItem();
        btnRptProvCC = new javax.swing.JMenuItem();
        btnRptTr = new javax.swing.JMenuItem();
        btnRptProv = new javax.swing.JMenuItem();
        mnuAyudasVentas = new javax.swing.JMenu();
        btnAyudaClientes = new javax.swing.JMenuItem();
        btnAyudaClientesCC = new javax.swing.JMenuItem();
        btnAyudaProv = new javax.swing.JMenuItem();
        btnAyudaTr = new javax.swing.JMenuItem();

        jMenuItem1MdiVentas.setText("jMenuItem1");

        jMenuItem2MdiVentas.setText("jMenuItem2");

        jMenuItem4MdiVentas.setText("jMenuItem4");

        jCheckBoxMenuItem1MdiVentas.setSelected(true);
        jCheckBoxMenuItem1MdiVentas.setText("jCheckBoxMenuItem1");

        jMenu1MdiVentas.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jDesktopPaneVentas.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneVentasLayout = new javax.swing.GroupLayout(jDesktopPaneVentas);
        jDesktopPaneVentas.setLayout(jDesktopPaneVentasLayout);
        jDesktopPaneVentasLayout.setHorizontalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jDesktopPaneVentasLayout.setVerticalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        mnuArchivoVentas.setText("Archivo");
        mnuArchivoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoVentasActionPerformed(evt);
            }
        });

        mnuSalirSistemaVentas.setSelected(true);
        mnuSalirSistemaVentas.setText("Salir del Sistema");
        mnuSalirSistemaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaVentasActionPerformed(evt);
            }
        });
        mnuArchivoVentas.add(mnuSalirSistemaVentas);

        mnuGeneralVentas.add(mnuArchivoVentas);

        mnuCatalogosVentas.setText("Catalogos");

        mnuCatalogosMantenimientosVentas.setText("Mantenimientos");
        mnuCatalogosMantenimientosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosVentasActionPerformed(evt);
            }
        });

        MantenimientoTransacciones.setSelected(true);
        MantenimientoTransacciones.setText("Mantenimiento Transacciones CC");
        MantenimientoTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoTransaccionesActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(MantenimientoTransacciones);

        MantenimientoCC.setText("Mantenimiento Cuentas Corriente Clientes");
        MantenimientoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoCCActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(MantenimientoCC);

        MantenimientoCCProv.setText("Mantenimiento Cuentas Corriente Proveedores");
        MantenimientoCCProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoCCProvActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(MantenimientoCCProv);

        MantenimientoProv.setText("Mantenimiento Proveedores");
        MantenimientoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoProvActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(MantenimientoProv);

        mnuCatalogosVentas.add(mnuCatalogosMantenimientosVentas);

        mnuGeneralVentas.add(mnuCatalogosVentas);

        mnuProcesosVentas.setText("Procesos");

        jMenuItem2.setText("PagoTodasFacturasClientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuProcesosVentas.add(jMenuItem2);

        jMenuItem1.setText("PagoTodasFacturasProveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuProcesosVentas.add(jMenuItem1);

        mnuGeneralVentas.add(mnuProcesosVentas);

        mnuConsultasVentas.setText("Consultas");
        mnuConsultasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasVentasActionPerformed(evt);
            }
        });
        mnuGeneralVentas.add(mnuConsultasVentas);

        mnuReportesVentas.setText("Reportes");

        btnRptClientes.setText("Reporte CC Clientes");
        btnRptClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRptClientesActionPerformed(evt);
            }
        });
        mnuReportesVentas.add(btnRptClientes);

        btnRptProvCC.setText("Reporte CC Proveedores");
        btnRptProvCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRptProvCCActionPerformed(evt);
            }
        });
        mnuReportesVentas.add(btnRptProvCC);

        btnRptTr.setText("Reporte Transacciones");
        btnRptTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRptTrActionPerformed(evt);
            }
        });
        mnuReportesVentas.add(btnRptTr);

        btnRptProv.setText("Reporte Proveedores");
        btnRptProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRptProvActionPerformed(evt);
            }
        });
        mnuReportesVentas.add(btnRptProv);

        mnuGeneralVentas.add(mnuReportesVentas);

        mnuAyudasVentas.setText("Ayudas");

        btnAyudaClientes.setText("Ayuda CC Clientes");
        btnAyudaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaClientesActionPerformed(evt);
            }
        });
        mnuAyudasVentas.add(btnAyudaClientes);

        btnAyudaClientesCC.setText("Ayuda CC Proveedores");
        btnAyudaClientesCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaClientesCCActionPerformed(evt);
            }
        });
        mnuAyudasVentas.add(btnAyudaClientesCC);

        btnAyudaProv.setText("Ayuda Proveedores");
        btnAyudaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaProvActionPerformed(evt);
            }
        });
        mnuAyudasVentas.add(btnAyudaProv);

        btnAyudaTr.setText("Ayuda Transacciones");
        btnAyudaTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaTrActionPerformed(evt);
            }
        });
        mnuAyudasVentas.add(btnAyudaTr);

        mnuGeneralVentas.add(mnuAyudasVentas);

        setJMenuBar(mnuGeneralVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientosVentasActionPerformed

    private void mnuArchivoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuArchivoVentasActionPerformed

    private void mnuSalirSistemaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaVentasActionPerformed
        // TODO add your handling code here:

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }        
    }//GEN-LAST:event_mnuSalirSistemaVentasActionPerformed

    private void MantenimientoTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoTransaccionesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoTransaccionesCC ventana = new frmMantenimientoTransaccionesCC();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);      
    }//GEN-LAST:event_MantenimientoTransaccionesActionPerformed

    private void mnuConsultasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasVentasActionPerformed

    private void MantenimientoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoCCActionPerformed
        // TODO add your handling code here:
        //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        frmCCorrientes ventana = new frmCCorrientes();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_MantenimientoCCActionPerformed

    private void MantenimientoCCProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoCCProvActionPerformed
        // TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
        frmCCorrientesProv ventana = new frmCCorrientesProv();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_MantenimientoCCProvActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmCCorrientesProvPagoTodos ventana = new frmCCorrientesProvPagoTodos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MantenimientoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoProvActionPerformed
        // TODO add your handling code here:
        frmProveedoresCC ventana = new frmProveedoresCC();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_MantenimientoProvActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         frmCCorrientesCliePagoTodos ventana = new frmCCorrientesCliePagoTodos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAyudaClientesCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaClientesCCActionPerformed
        // TODO add your handling code here:
        // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
       frmAyudaCCClientes ventana = new frmAyudaCCClientes();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnAyudaClientesCCActionPerformed

    private void btnRptClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRptClientesActionPerformed
        // TODO add your handling code here:
         //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        frmReporteCCClientes ventana = new frmReporteCCClientes();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnRptClientesActionPerformed

    private void btnRptProvCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRptProvCCActionPerformed
        // TODO add your handling code here:
          // REALIZADO POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395
         frmReportesCCProveedores ventana = new frmReportesCCProveedores();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnRptProvCCActionPerformed

    private void btnAyudaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaClientesActionPerformed
        // TODO add your handling code here:
         //REALIZADO POR: MONICA GABRIELA PEREZ VELASQUEZ; 9959-21-1840
        frmAyudaCCClientes ventana = new frmAyudaCCClientes();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_btnAyudaClientesActionPerformed

    private void btnRptTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRptTrActionPerformed
        // TODO add your handling code here:
        frmReportesTransacciones ventana = new frmReportesTransacciones();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnRptTrActionPerformed

    private void btnRptProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRptProvActionPerformed
        // TODO add your handling code here:
        frmReportesProveedores ventana = new frmReportesProveedores();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnRptProvActionPerformed

    private void btnAyudaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaProvActionPerformed
        // TODO add your handling code here:
        frmAyudaProveedores ventana = new frmAyudaProveedores();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnAyudaProvActionPerformed

    private void btnAyudaTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaTrActionPerformed
        // TODO add your handling code here:
        frmAyudaTransacciones ventana = new frmAyudaTransacciones();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        ventana.show();
    }//GEN-LAST:event_btnAyudaTrActionPerformed

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
            java.util.logging.Logger.getLogger(MdiCCorrientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiCCorrientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiCCorrientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiCCorrientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiCCorrientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MantenimientoCC;
    private javax.swing.JMenuItem MantenimientoCCProv;
    private javax.swing.JMenuItem MantenimientoProv;
    private javax.swing.JCheckBoxMenuItem MantenimientoTransacciones;
    private javax.swing.JMenuItem btnAyudaClientes;
    private javax.swing.JMenuItem btnAyudaClientesCC;
    private javax.swing.JMenuItem btnAyudaProv;
    private javax.swing.JMenuItem btnAyudaTr;
    private javax.swing.JMenuItem btnRptClientes;
    private javax.swing.JMenuItem btnRptProv;
    private javax.swing.JMenuItem btnRptProvCC;
    private javax.swing.JMenuItem btnRptTr;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1MdiVentas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPaneVentas;
    private javax.swing.JMenu jMenu1MdiVentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1MdiVentas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem2MdiVentas;
    private javax.swing.JMenuItem jMenuItem4MdiVentas;
    private javax.swing.JMenu mnuArchivoVentas;
    private javax.swing.JMenu mnuAyudasVentas;
    private javax.swing.JMenu mnuCatalogosMantenimientosVentas;
    private javax.swing.JMenu mnuCatalogosVentas;
    private javax.swing.JMenu mnuConsultasVentas;
    private javax.swing.JMenuBar mnuGeneralVentas;
    private javax.swing.JMenu mnuProcesosVentas;
    private javax.swing.JMenu mnuReportesVentas;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistemaVentas;
    // End of variables declaration//GEN-END:variables
}
