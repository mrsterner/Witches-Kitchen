package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.WKIdentifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class WKCreativeTabs {

    public static final ItemGroup GENERAL_TAB = register("general", new ItemStack(Items.POTION));
    public static final ItemGroup SEED_TAB = register("seed", new ItemStack(WKItems.AMARANTH_SEEDS));

    static ItemGroup register(String name, ItemStack icon) {
        final Identifier id = new WKIdentifier(name);
        final QuiltItemGroup group = QuiltItemGroup.create(id);
        group.setIcon(icon);
        return group;
    }

    // Used to control in which order static constructors are called
    public static void register() {

    }
}
