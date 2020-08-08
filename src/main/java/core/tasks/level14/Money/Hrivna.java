package core.tasks.level14.Money;

public class Hrivna extends Money {
    public Hrivna(double amoun){
        super(amoun);
    }
    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}