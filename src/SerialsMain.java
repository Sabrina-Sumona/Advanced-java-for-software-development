import java.util.Random;

public class SerialsMain {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            TvSerials serial = getTvSerial();
            System.out.println(serial.getPlot());
            System.out.println();
        }
    }
    public static TvSerials getTvSerial() {
        int num = new Random().nextInt();
        num %= 5 ;
        System.out.println(num);

        switch(num) {
            case 0:
                return new BreakingBad();

            case 1:
                return new WalkingDead();

            case 2:
                return new Dark();

            case 3:
                return new GameOfThrones();

            case 4:
                return new Dexter();

        }
        return new Dexter();
    }
}

// ctrl + B --> goto declaration of the class

// if override then the overridden parts will be shown
// it not then the super class's parts will be shown