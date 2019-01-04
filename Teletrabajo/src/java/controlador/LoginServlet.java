package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.entidades.*;
import modelo.servicios.EntidadesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Fran
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EntidadesService servicio = ctx.getBean(EntidadesService.class);
        String loginMail = request.getParameter("login");
        String pass = request.getParameter("pass");

        Usuario u = servicio.logearse(loginMail, pass);
        Usuario uM = servicio.logearseMail(loginMail, pass);

        if (u != null || uM != null) {
            if (u == null) {
                u = uM;
            }

            if (servicio.esSuperAdmin(u.getIdUsuario())) {
                response.sendRedirect("prueba.jsp");//JSP SUPER ADMINISTRADOR
            }
            if (u.getClientes().size() > 0) {

//                List<Proyecto> lista = servicio.listarProyectosPorUsuario(u.getIdUsuario());
//                request.getSession().setAttribute("lista", lista);
//                
//                request.getSession().setAttribute("idUsuario", u.getIdUsuario());
//                response.sendRedirect("indexProyectos.jsp");
                response.sendRedirect("indexCliente.jsp");//JSP CLIENTE SUPER sin plomo
            } else {

                response.sendRedirect("index.jsp");
            }
        } else {
            response.sendRedirect("logError.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        EntidadesService servicio = ctx.getBean(EntidadesService.class);
//        //List<Alerta> lista = SQL.todasLasAlertasDeUnUsuario(1);
//        List<Tarea> lista = servicio.listarTareasporId(1);
//        request.getSession().setAttribute("Alerta", lista);
//        response.sendRedirect("Alerta.jsp");
//        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}