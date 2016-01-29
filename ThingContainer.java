package nangelimalil.rogi.initLab02;

/**
 * Created by rogi on 1/28/16.
 */
public class ThingContainer {


        ColorfulThing[] clrfulThing;
        int containerSize;
        int currentPosition;

        ThingContainer(int arraySize) {
            clrfulThing = new ColorfulThing[arraySize];
            containerSize = arraySize;
            currentPosition = -1;
            }

        ThingContainer(ColorfulThing[] cThing) {
            containerSize = cThing.length;
            clrfulThing = new ColorfulThing[containerSize];
            for(int i = 0; i < containerSize ; i++)
            {
                clrfulThing[i] = cThing[i];
                }
            currentPosition = -1;
            }

        public void add(ColorfulThing cThing) {
            if (currentPosition < containerSize - 1) {
                this.clrfulThing[++currentPosition] = cThing;
                } else {
                System.out.println("Contanier full " + cThing.getColor() + " could not be added");
                System.out.println();
                }
            }

        public ColorfulThing pop() {

            ColorfulThing cThing = null;

            if (currentPosition >= 0) {
                cThing = this.clrfulThing[currentPosition];
                this.clrfulThing[currentPosition--] = null;
                } else {
                System.out.println("Contanier empty");
                }
            return cThing;
            }

        public ColorfulThing remove(RainBowColor rClr) {

            ColorfulThing cThing = null;

            for (int i = 0; i <= currentPosition; i++) {
                if ((clrfulThing[i] != null) && (clrfulThing[i].getColor().equals(rClr))) {
                    //if ((clrfulThing[i] != null) && (clrfulThing[i].equals(rClr))) {

                    cThing = this.clrfulThing[i];
                    this.clrfulThing[i] = null;
                    break;
                    }
                }
            return cThing;
            }

        public ColorfulThing remove(ColorfulThing cThing) {

            ColorfulThing clrThing = null;

            for (int i = 0; i <= currentPosition; i++) {
                if ((clrfulThing[i] != null) && clrfulThing[i].getColor().equals(cThing.getColor())) {
//            if ((clrfulThing[i] != null) && clrfulThing[i].equals(cThing.getColor())) {
                    clrThing = this.clrfulThing[i];
                    this.clrfulThing[i] = null;
                    break;
                    }
                }
            return clrThing;
            }

        public void printThings() {
            System.out.println("Total color count: " + (currentPosition + 1));
            for (int i = 0; i <= currentPosition; i++) {
                System.out.println(clrfulThing[i].getColor());
                }
            System.out.println();
            }
    }


