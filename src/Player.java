public class Player {
    private String Name;
    private int Age;
    private String Type;
    private int Statistics;

    public Player(){
    }
    public Player(String Name,int Age, String Type, int Statistics) {
        this.Name = Name;
        this.Age = Age;
        this.Type = Type;
        this.Statistics = Statistics;
    }
    public void setPlayerDetails(String Name, int Age, String Type, int Statistics) {
        this.Name = Name;
        this.Age = Age;
        this.Type = Type;
        this.Statistics = Statistics;
    }

    public void getPlayerDetails(){
        System.out.println("");
        System.out.println("Player Name   : "+Name);
        System.out.println("Player Age    : "+Age);
        System.out.println("Player Type   : "+Type);
        System.out.println("Player Statics: "+Statistics);
        System.out.println("");
    }

    public int getStatistics(){
        return Statistics;
    }

    public void getPlayerType(){
        System.out.println("Player Type: "+Type);
    }

    public void getBestPerfomance(){

    }










}
