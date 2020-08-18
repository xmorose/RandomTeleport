package me.darkeyedragon.randomtp.command.context;

import me.darkeyedragon.randomtp.api.world.RandomWorld;
import me.darkeyedragon.randomtp.util.WorldUtil;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class PlayerWorldContext {
    private Player player;
    private World world;

    public boolean isPlayer() {
        return player != null;
    }

    public boolean isWorld() {
        return world != null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public RandomWorld getWorld() {
        return WorldUtil.toRandomWorld(world);
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
