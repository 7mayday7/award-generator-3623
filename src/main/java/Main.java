import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> itemGenerators = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            itemGenerators.add(new BronzeGenerator());
            itemGenerators.add(new DiamondGenerator());
            itemGenerators.add(new PlatinumGenerator());
            itemGenerators.add(new RubyGenerator());
            itemGenerators.add(new SapphireGenerator());
            itemGenerators.add(new SilverGenerator());
        }
        for (int i = 0; i < 3; i++) {
            itemGenerators.add(new GoldGenerator());
        }
        for (int i = 0; i < 1; i++) {
            itemGenerators.add(new GemGenerator());
        }

        Random random = ThreadLocalRandom.current();

        int gemCounter = 0;
        int goldCounter = 0;

        for (int i = 0; i <= 20; i++) {
            ItemGenerator index = itemGenerators.get(random.nextInt(itemGenerators.size()));
            index.openAward();

            if (index instanceof GemGenerator) {
                gemCounter++;
                if (gemCounter >= 1) {
                }
            } else if (index instanceof GoldGenerator) {
                goldCounter++;
                if (goldCounter >= 3) {
                }
            }
        }
    }
}
