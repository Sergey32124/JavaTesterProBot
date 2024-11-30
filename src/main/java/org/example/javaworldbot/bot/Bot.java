package org.example.javaworldbot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@Component
public class Bot extends TelegramLongPollingBot {
    public Bot() {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        String text = update.getMessage().getText();
        String name=update.getMessage().getFrom().getUserName();
        Long chat_id= update.getMessage().getChatId();

        System.out.println("chat_id : " + chat_id);
        System.out.println("name : " + name);
        System.out.println("text : " + text);
    }

    @Override
    public String getBotUsername() {
        return "JavaTesterProBot";
    }
}
