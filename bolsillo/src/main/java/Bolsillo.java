import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bolsillo.Daviplata;
import Bolsillo.Nequi;


public class Bolsillo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        System.out.println(accion);

        switch (accion) {

            case "consultar":
                req.getRequestDispatcher("consultar.jsp").forward(req, resp);
                break;

            case "Consultarr":
                req.getRequestDispatcher("Consultarr.jsp").forward(req, resp);
                break;

            case "Daviplata":
                req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
                break;

            case "Daviplataa":
                req.getRequestDispatcher("Daviplataa.jsp").forward(req, resp);
                break;

            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;

            case "login":
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                break;

            case "menu":
                req.getRequestDispatcher("menu.jsp").forward(req, resp);
                break;

            case "Nequi":
                req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
                break;

            case "Nequii":
                req.getRequestDispatcher("Nequii.jsp").forward(req, resp);
                break;

            case "Recargar":
                req.getRequestDispatcher("Recargar.jsp").forward(req, resp);
                break;

            case "Recargaa":
                req.getRequestDispatcher("Recargaa.jsp").forward(req, resp);
                break;

            case "sacar":
                req.getRequestDispatcher("sacar.jsp").forward(req, resp);
                break;

            case "sacarr":
                req.getRequestDispatcher("sacarr.jsp").forward(req, resp);
                break;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String accion = req.getParameter("accion");
        System.out.println(accion);

        switch (accion) {

            case "Recargar":
                double R = Double.parseDouble(req.getParameter("Recarga"));

                Daviplata Davi = new Daviplata(R);
                req.setAttribute("Recargar", Davi.RecargarSaldo());
                req.getRequestDispatcher("Recargaa.jsp").forward(req, resp);
                break;

            case "Retirar":
                double Re = Double.parseDouble(req.getParameter("Retira"));

                Daviplata Davip = new Daviplata(Re);
                req.setAttribute("Retirar", Davip.RetirarSaldo());
                req.getRequestDispatcher("Sacarr.jsp").forward(req, resp);
                break;

            case "Confirmar":

                Daviplata Cons = new Daviplata();
                req.setAttribute("Consultar", Cons.ConsultarSaldoo());
                Nequi Conss = new Nequi();
                req.setAttribute("Consultar", Conss.ConsultarSaldoo());
                req.getRequestDispatcher("consultar.jsp").forward(req, resp);
                break;

        
            case "login":
            String username = req.getParameter("username");
            String password = req.getParameter("password");
    
            if (username.equals("karen") && password.equals("12")) {
                // Usuario y contraseña válidos
                req.getRequestDispatcher("menu.jsp").forward(req, resp);
            } else {
                // Usuario o contraseña inválidos
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }
            break;

            case "Daviplata":
            String usernamer = req.getParameter("username");
            String passwordr = req.getParameter("password");
    
            if (usernamer.equals("karen") && passwordr.equals("122")) {
                // Usuario y contraseña válidos
                req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
            } else {
                // Usuario o contraseña inválidos
                req.getRequestDispatcher("Daviplataa.jsp").forward(req, resp);
            }
            break;

            case "Nequi":
            String usernamerr = req.getParameter("username");
            String passwordrr = req.getParameter("password");
    
            if (usernamerr.equals("karen") && passwordrr.equals("1223")) {
                // Usuario y contraseña válidos
                req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
            } else {
                // Usuario o contraseña inválidos
                req.getRequestDispatcher("Nequii.jsp").forward(req, resp);
            }
            break;
           
    

}
    }
}