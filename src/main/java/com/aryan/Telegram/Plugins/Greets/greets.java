package com.aryan.Telegram.Plugins.Greets;

import com.aryan.Telegram.Bot;
import com.aryan.Telegram.Utilities.Master;
import com.aryan.configuration.config;
import org.telegram.telegrambots.meta.api.objects.Update;

/*
 * For Handling Greets such as Hi, Hello
 * Work's for both private & Groups
*/
public class greets extends Bot implements Master{
    @Override
    public void handleRequest(Update update, String cmd) {
        if(cmd.equalsIgnoreCase(config.handler+"start")){
            String text = "Hey! [**"+update.getMessage().getFrom().getFirstName()+"**](https://t.me/"+update.getMessage().getFrom().getUserName()+")";
            sendMessage(update, text);
        }
    }
    
}
