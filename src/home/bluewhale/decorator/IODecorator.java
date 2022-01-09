package home.bluewhale.decorator;

import home.bluewhale.decorator.io.LowerCaseInputStream;

import java.io.*;

public class IODecorator {

    public static void main(String[] args) {
        int c;

        try {

            File file = new File("resources/test.txt");
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(file)
                            )
                    );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
