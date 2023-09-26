package Fabric;

import Interface.iGameItem;
import Product.GoldAward;

public class GoldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GoldAward();
    }
}
