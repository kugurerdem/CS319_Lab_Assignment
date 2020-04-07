public class Player{

    private String name;
    private int score;

    public Player(String n){
        this.name = n;
        this.score = 0;
    }

    public string getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int s){
        score = s;
    }

    public void addScore(int inc){
        score += inc;
    }

    @Override
    public String toString(){
        return name + " has " + score + " points ";
    }

}