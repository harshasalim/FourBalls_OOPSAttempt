import processing.core.PApplet;


public class FourBalls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    public static int FIRST_BALL_SPEED = 1;
    public static int SECOND_BALL_SPEED = 2;
    public static int THIRD_BALL_SPEED = 3;
    public static int FOURTH_BALL_SPEED = 4;
    public static int BALL_START_X_POSITION = 0;
    public static int FIRST_BALL_START_Y_POSITION = HEIGHT/5;
    public static int SECOND_BALL_START_Y_POSITION = 2*HEIGHT/5;
    public static int THIRD_BALL_START_Y_POSITION = 3*HEIGHT/5;
    public static int FOURTH_BALL_START_Y_POSITION = 4*HEIGHT/5;

    public Ball firstBall = new Ball(this,RADIUS, BALL_START_X_POSITION, FIRST_BALL_START_Y_POSITION, FIRST_BALL_SPEED);
    public Ball secondBall = new Ball(this, RADIUS, BALL_START_X_POSITION, SECOND_BALL_START_Y_POSITION, SECOND_BALL_SPEED);
    public Ball thirdBall = new Ball(this, RADIUS, BALL_START_X_POSITION, THIRD_BALL_START_Y_POSITION, THIRD_BALL_SPEED);
    public Ball fourthBall = new Ball(this, RADIUS, BALL_START_X_POSITION, FOURTH_BALL_START_Y_POSITION, FOURTH_BALL_SPEED);


    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        firstBall.drawBall();
        secondBall.drawBall();
        thirdBall.drawBall();
        fourthBall.drawBall();
    }
}
