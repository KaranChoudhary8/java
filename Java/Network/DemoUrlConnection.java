import java.io.*;
import java.net.*;
/**
 *
 * @author karan
 */
public class DemoUrlConnection {
    public static void main(String args[]) {
        try{  
            URL url=new URL("https://svvv.edu.in/");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int a;
            while((a=stream.read())!=-1){
            System.out.print((char)a);
            }
        }catch(Exception e){System.out.println(e);} 
    }
}
