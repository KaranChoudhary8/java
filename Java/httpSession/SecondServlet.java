import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author karan
 */
public class SecondServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession(false);
        String n=(String)session.getAttribute("uname");
        out.print("Hello "+n);
        out.close();
        }catch(Exception e){System.out.println(e);}
    }
}