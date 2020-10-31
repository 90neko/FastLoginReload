package com.ksptooi.flr.starter;

import com.google.inject.Injector;
import com.ksptooi.flr.entity.model.InputModel;
import com.ksptooi.flr.input.dispatch.adapter.InputAdapter;
import com.ksptooi.flr.input.command.PlayerCommandHandler;
import com.ksptooi.flr.module.export.ProcModule;
import com.ksptooi.flr.proc.exception.NotFoundHandlerException;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class FastLoginR extends JavaPlugin {

    public static final String currentVersion = "1.4F.51";

    public static final Injector injector= ProcModule.getInject();

    @Override
    public void onEnable() {

        Logger logger = Bukkit.getLogger();
        logger.info("[FastLoginR]版本:"+currentVersion);
        logger.info("[FastLoginR]尝试注入Services:");
        logger.info("[FastLoginR]");

        /*Thread.currentThread().setContextClassLoader(getClass().getClassLoader());*/

        InputAdapter instance = ProcModule.getInject().getInstance(InputAdapter.class);

        instance.regHandler(PlayerCommandHandler.class);
/*        instance.assign("login",null,null,null,null);*/


/*        DalModule.install(DatabaseType.H2);

        Injector inject = DalModule.getInject();

        PlayerMapper instance1 = inject.getInstance(PlayerMapper.class);

        FLRPlayer playerById = instance1.getPlayerById(1);

        System.out.println(playerById);*/

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    //命令执行器
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        //获取到适配器
        InputAdapter adapter = injector.getInstance(InputAdapter.class);

        InputModel model = null;

        try {

            model = adapter.assign(cmd.getName(), sender, cmd, label, args);

            if(model == null){
                sender.sendMessage("当前命令执行时出现内部错误,请联系管理员.");
                return false;
            }

        } catch (NotFoundHandlerException e) {
            sender.sendMessage("没有为该命令找到相应的处理器.");
            e.printStackTrace();
            return false;
        }


        return model.isFinish();
    }



}
