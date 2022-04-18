public class thirsTask {
}
class Mamonth{
    Mood mood = Mood.CALM;

    public void Detectthreat(){
        mood = Mood.PANIC;
    }

    public void sleep(){
        mood = Mood.SLEEPY;
    }

    public void doNothing(){
        mood = Mood.CALM;
    }

    public void takeDamage(){
        mood = Mood.ANGRY;
    }
}
enum Mood{
    CALM, ANGRY, PANIC, SLEEPY
}