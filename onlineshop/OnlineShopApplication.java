package de.telran.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {
 // В проект работы в классе добавлен файл DB.png, в котором описана примерная структура БД online магазина.
//Создайте контроллеры для каждой вида таблицы и реализуйте все CRUD методы для каждого объекта, используя парадигмы REST протокола:
//1) Users - пользователи              	- выполнено
//2) Products - товары					- выполнено
//*3) Cart - корзина
//*4) CartItems - товары в корзине
//*5) Orders - заказы
//*6) OrderItems - товары в заказе
//*7) Favorites - избранные товары		- выполнено
//*8) Categories - категории товаров.	- на уроке
//Для каждой сущности создайте пока POJO класс и информацию храните в List (например List).
//Используя полученные знания по жизненному циклу компонентов Spring, заполните тестовыми данными эти List.

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
