package com.company.practice.objects;

public class Circle implements Movable, Resizable {

    private Point2D center; // a
    private Point2D point;//b

    public Circle(Point2D center, Point2D point){
        this.center = center;
        this.point = point;
    }

    public double getRadius(){ // prmoien dwuktornie
        return Math.sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2));
    }
    public double getPeremiter(){
        return 2 * Math.PI * getRadius();
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }


    @Override
    public void resize(double sizeFactor) {
        double x = center.getX() - point.getX();
        double y = center.getY() - point.getY();
        // point.x = center.x - x;
        point.setX(center.getX() - x * sizeFactor);
        point.setY(center.getY() - y * sizeFactor);

    }
    @Override
    public void move(MoveDirection moveDirection) {
//        center.setX(center.getX()+ moveDirection.getX());
//        center.setY(center.getY() + moveDirection.getY());
//        point.setX(point.getX()+ moveDirection.getX());
//        point.setY(point.getX() + moveDirection.getY());
        center.move(moveDirection);
        point.move(moveDirection);

    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    //    public List<Point2D> GetSlicePoints(){
//
//    }
}
