public class Television {
    public static int nextId = 1;
    private static int instanceCount = 0;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;

    private int id;
    private String brand;
    private Integer volume;
    private boolean muted;
    private int savedVolume;
    private DisplayType display = DisplayType.LED;


    // Constructors
    public Television() {}

    public Television(String brand, Integer volume, boolean muted, int savedVolume, DisplayType display) {
        instanceCount++;
        this.id = nextId++;
        this.brand = brand;
        this.volume = volume;
        this.muted = muted;
        this.savedVolume = savedVolume;
        this.display = display;
    }

    // METHODS
    /*
     * Static methods are called from the class itself
     * Non-static methods are called and rely on instances of the class
     *
     * Static methods are created at compile time
     * Non-static methods are created at run time, ergo, they cannot be called within each other
     */
    public static int getInstanceCount(Television tv) {
        boolean isTv1Connected = tv.verifyInternetConnection();
        if(isTv1Connected) {
            System.out.println("Turning on your " + tv.brand + " TV to volume " + tv.volume);
            System.out.println();
        } else {
            System.out.println("Your TV is not connected to the internet, try again later... loooosssseerrrr");
        }
        return instanceCount;
    }

    private boolean verifyInternetConnection() {
        return true;
    }
    public void turnOn() {
        boolean isConnected =  verifyInternetConnection();
        String connection = isConnected ? "TV is connected. " : "TV is not Connected";
        System.out.println("Turning on your " + brand + " TV to volume " + volume + ". " + "Your TV is " + connection);
    }

    void turnOff() {
        System.out.println("Shutting Down...goodbye");
    }

    /*
     * Single use case for mute
     * Every call we just set the opposite of what muted is
     */
    public void mute() {
        setSavedVolume(this.getVolume()); // Set the savedVolume to the current volume
        muted = !isMuted(); // Alternative: muted = isMuted() ? false  : true;
        volume = muted ? MIN_VOLUME : savedVolume; // If muted = true ? volume = MIN_VOLUME : Else, volume = savedVolume


        // If muted is true, Print the first response, else print the second response
        System.out.println(muted ? "TV is muted and the volume is " + this.getVolume() : "TV is unmuted and the volume is " + this.getVolume());
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equals("Samsung")) {
            this.brand = brand;
        } else if (brand.equals("Sony")) {
            this.brand = brand;
        } else if (brand.equals("LG")){
            this.brand = brand;
        } else if (brand.equals("Toshiba")) {
            this.brand = brand;
        }else {
            System.out.println("We don't do those TV's here sir");
        }
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        if(volume > 100 || volume < 0) {
            System.out.println("TV Cannot do that my boi!");
        } else {
            this.volume = volume;
        }
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public int getSavedVolume() {
        return savedVolume;
    }

    public void setSavedVolume(int savedVolume) {
        this.savedVolume = savedVolume;
    }


    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Television{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                ", muted=" + muted +
                ", savedVolume=" + savedVolume +
                ", display=" + display +
                '}';
    }
}
