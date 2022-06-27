package io.github.solclient.client.util;

import io.github.solclient.abstraction.mc.world.item.ItemType;
import lombok.AllArgsConstructor;
import net.minecraft.item.Item;

/**
 * Enum of Bukkit API materials for version 1.8.
 */
@AllArgsConstructor
public enum BukkitMaterial {
	AIR(0), STONE(1), GRASS(2), DIRT(3), COBBLESTONE(4), WOOD(5), SAPLING(6), BEDROCK(7), WATER(8), STATIONARY_WATER(9),
	LAVA(10), STATIONARY_LAVA(11), SAND(12), GRAVEL(13), GOLD_ORE(14), IRON_ORE(15), COAL_ORE(16), LOG(17), LEAVES(18),
	SPONGE(19), GLASS(20), LAPIS_ORE(21), LAPIS_BLOCK(22), DISPENSER(23), SANDSTONE(24), NOTE_BLOCK(25), BED_BLOCK(26),
	POWERED_RAIL(27), DETECTOR_RAIL(28), PISTON_STICKY_BASE(29), WEB(30), LONG_GRASS(31), DEAD_BUSH(32),
	PISTON_BASE(33), PISTON_EXTENSION(34), WOOL(35), PISTON_MOVING_PIECE(36), YELLOW_FLOWER(37), RED_ROSE(38),
	BROWN_MUSHROOM(39), RED_MUSHROOM(40), GOLD_BLOCK(41), IRON_BLOCK(42), DOUBLE_STEP(43), STEP(44), BRICK(45), TNT(46),
	BOOKSHELF(47), MOSSY_COBBLESTONE(48), OBSIDIAN(49), TORCH(50), FIRE(51), MOB_SPAWNER(52), WOOD_STAIRS(53),
	CHEST(54), REDSTONE_WIRE(55), DIAMOND_ORE(56), DIAMOND_BLOCK(57), WORKBENCH(58), CROPS(59), SOIL(60), FURNACE(61),
	BURNING_FURNACE(62), SIGN_POST(63), WOODEN_DOOR(64), LADDER(65), RAILS(66), COBBLESTONE_STAIRS(67), WALL_SIGN(68),
	LEVER(69), STONE_PLATE(70), IRON_DOOR_BLOCK(71), WOOD_PLATE(72), REDSTONE_ORE(73), GLOWING_REDSTONE_ORE(74),
	REDSTONE_TORCH_OFF(75), REDSTONE_TORCH_ON(76), STONE_BUTTON(77), SNOW(78), ICE(79), SNOW_BLOCK(80), CACTUS(81),
	CLAY(82), SUGAR_CANE_BLOCK(83), JUKEBOX(84), FENCE(85), PUMPKIN(86), NETHERRACK(87), SOUL_SAND(88), GLOWSTONE(89),
	PORTAL(90), JACK_O_LANTERN(91), CAKE_BLOCK(92), DIODE_BLOCK_OFF(93), DIODE_BLOCK_ON(94), STAINED_GLASS(95),
	TRAP_DOOR(96), MONSTER_EGGS(97), SMOOTH_BRICK(98), HUGE_MUSHROOM_1(99), HUGE_MUSHROOM_2(100), IRON_FENCE(101),
	THIN_GLASS(102), MELON_BLOCK(103), PUMPKIN_STEM(104), MELON_STEM(105), VINE(106), FENCE_GATE(107),
	BRICK_STAIRS(108), SMOOTH_STAIRS(109), MYCEL(110), WATER_LILY(111), NETHER_BRICK(112), NETHER_FENCE(113),
	NETHER_BRICK_STAIRS(114), NETHER_WARTS(115), ENCHANTMENT_TABLE(116), BREWING_STAND(117), CAULDRON(118),
	ENDER_PORTAL(119), ENDER_PORTAL_FRAME(120), ENDER_STONE(121), DRAGON_EGG(122), REDSTONE_LAMP_OFF(123),
	REDSTONE_LAMP_ON(124), WOOD_DOUBLE_STEP(125), WOOD_STEP(126), COCOA(127), SANDSTONE_STAIRS(128), EMERALD_ORE(129),
	ENDER_CHEST(130), TRIPWIRE_HOOK(131), TRIPWIRE(132), EMERALD_BLOCK(133), SPRUCE_WOOD_STAIRS(134),
	BIRCH_WOOD_STAIRS(135), JUNGLE_WOOD_STAIRS(136), COMMAND(137), BEACON(138), COBBLE_WALL(139), FLOWER_POT(140),
	CARROT(141), POTATO(142), WOOD_BUTTON(143), SKULL(144), ANVIL(145), TRAPPED_CHEST(146), GOLD_PLATE(147),
	IRON_PLATE(148), REDSTONE_COMPARATOR_OFF(149), REDSTONE_COMPARATOR_ON(150), DAYLIGHT_DETECTOR(151),
	REDSTONE_BLOCK(152), QUARTZ_ORE(153), HOPPER(154), QUARTZ_BLOCK(155), QUARTZ_STAIRS(156), ACTIVATOR_RAIL(157),
	DROPPER(158), STAINED_CLAY(159), STAINED_GLASS_PANE(160), LEAVES_2(161), LOG_2(162), ACACIA_STAIRS(163),
	DARK_OAK_STAIRS(164), SLIME_BLOCK(165), BARRIER(166), IRON_TRAPDOOR(167), PRISMARINE(168), SEA_LANTERN(169),
	HAY_BLOCK(170), CARPET(171), HARD_CLAY(172), COAL_BLOCK(173), PACKED_ICE(174), DOUBLE_PLANT(175),
	STANDING_BANNER(176), WALL_BANNER(177), DAYLIGHT_DETECTOR_INVERTED(178), RED_SANDSTONE(179),
	RED_SANDSTONE_STAIRS(180), DOUBLE_STONE_SLAB2(181), STONE_SLAB2(182), SPRUCE_FENCE_GATE(183), BIRCH_FENCE_GATE(184),
	JUNGLE_FENCE_GATE(185), DARK_OAK_FENCE_GATE(186), ACACIA_FENCE_GATE(187), SPRUCE_FENCE(188), BIRCH_FENCE(189),
	JUNGLE_FENCE(190), DARK_OAK_FENCE(191), ACACIA_FENCE(192), SPRUCE_DOOR(193), BIRCH_DOOR(194), JUNGLE_DOOR(195),
	ACACIA_DOOR(196), DARK_OAK_DOOR(197), IRON_SPADE(2560), IRON_PICKAXE(2570), IRON_AXE(2580), FLINT_AND_STEEL(259),
	APPLE(260), BOW(2614), ARROW(262), COAL(263), DIAMOND(264), IRON_INGOT(265), GOLD_INGOT(266), IRON_SWORD(2670),
	WOOD_SWORD(268), WOOD_SPADE(269), WOOD_PICKAXE(270), WOOD_AXE(271), STONE_SWORD(27231), STONE_SPADE(27331),
	STONE_PICKAXE(27431), STONE_AXE(27531), DIAMOND_SWORD(276561), DIAMOND_SPADE(277561), DIAMOND_PICKAXE(278561),
	DIAMOND_AXE(279561), STICK(280), BOWL(281), MUSHROOM_SOUP(282), GOLD_SWORD(283), GOLD_SPADE(284), GOLD_PICKAXE(285),
	GOLD_AXE(286), STRING(287), FEATHER(288), SULPHUR(289), WOOD_HOE(290), STONE_HOE(29131), IRON_HOE(2920),
	DIAMOND_HOE(293561), GOLD_HOE(294), SEEDS(295), WHEAT(296), BREAD(297), LEATHER_HELMET(298),
	LEATHER_CHESTPLATE(299), LEATHER_LEGGINGS(300), LEATHER_BOOTS(301), CHAINMAIL_HELMET(30265),
	CHAINMAIL_CHESTPLATE(3030), CHAINMAIL_LEGGINGS(3045), CHAINMAIL_BOOTS(30595), IRON_HELMET(30665),
	IRON_CHESTPLATE(3070), IRON_LEGGINGS(3085), IRON_BOOTS(30995), DIAMOND_HELMET(3103), DIAMOND_CHESTPLATE(3118),
	DIAMOND_LEGGINGS(3125), DIAMOND_BOOTS(3139), GOLD_HELMET(314), GOLD_CHESTPLATE(31512), GOLD_LEGGINGS(31605),
	GOLD_BOOTS(317), FLINT(318), PORK(319), GRILLED_PORK(320), PAINTING(321), GOLDEN_APPLE(322), SIGN(3236),
	WOOD_DOOR(324), BUCKET(3256), WATER_BUCKET(326), LAVA_BUCKET(327), MINECART(328), SADDLE(329), IRON_DOOR(330),
	REDSTONE(331), SNOW_BALL(3326), BOAT(333), LEATHER(334), MILK_BUCKET(335), CLAY_BRICK(336), CLAY_BALL(337),
	SUGAR_CANE(338), PAPER(339), BOOK(340), SLIME_BALL(341), STORAGE_MINECART(342), POWERED_MINECART(343), EGG(3446),
	COMPASS(345), FISHING_ROD(346), WATCH(347), GLOWSTONE_DUST(348), RAW_FISH(349), COOKED_FISH(350), INK_SACK(351),
	BONE(352), SUGAR(353), CAKE(354), BED(355), DIODE(356), COOKIE(357), MAP(358), SHEARS(3598), MELON(360),
	PUMPKIN_SEEDS(361), MELON_SEEDS(362), RAW_BEEF(363), COOKED_BEEF(364), RAW_CHICKEN(365), COOKED_CHICKEN(366),
	ROTTEN_FLESH(367), ENDER_PEARL(3686), BLAZE_ROD(369), GHAST_TEAR(370), GOLD_NUGGET(371), NETHER_STALK(372),
	POTION(373), GLASS_BOTTLE(374), SPIDER_EYE(375), FERMENTED_SPIDER_EYE(376), BLAZE_POWDER(377), MAGMA_CREAM(378),
	BREWING_STAND_ITEM(379), CAULDRON_ITEM(380), EYE_OF_ENDER(381), SPECKLED_MELON(382), MONSTER_EGG(383),
	EXP_BOTTLE(384), FIREBALL(385), BOOK_AND_QUILL(386), WRITTEN_BOOK(3876), EMERALD(388), ITEM_FRAME(389),
	FLOWER_POT_ITEM(390), CARROT_ITEM(391), POTATO_ITEM(392), BAKED_POTATO(393), POISONOUS_POTATO(394), EMPTY_MAP(395),
	GOLDEN_CARROT(396), SKULL_ITEM(397), CARROT_STICK(398), NETHER_STAR(399), PUMPKIN_PIE(400), FIREWORK(401),
	FIREWORK_CHARGE(402), ENCHANTED_BOOK(403), REDSTONE_COMPARATOR(404), NETHER_BRICK_ITEM(405), QUARTZ(406),
	EXPLOSIVE_MINECART(407), HOPPER_MINECART(408), PRISMARINE_SHARD(409), PRISMARINE_CRYSTALS(410), RABBIT(411),
	COOKED_RABBIT(412), RABBIT_STEW(413), RABBIT_FOOT(414), RABBIT_HIDE(415), ARMOR_STAND(4166), IRON_BARDING(417),
	GOLD_BARDING(418), DIAMOND_BARDING(419), LEASH(420), NAME_TAG(421), COMMAND_MINECART(422), MUTTON(423),
	COOKED_MUTTON(424), BANNER(4256), SPRUCE_DOOR_ITEM(427), BIRCH_DOOR_ITEM(428), JUNGLE_DOOR_ITEM(429),
	ACACIA_DOOR_ITEM(430), DARK_OAK_DOOR_ITEM(431), GOLD_RECORD(2256), GREEN_RECORD(2257), RECORD_3(2258),
	RECORD_4(2259), RECORD_5(2260), RECORD_6(2261), RECORD_7(2262), RECORD_8(2263), RECORD_9(2264), RECORD_10(2265),
	RECORD_11(2266), RECORD_12(2267);

	private final int id;

	public ItemType getItem() {
		return null;
	}

}
