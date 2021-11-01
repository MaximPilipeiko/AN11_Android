import jacket.IJacket;
import shoes.IShoes;
import trouses.ITrousers;

// todo no inherit
public class Human {
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;
    private final String name;

    // todo args final too
    public Human(IJacket jacket, IShoes shoes, ITrousers trousers, String name) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
        this.name = name;
    }

    // todo understendable name
    public void getDressed() {
        // todo null check
        if (trousers != null) {
            trousers.putOn();
        }
        if (shoes != null) {
            shoes.putOn();
        }
        if (jacket != null) {
            jacket.putOn();
        }
        System.out.println(name + " totally dressed now.");
    }

    public void undressed() {
        if (jacket != null) {
            jacket.takeOff();
        }
        if (shoes != null) {
            shoes.takeOff();
        }
        if (trousers != null) {
            trousers.takeOff();
        }
        System.out.println(name + " totally undressed now.");
    }
}
