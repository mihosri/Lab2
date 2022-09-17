/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class ArithmeticCalculatorServlet extends HttpServlet 
{

    
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
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        String message = "---";
        request.setAttribute("message", message);
        
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
            throws ServletException, IOException 
    {
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        String message;
        
        try
        {
            String firststr = request.getParameter("first");
            String secondstr = request.getParameter("second");
            String operation = request.getParameter("operation");

            double first = Double.parseDouble(firststr);
            double second = Double.parseDouble(secondstr);

            double result;
            
           

            switch (operation)
            {
                case "+":{
                    result = first + second;
                     break;
                }

                case "-":{
                    result = first - second;
                     break;
                }

                case "*":{
                    result = first * second;
                     break;
                }

                case "%":{
                    result = first % second;
                     break;
                }

                default:{
                    result = Double.NaN;
                     break;
                }

            }
            

            if(Double.isNaN(result))
            {
                message = "Result is not a number";
            }

            else
            {
                message = String.format(".4f", result);
                //or message = result + "";
            }
        
        }catch(Exception ex)
        {
            message = "invalid";
        }
   
        
        
        
        request.setAttribute("message", message);
        
    }

    
}
