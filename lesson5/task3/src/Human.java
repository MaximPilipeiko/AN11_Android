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
    public Human(final IJacket pJacket, final IShoes pShoes, final ITrousers pTrousers, final String pName) {
        jacket = pJacket;
        shoes = pShoes;
        trousers = pTrousers;
        name = pName;
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
