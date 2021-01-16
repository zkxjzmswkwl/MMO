package dev.beverlydrive.mmo;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {

    private int width, height;
    private String title;
    private long window;

    public Window(int width, int height, String title)
    {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void spawn()
    {
        if (!GLFW.glfwInit())
        {
            System.err.println("GLFW wasn't initialized.");
            return;
        }

        window = GLFW.glfwCreateWindow(width, height, title, 0, 0);
        if (window == 0)
        {
            System.err.println("Could not spawn game window.");
            return;
        }

        GLFWVidMode windowMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        GLFW.glfwSetWindowPos(window, windowMode.width() - width / 2, windowMode.height() - height / 2);
        GLFW.glfwShowWindow(window);
    }

    public void tick()
    {
        GLFW.glfwPollEvents();
    }

    public void swpBuff()
    {
        GLFW.glfwSwapBuffers(window);
    }
}
