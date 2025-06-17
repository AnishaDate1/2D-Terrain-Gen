import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Terrain extends JFrame {
    private static final int width = 600;
    private static final int height = 600;
    private static final int scaile = 5;
    private double[][] terrainGrid;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < terrainGrid.length; x++) {
            for (int y = 0; y < terrainGrid[0].length; y++) {
                //g.setColor(getTerrainColor(terrainGrid[x][y]));
                g.fillRect(x * scaile, y * scaile, scaile, scaile);
            }
        }
    }

}