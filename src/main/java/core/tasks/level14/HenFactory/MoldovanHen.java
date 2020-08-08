package core.tasks.level14.HenFactory;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 77;
    }

    public   String getDescription(){
        return  super.getDescription() + " Моя страна - "+ Country.MOLDOVA +". Я несу " +  getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}

