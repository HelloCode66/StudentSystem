package studentSystem.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/stulogin")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // resp.setContentType("text/html;charset=UTF-8");
        if(null == username || "".equals(username)){
            resp.getWriter().write("账号不能为空，请重新输入（2s后返回...）");
            resp.setHeader("Refresh","2;URL=/login.jsp");
        }else{
            if("admin".equals(username) && "abc123".equals(password)){
                session.setAttribute("username","admin");
                session.setAttribute("password","abc123");
                resp.sendRedirect("/index.jsp");
            }else{
                resp.getWriter().write("账号密码不正确，请重新输入（2s后返回...）");
                resp.setHeader("Refresh","2;URL=/login.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
