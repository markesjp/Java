/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;
/**
 *
 * @author jhon_
 */
public class Ponto {

    private double x, y;
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        if(x<0)
            this.x = 0;
        else
            this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        if(y<0)
            this.y = 0;
        else
            this.y = y;
    }
    
    public void iniPonto(double x, double y){
        setX(x);
        setY(y);
    }
    
    public double distPonto(Ponto p1, double x, double y){
        return (double) Math.sqrt((double) Math.pow((p1.getX() - x),2) + (double) Math.pow((p1.getY() - y),2));
    }
    
}
