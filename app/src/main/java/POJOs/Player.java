package POJOs;

/**
 * Created by Flavadave on 4/12/2015.
 */
public class Player {
    public String name;
    public int number;
    public String position;
    public int age;
    public int tds;
    public int yards;
    public int seasonsInLeague;

    // Player constructor with required fields
    public Player(String name, int number, String position, int age, int tds, int yards, int seasonsInLeague){

    }
    // Creating 5 players for the array
    Player player1 = new Player("John Elway", 7, "Quarterback", 50, 300, 51475, 16);
    Player player2 = new Player("Peyton Manning", 18, "Quarterback", 39, 530, 69691, 18);
    Player player3 = new Player("C.J. Anderson", 22, "Running Back", 24, 8, 887, 3);
    Player player4 = new Player("Demaryius Thomas", 88, "Wide Receiver", 27, 41, 5317, 6);
    Player player5 = new Player("Emmanuel Sanders", 10, "Wide Reciever", 28, 20, 3434, 6);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTds() {
        return tds;
    }

    public void setTds(int tds) {
        this.tds = tds;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public int getSeasonsInLeague() {
        return seasonsInLeague;
    }

    public void setSeasonsInLeague(int seasonsInLeague) {
        this.seasonsInLeague = seasonsInLeague;
    }
}
