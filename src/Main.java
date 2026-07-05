import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Set the Turtle window's canvas size
        Turtle.setCanvasSize(600, 600);

        // Change the background color to black to represent the sky
        Turtle.bgcolor(Color.BLACK);

        // Create a new turtle instance to draw
        Turtle t = new Turtle();

        // Set animation speed
        t.speed(5);

        // July Theme: Drawing a bright, glowing Sun to represent the hot summer weather of July
        t.penColor(Color.YELLOW);
        t.width(2);

        // Use a loop to efficiently draw the multi-angled sun shape
        for (int i = 0; i < 36; i++) {
            t.forward(150);
            t.right(170); // Sharp turn to create the sunburst rays
        }
    }
}