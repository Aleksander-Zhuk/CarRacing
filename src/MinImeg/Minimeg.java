package MinImeg;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Minimeg {
    public static void main(String[] args) throws IOException {


    File input = new File("src/Car_image/.png");
    BufferedImage image = ImageIO.read(input);
    int newWidth = 100;
    int newHeight = 50;
    BufferedImage scaledImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = scaledImage.createGraphics();
    g.drawImage(image, 0, 0, newWidth, newHeight, null);
    g.dispose();

    // сохранение измененного изображения в файл
    File output = new File("src/MinImeg/0.png");
    ImageIO.write(scaledImage, "png", output);
    }

}
