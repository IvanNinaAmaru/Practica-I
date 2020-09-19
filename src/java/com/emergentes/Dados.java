package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Ivan Nina
 */
@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HolaMundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo</h1>");
            int dado1, dado2;
int punto = 0;
Scanner en = new Scanner (System.in);
out.println("Digite LANZAR para tirar los dados");
en.next();            
out.println("Lanzamiento de dados:");
dado1 = (int)(Math.random() * 6) + 1;
dado2 = (int)(Math.random() * 6) + 1;
out.println(dado1);
out.println(dado2);

int suma = dado1 + dado2;

if (suma == 7 || suma == 11){
out.println("Felicidades has ganado");
}
if (suma == 2 || suma == 3 || suma == 12){
out.println("Lo siento has perdido");
}
if (suma !=7 && suma != 11 && suma != 2 && suma != 3 && suma != 12){
punto = suma;
out.println("Su Punto es: "+punto);
out.println("Digite LANZAR para tirar los dados otra vez");
en.next();
dado1 = (int)(Math.random() * 6) + 1;
dado2 = (int)(Math.random() * 6) + 1;
out.println(dado1);
out.println(dado2);
suma = dado1 + dado2;
if (suma == punto){
out.println("Felicidades has ganado");
}
if (suma == 7){
System.out.println("Lo siento has perdido");
}
do {

out.println("Su Punto es: "+punto);
out.println("Digite LANZAR para tirar los dados otra vez");
en.next();
dado1 = (int)(Math.random() * 6) + 1;
dado2 = (int)(Math.random() * 6) + 1;
System.out.println(dado1);
System.out.println(dado2);
suma = dado1 = dado2;
} while (suma != 7 || suma != punto);
if (suma == 7){
System.out.println("Lo siento has perdido");
}
if (suma == punto){
System.out.print("Felicidades has ganado");
            out.println("</body>");
            out.println("</html>");
}
}
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

}
}