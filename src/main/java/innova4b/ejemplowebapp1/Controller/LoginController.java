package innova4b.ejemplowebapp1.Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/Login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");
		if (!usuario.equals(password)){			
			//resp.sendError(resp.SC_UNAUTHORIZED); //401
			//resp.sendError(resp.SC_INTERNAL_SERVER_ERROR); //500
			req.setAttribute("error", true);
			getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);			
		}else{
			HttpSession session = req.getSession(true);			
			session.setAttribute("usuario", usuario);
			session.setMaxInactiveInterval(30*60);
			Cookie cookie = new Cookie("prueba", "Cookie de prueba");
			cookie.setMaxAge(30*60);
			resp.addCookie(cookie);
			resp.sendRedirect("/home.jsp");
		}
	}

}
