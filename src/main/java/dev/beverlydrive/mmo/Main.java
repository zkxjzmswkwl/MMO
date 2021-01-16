package dev.beverlydrive.mmo;


// 카터
// 1.9.2021

public class Main implements Runnable
{
    public Thread mmo;
    public static Window window;

    private void start()
    {
        mmo = new Thread(this, "MMO");
        mmo.start();
    }

    private static void initialization()
    {
        System.out.println("Initializing game");
        window = new Window(1920, 1080, "MMO");
        window.spawn();
    }

    private void update()
    {

    }

    private void render()
    {

    }

    @Override
    public void run()
    {
        initialization();
        while (true)
        {
            update();
            render();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}