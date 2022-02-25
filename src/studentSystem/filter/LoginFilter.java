package studentSystem.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(value = {"/add.jsp", "/stulist"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 将请求和响应对象转换为和HTTP相关的HttpServletRequest和HttpServletResponse
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获取会话域对象中的数据
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        // 判断用户名
        if("admin".equals(username) && "abc123".equals(password)){
            filterChain.doFilter(request, response);
        }else{
            // 输出提示信息并设置定时刷新到登录页面
            response.getWriter().write("您还未登录，请登录后再试。(2s后为您跳转到登录页面)");
            response.setHeader("Refresh","2;URL=/login.jsp");
        }
    }
}
