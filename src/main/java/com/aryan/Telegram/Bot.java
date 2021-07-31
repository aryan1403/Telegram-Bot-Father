package com.aryan.Telegram;

import com.aryan.Telegram.Plugins.Greets.greets;
import com.aryan.configuration.config;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot{

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().getText().startsWith(config.handler))
            sendRequest(update, update.getMessage().getText());
        
    }

    public void sendRequest(Update update, String cmd){
        new greets().handleRequest(update, cmd);
    }

    public Message sendMessage(Update update, String text){
        SendMessage sMessage = new SendMessage();
        sMessage.setChatId(update.getMessage().getChatId().toString());
        sMessage.enableMarkdown(true);
        sMessage.setText(text);
        try {
            Message message = execute(sMessage);
            return message;
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getBotUsername() {
        return config.botUsername;
    }

    @Override
    public String getBotToken() {
        return config.botToken;
    }
    
}
