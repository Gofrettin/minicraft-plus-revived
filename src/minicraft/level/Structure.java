package minicraft.level;

import java.util.HashMap;
import java.util.HashSet;

import minicraft.entity.furniture.Furniture;
import minicraft.entity.furniture.Lantern;
import minicraft.gfx.Point;
import minicraft.level.tile.Tile;
import minicraft.level.tile.Tiles;

// this stores structures that can be drawn at any location.
public class Structure {
	
	private HashSet<TilePoint> tiles;
	private HashMap<Point, Furniture> furniture;
	
	public Structure() {
		tiles = new HashSet<>();
		furniture = new HashMap<>();
	}
	
	public void setTile(int x, int y, Tile tile) {
		tiles.add(new TilePoint(x, y, tile));
	}
	public void addFurniture(int x, int y, Furniture furniture) {
		this.furniture.put(new Point(x, y), furniture);
	}
	
	public void draw(Level level, int xt, int yt) {
		for(TilePoint p: tiles)
			level.setTile(xt+p.x, yt+p.y, p.t);
		
		for(Point p: furniture.keySet())
			level.add(furniture.get(p).clone(), xt+p.x, yt+p.y, true);
	}

	public void setData(String keys, String data) {
		// so, the keys are single letters, each letter represents a tile
		HashMap<String, String> keyPairs = new HashMap<>();
		String[] stringKeyPairs = keys.split(",");

		// puts all the keys in the keyPairs HashMap
		for (int i = 0; i < stringKeyPairs.length; i++) {
			String[] thisKey = stringKeyPairs[i].split(":");
			keyPairs.put(thisKey[0], thisKey[1]);
		}

		String[] dataLines = data.split("\n");
		int width = dataLines[0].length();
		int height = dataLines.length;

		for (int i = 0; i < dataLines.length; i++) {
			for (int c = 0; c < dataLines[i].length(); c++) {
				Tile tile = Tiles.get(keyPairs.get(String.valueOf(dataLines[i].charAt(c))));
				this.setTile(Math.round(-width / 2f) + i, Math.round(-height / 2f) + c, tile);
			}
		}
	}
	
	static class TilePoint {
		int x, y;
		Tile t;
		
		public TilePoint(int x, int y, Tile tile) {
			this.x = x;
			this.y = y;
			this.t = tile;
		}
		
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof TilePoint)) return false;
			TilePoint p = (TilePoint) o;
			return x == p.x && y == p.y && t.id == p.t.id;
		}
		
		@Override
		public int hashCode() {
			return x+y*51 + t.id * 131;
		}
	}
	
	static final Structure dungeonGate;
	static final Structure mobDungeon;
	
	static {
		dungeonGate = new Structure();
		dungeonGate.setData("O:Obsidian,D:Obsidian Door,W:Obsidian Wall",
				"WWDWW\n" +
					"WOOOW\n" +
					"DOOOD\n" +
					"WOOOW\n" +
					"WWDWW"
		);
		dungeonGate.addFurniture(-1, -1, new Lantern(Lantern.Type.IRON));

		mobDungeon = new Structure();
		mobDungeon.setData("B:Stone Bricks,W:Stone Wall",
				"WWBWW\n" +
					"WBBBW\n" +
					"BBBBB\n" +
					"WBBBW\n" +
					"WWBWW"
		);
	}
}
