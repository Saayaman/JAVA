package Lab2;

import java.util.Arrays;

public class Province{

    protected String name;
    private String capital;
    private int populationInMillion;

    public static final int DEFAULT_POPULATION_MILLIONA = 4;
    public static final String  DEFAULT_PROVINCE = "British Columbia";
    public static final String  DEFAULT_CAPITAL = "Victoria";


    public String[] provinceNames = {"Ontario", "Quebec", "British Columbia", "Alberta", "Nova Scotia", "NewfoundLand and Labrador", "Saskatchewan", "Manitoba", "New Brunswick", "Prince Edward Island"};
    public String[] capitalNames = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Halifax", "St. John's", "Regina", "Winnipeg", "Fredericton", "Charlettetown"};

    public Province(String provinceName, String provinceCapital, int populationInMillion) {
        if( isValidPopulation(populationInMillion) && isValidProvince (name) && isValidCapitalCity(capital)) {
            this.name = name;
            this.capital = capital;
            this.populationInMillion = populationInMillion;
        } else{
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillion = DEFAULT_POPULATION_MILLIONA;

        }
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationInMillion() {
        return populationInMillion;
    }

    private Boolean isValidPopulation(int population){

        //check if popultion is correct in country class
        return 4 <= population && 38 >= population;
    }

    private Boolean isValidProvince(String province){

        //check if the province exists in Country Class?
        return Arrays.stream(provinceNames).anyMatch(province::equals);
    }

    private Boolean isValidCapitalCity(String capital){

        //check if the province exists in Country Class?

        return Arrays.stream(capitalNames).anyMatch(capital::equals);

    }

    public String getDetail(){
        return "The capital of " + getName() + " is " + getCapital() + ". The populations is " + getPopulationInMillion();
    }

}



