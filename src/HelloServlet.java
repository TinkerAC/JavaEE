import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/HelloServlet") public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String pageNo=req.getParameter("pageNum");
        String queryString =req.getParameter("queryString");
        int pageNum=0;
        if(pageNo!=null)
            pageNum=Integer.parseInt(pageNo);


        out.println("<h1>" +"请求的页码是" +pageNo + "</h1>");


        out.println("<h1>" +"请求的查询字符是" +queryString + "</h1>");
        out.flush();
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String userpwd = request.getParameter("password");
        String[] channel =request.getParameterValues("channel");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + userpwd);

        Enumeration<String> eml= request.getParameterNames();
        PrintWriter out = response.getWriter();

        out.println("<head>");
        out.println("<title>Servlet测试</title>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("</head>");

        out.println("<h1>" + "用户注册信息" + "</h1>");
        out.println("<p>" + "用户名：" + username + "</p>");
        out.println("<p>" + "密码：" + userpwd + "</p>");
        for(String c:channel)
        {
            out.println( c + "&nbsp;");
        }
        out.println("所有的请求的参数名称为：");
        while(eml.hasMoreElements())
        {
            out.println(eml.nextElement() + "&nbsp;");
        }
        out.flush();

        out.close();

    }
}