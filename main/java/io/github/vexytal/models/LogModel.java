package io.github.vexytal.models;

import net.minecraft.util.com.google.gson.JsonObject;
import io.github.vexytal.Utils;
import io.github.vexytal.Hive.Hive;
import io.github.vexytal.enums.LogType;

public class LogModel {
	
	public LogType type;
	public JsonObject data;
	public String player;
	public long time;
	
	public LogModel(LogType type, String player, JsonObject data){
		new LogModel(type, player, data, Utils.getTime());
	}
	
	public LogModel(LogType type, String player, JsonObject data, long time){
		this.type = type;
		this.player = player;
		this.data = data;
		this.time = time;
		Hive.logs.add(this);
	}
	
}
