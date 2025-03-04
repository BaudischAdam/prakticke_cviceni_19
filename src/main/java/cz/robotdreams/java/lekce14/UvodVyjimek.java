package cz.robotdreams.java.lekce14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UvodVyjimek {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("uvod.txt");
        byte[] buf = new byte[1024];
        int precteno = in.read(buf);
        System.out.println(new String(buf, 0, precteno));
    }
}