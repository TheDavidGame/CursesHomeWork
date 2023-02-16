package home8;

public class BestCarpenterEver{
    private boolean status;


    public boolean fix(Table table){
        return table instanceof CanFix;
    }

    public boolean fix(Chair chair){
        return chair instanceof CanFix;
    }
}
