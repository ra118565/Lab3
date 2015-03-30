import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
        public static void main(String[] args) {
               
            int width = 0;
            int length = 0;
            int perimeter = 0;
                   
            try
            {
            	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	           
            	//lê o comprimento do retângulo
            	System.out.println("Please enter length of a rectangle");
            	length = Integer.parseInt(br.readLine());
	            
            	//lê a largura do retângulo
            	System.out.println("Please enter width of a rectangle");
            	width = Integer.parseInt(br.readLine());
	            
            	//calcula o perímetro
            	perimeter = 2*(length + width);
            }
   
            catch(NumberFormatException ne)
            {
            	System.out.println("Invalid value" + ne);
            	System.exit(0);
            }
            
            catch(IOException ioe)
            {
	            System.out.println("IO Error :" + ioe);
	            System.exit(0);
            }
           
            System.out.println("Perimeter of a rectangle is " + perimeter);
        }
}