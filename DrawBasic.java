import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = 100;
		int height = 80;
		int x[] = {20, 120, 20, 120};
		int y[] = {120, 200, 200, 120};
		int x2[] = {740, 840, 740, 840};
		int y2[] = {20, 100, 100, 20};
		int x3[] = {740, 840, 740, 840};
		int y3[] = {120, 200, 200, 120};
		String[] label = {"drawLine()", "drawRect()", "draw3DRect()", "drawRoundRect()", "drawOval()", "drawArc()", "drawPolygon()",
						"drawPolyline()", "fillRect()", "fill3DRect()", "fillRoundRect()", "fillOval()", "fillArc()", "fillPolygon"};
		for(int i=0; i<label.length; i++) {
			if(i<7)
				g.drawString(label[i], 20+i*120, 115);
			else 
				g.drawString(label[i], 20+(i-7)*120, 215);
			
		}
		g.drawLine(20, 100, 120, 20);
		g.drawPolyline(x, y, 4);
		g.drawRect(140, 20, width, height);
		g.fillRect(140, 120, width, height);
		g.setColor(Color.LIGHT_GRAY);
		g.draw3DRect(260, 20, width, height, true);
		g.fill3DRect(260, 120, width, height, true);
		g.setColor(Color.BLACK);
		g.drawRoundRect(380, 20, width, height, 10, 10);
		g.fillRoundRect(380, 120, width, height, 10, 10);
		g.drawOval(500, 20, width, height);
		g.fillOval(500, 120, width, height);
		g.drawArc(620, 20, width, height, 80, 140);
		g.fillArc(620, 120, width, height, 80, 140);
		g.drawPolygon(x2, y2, 4);
		g.fillPolygon(x3, y3, 4);
	}
}
public class DrawBasic extends JFrame{
	public DrawBasic() {
		this.setSize(880, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("기본도형그리기");
		add(new MyPanel());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		DrawBasic d = new DrawBasic();
	}
}
