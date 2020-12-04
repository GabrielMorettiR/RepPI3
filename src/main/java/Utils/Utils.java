/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
public class Utils {
    public static void Erro(Exception ex, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String msgErro = ex.getMessage();
            request.setAttribute("msgErro", msgErro);

            RequestDispatcher requestDispatcher = request
                    .getRequestDispatcher("/Protegido/erro.jsp");
            requestDispatcher.forward(request, response);
    }
    
    public static void Sucesso(HttpServletResponse response) throws ServletException, IOException{
        response.sendRedirect("Protegido/sucesso.jsp");
    }
    
    public static void Qtd(HttpServletResponse response) throws ServletException, IOException{
        response.sendRedirect("Protegido/quantidade.jsp");
    }
}
