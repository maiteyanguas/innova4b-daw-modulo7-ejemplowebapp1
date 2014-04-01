package innova4b.ejemplowebapp1.Controller;

import innova4b.ejemplowebapp1.Repository.EmpleadoRepo;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Empleado")
public class EmpleadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		EmpleadoRepo empleadoRepo = new EmpleadoRepo((Connection) getServletContext().getAttribute("DBConnection"));
		
		request.setAttribute("empleados", empleadoRepo.getEmpleados());
		getServletContext().getRequestDispatcher("/empleado.jsp").forward(request, response);
	}	

}
