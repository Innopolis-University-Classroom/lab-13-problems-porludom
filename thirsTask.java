public class thirsTask {
}
class Mamonth{
    Mood mood;

    public void react(){
        mood.react();
    }
}
abstract class Mood{
    abstract void react();
}

class Angry extends Mood{

    @Override
    void react() {

    }
}
class Calm extends Mood{
    @Override
    void react() {

    }
}
class Panic extends Mood{
    @Override
    void react() {

    }
}