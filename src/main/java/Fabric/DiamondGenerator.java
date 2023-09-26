package Fabric;

import Interface.iGameItem;
import Product.DiamondAward;

public class DiamondGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new DiamondAward();
    }
}
