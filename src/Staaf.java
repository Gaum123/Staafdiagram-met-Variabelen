import java.applet.*;
import java.awt.*;

public class Staaf extends Applet {
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;

    public void init() {

        gewichtValerie = 80;
        gewichtHans = 40;
        gewichtJeroen = 120;
    }

        public void paint(Graphics g) {

            g.drawLine(50, 50, 50, 300);
            g.drawLine(50, 50, 250, 50);
            g.drawString("0", 40, 50);
            g.drawString("40", 30, 90);
            g.drawString("80", 30, 130);
            g.drawString("120", 25, 170);
            g.drawString("160", 25, 210);
            g.drawString("200", 25, 250);
            g.setColor(Color.blue);
            g.fillRect(50, 50, 50, gewichtValerie);
            g.setColor(Color.green);
            g.fillRect(100, 50, 50, gewichtJeroen);
            g.setColor(Color.red);
            g.fillRect(150, 50, 50, gewichtHans);
            g.setColor(Color.black);
            g.drawString("Valerie", 55, 40);
            g.drawString("Jeroen", 105, 40);
            g.drawString("Hans", 155, 40);
            g.drawString("Kg", 30, 260);
            g.drawString("Kg", 30, 220);
            g.drawString("Kg", 30, 180);
            g.drawString("Kg", 30, 140);
            g.drawString("Kg", 30, 100);
            g.drawString("Kg", 30, 60);
    }
}

