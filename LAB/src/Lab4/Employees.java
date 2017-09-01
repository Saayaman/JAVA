package Lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employees {

    private ArrayList<Employee> employees;

    public Employees() {
        employees = makeEmployees();
    }


    private ArrayList<Employee> makeEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new HockeyPlayer("Wayne Gretzky", 894));
        employees.add(new HockeyPlayer("Who Ever", 0));
        employees.add(new HockeyPlayer("Brent Gretzky", 1));
        employees.add(new HockeyPlayer("Pablo", 437));
        employees.add(new HockeyPlayer("Jason", 0));


        employees.add(new Professor("Albert Einstein", "Physics"));
        employees.add(new Professor("Alan Turing", "Computer Science"));
        employees.add(new Professor("Richard Feynman", "Physics"));
        employees.add(new Professor("Tim Verners-Lee", "Computer Science"));
        employees.add(new Professor("Kurt Godel", "Logic"));

        employees.add(new Parent("Tiger Woods",1));
        employees.add(new Parent("Super Mom",200));
        employees.add(new Parent("Lazy Larry",20));
        employees.add(new Parent("Ex Hausted",148));
        employees.add(new Parent("Super Dad",167));


        employees.add(new GasStation("Joe Smith", 10));
        employees.add(new GasStation("Tony Balony", 100));
        employees.add(new GasStation("Mary Fairy", 1000));
        employees.add(new GasStation("Benjamin", 101));
        employees.add(new GasStation("Bee See", 1));
        return employees;
    }

    public ArrayList<HockeyPlayer> getHockeyArrayList(){

        ArrayList<HockeyPlayer> arrayHockeyPlayers = new ArrayList<>();
        arrayHockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
        arrayHockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
        arrayHockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
        arrayHockeyPlayers.add(new HockeyPlayer("Pablo", 437));
        arrayHockeyPlayers.add(new HockeyPlayer("Jason", 0));

        return arrayHockeyPlayers;
    }


    public void sortEmployees(){
        ArrayList<HockeyPlayer> hockeyPlayers = getHockeyArrayList();
        Collections.sort(hockeyPlayers);
    }

}
