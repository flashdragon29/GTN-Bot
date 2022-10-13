package org.example.Events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class helloevent extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] msgsent = event.getMessage().getContentRaw().split(" ");

        if (msgsent[0].equalsIgnoreCase("-play")) {

            if (msgsent.length == 1) {
                event.getMessage().reply("Invalid format").queue();
                event.getMessage().reply("use -play <number>").queue();

            } else if (msgsent.length == 2) {
                int rnd = new Random().nextInt(10);
                try {
                    int ans = Integer.parseInt(msgsent[1]);
                    if (rnd == ans) {
                        event.getMessage().reply("You Guessed Correct!").queue();
                    } else {
                        event.getMessage().reply("you Guessed Wrong!, the num was " + rnd).queue();
                    }
                } catch (NumberFormatException e) {
                    event.getMessage().reply("Enter a Valid Number").queue();
                }


            } else {
                event.getMessage().reply("Enter a Valid Format").queue();
            }


        }
    }


}

