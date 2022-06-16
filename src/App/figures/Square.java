package App.figures;

import App.Shape;

public class Square implements Shape {
    private float height;

    public Square(float height){
        this.height = height;
    }

    @Override
    public float getArea(){
        return height * height;
    }
}
