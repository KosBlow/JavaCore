package core.tasks.level14.HenFactory;

/*
Написать Фабрику(Factory) по производству кур(Hen):
 */

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();}
            else if (country.equals(Country.RUSSIA)){
                hen = new RussianHen();}
            else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();}
            else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();}
            return hen;
        }
    }

}
