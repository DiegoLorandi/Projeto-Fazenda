package ProjetoFazendaPOO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Calculos extends Animais {
	
	Calculos(){
		this.arroba = 30;
		this.precoMedioArroba = 295;
	}
	
	public String TotalAnimais() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT COUNT(id) FROM Animais WHERE situacao = 'V'";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        String total_animais = (resultado.getString("COUNT(id)"));
        resultado.close();
        comando.close();
        conn.close();
        return total_animais;
    }
	
	public String TotalAnimaisMachos() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT COUNT(id) FROM Animais WHERE situacao = 'V' AND sexo = 'M' ";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        String total_animais = (resultado.getString("COUNT(id)"));
        resultado.close();
        comando.close();
        conn.close();
        return total_animais;
    }
	
	public String TotalAnimaisFemeas() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT COUNT(id) FROM Animais WHERE situacao = 'V' AND sexo = 'F'";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        String total_animais = (resultado.getString("COUNT(id)"));
        resultado.close();
        comando.close();
        conn.close();
        return total_animais;
    }
	
	public String PesoMedio() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT AVG(Peso) FROM Animais WHERE situacao = 'V';";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        String pesomedio = resultado.getString("AVG(Peso)");
        resultado.close();
        comando.close();
        conn.close();
        return pesomedio;
    }
	
	public float ValorRebanho() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT SUM(Peso) FROM Animais WHERE situacao = 'V';";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        float pesototal = Float.parseFloat(resultado.getString("SUM(Peso)"));
        float valortotal = (pesototal / arroba) * precoMedioArroba;
        resultado.close();
        comando.close();
        conn.close();
        return valortotal;
    }
	
	public String LucroTotal() throws SQLException {
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT SUM(ValorVenda) FROM vendas;";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        String valortotal = resultado.getString("SUM(ValorVenda)");
        resultado.close();
        comando.close();
        conn.close();
        return valortotal;
    }
}
