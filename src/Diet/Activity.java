package Diet;

public class Activity {
    private final double activeVeryLow = 1;
    private final double activeLow = 1.2;
    private final double activeMid = 1.5;
    private final double activeHigh = 1.7;
    private final double activeVeryHigh = 1.9;

    public double getActiveHigh() {

        return activeHigh;
    }
    public double getActiveLow() {

        return activeLow;
    }
    public double getActiveVeryLow() {

        return activeVeryLow;
    }
    public double getActiveMid() {

        return activeMid;
    }
    public double getActiveVeryHigh() {

        return activeVeryHigh;
    }
    public int activeChoiceReduce(){
        return 500 ;
    }
    public int activeChoiceBodyBuild(){
        return 200 ;
    }
}
