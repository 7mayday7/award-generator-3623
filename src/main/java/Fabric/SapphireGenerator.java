package Fabric;

import Interface.iGameItem;
import Product.SapphireAward;

public class SapphireGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SapphireAward();
    }
}
