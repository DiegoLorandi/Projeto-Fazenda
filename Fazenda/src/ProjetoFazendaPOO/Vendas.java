package ProjetoFazendaPOO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Vendas {
	private String id;
	private String gta;
	private String datavenda;
	private float valorvenda;
	private String idanimal;
	private String idcomprador;
	
	public void InsereVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "INSERT INTO Vendas(id,GTA,DataVenda,ValorVenda,idAnimal,idComprador) VALUES(" + getId() + ",'" + getGta() + "','" + getDatavenda() + "'," + getValorvenda() + ","+ getIdanimal() +","+ getIdcomprador() +")";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Venda incluída");
    }
	
	public void RemoveVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "DELETE FROM Vendas WHERE id = " + getId();
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir essa venda ?", "Cuidado", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Venda Removida");
        }
        else
        	JOptionPane.showMessageDialog(null,"Remoção Cancelada");
    }
	
	public void AlteraVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
   
        String Sql = "UPDATE Vendas SET GTA = '" + getGta() + "',"
        		+ " DataVenda = '"+ getDatavenda() +"',"
        		+ " ValorVenda = '"+ getValorvenda() +"',"
        		+ " idAnimal = '"+ getIdanimal() +"',"
        		+ " idComprador = '"+ getIdcomprador() +"'"
        		+ " WHERE id = '"+ getId() +"';";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Dados da Venda atualizados");
    }
	
	public void ConsultarVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Vendas WHERE id ="+ getId();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();

        setId(resultado.getString("id")); 
        setGta(resultado.getString("GTA"));
        setDatavenda(resultado.getString("DataVenda"));
        setValorvenda(resultado.getFloat("ValorVenda"));
        setIdanimal(resultado.getString("idAnimal"));
        setIdcomprador(resultado.getString("idComprador")); 
        
        resultado.close();
        comando.close();
        conn.close();
        JOptionPane.showMessageDialog(null, "Consulta com Sucesso!");
    }
		
	public void ConsultarGTA() throws SQLException {
		float valorTotal = 0;
		float valorParcial = 0;
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Vendas WHERE GTA = " + getGta();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setDatavenda(resultado.getString("DataVenda"));
        setIdcomprador(resultado.getString("idComprador"));
        valorTotal = Float.parseFloat(resultado.getString("ValorVenda"));
		while(resultado.next()){
            valorParcial = Float.parseFloat(resultado.getString("ValorVenda"));
            valorTotal = valorTotal + valorParcial;
        }
		setValorvenda(valorTotal);
        JOptionPane.showMessageDialog(null, "Consulta com Sucesso!");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGta() {
		return gta;
	}
	public void setGta(String gta) {
		this.gta = gta;
	}
	public String getDatavenda() {
		return datavenda;
	}
	public void setDatavenda(String datavenda) {
		this.datavenda = datavenda;
	}
	public float getValorvenda() {
		return valorvenda;
	}
	public void setValorvenda(float valorvenda) {
		this.valorvenda = valorvenda;
	}
	public String getIdanimal() {
		return idanimal;
	}
	public void setIdanimal(String idanimal) {
		this.idanimal = idanimal;
	}
	public String getIdcomprador() {
		return idcomprador;
	}
	public void setIdcomprador(String idcomprador) {
		this.idcomprador = idcomprador;
	}
	

}