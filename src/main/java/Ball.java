import processing.core.PApplet;

public class Ball {
    private PApplet parent;
    private int radius;
    private int startx;
    private int starty;
    private int jumpsPerFrame;

    public Ball(PApplet parent, int radius, int startx, int starty, int jumpsPerFrame){
        this.parent = parent;
        this.radius = radius;
        this.startx = startx;
        this.starty = starty;
        this.jumpsPerFrame = jumpsPerFrame;
    }

    public void drawBall() {
        parent.ellipse(startx, starty, radius, radius);
        startx+=jumpsPerFrame;
    }
}
