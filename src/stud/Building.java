/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

/**
 *
 * @author Администратор
 */
public class Building {

    // поля класса
    private String address;
    private int floorsCount;
    private double area;

    // конструктор класса
    public Building(){
        this.address = "default_address";
        this.floorsCount = 1;
        this.area = 0;
    }
    
    public Building(String address) {
        this.address = address;
        this.floorsCount = 1;
        this.area = 0;
    }
    
    public Building(String address, int floorCount, double area) {
        this.address = address;
        setFloorsCount(floorsCount);
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloorsCount(int floorsCount) {
        if (floorsCount < 1) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        this.floorsCount = floorsCount;
    }
    
    
    
    public void print() {
        System.out.printf("Building address: %s%n"
                + "floors = %d%n"
                + "area = %.2f%n", 
                this.address, this.floorsCount, this.area);
    }

    public static void main(String[] args) {
        Building univer = new Building("kremlevskaya ul., d. 35", 0, 400);
        univer.setAddress("kremlevskaya ul., d. 18");
        System.out.println(univer.address);
        System.out.println(univer.getAddress());
        univer.print();
        Building home = new Building("pr pobedy");
        home.print();
//        Point p = new Point();
        ApartmentBuilding ab = new Building("tekhnicheskaya ul", 5, 100);
        ab.print();
    }

}

class Point2 {
    
}