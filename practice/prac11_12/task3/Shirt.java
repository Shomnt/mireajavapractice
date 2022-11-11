package practice.prac11_12.task3;

public class Shirt {
    private String index;
    private String model;
    private String color;
    private String size;

    public Shirt(String index, String model, String color, String size){
        this.index = index;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt:" + '\n' +
                "index=" + index + "," + '\n' +
                "model=" + model + "," + '\n' +
                "color=" + color + "," + '\n' +
                "size=" + size;
    }
}
