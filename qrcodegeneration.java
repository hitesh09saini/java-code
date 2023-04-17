import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class qrcodegeneration {
   
    
    public static void main(String[] args) {
        try {
             File file = new File("C:\\Users\\Public\\Pictures\\abc.jpg");
             String contant ="this is my content";

            ByteArrayOutputStream out = QRCode.from(contant).to(ImageType.JPG).stream();

            FileOutputStream fos = new FileOutputStream(file);

            fos.write(out.toByteArray());
            fos.close();
            System.out.println("success");


        } catch (Exception e) {
            
           e.printStackTrace();
        }

    }
}
