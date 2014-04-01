package innova4b.ejemplowebapp1.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import innova4b.ejemplowebapp1.Domain.*;

public class EmpleadoRepo {
	Connection connection;
	
	public EmpleadoRepo(Connection connection){
		this.connection = connection;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from empleado");				
			while (rs.next()){
				Empleado empleado = new Empleado();	
				empleado.setNombre(rs.getString("nombre"));
				empleado.setApellido(rs.getString("apellido"));
				empleados.add(empleado);
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return empleados;
	}

}
