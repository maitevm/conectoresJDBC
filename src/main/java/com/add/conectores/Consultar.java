package com.add.conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultar {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "Contrase�a21");
			Statement st =con.createStatement();
			
			ResultSet rs =st.executeQuery("select * from tablaex");
			//System.out.println("Prueba commmit");
			//otro comentario
			//otro commentario
			//hiuh
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+ " "+ rs.getDouble(5));
			}
			
			con.close();
		}
		
		catch(SQLException e) {
			
			System.out.println(e);
		}
		

	}

}
