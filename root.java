public class root {
    public static void main(String[] args) {
        float a=1;
		float b=4;
		float c=6;
		float D=0;
		float x =0;
		float A = 2*a;
	D = b*b - 4*a*c;
		
		if(D==0){
		System.out.println("the values of both the roots will be same");
        
		x = (-b+D)/A;
        System.out.println("value of real root :"+x);
		}else if(D>0){
		System.out.println("the roots will be unequal real roots");
		x = (-b+D)/A;
		x = (-b-D)/A;
		System.out.println("value of both root :"+x);
		}else {
		System.out.println("The equation has no real root");
		}

        }
    }

