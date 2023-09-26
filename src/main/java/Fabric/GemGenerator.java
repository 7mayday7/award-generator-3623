package Fabric;

import Interface.iGameItem;
import Product.GemAward;

public class GemGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GemAward();
    }
}
