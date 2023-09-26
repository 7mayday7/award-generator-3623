package Fabric;

import Interface.iGameItem;
import Product.BronzeAward;

public class BronzeGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new BronzeAward();
    }
}
