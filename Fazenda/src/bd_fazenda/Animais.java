package bd_fazenda;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Animais {
	private int id;
	private String codigoanimal;
	private String sexo;
	private String raca;
	private String datanascimento;
	private int pai;
	private int mae;
	private int peso;
	private String situacao;
	
	public void Inserir() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "INSERT INTO animais(id,CodigoAnimal,Sexo,Raca,DataNascimento,Pai,Mae,Peso,Situacao) VALUES(" + getId() + ",'" + getCodigoanimal() + "','" + getSexo() + "','" + getRaca() + "','" + getDatanascimento() + "',"+ getPai() +","+ getMae() +","+ getPeso() +",'" + getSituacao() + "')";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Animal Incluído");
    }
	
	public void Alterar(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
   
        String Sql = "UPDATE animais SET CodigoAnimal = '" + getCodigoanimal() + "',"
        		+ " Sexo = '"+ getSexo() +"',"
        		+ " Raca = '"+ getRaca() +"',"
        		+ " DataNascimento = '"+ getDatanascimento() +"',"
        		+ " Pai = '"+ getPai() +"',"
        		+ " Mae = '"+ getMae() +"',"
        		+ " Peso ='"+ getPeso() +"',"
        		+ " Situacao ='"+ getSituacao() +"'"
        		+ " WHERE id = '"+ id +"'   ";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Dados do Animal atualizados");
    }
	
	public void BuscarAnimalID(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM animais WHERE id = " + id;
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setCodigoanimal(resultado.getString("CodigoAnimal"));
        setSexo(resultado.getString("Sexo"));
        setRaca(resultado.getString("Raca"));
        setDatanascimento(resultado.getString("DataNascimento"));
        setPai(resultado.getInt("Pai"));
        setMae(resultado.getInt("Mae"));
        setPeso(resultado.getInt("Peso"));
        setSituacao(resultado.getString("Situacao"));
        
        resultado.close();
        comando.close();
        conn.close();
    }
	
	public void AtualizarPeso(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
   
        String Sql = "UPDATE animais SET peso = '" + getPeso() + "' WHERE id = '"+id+"'  ";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Peso Atualizado");
    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoanimal() {
		return codigoanimal;
	}
	public void setCodigoanimal(String codigoanimal) {
		this.codigoanimal = codigoanimal;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public int getPai() {
		return pai;
	}
	public void setPai(int pai) {
		this.pai = pai;
	}
	public int getMae() {
		return mae;
	}
	public void setMae(int mae) {
		this.mae = mae;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
