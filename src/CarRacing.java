import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CarRacing extends JFrame implements ActionListener {
    private ImageIcon icon01,icon02,icon03,icon04,icon05,icon9;
    private JPanel panel, panel2;
    private int x01 = 10, x02 = 10, x03 = 10, x04 = 10, x05 = 10;
    private int y01 = 10, y02 = 80, y03 = 150, y04 = 220, y05 = 290;
    private Random random;
    private Timer timer;
    private Font font;

    CarRacing () {
        super("Car raicing");
        setSize(1000,380);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        font = new Font("Arial Black",Font.BOLD,20);
        icon01 = new ImageIcon("src/MinImeg/01.png");
        icon02 = new ImageIcon("src/MinImeg/02.png");
        icon03 = new ImageIcon("src/MinImeg/03.png");
        icon04 = new ImageIcon("src/MinImeg/04.png");
        icon05 = new ImageIcon("src/MinImeg/05.png");
        icon9 = new ImageIcon("src/MinImeg/09.png");
        panel = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(icon01.getImage(), x01, y01, null);
                g.drawImage(icon02.getImage(), x02, y02, null);
                g.drawImage(icon03.getImage(), x03, y03, null);
                g.drawImage(icon04.getImage(), x04, y04, null);
                g.drawImage(icon05.getImage(), x05, y05, null);
        }
    };
        panel.setBackground(Color.BLACK);
        getContentPane().add(panel);
        setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer = new Timer(20, this);
        timer.start();
    }
        @Override
        public void actionPerformed(ActionEvent e) {
        x01 = x01 + (int) (Math.random()*4+1);
        if (x01 > getWidth() - icon01.getIconWidth()) {
            timer.stop();
            panel2 = new JPanel(){
                protected void paintComponent(Graphics g) {
                    g.drawImage(icon9.getImage(), 0, 0, null);
                    g.drawImage(icon01.getImage(), 10, 10, null);
                    g.setFont(font);
                    g.setColor(Color.CYAN);
                    g.drawString("Победил № 1", 10, 90);
                }
            };
            panel.setVisible(false);
            panel2.setBackground(Color.BLACK);
            getContentPane().add(panel2);
            panel2.setVisible(true);
        }
        x02 = x02 + (int) (Math.random()*4+1);
            if (x02 > getWidth() - icon01.getIconWidth()) {
                timer.stop();
                panel2 = new JPanel(){
                    protected void paintComponent(Graphics g) {
                        g.drawImage(icon9.getImage(), 0, 0, null);
                        g.drawImage(icon02.getImage(), 10, 10, null);
                        g.setFont(font);
                        g.setColor(Color.ORANGE);
                        g.drawString("Победил № 2", 10, 90);
                    }
                };
                panel.setVisible(false);
                panel2.setBackground(Color.BLACK);
                getContentPane().add(panel2);
                panel2.setVisible(true);
            }
        x03 = x03 + (int) (Math.random()*4+1);
            if (x03 > getWidth() - icon01.getIconWidth()) {
                timer.stop();
                panel2 = new JPanel(){
                    protected void paintComponent(Graphics g) {
                        g.drawImage(icon9.getImage(), 0, 0, null);
                        g.drawImage(icon03.getImage(), 10, 10, null);
                        g.setFont(font);
                        g.setColor(Color.RED);
                        g.drawString("Победил № 3", 10, 90);
                    }
                };
                panel.setVisible(false);
                panel2.setBackground(Color.BLACK);
                getContentPane().add(panel2);
                panel2.setVisible(true);
            }
        x04 = x04 + (int) (Math.random()*4+1);
            if (x04 > getWidth() - icon01.getIconWidth()) {
                timer.stop();
                panel2 = new JPanel(){
                    protected void paintComponent(Graphics g) {
                        g.drawImage(icon9.getImage(), 0, 0, null);
                        g.drawImage(icon04.getImage(), 10, 10, null);
                        g.setFont(font);
                        g.setColor(Color.BLUE);
                        g.drawString("Победил № 4", 10, 90);
                    }
                };
                panel.setVisible(false);
                panel2.setBackground(Color.BLACK);
                getContentPane().add(panel2);
                panel2.setVisible(true);
            }
        x05 = x05 + (int) (Math.random()*4+1);
            if (x05 > getWidth() - icon01.getIconWidth()) {
                timer.stop();
                panel2 = new JPanel(){
                    protected void paintComponent(Graphics g) {
                        g.drawImage(icon9.getImage(), 0, 0, null);
                        g.drawImage(icon05.getImage(), 10, 10, null);
                        g.setFont(font);
                        g.setColor(Color.RED);
                        g.drawString("Победил № 5", 10, 90);
                    }
                };
                panel.setVisible(false);
                panel2.setBackground(Color.BLACK);
                getContentPane().add(panel2);
                panel2.setVisible(true);
            }
        panel.repaint();
        }
    public static void main(String[] args) {
        new CarRacing();
    }
}