package studentSystem.servlet;

import studentSystem.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/stuadd")
public class add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取对应表单内容
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String score = req.getParameter("score");
        // 封装学生对象
        Student stu = new Student(username, Integer.parseInt(age), Integer.parseInt(score));
        // 保存到本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Java\\code\\StudentServlet\\stu.txt",true));
        bw.write(stu.getUsername() + "," + stu.getAge() + "," + stu.getScore());
        bw.newLine();
        bw.close();

        // 响应给浏览器
        // resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.println("添加成功，将在3秒后跳转到首页!!!");
        resp.setHeader("Refresh","3;url=/index.jsp");
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
