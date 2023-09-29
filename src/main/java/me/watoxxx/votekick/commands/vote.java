package me.watoxxx.votekick.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vote implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("§cYou can not use this command in the Console.");
            return true;
        }
        Player p = (Player) sender;
        if (args.length < 1){
            return false;
        }
        if (args.lenght > 1){
            if (args[1].equalsIgnoreCase("false"){
                VoteManager.vote(p, args[0], false);
                return true;
            }
            if (args[1].equalsIgnoreCase("true"){
                VoteManager.vote(p, args[0], true);
                return true;
            }
            
            return false;
        }
        VoteManager.vote(p, args[0, true);
        return true;
    }
}
