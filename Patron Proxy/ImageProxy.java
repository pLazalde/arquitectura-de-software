import java.awt.*;
import javax.swing.*;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final String imagePath; 
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(String path) {
        imagePath = path;
    }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Cargando portada del disco, por favor espera...", x + 250, y + 190);
            
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(2000); 
                            setImageIcon(new ImageIcon(imagePath, "Album Cover"));
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}