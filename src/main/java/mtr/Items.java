package mtr;

import mtr.data.RailType;
import mtr.item.*;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

public interface Items {

	Item APG_DOOR = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item APG_GLASS = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item APG_GLASS_END = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item BRUSH = new Item(new Item.Settings().group(ItemGroups.CORE).maxCount(1));
	Item DASHBOARD = new ItemDashboard(new Item.Settings().group(ItemGroups.CORE).maxCount(1));
	Item ESCALATOR = new ItemEscalator(new Item.Settings().group(ItemGroups.RAILWAY_FACILITIES));
	Item PSD_DOOR_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_GLASS_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_GLASS_END_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_DOOR_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item PSD_GLASS_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item PSD_GLASS_END_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item RAIL_CONNECTOR_1_WOODEN = new ItemRailModifier(false, RailType.WOODEN);
	Item RAIL_CONNECTOR_1_WOODEN_ONE_WAY = new ItemRailModifier(true, RailType.WOODEN);
	Item RAIL_CONNECTOR_2_STONE = new ItemRailModifier(false, RailType.STONE);
	Item RAIL_CONNECTOR_2_STONE_ONE_WAY = new ItemRailModifier(true, RailType.STONE);
	Item RAIL_CONNECTOR_3_IRON = new ItemRailModifier(false, RailType.IRON);
	Item RAIL_CONNECTOR_3_IRON_ONE_WAY = new ItemRailModifier(true, RailType.IRON);
	Item RAIL_CONNECTOR_4_OBSIDIAN = new ItemRailModifier(false, RailType.OBSIDIAN);
	Item RAIL_CONNECTOR_4_OBSIDIAN_ONE_WAY = new ItemRailModifier(true, RailType.OBSIDIAN);
	Item RAIL_CONNECTOR_5_BLAZE = new ItemRailModifier(false, RailType.BLAZE);
	Item RAIL_CONNECTOR_5_BLAZE_ONE_WAY = new ItemRailModifier(true, RailType.BLAZE);
	Item RAIL_CONNECTOR_6_DIAMOND = new ItemRailModifier(false, RailType.DIAMOND);
	Item RAIL_CONNECTOR_6_DIAMOND_ONE_WAY = new ItemRailModifier(true, RailType.DIAMOND);
	Item RAIL_CONNECTOR_PLATFORM = new ItemRailModifier(false, RailType.PLATFORM);
	Item RAIL_CONNECTOR_SIDING = new ItemRailModifier(false, RailType.SIDING);
	Item RAIL_CONNECTOR_TURN_BACK = new ItemRailModifier(false, RailType.TURN_BACK);
	Item RAIL_REMOVER = new ItemRailModifier();
	Item SIGNAL_CONNECTOR_WHITE = new ItemSignalModifier(true, DyeColor.WHITE);
	Item SIGNAL_CONNECTOR_ORANGE = new ItemSignalModifier(true, DyeColor.ORANGE);
	Item SIGNAL_CONNECTOR_MAGENTA = new ItemSignalModifier(true, DyeColor.MAGENTA);
	Item SIGNAL_CONNECTOR_LIGHT_BLUE = new ItemSignalModifier(true, DyeColor.LIGHT_BLUE);
	Item SIGNAL_CONNECTOR_YELLOW = new ItemSignalModifier(true, DyeColor.YELLOW);
	Item SIGNAL_CONNECTOR_LIME = new ItemSignalModifier(true, DyeColor.LIME);
	Item SIGNAL_CONNECTOR_PINK = new ItemSignalModifier(true, DyeColor.PINK);
	Item SIGNAL_CONNECTOR_GRAY = new ItemSignalModifier(true, DyeColor.GRAY);
	Item SIGNAL_CONNECTOR_LIGHT_GRAY = new ItemSignalModifier(true, DyeColor.LIGHT_GRAY);
	Item SIGNAL_CONNECTOR_CYAN = new ItemSignalModifier(true, DyeColor.CYAN);
	Item SIGNAL_CONNECTOR_PURPLE = new ItemSignalModifier(true, DyeColor.PURPLE);
	Item SIGNAL_CONNECTOR_BLUE = new ItemSignalModifier(true, DyeColor.BLUE);
	Item SIGNAL_CONNECTOR_BROWN = new ItemSignalModifier(true, DyeColor.BROWN);
	Item SIGNAL_CONNECTOR_GREEN = new ItemSignalModifier(true, DyeColor.GREEN);
	Item SIGNAL_CONNECTOR_RED = new ItemSignalModifier(true, DyeColor.RED);
	Item SIGNAL_CONNECTOR_BLACK = new ItemSignalModifier(true, DyeColor.BLACK);
	Item SIGNAL_REMOVER_WHITE = new ItemSignalModifier(false, DyeColor.WHITE);
	Item SIGNAL_REMOVER_ORANGE = new ItemSignalModifier(false, DyeColor.ORANGE);
	Item SIGNAL_REMOVER_MAGENTA = new ItemSignalModifier(false, DyeColor.MAGENTA);
	Item SIGNAL_REMOVER_LIGHT_BLUE = new ItemSignalModifier(false, DyeColor.LIGHT_BLUE);
	Item SIGNAL_REMOVER_YELLOW = new ItemSignalModifier(false, DyeColor.YELLOW);
	Item SIGNAL_REMOVER_LIME = new ItemSignalModifier(false, DyeColor.LIME);
	Item SIGNAL_REMOVER_PINK = new ItemSignalModifier(false, DyeColor.PINK);
	Item SIGNAL_REMOVER_GRAY = new ItemSignalModifier(false, DyeColor.GRAY);
	Item SIGNAL_REMOVER_LIGHT_GRAY = new ItemSignalModifier(false, DyeColor.LIGHT_GRAY);
	Item SIGNAL_REMOVER_CYAN = new ItemSignalModifier(false, DyeColor.CYAN);
	Item SIGNAL_REMOVER_PURPLE = new ItemSignalModifier(false, DyeColor.PURPLE);
	Item SIGNAL_REMOVER_BLUE = new ItemSignalModifier(false, DyeColor.BLUE);
	Item SIGNAL_REMOVER_BROWN = new ItemSignalModifier(false, DyeColor.BROWN);
	Item SIGNAL_REMOVER_GREEN = new ItemSignalModifier(false, DyeColor.GREEN);
	Item SIGNAL_REMOVER_RED = new ItemSignalModifier(false, DyeColor.RED);
	Item SIGNAL_REMOVER_BLACK = new ItemSignalModifier(false, DyeColor.BLACK);
}
