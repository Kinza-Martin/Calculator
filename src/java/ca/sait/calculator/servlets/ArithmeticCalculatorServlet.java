package ca.sait.calculator.servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kinza Martin
 */
@WebServlet(value = "/arithmetic")
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
       
    
      int num1, num2;
      String result;  
         try{
            if(request.getParameter("first")== ""&& request.getParameter("second")== ""){
                 request.setAttribute("message","Result: ---");
                 
            }
            else if(request.getParameter("first")== "" || request.getParameter("second")== ""){
                request.setAttribute("message","Result: invalid");
            }
            
            else if(request.getParameter("first")!= null && request.getParameter("second")!= null){
           
            num1= Integer.parseInt(request.getParameter("first"));
            num2 = Integer.parseInt(request.getParameter("second"));
            result = request.getParameter("operation");
           
                switch (result) {
                    case "+":
                        request.setAttribute("message","Result: " + (num1+num2) );
                        break;
                    case "-":
                        request.setAttribute("message","Result: " + (num1-num2) );
                        break;
                    case "*":
                        request.setAttribute("message","Result: " + (num1*num2) );
                        break;
                    case "%":
                        request.setAttribute("message","Result: " + (num1/num2) );
                        break;
                    default:
                        break;
                }
   
            }
        
        
        }
        catch (Exception ex){
                 request.setAttribute("message","Result: invalid");
        }

   
   
   

getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}