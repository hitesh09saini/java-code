class student{
String name ;
int rollno;

student(){
  System.out.println("constructor called");
}


student(String name , int rollno){
    System.out.println("constructor called");
  this.name =name;
  this.rollno =rollno;
   
 }

public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.rollno);
}

}

public class oops2 extends car {
    public static void main(String[] args) {
        
    
   student st1 = new student();
    st1.name ="hitesh";
   st1.rollno =90;
   st1.printInfo();


   student st2 =new student("hitesh", 60);
    st2.printInfo();


    }
}
