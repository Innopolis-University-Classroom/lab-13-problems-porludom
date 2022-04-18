import java.util.ArrayList;

public class firsttask {
    public static void main(String[] args) {

    }
}
enum TEAM{
    BARSELONA, MADRID
}
class FIFA{
    ArrayList<Fan> madridFans = new ArrayList<>();
    ArrayList<Fan> barselonaFans = new ArrayList<>();

    public void startGame(TEAM team1, TEAM team2){
        if(team1 == TEAM.BARSELONA || team2 == TEAM.BARSELONA){
            barselonaFans.forEach(x -> x.sendMessage("Barselona game has started"));
        }
        if(team1 == TEAM.MADRID || team2 == TEAM.MADRID){
            madridFans.forEach(x -> x.sendMessage("Madrid game has started"));
        }
    }

    public void addMadridFan(Fan fan){
        madridFans.add(fan);
    }
    public void addBarselonaFan(Fan fan){
        barselonaFans.add(fan);
    }
}

class Fan{
public void sendMessage(String msg){

}
}