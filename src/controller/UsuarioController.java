package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioController {

    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * from TBUSUARIO "
                + " WHERE email = ? and senha = ? "
                + " and ativo = true";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, email);
            comando.setString(2, senha);

            resultado = comando.executeQuery();

            if (resultado.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return false;
    }

    public boolean inserirUsuario(Usuario usu) {

        String sql = "INSERT INTO TBUSUARIO(nome, email, senha, datanasc, ativo) "
                + " VALUES (?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, usu.getNome());
            comando.setString(2, usu.getEmail());
            comando.setString(3, usu.getSenha());
            comando.setDate(4, new java.sql.Date(usu.getDatanasc().getTime()));
            comando.setBoolean(5, usu.isAtivo());

            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao();

        }
        return false;

    }

    
    public Usuario buscarPorPk(int pkUsuario) {
        String sql = "SELECT * FROM tbusuario "
                + " WHERE PKUSUARIO = ? ";

        GerenciadorConexao gerenciador = new GerenciadorConexao();

        PreparedStatement comando = null;
        ResultSet resultado = null;
        Usuario usu = new Usuario();

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, pkUsuario);

            resultado = comando.executeQuery();

            if (resultado.next()) {

                usu.setPkusuario(resultado.getInt("pkusuario"));
                usu.setNome(resultado.getString("nome"));
                usu.setEmail(resultado.getString("email"));
                usu.setSenha(resultado.getString("senha"));
                usu.setDatanasc(resultado.getDate("datanasc"));
                usu.setAtivo(resultado.getBoolean("ativo"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
            Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return usu;
    }
}
