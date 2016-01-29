package nangelimalil.rogi.initLab02;

/**
 * Created by rogi on 1/28/16.
 */


enum RainBowColor {
    VIOLETE, INDIGO, BLUE, GREEN, YELLOW, ORANGE, RED
}

public class InitializationLab02 {
    // below is the code that consumes above classes:
    //public class InitializationLab2 {
        public static void main(String[] args) {
            ThingContainer tc = new ThingContainer(3);

            tc.printThings();

            ColorfulThing cft = new ColorfulThing(RainBowColor.RED);
            tc.add(cft);
            tc.printThings();

            cft = new ColorfulThing(RainBowColor.GREEN);
            tc.add(cft);

            cft = new ColorfulThing(RainBowColor.YELLOW);
            tc.add(cft);
            tc.printThings();

            cft = new ColorfulThing(RainBowColor.BLUE);
            tc.add(cft);
            tc.printThings();

            cft = tc.pop();
            System.out.println("Popped color: " + cft.getColor());

            cft = new ColorfulThing(RainBowColor.BLUE);
            tc.add(cft);
            tc.printThings();

            cft = tc.pop();
            System.out.println("Popped color: " + cft.getColor());

            cft = tc.pop();
            System.out.println("Popped color: " + cft.getColor());

            cft = tc.pop();
            System.out.println("Popped color: " + cft.getColor());

            tc.printThings();

            tc.add(new ColorfulThing(RainBowColor.BLUE));
            tc.add(new ColorfulThing(RainBowColor.GREEN));
            tc.add(new ColorfulThing(RainBowColor.INDIGO));
            tc.add(new ColorfulThing(RainBowColor.ORANGE));
            tc.printThings();

            tc.add(new ColorfulThing(RainBowColor.RED));
            tc.add(new ColorfulThing(RainBowColor.VIOLETE));
            tc.add(new ColorfulThing(RainBowColor.YELLOW));
            tc.add(new ColorfulThing(RainBowColor.BLUE));
            tc.add(new ColorfulThing(RainBowColor.GREEN));
            tc.add(new ColorfulThing(RainBowColor.INDIGO));
            tc.printThings();

            //cft = tc.remove(RainBowColor.BLUE);
            cft = tc.remove(new ColorfulThing(RainBowColor.BLUE));
            System.out.println("Removed color: " + cft.getColor());

            //cft = tc.remove(RainBowColor.INDIGO);
            cft = tc.remove(new ColorfulThing(RainBowColor.INDIGO));
            System.out.println("Removed color: " + cft.getColor());

            cft = tc.remove(new ColorfulThing(RainBowColor.GREEN));
            System.out.println("Removed color: " + cft.getColor());

        }

    }

