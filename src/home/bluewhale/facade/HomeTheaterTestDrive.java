package home.bluewhale.facade;


public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        //Creating components
        HomeTheaterFacade.Amplifier amp = new HomeTheaterFacade.Amplifier();
        HomeTheaterFacade.Tuner tuner = new HomeTheaterFacade.Tuner();
        HomeTheaterFacade.DvdPlayer dvd = new HomeTheaterFacade.DvdPlayer();
        HomeTheaterFacade.CdPlayer cd = new HomeTheaterFacade.CdPlayer();
        HomeTheaterFacade.Projector projector = new HomeTheaterFacade.Projector();
        HomeTheaterFacade.Screen screen = new HomeTheaterFacade.Screen();
        HomeTheaterFacade.TheaterLights lights = new HomeTheaterFacade.TheaterLights();
        HomeTheaterFacade.PopcornPopper popper = new HomeTheaterFacade.PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
