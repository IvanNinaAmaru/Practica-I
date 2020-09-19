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
@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       out.println("</html>"); 
       out.println("<!DOCTYPE html>");
       out.println("");       
       out.println("<title>JSP Page</title>");
       out.println("</head>");
        out.println("<body>"); 


       double n1=0, n2=0, r=0;

       int valor;

       n1= Double.parseDouble(request.getParameter("txtnum1"));

       n2= Double.parseDouble(request.getParameter("txtnum2"));

       valor=Integer.parseInt(request.getParameter("operaciones"));

       if(valor==1){

           r=n1+n2;

           out.print("La suma es :" +r);

       }else if(valor==2){

           r=n1-n2;

           out.print("La resta es :" +r);

       }else if(valor==3){

           r=n1*n2;

           out.print("El producto :" +r);

       }else if(valor==4){

           r=n1/n2;

           out.print("El resto de la división es :" +r);

       }else 

       out.println("</body>");  
       out.println("</html>"); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }
}
