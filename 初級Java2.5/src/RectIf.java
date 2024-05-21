
public class RectIf extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=10;
		int y=0;
		int z=20;
		int a=20;
		int i;
		for(i=0;i<9;i++) {
				fillRect(x,y,z,a);
			
			x=x+z;
			y=y+a;
			z*=1.3;
			a*=1.3;
			
		}
	}

}
