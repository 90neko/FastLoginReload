package com.ksptooi.flr.starter;

import com.ksptooi.flr.service.player.PlayerService;
import com.ksptooi.flr.starter.spring.ContextR;
import com.ksptooi.flr.starter.spring.JarUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public class FastLoginR extends JavaPlugin {

    public static final String currentVersion = "1.1F";

    @Override
    public void onEnable() {

        Logger logger = Bukkit.getLogger();
        logger.info("[FastLoginR]版本:"+currentVersion);
        logger.info("[FastLoginR]尝试注入Services:");
        logger.info("[FastLoginR]");



/*        PlayerService playerService = ContextR.get(PlayerService.class);

        logger.info("[FastLoginR]"+playerService);
        playerService.playerRegister(null);*/

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}