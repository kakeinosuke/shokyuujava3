
public class practiceCarMove extends MyFrame{
public void run() {
	practiceCar[] cars = new practiceCar[5];
	cars[0] = new practiceCar(50, 30, 10, 0);
	cars[1] = new practiceCar(60, 80, 11, 0);
	cars[2] = new practiceCar(70, 130, 12, 0);
	cars[3]=new practiceCar(80,180,13,0);
	cars[4]=new practiceCar(90,230,14,0);
	for (int i = 0; i < 30; i++) {
		clear();
		for (int j = 0; j < cars.length; j++) {
			cars[j].draw(this);
			cars[j].move();
			
		}
		
		sleep(0.1);

	}
}
}
