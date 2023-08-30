package net.regygigas.questsofthegods.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public  static final CreativeModeTab QUESTSOFTHEGODS_TAB = new CreativeModeTab("QuestsOfTheGodsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RESTROTOTEM.get());
        }
    };

}
