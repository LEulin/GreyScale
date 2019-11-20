package greyscale;

/**
 *
 * @author ajocme_sd2082
 */
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GreyScale {

    BufferedImage image;
    int width;
    int height;

    public GreyScale() {

        try {
            File input = new File("C:\\Users\\eulinle_sd2082\\Pictures\\flower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();


            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    
                    if (c.getBlue() < 10 && c.getGreen() < 10 && c.getRed() < 10) {
                        
                    } else {
                        Color white = new Color(255,255,255);
                        image.setRGB(j, i, white.getRGB());
                    }
                }
            }

            File ouptut = new File("C:\\Users\\eulinle_sd2082\\Pictures\\newFlower.png");
            ImageIO.write(image, "png", ouptut);

        } catch (Exception e) {
        }
    }

    static public void main(String args[]) throws Exception {
        GreyScale obj = new GreyScale();
    }
}
