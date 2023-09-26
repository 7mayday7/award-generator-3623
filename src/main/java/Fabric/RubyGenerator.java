package Fabric;

import Interface.iGameItem;
import Product.RubyAward;

public class RubyGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new RubyAward();
    }
}
