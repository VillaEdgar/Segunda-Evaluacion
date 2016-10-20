/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class ServletCuadrado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            
            String calcu=request.getParameter("calculo");
            int lado=Integer.parseInt(request.getParameter("lado"));
            
            if(calcu.equals("area")){
                out.append("El area del cuadrado es igual a:"+(lado*lado));
            }else{
                if(calcu.equals("perimetro")){
                    out.append("El perimetro del cuadrado es igual a:"+(lado*4));
                }else{
                    out.append("ERROR!");
                }
            }
        }
    }
}
