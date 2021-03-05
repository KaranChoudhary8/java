import java.awt.*;
class MyFont{
    public static void main (String args[]){
        String[] myFont = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //cmd printing
        int a=0;
        for(a=0;a<myFont.length; a++){
            System.out.println((a+1)+"\t"+myFont[a]);
        }

        System.out.println("\nTotal number font family in device is: "+(a));
    }
}