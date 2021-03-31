package crazycatzzz.cat.muds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CatMuds implements ModInitializer {
	//NORMAL ITEMS
	public static final Item DRIED_MUD_BALL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MudFoodComponents.DRIED_MUD_BALL));
	public static final Item MUD_BALL = new Item(new Item.Settings().group(ItemGroup.MISC));

	//DRIED MUD ITEMS
	public static final ToolItem DRIED_MUD_SWORD = new SwordItem(MudToolMaterial.INSTANCE, 5, 4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem DRIED_MUD_SHOVEL = new ShovelItem(MudToolMaterial.INSTANCE, 1, 2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DRIED_MUD_PICKAXE = new MudPickaxeItem(MudToolMaterial.INSTANCE, 3, 3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DRIED_MUD_AXE = new MudAxeItem(MudToolMaterial.INSTANCE, 9, 3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DRIED_MUD_HOE = new MudHoeItem(MudToolMaterial.INSTANCE, 1, 7F, new Item.Settings().group(ItemGroup.TOOLS));

	//MUD BLOCKS
	public static final Block MUD_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).strength(5.0F, 5.0F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));

	@Override
	public void onInitialize() {
		//////////
		//BLOCKS//
		//////////

		//MUD_BLOCK
		Registry.register(Registry.BLOCK, new Identifier("catmuds", "mud_block"), MUD_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("catmuds", "mud_block"), new BlockItem(MUD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))); //To register the block as an item



		/////////
		//ITEMS//
		/////////

		//DRIED_MUD_BALL
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_ball"), DRIED_MUD_BALL);
		//MUD_BALL
		Registry.register(Registry.ITEM, new Identifier("catmuds", "mud_ball"), MUD_BALL);


		
		///////////////////
		//TOOLS & WEAPONS//
		///////////////////

		//DRIED_MUD_SWORD
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_sword"), DRIED_MUD_SWORD);
		//DRIED_MUD_PICKAXE
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_pickaxe"), DRIED_MUD_PICKAXE);
		//DRIED_MUD_AXE
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_axe"), DRIED_MUD_AXE);
		//DRIED_MUD_HOE
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_hoe"), DRIED_MUD_HOE);
		//DRIED_MUD_SHOVEL
		Registry.register(Registry.ITEM, new Identifier("catmuds", "dried_mud_shovel"), DRIED_MUD_SHOVEL);
	}
}
