package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test 1
        System.out.println("==== Test Case 1 Output ====");
        int resolusi = 1080;
        TV tv = new TV(resolusi);

        Colokan vga = new VGA(10_000, 100, "Samsung");
        tv.connect(vga);
        System.out.println("TV dengan colokan merk " + vga.getMerk() + " dapat menampilkan gambar " + tv.getResolution() +
                "p");

        // Test 2
        System.out.println("==== Test Case 2 Output ====");
        resolusi = 720;
        tv = new TV(resolusi);

        Colokan hdmi = new HDMI(65_000, 100, "Advan");
        tv.connect(hdmi);
        System.out.println("TV dengan colokan merk " + hdmi.getMerk() + " dapat menampilkan gambar " + tv.getResolution() +
                "p");
    }
}
