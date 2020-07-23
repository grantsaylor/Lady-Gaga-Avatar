package part1.game.character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LeftWalkingCharacter implements Character {

    @Override
    public int getWidth() {
        return 30;
    }

    @Override
    public int getHeight() {
        return 60;
    }

    @Override
    public String getName() {
        return "leftwalking";
    }

    @Override
    public Color getColor() {
        return Color.blue;
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("leftwalking.png"));
    }
}
