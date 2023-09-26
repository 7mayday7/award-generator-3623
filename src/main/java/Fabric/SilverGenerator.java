package Fabric;

import Interface.iGameItem;
import Product.GoldAward;
import Product.SilverAward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverAward();
    }
}
