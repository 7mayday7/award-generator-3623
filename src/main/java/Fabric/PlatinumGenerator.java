package Fabric;

import Interface.iGameItem;
import Product.PlatinumAward;

public class PlatinumGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new PlatinumAward();
    }
}
