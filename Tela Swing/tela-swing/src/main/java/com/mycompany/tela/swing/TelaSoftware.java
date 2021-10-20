package com.mycompany.tela.swing;


import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.awt.Desktop;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaSoftware extends javax.swing.JFrame {

    public TelaSoftware() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSair = new javax.swing.JLabel();
        lblAjuda = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblProcessador = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblHD = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        lblAtivar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjudaMouseClicked(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        lblMinimizar.setText("-");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblProcessador.setFont(new java.awt.Font("Fira Code SemiBold", 1, 10)); // NOI18N
        lblProcessador.setText("aguardando inicialização...");
        lblProcessador.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblRam.setFont(new java.awt.Font("Fira Code SemiBold", 1, 12)); // NOI18N
        lblRam.setText("aguardando inicialização...");
        lblRam.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblHD.setFont(new java.awt.Font("Fira Code SemiBold", 1, 10)); // NOI18N
        lblHD.setText("aguardando inicialização...");
        lblHD.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblSistema.setFont(new java.awt.Font("Fira Code SemiBold", 1, 12)); // NOI18N
        lblSistema.setText("aguardando inicialização...");
        lblSistema.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblLoading.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2.png"))); // NOI18N
        lblAtivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAtivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtivarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAtivarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAtivarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAtivarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAtivarMouseReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela-Software.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(lblSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(lblAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(lblHD, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblRam, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(lblLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(596, 596, 596)
                .addComponent(lblAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblHD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblRam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(lblLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(lblAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMouseClicked
        String[] args;
        try {
            URI link = new URI("https://github.com/Grupo-1-adsa/Grupo-1-adsa");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }//GEN-LAST:event_lblAjudaMouseClicked

    private void lblAtivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtivarMouseClicked
        ImageIcon parteUm = new ImageIcon(getClass().getResource("/loading-1.gif"));
        ImageIcon parteDois = new ImageIcon(getClass().getResource("/check-1.png"));
        lblLoading.setIcon(parteUm);
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                lblLoading.setIcon(parteDois);
            }
        };
        timer.scheduleAtFixedRate(tarefa, 2500, 5000);

        Looca looca = new Looca();

        com.github.britooo.looca.api.group.sistema.Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        Processador processador = looca.getProcessador();
        Temperatura temperatura = looca.getTemperatura();
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
        ServicosGroup grupoDeServicos = looca.getGrupoDeServicos();
        ProcessosGroup grupoDeProcessos = looca.getGrupoDeProcessos();

        lblProcessador.setText("<html>" + String.valueOf(processador.getFabricante() + "<br>" + processador.getNome() + "<br>" + processador.getIdentificador() + "<br>"
                + processador.getMicroarquitetura() + "<br>" + processador.getId()
                + "</html>"));
//        lblRam.setText("<html>" + String.valueOf(memoria.getDisponivel() + "<br>" + memoria.getEmUso() + "<br>" + memoria.getTotal() + "</html>"));
        lblRam.setText(String.valueOf(memoria));
        lblHD.setText("<html>" + String.valueOf(grupoDeDiscos.getQuantidadeDeDiscos() + "<br>" + grupoDeDiscos.getQuantidadeDeVolumes()
                + "<br>" + grupoDeDiscos.getTamanhoTotal() + "<br>" + grupoDeDiscos.getVolumes() + "</html>"));
        lblSistema.setText("<html>" + String.valueOf(sistema.getFabricante() + "<br>" + sistema.getSistemaOperacional() + "<br>" + sistema.getInicializado() + "<br>"
                + sistema.getPermissao() + "<br>" + sistema.getTempoDeAtividade() + "</html>"));
    }//GEN-LAST:event_lblAtivarMouseClicked

    private void lblAtivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtivarMouseEntered
        ImageIcon botao = new ImageIcon(getClass().getResource("/button2.png")); 
        lblAtivar.setIcon(botao); 
        
    }//GEN-LAST:event_lblAtivarMouseEntered

    private void lblAtivarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtivarMouseExited
        ImageIcon botao = new ImageIcon(getClass().getResource("/button3.png")); 
        lblAtivar.setIcon(botao); 
    }//GEN-LAST:event_lblAtivarMouseExited

    private void lblAtivarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtivarMousePressed
        ImageIcon botao = new ImageIcon(getClass().getResource("/button1.png")); 
        lblAtivar.setIcon(botao); 
    }//GEN-LAST:event_lblAtivarMousePressed

    private void lblAtivarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtivarMouseReleased
        ImageIcon botao = new ImageIcon(getClass().getResource("/button3.png")); 
        lblAtivar.setIcon(botao); 
    }//GEN-LAST:event_lblAtivarMouseReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSoftware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblAtivar;
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSistema;
    // End of variables declaration//GEN-END:variables
}
