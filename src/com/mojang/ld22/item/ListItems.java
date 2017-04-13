package com.mojang.ld22.item;

import com.mojang.ld22.entity.Anvil;
import com.mojang.ld22.entity.Bed;
import com.mojang.ld22.entity.Chest;
import com.mojang.ld22.entity.Enchanter;
import com.mojang.ld22.entity.Furnace;
import com.mojang.ld22.entity.GoldLantern;
import com.mojang.ld22.entity.IronLantern;
import com.mojang.ld22.entity.Lantern;
import com.mojang.ld22.entity.Loom;
import com.mojang.ld22.entity.Oven;
import com.mojang.ld22.entity.Spawner;
import com.mojang.ld22.entity.Tnt;
import com.mojang.ld22.entity.Workbench;
import com.mojang.ld22.item.resource.Resource;
import java.util.ArrayList;
import java.util.List;

public class ListItems {

	public static List items = new ArrayList();
	
	public Item spawnercow;
	public Item spawnerpig;
	public Item spawnersheep;
	public Item spawnerslime;
	public Item spawnerzombie;
	public Item spawnercreeper;
	public Item spawnerskeleton;
	public Item spawnersnake;
	public Item spawnerknight;
	public Item spawnerairwizard;
	public Item spawnerairwizardii;
	
	public Item powglove;
	public Item workbench;
	public Item oven;
	public Item furnace;
	public Item anvil;
	public Item chest;
	public Item lantern;
	public Item ironlantern;
	public Item goldlantern;
	public Item enchanter;
	public Item loom;
	public Item tnt;
	public Item bed;
	public Item bucket;
	public Item wbucket;
	public Item lbucket;
	
	public Item arrow;
	public Item torch;
	public Item wood;
	public Item stone;
	public Item flower;
	public Item acorn;
	public Item dirt;
	public Item sand;
	public Item cactusFlower;
	
	public Item seeds;
	public Item wheat;
	public Item bread;
	public Item apple;
	public Item rawpork;
	public Item rawfish;
	public Item rawbeef;
	public Item cookedpork;
	public Item cookedfish;
	public Item steak;
	
	public Item leather;
	public Item coal;
	public Item ironOre;
	public Item goldOre;
	public Item ironIngot;
	public Item goldIngot;
	public Item slime;
	public Item glass;
	public Item cloth;
	public Item cloud;
	public Item gem;
	
	public Item wool;
	public Item redwool;
	public Item bluewool;
	public Item greenwool;
	public Item yellowwool;
	public Item blackwool;
	
	public Item rod;
	public Item rose;
	public Item plank;
	public Item stbrick;
	public Item obrick;
	public Item plankwall;
	public Item stonewall;
	public Item obwall;
	public Item wooddoor;
	public Item stonedoor;
	public Item obdoor;
	public Item grassseeds;
	public Item bone;
	public Item string;
	public Item goldapple;
	public Item lapisOre;
	public Item book;
	public Item gunp;
	public Item bookant;
	public Item scale;
	public Item shard;
	public Item key;
	
	public Item woodshovel;
	public Item rockshovel;
	public Item ironshovel;
	public Item goldshovel;
	public Item gemshovel;
	public Item woodhoe;
	public Item rockhoe;
	public Item ironhoe;
	public Item goldhoe;
	public Item gemhoe;
	public Item woodpickaxe;
	public Item rockpickaxe;
	public Item ironpickaxe;
	public Item goldpickaxe;
	public Item gempickaxe;
	public Item woodaxe;
	public Item rockaxe;
	public Item ironaxe;
	public Item goldaxe;
	public Item gemaxe;
	public Item woodsword;
	public Item rocksword;
	public Item ironsword;
	public Item goldsword;
	public Item gemsword;
	public Item woodclaymore;
	public Item rockclaymore;
	public Item ironclaymore;
	public Item goldclaymore;
	public Item gemclaymore;
	public Item woodbow;
	public Item rockbow;
	public Item ironbow;
	public Item goldbow;
	public Item gembow;
	public Item woodpick;
	public Item rockpick;
	public Item ironpick;
	public Item goldpick;
	public Item gempick;
	public Item woodhatchet;
	public Item rockhatchet;
	public Item ironhatchet;
	public Item goldhatchet;
	public Item gemhatchet;
	public Item woodspade;
	public Item rockspade;
	public Item ironspade;
	public Item goldspade;
	public Item gemspade;
	
	public Item larmor;
	public Item sarmor;
	public Item iarmor;
	public Item garmor;
	public Item gemarmor;
	public Item redclothes;
	public Item blueclothes;
	public Item greenclothes;
	public Item yellowclothes;
	public Item blackclothes;
	public Item orangeclothes;
	public Item purpleclothes;
	public Item cyanclothes;
	public Item regclothes;
	
	public Item potion;
	public Item speedpotion;
	public Item lightpotion;
	public Item swimpotion;
	public Item energypotion;
	public Item regenpotion;
	public Item timepotion;
	public Item lavapotion;
	public Item shieldpotion;
	public Item hastepotion;
	
	public ListItems() {
		this.spawnercow = (new FurnitureItem(new Spawner("Cow", 1))).addItem();
		this.spawnerpig = (new FurnitureItem(new Spawner("Pig", 1))).addItem();
		this.spawnersheep = (new FurnitureItem(new Spawner("Sheep", 1))).addItem();
		this.spawnerslime = (new FurnitureItem(new Spawner("Slime", 1))).addItem();
		this.spawnerzombie = (new FurnitureItem(new Spawner("Zombie", 1))).addItem();
		this.spawnercreeper = (new FurnitureItem(new Spawner("Creeper", 1))).addItem();
		this.spawnerskeleton = (new FurnitureItem(new Spawner("Skeleton", 1))).addItem();
		this.spawnersnake = (new FurnitureItem(new Spawner("Snake", 1))).addItem();
		this.spawnerknight = (new FurnitureItem(new Spawner("Knight", 1))).addItem();
		this.spawnerairwizard = (new FurnitureItem(new Spawner("AirWizard", 1))).addItem();
		this.spawnerairwizardii = (new FurnitureItem(new Spawner("AirWizardII", 1))).addItem();
		
		this.powglove = (new PowerGloveItem()).addItem();
		this.workbench = (new FurnitureItem(new Workbench())).addItem();
		this.oven = (new FurnitureItem(new Oven())).addItem();
		this.furnace = (new FurnitureItem(new Furnace())).addItem();
		this.anvil = (new FurnitureItem(new Anvil())).addItem();
		this.chest = (new FurnitureItem(new Chest())).addItem();
		this.lantern = (new FurnitureItem(new Lantern())).addItem();
		this.ironlantern = (new FurnitureItem(new IronLantern())).addItem();
		this.goldlantern = (new FurnitureItem(new GoldLantern())).addItem();
		this.enchanter = (new FurnitureItem(new Enchanter())).addItem();
		this.loom = (new FurnitureItem(new Loom())).addItem();
		this.tnt = (new FurnitureItem(new Tnt())).addItem();
		this.bed = (new FurnitureItem(new Bed())).addItem();
		this.bucket = (new BucketItem()).addItem();
		this.wbucket = (new BucketWaterItem()).addItem();
		this.lbucket = (new BucketLavaItem()).addItem();
		
		this.arrow = (new ResourceItem(Resource.arrow)).addItem();
		this.torch = (new ResourceItem(Resource.torch)).addItem();
		this.wood = (new ResourceItem(Resource.wood)).addItem();
		this.stone = (new ResourceItem(Resource.stone)).addItem();
		this.flower = (new ResourceItem(Resource.flower)).addItem();
		this.acorn = (new ResourceItem(Resource.acorn)).addItem();
		this.dirt = (new ResourceItem(Resource.dirt)).addItem();
		this.sand = (new ResourceItem(Resource.sand)).addItem();
		this.cactusFlower = (new ResourceItem(Resource.cactusFlower)).addItem();
		this.seeds = (new ResourceItem(Resource.seeds)).addItem();
		this.wheat = (new ResourceItem(Resource.wheat)).addItem();
		this.bread = (new ResourceItem(Resource.bread)).addItem();
		this.apple = (new ResourceItem(Resource.apple)).addItem();
		this.rawpork = (new ResourceItem(Resource.rawpork)).addItem();
		this.rawfish = (new ResourceItem(Resource.rawfish)).addItem();
		this.rawbeef = (new ResourceItem(Resource.rawbeef)).addItem();
		this.cookedpork = (new ResourceItem(Resource.cookedpork)).addItem();
		this.cookedfish = (new ResourceItem(Resource.cookedfish)).addItem();
		this.steak = (new ResourceItem(Resource.steak)).addItem();
		this.leather = (new ResourceItem(Resource.leather)).addItem();
		this.coal = (new ResourceItem(Resource.coal)).addItem();
		this.ironOre = (new ResourceItem(Resource.ironOre)).addItem();
		this.goldOre = (new ResourceItem(Resource.goldOre)).addItem();
		this.ironIngot = (new ResourceItem(Resource.ironIngot)).addItem();
		this.goldIngot = (new ResourceItem(Resource.goldIngot)).addItem();
		this.slime = (new ResourceItem(Resource.slime)).addItem();
		this.glass = (new ResourceItem(Resource.glass)).addItem();
		this.cloth = (new ResourceItem(Resource.cloth)).addItem();
		this.cloud = (new ResourceItem(Resource.cloud)).addItem();
		this.gem = (new ResourceItem(Resource.gem)).addItem();
		this.wool = (new ResourceItem(Resource.wool)).addItem();
		this.redwool = (new ResourceItem(Resource.redwool)).addItem();
		this.bluewool = (new ResourceItem(Resource.bluewool)).addItem();
		this.greenwool = (new ResourceItem(Resource.greenwool)).addItem();
		this.yellowwool = (new ResourceItem(Resource.yellowwool)).addItem();
		this.blackwool = (new ResourceItem(Resource.blackwool)).addItem();
		this.rose = (new ResourceItem(Resource.rose)).addItem();
		this.plank = (new ResourceItem(Resource.plank)).addItem();
		this.stbrick = (new ResourceItem(Resource.sbrick)).addItem();
		this.obrick = (new ResourceItem(Resource.obrick)).addItem();
		this.plankwall = (new ResourceItem(Resource.plankwall)).addItem();
		this.stonewall = (new ResourceItem(Resource.stonewall)).addItem();
		this.obwall = (new ResourceItem(Resource.obwall)).addItem();
		this.wooddoor = (new ResourceItem(Resource.wdoor)).addItem();
		this.stonedoor = (new ResourceItem(Resource.sdoor)).addItem();
		this.obdoor = (new ResourceItem(Resource.odoor)).addItem();
		this.grassseeds = (new ResourceItem(Resource.grassseeds)).addItem();
		this.bone = (new ResourceItem(Resource.bone)).addItem();
		this.string = (new ResourceItem(Resource.string)).addItem();
		this.goldapple = (new ResourceItem(Resource.goldapple)).addItem();
		this.lapisOre = (new ResourceItem(Resource.lapisOre)).addItem();
		this.book = (new ResourceItem(Resource.book)).addItem();
		this.gunp = (new ResourceItem(Resource.gunp)).addItem();
		this.bookant = (new ResourceItem(Resource.bookant)).addItem();
		this.scale = (new ResourceItem(Resource.scale)).addItem();
		this.shard = (new ResourceItem(Resource.shard)).addItem();
		this.key = (new ResourceItem(Resource.key)).addItem();
		this.rod = (new ToolItem(ToolType.rod, 0)).addItem();
		this.woodshovel = (new ToolItem(ToolType.shovel, 0)).addItem();
		this.rockshovel = (new ToolItem(ToolType.shovel, 1)).addItem();
		this.ironshovel = (new ToolItem(ToolType.shovel, 2)).addItem();
		this.goldshovel = (new ToolItem(ToolType.shovel, 3)).addItem();
		this.gemshovel = (new ToolItem(ToolType.shovel, 4)).addItem();
		this.woodhoe = (new ToolItem(ToolType.hoe, 0)).addItem();
		this.rockhoe = (new ToolItem(ToolType.hoe, 1)).addItem();
		this.ironhoe = (new ToolItem(ToolType.hoe, 2)).addItem();
		this.goldhoe = (new ToolItem(ToolType.hoe, 3)).addItem();
		this.gemhoe = (new ToolItem(ToolType.hoe, 4)).addItem();
		this.woodpickaxe = (new ToolItem(ToolType.pickaxe, 0)).addItem();
		this.rockpickaxe = (new ToolItem(ToolType.pickaxe, 1)).addItem();
		this.ironpickaxe = (new ToolItem(ToolType.pickaxe, 2)).addItem();
		this.goldpickaxe = (new ToolItem(ToolType.pickaxe, 3)).addItem();
		this.gempickaxe = (new ToolItem(ToolType.pickaxe, 4)).addItem();
		this.woodaxe = (new ToolItem(ToolType.axe, 0)).addItem();
		this.rockaxe = (new ToolItem(ToolType.axe, 1)).addItem();
		this.ironaxe = (new ToolItem(ToolType.axe, 2)).addItem();
		this.goldaxe = (new ToolItem(ToolType.axe, 3)).addItem();
		this.gemaxe = (new ToolItem(ToolType.axe, 4)).addItem();
		this.woodsword = (new ToolItem(ToolType.sword, 0)).addItem();
		this.rocksword = (new ToolItem(ToolType.sword, 1)).addItem();
		this.ironsword = (new ToolItem(ToolType.sword, 2)).addItem();
		this.goldsword = (new ToolItem(ToolType.sword, 3)).addItem();
		this.gemsword = (new ToolItem(ToolType.sword, 4)).addItem();
		this.woodclaymore = (new ToolItem(ToolType.claymore, 0)).addItem();
		this.rockclaymore = (new ToolItem(ToolType.claymore, 1)).addItem();
		this.ironclaymore = (new ToolItem(ToolType.claymore, 2)).addItem();
		this.goldclaymore = (new ToolItem(ToolType.claymore, 3)).addItem();
		this.gemclaymore = (new ToolItem(ToolType.claymore, 4)).addItem();
		this.woodbow = (new ToolItem(ToolType.bow, 0)).addItem();
		this.rockbow = (new ToolItem(ToolType.bow, 1)).addItem();
		this.ironbow = (new ToolItem(ToolType.bow, 2)).addItem();
		this.goldbow = (new ToolItem(ToolType.bow, 3)).addItem();
		this.gembow = (new ToolItem(ToolType.bow, 4)).addItem();
		this.woodpick = (new ToolItem(ToolType.pick, 0)).addItem();
		this.rockpick = (new ToolItem(ToolType.pick, 1)).addItem();
		this.ironpick = (new ToolItem(ToolType.pick, 2)).addItem();
		this.goldpick = (new ToolItem(ToolType.pick, 3)).addItem();
		this.gempick = (new ToolItem(ToolType.pick, 4)).addItem();
		this.woodhatchet = (new ToolItem(ToolType.hatchet, 0)).addItem();
		this.rockhatchet = (new ToolItem(ToolType.hatchet, 1)).addItem();
		this.ironhatchet = (new ToolItem(ToolType.hatchet, 2)).addItem();
		this.goldhatchet = (new ToolItem(ToolType.hatchet, 3)).addItem();
		this.gemhatchet = (new ToolItem(ToolType.hatchet, 3)).addItem();
		this.woodspade = (new ToolItem(ToolType.spade, 0)).addItem();
		this.rockspade = (new ToolItem(ToolType.spade, 1)).addItem();
		this.ironspade = (new ToolItem(ToolType.spade, 2)).addItem();
		this.goldspade = (new ToolItem(ToolType.spade, 3)).addItem();
		this.gemspade = (new ToolItem(ToolType.spade, 4)).addItem();
		this.larmor = (new ResourceItem(Resource.larmor)).addItem();
		this.sarmor = (new ResourceItem(Resource.sarmor)).addItem();
		this.iarmor = (new ResourceItem(Resource.iarmor)).addItem();
		this.garmor = (new ResourceItem(Resource.garmor)).addItem();
		this.gemarmor = (new ResourceItem(Resource.gemarmor)).addItem();
		
		this.redclothes = (new ResourceItem(Resource.redclothes)).addItem();
		this.blueclothes = (new ResourceItem(Resource.blueclothes)).addItem();
		this.greenclothes = (new ResourceItem(Resource.greenclothes)).addItem();
		this.yellowclothes = (new ResourceItem(Resource.yellowclothes)).addItem();
		this.blackclothes = (new ResourceItem(Resource.blackclothes)).addItem();
		this.orangeclothes = (new ResourceItem(Resource.orangeclothes)).addItem();
		this.purpleclothes = (new ResourceItem(Resource.purpleclothes)).addItem();
		this.cyanclothes = (new ResourceItem(Resource.cyanclothes)).addItem();
		this.regclothes = (new ResourceItem(Resource.regclothes)).addItem();
		
		this.potion = (new ResourceItem(Resource.potion)).addItem();
		this.speedpotion = (new ResourceItem(Resource.speedpotion)).addItem();
		this.lightpotion = (new ResourceItem(Resource.lightpotion)).addItem();
		this.swimpotion = (new ResourceItem(Resource.swimpotion)).addItem();
		this.energypotion = (new ResourceItem(Resource.energypotion)).addItem();
		this.regenpotion = (new ResourceItem(Resource.regenpotion)).addItem();
		this.timepotion = (new ResourceItem(Resource.timepotion)).addItem();
		this.lavapotion = (new ResourceItem(Resource.lavapotion)).addItem();
		this.shieldpotion = (new ResourceItem(Resource.shieldpotion)).addItem();
		this.hastepotion = (new ResourceItem(Resource.hastepotion)).addItem();
	}
	
	/** fetches an item from the list given it's name. I mean, I would have just used a HashMap... */
	public static Item getItem(String name) {
		Item newItem = new Item();
		if(!name.equals("")) { // name is not nothing
			if(name.contains(";")) { // if has ";" in name for whatever reason...
				name = name.substring(0, name.indexOf(";")); // cut it off, plus anything after it.
			}
			
			for(int i = 0; i < items.size(); i++) { // loop through the items
				if(((Item)items.get(i)).getName().equals(name)) { // if names match
					newItem = (Item)items.get(i); // set the item
					return newItem; // return the item
				}
			}
		}
		
		return newItem; // would return new Item();
	}
}
	
