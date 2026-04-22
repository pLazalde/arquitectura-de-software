import java.awt.*;
import javax.swing.*;

class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icon != null) {
            // Calcula las coordenadas para centrar la imagen en la ventana
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            int x = (getWidth() - w) / 2;
            int y = (getHeight() - h) / 2;
            
            icon.paintIcon(this, g, x, y);
        }
    }
}