import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author karan
 */
public class JavaServlet {

    public static void main(String args[]) {
        String message;

        public void init() throws ServletException{
           message = "Hello World, its Servlet Here";
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

           // Set response content type
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           out.println("<h1>" + message + "</h1>");
        }

        public void destroy() {
           // do nothing.
        }
    }
}