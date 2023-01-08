package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//(exclude = DataSourceAutoConfiguration.class)
						// отключает автоматическую кофигурацию подключения к БД
						// Ручная настройка - в тестовом классе ManualJdbcConnectService

public class CatsgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsgramApplication.class, args);
	}

}
