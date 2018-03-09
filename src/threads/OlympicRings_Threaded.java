package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	

	Robot rob = new Robot(400, 400);
	rob.setPenColor(Color.CYAN);
Robot bob = new Robot(580, 400);
Robot biff = new Robot(760, 400);
biff.setPenColor(Color.RED);
Robot spooderman = new Robot(490, 490);
spooderman.setPenColor(Color.YELLOW);
Robot computer = new Robot(670, 490);
computer.setPenColor(Color.GREEN);
new Thread(()-> circoo(rob)).start();
new Thread(()-> circoo(bob)).start();
new Thread(()-> circoo(biff)).start();
new Thread(()-> circoo(spooderman)).start();
new Thread(()-> circoo(computer)).start();
}
static void circoo(Robot r) {
r.setSpeed(10);
	r.penDown();
	for(int i=0; i<360; i++) {
		r.move(1);
		r.turn(1);
	}
}

}

