import java.io.File;
import java.io.IOException;
import java.lang.Math; 

public class SierpinskiTriangle {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        int[] pointA = new int[] {400 ,0};
        int[] pointB = new int[] {0, 800};
        int[] pointC = new int[] {800,800};
        
        int i = -1;
        int rand = 0;
        int[] marker = new int[] {566, 380};
        int movement = 0;
        
        while (i != 0){
            movement = (int)(Math.random() * 3);
            if (movement == 0){
                marker[0] = (int)(marker[0] + pointA[0])/2;
                marker[1] = (int)(marker[1] + pointA[1])/2;
            }
            if (movement == 1){
                marker[0] = (int)(marker[0] + pointB[0])/2;
                marker[1] = (int)(marker[1] + pointB[1])/2;
            }
            if (movement == 2){
                marker[0] = (int)(marker[0] + pointC[0])/2;
                marker[1] = (int)(marker[1] + pointC[1])/2;
            }
            new Rect(marker[0], marker[1]);
            i--;
        }
    }
}