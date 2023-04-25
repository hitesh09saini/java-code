

public class oops {
    public static void main(String[] args) {

      //  this is for pen class  
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color ="red";
        pen2.color ="blue";

        pen1.printcolor();
        pen2.printcolor();

        pen1.type = "wollpen";
        pen2.type = "jelpen";

        pen1.printtype();
        pen2.printtype();

        pen1.write();
        pen2.write();

       System.out.println();
       
      // for car class

        car car1 = new car();
        car car2 = new car();
        car1.color ="red";
        car2.color ="blue";

        car1.modal ="2000";
        car2.modal ="2014";

        car1.type = "safari";
        car2.type ="thar";

        car1.number = "1141";
        car2.number ="5829";

        car2.company ="tata";
        car1.company ="mahindra";

        car1.printcolor();
        car2.printcolor();

        car1.printcompany();
        car2.printcompany();

        car1.printmodal();
        car2.printmodal();

        car1.printnumber();
        car2.printnumber();

        car1.printtype();
        car2.printtype();

        System.out.println();

        // this is for bike class

        bike bike1 = new bike();
        
        bike1.color ="red";
        bike1.modal ="2020";
        bike1.type ="bullet";
        bike1.printcolor();
        bike1.printmodal();
        bike1.printtype();

    }
}
