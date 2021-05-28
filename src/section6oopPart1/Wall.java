package section6oopPart1;

public class Wall {
    private double width;
    private double height;

    //2 constructors:
    public Wall() {
        System.out.println("Constructor Called");
    }

    public Wall(double width, double height) {
        if( width < 0.0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0.0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0.0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }


}
