package bd_fazenda;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;


public class Vendas {
	private int id;
	private int gta;
	private String datavenda;
	private float valorvenda;
	private int idanimal;
	private int idcomprador;
	
	
	
	
	
	
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
