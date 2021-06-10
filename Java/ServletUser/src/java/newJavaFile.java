import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author karan
 */
public class newJavaFile {

        public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

          // Set response content type
          response.setContentType("text/html");

          PrintWriter out = response.getWriter();
          String title = "Using GET Method to Read Form Data";
          String docType =
             "<!doctype html>\n";

          out.println(docType +
             "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                   "<h1 align = \"center\">" + title + "</h1>\n" +
                   "<ul>\n" +
                      "  <li><b>First Name</b>: "
                      + request.getParameter("first_name") + "\n" +
                      "  <li><b>Last Name</b>: "
                      + request.getParameter("last_name") + "\n" +
                   "</ul>\n" +
                "</body>" +
             "</html>"
          );
       }
}
