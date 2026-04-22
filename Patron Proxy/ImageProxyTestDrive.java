import javax.swing.*;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;

    public static void main(String[] args) throws Exception {
        // Ejecutamos el cliente
        new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        String localImagePath = "covers/prueba.jpg"; 
        
        Icon icon = new ImageProxy(localImagePath);
        imageComponent = new ImageComponent(icon);
        
        JFrame frame = new JFrame("Visor de Álbumes (Proxy Virtual Local)");
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}