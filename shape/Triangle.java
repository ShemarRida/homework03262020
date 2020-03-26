package shape;

public class Triangle {
    private float height;
    private float base;

    public Triangle() {

    }

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    public float getHeight() {

        return height;
    }

    public void setHeight(float height) {

        this.height = height;
    }

    public float getBase() {

        return base;
    }

    public void setBase(float base) {

        this.base = base;
    }

    public Float calculateArea(float base, float height) {
        return ((base * height) / 2);
    }

    public int calculateArea(int x) {
        return (x * 10);


    }
}