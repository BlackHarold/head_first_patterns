package home.bluewhale.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }
    //Another methods


    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public static class Amplifier {
        public void on() {
            System.out.println(this.getClass().getSimpleName());
        }

        public void setDvd(DvdPlayer dvd) {
            System.out.println(this.getClass().getSimpleName());
        }

        public void setSurroundSound() {
            System.out.println(this.getClass().getSimpleName());
        }

        public void setVolume(int i) {
            System.out.println(this.getClass().getSimpleName());
        }

        public void off() {
            System.out.println(this.getClass().getSimpleName());
        }
    }

    public static class Tuner {
    }

    public static class DvdPlayer {
        public void on() {
            System.out.println(this.getClass().getSimpleName());
        }

        public void play(String movie) {
            System.out.println(this.getClass().getSimpleName());
        }

        public void stop() {
            System.out.println(this.getClass().getSimpleName());
        }

        public void eject() {
        }

        public void off() {
        }
    }

    public static class CdPlayer {
    }

    public static class Projector {
        public void on() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void wideScreenMode() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void off() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }
    }

    public static class TheaterLights {
        public void dim(int i) {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void on() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }
    }

    public static class Screen {
        public void down() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void up() {
            System.out.println(this.getClass().getSimpleName()+" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }
    }

    public static class PopcornPopper {
        public void on() {
            System.out.println(this.getClass().getSimpleName() +" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void pop() {
            System.out.println(this.getClass().getSimpleName() +" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }

        public void off() {
            System.out.println(this.getClass().getSimpleName() +" method:"+ new Throwable().getStackTrace()[0].getMethodName());
        }
    }
}
