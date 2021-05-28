package ru.specialist;

public class House {
    private Window window;
    private int height;

    /* public House() {

     }*/
    public House(Window window, int height) {
        //window = new Window();
        //window = new PlasticWindow();
        // window = new WoodFrameWindow();
        this.window = window;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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



}
