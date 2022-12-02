package practice.prac10;

public class Client
{
    Chair chair;

    public void sit() {
        System.out.println("Вы сели на стул");
    }

    public void SetChair(Chair chair)
    {
        this.chair = chair;
    }
}
