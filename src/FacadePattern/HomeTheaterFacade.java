package FacadePattern;

import FacadePattern.component.CdPlayer;
import FacadePattern.component.DvdPlayer;

public class HomeTheaterFacade
{
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;

    public HomeTheaterFacade(CdPlayer cdPlayer, DvdPlayer dvdPlayer)
    {
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie)
    {
        System.out.println("Ready to play "+movie);
        cdPlayer.on();
        dvdPlayer.on();
    }


    public void closeMovie()
    {
        System.out.println("Ready to close ");
        cdPlayer.off();
        dvdPlayer.off();
    }
}
