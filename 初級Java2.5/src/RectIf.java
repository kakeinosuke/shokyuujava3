
public class RectIf extends MyFrame{
	public void run() {
		int x=0;
		int y=0;
		int z=0;
		int a=30;
		int i;
		for(i=0;i<9;i++) {
			
			setColor(x,y,z);
				fillRect(a,50,10,100);
			x+=14;
			y+=14;
			z+=14;
			a+=20;
			
		}
	}

}
