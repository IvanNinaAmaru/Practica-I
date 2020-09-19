package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Ivan Nina
 */
@WebServlet(name = "dolaresBolivianos", urlPatterns = {"/dolaresBolivianos"})
public class dolaresBolivianos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet DolaresBolivianos</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dolares a Bolivianos</h1>");
        out.println("<form action='' method='post'>");
            out.println("Dolares: ");
            out.println("<input type='number' name='dolar' value='0'>");
            out.println("<br>");
            out.println("<h1>Bolivianos a Dolares</h1>");
            out.println("Bolivianos");
            out.println("<input type='number' name='boliviano' value='0'>");
            out.println("<br>");
            out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int dolar = Integer.parseInt(request.getParameter("dolar"));
        int bo = Integer.parseInt(request.getParameter("boliviano"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            if(dolar != 0)
            {
                double dol=dolar*6.9;
                out.println("Dolares en bolivianos es: "+dol+"<br>");
            }
            if(bo != 0)
            {
                double bol=bo/6.9;
                out.println("Bolivianos en dolares es: "+bol+"<br>");
            }
        }
        finally{out.close();}
    }
    }

