package ru.specialist;

public class House {
    private Window window;
    private int height;
   private Material wall;

    /* public House() {

     }*/
/*    public House(Window window, int height) {
        //window = new Window();
        //window = new PlasticWindow();
        // window = new WoodFrameWindow();
        this.window = window;
        this.height = height;
    }*/

    public House(Window window) {
        this.window = window;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }
    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void view() {
        window.open();
    }
    public void buildWall(){
        for (int i = 0; i < getHeight(); i++) {
            System.out.printf("Этаж %d. ",i);
        }
    }

}
