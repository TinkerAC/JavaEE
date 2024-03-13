import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet") public class HelloServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String pageNo=req.getParameter("pageNo");
        String queryString =req.getParameter("pageSize");
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


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request, response);
    }
}