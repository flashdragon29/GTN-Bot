package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.Events.helloevent;

public class Main {
    public static void main(String[] args) {

        JDA bot = JDABuilder.createDefault("MTAyOTk3Nzg4ODA1OTA0Mzg1MQ.G8lvYf.WPL7kyi44SJnadQx5DwqUdD-EnpJwFE2DQyYCA", GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.playing("Playing Guess The Number"))
                .addEventListeners(new helloevent())
                .build();
    }
}