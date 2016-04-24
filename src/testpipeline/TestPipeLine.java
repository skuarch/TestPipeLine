package testpipeline;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author skuarch
 */
public class TestPipeLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f = new File("/home/skuarch/Test");
        FileInputStream fis = new FileInputStream(f);
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.write(ch);
        }
    }
}
