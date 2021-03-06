package section6oopPart1;

public class Car {

    //class or member variables  or FIELDS
    //encapsulation...hide internal workings

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

}
