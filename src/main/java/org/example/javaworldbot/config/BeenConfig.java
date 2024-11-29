package org.example.javaworldbot.config;


import org.example.javaworldbot.bot.Bot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@ComponentScan

public class BeenConfig {
    @Bean
    public TelegramBotsApi telegramBotsApi(Bot bot){
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
            return telegramBotsApi;
        }
        catch (TelegramApiException e){
            throw new RuntimeException(e);
        }
    }
}
