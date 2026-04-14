public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // 1. Instanciar los componentes del subsistema
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        // 2. Instanciar la Fachada pasándole todos los componentes
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amp, tuner, dvd, cd, projector, screen, lights, popper
        );

        // 3. Usar la interfaz simplificada
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}