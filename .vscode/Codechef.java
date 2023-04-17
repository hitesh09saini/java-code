import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Codechef{
	public static void main (String[] args) throws java.lang.Exception
	{
	try {
	    InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
	    String t = br.readLine();
	    
	    for(int i=0; i<Integer.parseInt(t); i++){
	       String n = br.readLine();
	        int counter = 0;
	        
	        for(int j=0; j<n.length(); j++){
	            if(n.charAt(j) == '4'){
	                counter++;
	            }
	        }
	        System.out.println(counter);
	    }
	    
	} catch(Exception e) {
	    return;
	}
	}
}
