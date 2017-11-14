package graficarVectores;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import graficarVectores.App;

public class Plano extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);

        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

    }

    public void graficarPunto(Graphics g, int x1, int y1) {
        g.drawRect(coord_x(x1), coord_y(y1), 2, 2);
    }

    private int coord_x(int x) {
        int real_x = x + this.getWidth() / 2;
        return real_x;
    }

    private int coord_y(int y) {
        int real_y = -y + this.getHeight() / 2;

        return (real_y);
    }
    
    public void graficarVector(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(coord_x(x1), coord_y(y1), coord_x(x2), coord_y(y2));
    }
}
