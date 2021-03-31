package crazycatzzz.cat.muds;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MudToolMaterial implements ToolMaterial {

    public static final MudToolMaterial INSTANCE = new MudToolMaterial();

    public int getDurability() {
        return 200;
    };
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    };
    public float getAttackDamage() {
        return 0F;
    };
    public int getMiningLevel() {
        return 2;
    };
    public int getEnchantability() {
        return 70;
    };
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CatMuds.DRIED_MUD_BALL);
    }
}
