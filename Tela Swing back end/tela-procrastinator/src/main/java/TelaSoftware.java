
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.awt.Desktop;
import java.net.URI;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

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
        lblIniciar = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblSair);
        lblSair.setBounds(810, 46, 120, 60);

        lblAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjudaMouseClicked(evt);
            }
        });
        getContentPane().add(lblAjuda);
        lblAjuda.setBounds(870, 596, 60, 70);

        lblMinimizar.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimizar.setText("-");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(lblMinimizar);
        lblMinimizar.setBounds(970, 0, 50, 30);

        lblProcessador.setFont(new java.awt.Font("Fira Code SemiBold", 1, 10)); // NOI18N
        lblProcessador.setForeground(new java.awt.Color(0, 0, 0));
        lblProcessador.setText("aguardando inicialização...");
        lblProcessador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblProcessador);
        lblProcessador.setBounds(50, 380, 190, 150);

        lblRam.setFont(new java.awt.Font("Fira Code SemiBold", 1, 12)); // NOI18N
        lblRam.setForeground(new java.awt.Color(0, 0, 0));
        lblRam.setText("aguardando inicialização...");
        lblRam.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblRam);
        lblRam.setBounds(290, 380, 190, 100);

        lblHD.setFont(new java.awt.Font("Fira Code SemiBold", 1, 10)); // NOI18N
        lblHD.setForeground(new java.awt.Color(0, 0, 0));
        lblHD.setText("aguardando inicialização...");
        lblHD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblHD);
        lblHD.setBounds(530, 380, 190, 110);

        lblIniciar.setForeground(new java.awt.Color(0, 0, 0));
        lblIniciar.setText("Iniciar");
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarMouseClicked(evt);
            }
        });
        getContentPane().add(lblIniciar);
        lblIniciar.setBounds(440, 590, 70, 70);

        lblSistema.setFont(new java.awt.Font("Fira Code SemiBold", 1, 12)); // NOI18N
        lblSistema.setForeground(new java.awt.Color(0, 0, 0));
        lblSistema.setText("aguardando inicialização...");
        lblSistema.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblSistema);
        lblSistema.setBounds(770, 380, 190, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ellen.m.almeida\\OneDrive - Accenture\\Documents\\LP\\POO\\tela-procrastinator\\src\\main\\java\\Imagem\\tela-Software.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1007, 713);

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

    private void lblIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseClicked
                                        
//        ImageIcon parteUm = new ImageIcon("C:\\Users\\ellen.m.almeida\\OneDrive - Accenture\\Documents\\LP\\POO\\tela-procrastinator\\src\\main\\java\\Imagem\\carregando.png");
//        ImageIcon parteDois = new ImageIcon("C:\\Users\\ellen.m.almeida\\OneDrive - Accenture\\Documents\\LP\\POO\\tela-procrastinator\\src\\main\\java\\Imagem\\check.png");
//        lblIniciar.setIcon(parteUm);
//        Timer timer = new Timer();
//        TimerTask tarefa = new TimerTask() {
//            @Override
//            public void run() {
//                lblIniciar.setIcon(parteDois);
//            }
//        };
//        timer.scheduleAtFixedRate(tarefa, 5000, 5000);

    
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

    }//GEN-LAST:event_lblIniciarMouseClicked

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
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSistema;
    // End of variables declaration//GEN-END:variables
}
