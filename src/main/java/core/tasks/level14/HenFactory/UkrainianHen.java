package core.tasks.level14.HenFactory;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 133;
    }

    public   String getDescription(){
        return  super.getDescription() + " Моя страна - "+ Country.UKRAINE +". Я несу " + getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
