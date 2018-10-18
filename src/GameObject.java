import java.awt.Graphics;

public abstract class GameObject {
	
	private int x,y;
	
	public GameObject() {
		x=y=0;
		
	}
	
	public abstract void movement();
	public void timeShift() {
		
	}
	public abstract void drawComponent(Graphics g);
	public abstract void die();

}
