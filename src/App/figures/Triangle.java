package App.figures;

import App.Shape;

public class Triangle implements Shape {
    private float base, height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea(){
        return (base * height) / 2;
    }
}
