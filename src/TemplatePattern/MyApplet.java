package TemplatePattern;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet
{
    private String message;

    //init钩子用来进行applet初始化动作,他会在applet一开始被调用一次
    public void init()
    {
        message = "init";
        //通知上层组件重绘该applet
        repaint();
    }

    //stop钩子在用户跳转到别的网页时调用
    public void stop()
    {
        message = "stop";
        //通知上层组件重绘该applet
        repaint();
    }

    public void paint(Graphics graphics)
    {
        graphics.drawString(message, 5, 15);
    }
}
