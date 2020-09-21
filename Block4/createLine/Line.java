/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createLine;

/**
 *
 * @author muravyovas
 */
public class Line {
    Point pointStart;
    Point pointEnd;
    Line(Point pointStart, Point pointEnd){
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }
    Line(int x1, int y1, int x2, int y2){
        this.pointStart = new Point(x1, y1);
        this.pointEnd = new Point(x2, y2);
    }
    public String toString(){
        return "Линия от {"
                + pointStart.x
                + ";"
                + pointStart.y
                + "} до {"
                + pointEnd.x
                + ";"
                + pointEnd.y
                + "}";
    }
}