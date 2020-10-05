package FacadePattern;

import FacadePattern.component.CdPlayer;
import FacadePattern.component.DvdPlayer;

public class MainTest
{
    public static void main(String[] args)
    {
        //一般来说,外观是直接委派,不需要用户自己创建
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(new CdPlayer(), new DvdPlayer());
        theaterFacade.watchMovie("I am");
        theaterFacade.closeMovie();
    }
}
