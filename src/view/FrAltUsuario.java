package view;

import controller.UsuarioController;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import model.Usuario;
import utils.Utils;

public class FrAltUsuario extends javax.swing.JDialog {

    public int pkusuario;

    public void setPkUsuario(int pkusuario) {

        this.pkusuario = pkusuario;
    }

    public FrAltUsuario(java.awt.Frame parent, boolean modal, int pkusuario) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        setPkUsuario(pkusuario);
        carregarUsuario();
    }

    public void carregarUsuario() {
        UsuarioController controller = new UsuarioController();
        Usuario usuario = controller.buscarPorPk(pkusuario);

        String codigo = String.valueOf(usuario.getPkUsuario());
        txtCodigo.setText(codigo);
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
        txtDataNasc.setText(Utils.converterDateToString(usuario.getDatanasc()));
        chkAtivo.setSelected(usuario.isAtivo());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        chkAtivo = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 29, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8664831_user_icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 55, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Código");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, 200, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Confirmar senha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 200, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Data de Nascimento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 20));

        txtNome.setEditable(false);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, -1));

        txtEmail.setEditable(false);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, -1));

        txtConfirmarSenha.setEditable(false);
        jPanel1.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, -1));

        txtDataNasc.setEditable(false);
        txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, -1));

        chkAtivo.setText("Ativo");
        jPanel1.add(chkAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 501, -1, -1));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_icon.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        txtSenha.setEditable(false);
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Senha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, 20));

        btnAlterar.setText("Alterar senha");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Nome: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 20));

        txtCodigo.setEditable(false);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        URL caminhoImagem = getClass().getResource("/images/autenticacao_icon.png");

        ImageIcon icon = new ImageIcon(caminhoImagem);

        this.setIconImage(icon.getImage());

    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //if (verificarCampos()) {
        //gravar();
        //}
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        if (txtSenha.isEditable() == false) {
            txtSenha.setEditable(true);
            txtConfirmarSenha.setEditable(true);
            txtSenha.setBackground(Color.white);
            txtConfirmarSenha.setBackground(Color.white);
            btnAlterar.setText("Cancelar Alteração");
            
            btnAlterar.setText("Cancelar alteração");
            txtSenha.setText("");
            txtConfirmarSenha.setText("");
        } else {
            txtSenha.setEditable(false);
            txtConfirmarSenha.setEditable(false);
            txtSenha.setBackground(Color.gray);
            txtConfirmarSenha.setText("Alerar senha");
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

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
            java.util.logging.Logger.getLogger(FrAltUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAltUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrAltUsuario dialog = new FrAltUsuario(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
