import java.awt.Graphics;

public class Hero extends GameObject{
	
	private static int CAP_LIVES = 5;
	private int lives;
	private int curScore;
	
	public Hero() {
		lives = CAP_LIVES;
		curScore = 0;
	}

	@Override
	public void movement() {
		// TODO Auto-generated method stub
		
		this.jump();
		
	}
	
	private void jump() {
		
	}

	@Override
	public void drawComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
	public void timeShift() {
		
	}
	
	public void fireBubble() {
		
	}

}
