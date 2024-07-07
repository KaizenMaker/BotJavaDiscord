package kaizenmaker.bot.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

public class BotLauncher extends ListenerAdapter {

    public static JDA jda;

    public static void main (String[] args){

        jda = JDABuilder.create("MTI1ODYxNzU3OTE1MzY1Nzg2Ng.GjmCEg.tW-ZyLR-JPoDVe5vHr6BNpPtbEkDJbVXN4YmYs",
                EnumSet.allOf(GatewayIntent.class)).build();

        jda.addEventListener(new BotLauncher());


    }
}
