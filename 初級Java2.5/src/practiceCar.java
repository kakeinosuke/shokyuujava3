
public class practiceCar {
	int x, y, vx, vy;

	public practiceCar(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void draw(MyFrame frame) {
		frame.fillOval(x , y+30, 15, 15);
		frame.fillOval(x+37, y+30, 15, 15);
		
		frame.fillRect(x+12, y , 30, 20);
		frame.fillRect(x-3, y+10 , 60, 20);
	}

	public void move() {
		x += vx;
		y += vy;
	}
}
