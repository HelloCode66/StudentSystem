package studentSystem.servlet;

import studentSystem.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
@WebServlet("/stulist")
public class list extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\Java\\code\\StudentServlet\\stu.txt"));
        ArrayList<Student> list = new ArrayList<>();
        String str;
        while((str = br.readLine()) != null){
            String[] split = str.split(",");
            Student stu = new Student(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            list.add(stu);
        }
        req.getSession().setAttribute("students",list);
        resp.sendRedirect("/list.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
