package com.abstraction.Problem02.PointInRectangle;

public class Rectangle {
    private Point bottomLeftCorner;
    private Point topRightCorner;

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
        this.bottomLeftCorner = new Point(bottomLeftX, bottomLeftY);
        this.topRightCorner = new Point(topRightX, topRightY);
    }

    public boolean contains(Point point) {
        int pointX = point.getCoordinatesX();
        int pointY = point.getCoordinatesY();

        return pointX >= bottomLeftCorner.getCoordinatesX() && pointY >= bottomLeftCorner.getCoordinatesY() &&
                pointX <= topRightCorner.getCoordinatesX() && pointY <= topRightCorner.getCoordinatesY() ?
                    true:
                    false;
    }
}
