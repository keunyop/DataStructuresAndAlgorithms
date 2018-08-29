package arrays;

public class GameEntry {
    private String name;  // name of the person earning this score
    private int    score; // the score value

    // Constructs a game entry with given parameters 
    public GameEntry(String n, int s) {
        this.name = n;
        this.score = s;
    }

    // Returns the name field
    public String getName() {
        return name;
    }

    // Returns the name field
    public int getScore() {
        return score;
    }

    // Returns a string representation of this entry
    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }

    public static void main(String[] args) {
        GameEntry gameEntry = new GameEntry("Keunyop", 33);
        System.out.println("Name: " + gameEntry.getName());
        System.out.println("Score: " + gameEntry.getScore());
        System.out.println(gameEntry.toString());
    }
}
