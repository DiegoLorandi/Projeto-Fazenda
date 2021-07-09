package bd_fazenda;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Compradores {
	private int id;
	private String nome;
	private String cnpj;
	private String telefone;
	private String uf;
	private String cidade;
	private String endereco;
	
	public void InsereComprador() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "INSERT INTO compradores(id,nome,CNPJ,Telefone,UF,cidade,endereco) VALUES(" + getId() + ",'" + getNome() + "','" + getCnpj() + "','" + getTelefone() + "','" + getUf() + "','"+ getCidade() +"','"+ getEndereco() +"')";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Comprador incluído");
    }
	
	public void ConsultarCompradorID(String id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Compradores WHERE id = " + id;
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setNome(resultado.getString("Nome"));
        setCnpj(resultado.getString("CNPJ"));
        setTelefone(resultado.getString("Telefone"));
        setUf(resultado.getString("UF"));
        setCidade(resultado.getString("Cidade"));
        setEndereco(resultado.getString("Endereço"));

        resultado.close();
        comando.close();
        conn.close();
    }
	
	public void ConsultarCompradorCidade(String Cidade) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Compradores WHERE Cidade LIKE ="+Cidade;
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("id") + 
                    " " + resultado.getString("Nome") + 
                    " " + resultado.getString("CNPJ") + 
                    " " + resultado.getString("Telefone") +
                    " " + resultado.getString("UF") + 
                    " " + resultado.getString("Cidade") + 
                    " " + resultado.getString("Endereco"));
        }
        String lista = "";
        int j;
        for(j=0; j<registros.size(); j++) {
            lista = lista + registros.get(j) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        resultado.close();
        comando.close();
        conn.close();
    }
	
	public void RemoveComprador(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "DELETE FROM Compradores WHERE id = " + getId();
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir esse comprador ?", "Cuidado", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Comprador Removido");
        }
        else
        	JOptionPane.showMessageDialog(null,"Remoção Cancelada");
    }
	
	public void AlteraComprador(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
   
        String Sql = "UPDATE Compradores SET nome = '" + getNome() + "',"
        		+ " CNPJ = '"+ getCnpj() +"',"
        		+ " Telefone = '"+ getTelefone() +"',"
        		+ " UF = '"+ getUf() +"',"
        		+ " Cidade = '"+ getCidade() +"',"
        		+ " Endereco = '"+ getEndereco() +"',"
        		+ " WHERE id = '"+ id +"'   ";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Dados do Comprador atualizados");
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
