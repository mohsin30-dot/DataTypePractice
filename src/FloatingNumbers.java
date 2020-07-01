public class FloatingNumbers {
    public static void main(String[] args) {

        // Lets say a sprinter for 100m ran 9.87s. what is his speed in km/h?
        float distance;
        float time;
        float speed;

        distance = 0.1f;   // 100 meter is 0.1km
        time = 9.87f/3600; // 9.87 is 9.87F & 60 per hour* 60 = 3600
        speed = distance/time;

        System.out.println("the average speed of a sprinter is km/h " + speed);
    }
}
