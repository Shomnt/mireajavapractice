package practice.prac10;

public class Client
{
    Chair chair;

    public void sit() {
        System.out.println("Вы сели на " + chair);
    }

    public void setChair(Chair chair)
    {
        this.chair = chair;
    }
}
