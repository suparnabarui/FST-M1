package activities;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class ActionsBase {
    // Set the pointer input type
    static PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
    
    static PointerInput  pointer= new PointerInput(Kind.TOUCH, "finger");

    // Create the sequence of actions for a swipe
    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(LEFT.asArg()));

        driver.perform(java.util.Collections.singletonList(swipe));
    }
    
 // Create the long press action function
    public static void doLongPress(AppiumDriver driver, Point start) {
        // Create s sequence of actions
        Sequence longPress = new Sequence(pointer, 1)
                .addAction(pointer.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
                .addAction(pointer.createPointerDown(LEFT.asArg()))
                .addAction(new Pause(pointer, Duration.ofMillis(500)))
                .addAction(pointer.createPointerUp(LEFT.asArg()));

        // Perform the actions
        driver.perform(Arrays.asList(longPress));
    }

    // Create the long press action function
    public static void doTap(AppiumDriver driver, Point start) {
        // Create s sequence of actions
        Sequence longPress = new Sequence(pointer, 1)
                .addAction(pointer.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
                .addAction(pointer.createPointerDown(LEFT.asArg()))
                .addAction(new Pause(pointer, Duration.ofMillis(80)))
                .addAction(pointer.createPointerUp(LEFT.asArg()));

        // Perform the actions
        driver.perform(Arrays.asList(longPress));
    }
}