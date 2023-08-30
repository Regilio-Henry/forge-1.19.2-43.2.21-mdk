package net.regygigas.questsofthegods.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.regygigas.questsofthegods.QuestsOfTheGods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, QuestsOfTheGods.MOD_ID);

    public  static  final RegistryObject<Item> RESTROTOTEM = ITEMS.register("restrototem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.QUESTSOFTHEGODS_TAB)));

    public  static  void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
