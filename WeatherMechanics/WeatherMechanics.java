package io.github.vexytal.WeatherMechanics;

import java.util.HashMap;
import java.util.logging.Logger;

import io.github.vexytal.Main;
import io.github.vexytal.DuelMechanics.DuelMechanics;
import io.github.vexytal.WeatherMechanics.drweather.CommandDRWeather;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WeatherType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class WeatherMechanics implements Listener {
	Logger log = Logger.getLogger("Minecraft");
	
	public static volatile HashMap<String, WeatherType> player_weather = new HashMap<String, WeatherType>();
	
	public void onEnable() {
		Main.plugin.getServer().getPluginManager().registerEvents(this, Main.plugin);
		
		Main.plugin.getCommand("drweather").setExecutor(new CommandDRWeather());
		
		new BukkitRunnable() {
			@Override
			public void run() {
				for(Player pl : Main.plugin.getServer().getOnlinePlayers()) {
					if(getRegionName(pl.getLocation()).startsWith("rain_") && pl.getPlayerWeather() != WeatherType.DOWNFALL) {
						pl.setPlayerWeather(WeatherType.DOWNFALL);
						continue;
					} else if(!(getRegionName(pl.getLocation()).startsWith("rain_")) && pl.getPlayerWeather() == WeatherType.DOWNFALL) {
						pl.setPlayerWeather(WeatherType.CLEAR);
						continue;
					}
				}
			}
		}.runTaskTimer(Main.plugin, 10L * 20L, 20L);
		
		log.info("[WeatherMechanics] has been enabled.");
	}
	
	public void onDisable() {
		log.info("[WeatherMechanics] has been disabled.");
	}
	
	public static String getRegionName(Location loc) {
		return DuelMechanics.getRegionName(loc);
	}
	
	@EventHandler
	public void onWorldChange(PlayerChangedWorldEvent e) {
		Player pl = e.getPlayer();
		if(!pl.getWorld().getName().equalsIgnoreCase(Bukkit.getWorlds().get(0).getName())) {
			if(pl.getPlayerWeather() == WeatherType.DOWNFALL) {
				pl.setPlayerWeather(WeatherType.CLEAR);
			}
		}
	}
	
}
