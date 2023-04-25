class studentln{

    String name;
    int rollno;
    // copy constructor
     studentln(studentln st2){
      this.name = st2.name;
      this.rollno = st2.rollno;
    }
     studentln() {
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

}
public class copyconstructor {
    public static void main(String[] args) {
        studentln st1 = new studentln();
        st1.name = "hitesh";
        st1.rollno = 20;
        studentln st3 = new studentln(st1);
        st3.printInfo();

    }
}
