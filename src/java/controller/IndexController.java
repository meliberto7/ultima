
package controller;

import global.GlobalUser;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Usuarios;
import model.dao.UsuarioDAO;


@WebServlet(name = "IndexController", urlPatterns = {"/IndexController", "/home", "/cadastro", "/login", "/logar", "/cadastrar"})
public class IndexController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            
            case "/home":
                
                request.getRequestDispatcher("WEB-INF/jsp/home.jsp").forward(request, response);
                
                break;
            
            case "/cadastro":
                
                request.getRequestDispatcher("WEB-INF/jsp/cadastro.jsp").forward(request, response);
                
                break;
            
            case "/login":
                
                request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
                
                break;
            
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String paginaAtual = request.getServletPath();
        
        switch(paginaAtual) {
            
            case "/home":
                
                request.getRequestDispatcher("WEB-INF/jsp/home.jsp").forward(request, response);
                
                break;
                
            case "/logar":
                
                valiLogar(request, response);
                
                break;
                
            case "/cadastrar":
                
                cadastrar(request, response);
                
                break;
            
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private void valiLogar(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String nextPage = "";
            
            UsuarioDAO dao = new UsuarioDAO();
            
            if (dao.logar(email, senha)) {
                
                nextPage = "home.jsp";
                
            } else {
                
                nextPage = "login.jsp";
                
            }
            
            request.getRequestDispatcher("WEB-INF/jsp/" + nextPage).forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void cadastrar(HttpServletRequest request, HttpServletResponse response) {
        
        try{
            
           UsuarioDAO dao = new UsuarioDAO();
           Usuarios usuario = new Usuarios();
           
           usuario.setNome(request.getParameter("nome"));
           usuario.setEmail(request.getParameter("email"));
           usuario.setSenha(request.getParameter("senha"));
           
           dao.cadastrar(usuario);
           
           request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
