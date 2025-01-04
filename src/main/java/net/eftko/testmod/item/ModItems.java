package net.eftko.testmod.item;

import net.eftko.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> sapphire = ITEMS.register("sapphire",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_sapphire = ITEMS.register("raw_sapphire",
            () ->  new Item(new Item.Properties()));

    public static void register(IEventBus EventBus) {
        ITEMS.register(EventBus);
    }
}
