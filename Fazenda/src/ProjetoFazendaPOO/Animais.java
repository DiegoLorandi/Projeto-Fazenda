package ProjetoFazendaPOO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Animais {
	private String id;
	private String codigoanimal;
	private String sexo;
	private String raca;
	private String datanascimento;
	private String pai;
	private String mae;
	private String peso;
	private String situacao;
	private float valorarroba;
	float precoMedioArroba;
	int arroba;
	
	Animais(){
		this.arroba = 30;
	}
	
	public float CalculaValorAnimal() throws SQLException {
		float total;
		String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM animais WHERE id = " + getId();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setPeso(resultado.getString("Peso"));
		total = (Integer.parseInt(getPeso())/arroba) * getValorarroba();
        
        return total;
	}
	
	public void InsereAnimal() throws SQLException {
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
	
	public void AlteraAnimal() throws SQLException {
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
        		+ " WHERE id = '"+ getId() +"';";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Dados do Animal atualizados");
    }
	
	public void ConsultaAnimalID() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM animais WHERE id = " + getId();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setCodigoanimal(resultado.getString("CodigoAnimal"));
        setSexo(resultado.getString("Sexo"));
        setRaca(resultado.getString("Raca"));
        setDatanascimento(resultado.getString("DataNascimento"));
        setPai(resultado.getString("Pai"));
        setMae(resultado.getString("Mae"));
        setPeso(resultado.getString("Peso"));
        setSituacao(resultado.getString("Situacao"));        
        resultado.close();
        comando.close();
        conn.close();
    }
	
	public void RemoveAnimal() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "DELETE FROM animais WHERE id = " + getId();
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir esse Animal ?", "Cuidado", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Animal Removido");
        }
        else
        	JOptionPane.showMessageDialog(null,"Remoção Cancelada");
    }
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public float getValorarroba() {
		return valorarroba;
	}
	public void setValorarroba(float valorarroba) {
		this.valorarroba = valorarroba;
	}
}
