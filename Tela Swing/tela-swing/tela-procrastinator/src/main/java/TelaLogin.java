
import controller.EquipamentoDAO;
import controller.FuncionarioDAO;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();
        lblEntrar = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblEsqueceuSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtEmail.setBackground(new java.awt.Color(196, 196, 196));
        txtEmail.setBorder(null);

        fieldSenha.setBackground(new java.awt.Color(196, 196, 196));
        fieldSenha.setBorder(null);

        lblEntrar.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(0, 0, 0));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ellen.m.almeida\\OneDrive - Accenture\\Documents\\LP\\POO\\tela-procrastinator\\src\\main\\java\\Imagem\\entrar 2.png")); // NOI18N
        lblEntrar.setText("Entrar");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
        });

        lblFechar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(0, 0, 0));
        lblFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechar.setText("x");
        lblFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("-");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblEsqueceuSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblEsqueceuSenha.setText("Esqueceu Senha");
        lblEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqueceuSenhaMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ellen.m.almeida\\OneDrive - Accenture\\Documents\\LP\\POO\\tela-procrastinator\\src\\main\\java\\Imagem\\tela-Login-1_1.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(lblEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(lblEsqueceuSenha))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin(String login, String senha) {
        return login.equals("admin@admin.com") && senha.equals("admin123");
    }
    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked

          FuncionarioDAO funcionarioDAO = new FuncionarioDAO(); 
          EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
          String login = String.valueOf(txtEmail.getText()); 
          String senha = String.valueOf(fieldSenha.getPassword()); 
          funcionarioDAO.loginBanco(login, senha);
          
          if (funcionarioDAO.verificaLogin() == true){ 
               this.dispose();
               new TelaOpcao().setVisible(true);
              
               equipamentoDAO.enviarEquipamento(funcionarioDAO.getFkFuncionario());
          }
          else {
            JOptionPane.showInternalMessageDialog(null, "Login ou senha incorretos.");
       }
          
          
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuSenhaMouseClicked

        String[] args;
        try {
            URI link = new URI("https://github.com/Grupo-1-adsa/Grupo-1-adsa");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }//GEN-LAST:event_lblEsqueceuSenhaMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblEsqueceuSenha;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
