
package ca.sait.calculator.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * determines the next age of the person
 * @author kinza
 */

public class AgeCalculatorServlet extends HttpServlet {

 
      
    

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
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
        
        String ageInput = request.getParameter("age");
       
        
        if(ageInput !=null){
            try {
           int age= Integer.parseInt(ageInput);
        
        age++;
        
        String message = String.format("you will be %d after your next birthday.",age);
        
        request.setAttribute("message", message);
            }catch (Exception ex){
            
        }
        }else{
            
        }
            
            
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       
    }

    

}
