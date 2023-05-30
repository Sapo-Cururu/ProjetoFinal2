package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import model.Produto;
import model.ProdutoDAO;
import java.sql.SQLException;

@WebServlet(name = "ProdutoController", urlPatterns = {"/ProdutoController"})
public class ProdutoController extends HttpServlet {
private String name;
private float price;
private int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        this.name = request.getParameter("product_name");
        this.price = parseFloat(request.getParameter("product_price"));
        this.id = parseInt(request.getParameter("product_id"));
        try{
            Produto produto = new Produto(this.name, this.price, this.id);
            ProdutoDAO dao = new ProdutoDAO();
            dao.insertProduto(produto);
            response.sendRedirect("lista.jsp");
            
        }catch(ClassNotFoundException | SQLException erro){
            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ProdutoController</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>erro: " + erro + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
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
        processRequest(request, response);
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
