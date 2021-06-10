
/**
 *
 * @author karan
 */
public class JavaUrlDemo {
    public static void main(String args[]) {
        // TODO code application logic here
        try{  
            URL url=new URL("https://svvv.edu.in/");  
            System.out.println("Protocol: "+url.getProtocol());  
            System.out.println("Host Name: "+url.getHost());  
            System.out.println("Port Number: "+url.getPort());  
            System.out.println("File Name: "+url.getFile());  
        }catch(Exception e){System.out.println(e);}  
    }
}
