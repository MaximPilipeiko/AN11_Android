//capitalize
public enum Colors{
    // uppercase
    RED (255, 0, 0),
    GREEN (0, 128, 0),
    BLUE (0, 0, 255);

    // understandable name
    private final int red;
    private final int green;
    private final int blue;

    Colors(final int red, final int green, final int blue) {
        // todo validation
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getColor(){
        return String.format("%s, %s, %s", red, green, blue);
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // todo no setters
}
