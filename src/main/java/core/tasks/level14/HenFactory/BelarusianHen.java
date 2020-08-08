package core.tasks.level14.HenFactory;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 44;
    }

    public   String getDescription(){
        return  super.getDescription() + " Моя страна - "+ Country.BELARUS +". Я несу " +  getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
