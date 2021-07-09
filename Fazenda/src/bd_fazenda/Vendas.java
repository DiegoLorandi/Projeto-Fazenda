package bd_fazenda;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Vendas {
	private int id;
	private int gta;
	private String datavenda;
	private float valorvenda;
	private int idanimal;
	private int idcomprador;
	
	public void InsereVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "INSERT INTO Vendas(id,GTA,DataVenda,ValorVenda,id_animal,cidade,endereco) VALUES(" + getId() + ",'" + getGta() + "','" + getDatavenda() + "'," + getValorvenda() + ","+ getIdanimal() +","+ getIdcomprador() +")";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Venda incluída");
    }
	
	public void RemoveVenda(int id) throws SQLException {
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
	
	public void AlteraVenda(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
   
        String Sql = "UPDATE Vendas SET GTA = '" + getGta() + "',"
        		+ " DataVenda = '"+ getDatavenda() +"',"
        		+ " ValorVenda = '"+ getValorvenda() +"',"
        		+ " id_animal = '"+ getIdanimal() +"',"
        		+ " id_comprador = '"+ getIdcomprador() +"',"
        		+ " WHERE id = '"+ id +"'   ";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Dados da Venda atualizados");
    }
	
	public void ConsultarVenda(int id) throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Vendas WHERE id ="+ id;
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("id") + 
                    " " + resultado.getString("GTA") + 
                    " " + resultado.getString("DataVenda") + 
                    " " + resultado.getString("ValorVenda") +
                    " " + resultado.getString("id_animal") + 
                    " " + resultado.getString("id_comprador") ) ; 
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
	
	public void MaiorVenda() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/fazenda";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "SELECT * FROM Vendas WHERE ValorVenda = (SELECT MAX(ValorVenda) FROM Vendas)";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setId(resultado.getInt("Id"));
        setGta(resultado.getInt("GTA"));
        setDatavenda(resultado.getString("DataVenda"));
        setValorvenda(resultado.getInt("ValorVenda"));
        setIdanimal(resultado.getInt("id_animal"));
        setIdcomprador(resultado.getInt("id_comprador"));

        resultado.close();
        comando.close();
        conn.close();
    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGta() {
		return gta;
	}
	public void setGta(int gta) {
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
	public int getIdanimal() {
		return idanimal;
	}
	public void setIdanimal(int idanimal) {
		this.idanimal = idanimal;
	}
	public int getIdcomprador() {
		return idcomprador;
	}
	public void setIdcomprador(int idcomprador) {
		this.idcomprador = idcomprador;
	}

}
