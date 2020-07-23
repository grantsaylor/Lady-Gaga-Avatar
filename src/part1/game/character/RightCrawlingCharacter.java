package part1.game.character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RightCrawlingCharacter implements Character {

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 20;
    }

    @Override
    public String getName() {
        return "rightcrawling";
    }

    @Override
    public Color getColor() {
        return Color.green;
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("rightcrawling.png"));
    }
}
