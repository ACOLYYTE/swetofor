package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SwingTest {
    public static Polygon poly;
    public static Polygon poly2;
    public static Polygon poly3;
    public static Polygon poly4;
    public static Polygon poly5;
    public static Polygon poly6;
    public static Polygon poly21;
    public static Polygon poly22;
    public static Polygon poly23;
    public static Polygon poly24;
    public static Polygon poly25;
    public static Polygon poly26;
    public static JFrame getJFrame() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 350, dimension.height / 2 - 250, 700, 500);
        return frame;
    }

    static class MyComponent extends JComponent {
        protected void paintComponent(Graphics g)   {
        Graphics2D g2 = (Graphics2D)g;
        Shape rectangle = new RoundRectangle2D.Double(300,130, 70,190,15D,17D);
        g2.setBackground(Color.black);
            g2.fill(rectangle);
           int[] Polygon1 = new int[3];
           int[] Polygon2 = new int[3];
           Polygon1[0]=267;
           Polygon1[1]=296;
           Polygon1[2]=295;
           Polygon2[0]=150;
           Polygon2[1]=150;
           Polygon2[2]=187;
            poly = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly);
            Polygon1[0]=267;
            Polygon1[1]=296;
            Polygon1[2]=295;
            Polygon2[0]=210;
            Polygon2[1]=210;
            Polygon2[2]=247;
            poly2 = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly2);
            Polygon1[0]=267;
            Polygon1[1]=296;
            Polygon1[2]=295;
            Polygon2[0]=270;
            Polygon2[1]=270;
            Polygon2[2]=307;
            poly3 = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly3);
            Polygon1[0]=404;
            Polygon1[1]=374;
            Polygon1[2]=374;
            Polygon2[0]=150;
            Polygon2[1]=150;
            Polygon2[2]=187;
            poly4 = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly4);
            Polygon1[0]=404;
            Polygon1[1]=374;
            Polygon1[2]=374;
            Polygon2[0]=210;
            Polygon2[1]=210;
            Polygon2[2]=247;
            poly5 = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly5);
            Polygon1[0]=404;
            Polygon1[1]=374;
            Polygon1[2]=374;
            Polygon2[0]=270;
            Polygon2[1]=270;
            Polygon2[2]=307;
            poly6 = new Polygon(Polygon1,Polygon2,3);
            g2.fill(poly6);


            g2.setColor(Color.black);
            g2.fillArc(313,114,45,25,0,180);
            RoundRectangle2D rect = new RoundRectangle2D.Double(318,325,35,40,10D,17D);
            g2.fill(rect);
            g2.setColor(Color.white);
            g2.fillArc(305,135,59,60,0,180);
            g2.setColor(Color.black);
            Ellipse2D ellipseB = new Ellipse2D.Double(307,140,55,55);
            g2.fill(ellipseB);
            g2.setColor(Color.red);
            Ellipse2D ellipse = new Ellipse2D.Double(311,145,47,47);
            g2.fill(ellipse);


            g2.setColor(Color.white);
            g2.fillArc(305,196,59,60,0,180);
            g2.setColor(Color.black);
            Ellipse2D ellipseBB = new Ellipse2D.Double(307,201,55,55);
            g2.fill(ellipseBB);
            g2.setColor(Color.yellow);
            Ellipse2D ellipse2 = new Ellipse2D.Double(311,205,47,47);
            g2.fill(ellipse2);



            g2.setColor(Color.white);
            g2.fillArc(305,255,59,60,0,180);
            g2.setColor(Color.black);
            Ellipse2D ellipseBBB = new Ellipse2D.Double(307,260,55,55);
            g2.fill(ellipseBBB);
            g2.setColor((Color.green));
            Ellipse2D ellipse3 = new Ellipse2D.Double(311,265,47,47);
            g2.fill(ellipse3);
            g2.setColor(Color.black);
            g2.fillOval(264,148,34,10);
            g2.fillOval(288,148,11,38);
            int polyLine[] = new int[3];
            int polyLine1[] = new int[3];
            polyLine[0]=293;
            polyLine[1]=293;
            polyLine[2]=263;
            polyLine1[0]=150;
            polyLine1[1]=185;
            polyLine1[2]=155;
            poly21 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly21);


            g2.fillOval(264,208,34,10);
            g2.fillOval(288,208,11,38);
            polyLine[0]=293;
            polyLine[1]=293;
            polyLine[2]=263;
            polyLine1[0]=210;
            polyLine1[1]=245;
            polyLine1[2]=215;
            poly22 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly22);

            g2.fillOval(264,268,34,10);
            g2.fillOval(288,268,11,38);
            polyLine[0]=293;
            polyLine[1]=293;
            polyLine[2]=263;
            polyLine1[0]=270;
            polyLine1[1]=305;
            polyLine1[2]=275;
            poly23 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly23);

            g2.fillOval(371,148,34,10);
            g2.fillOval(370,148,11,38);
            polyLine[0]=375;
            polyLine[1]=375;
            polyLine[2]=405;
            polyLine1[0]=150;
            polyLine1[1]=185;
            polyLine1[2]=155;
            poly24 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly24);
            g2.fillOval(371,208,34,10);
            g2.fillOval(370,208,11,38);
            polyLine[0]=375;
            polyLine[1]=375;
            polyLine[2]=405;
            polyLine1[0]=210;
            polyLine1[1]=245;
            polyLine1[2]=215;
            poly25 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly25);
            g2.fillOval(371,268,34,10);
            g2.fillOval(370,268,11,38);
            polyLine[0]=375;
            polyLine[1]=375;
            polyLine[2]=405;
            polyLine1[0]=270;
            polyLine1[1]=305;
            polyLine1[2]=275;
            poly25 = new Polygon(polyLine,polyLine1,3);
            g2.fill(poly25);












        }



    }
}
