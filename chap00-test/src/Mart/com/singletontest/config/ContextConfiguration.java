package Mart.com.singletontest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Mart.com.singletontest.Cart.ShoopingCart;
import Mart.com.singletontest.Product.Meat;
import Mart.com.singletontest.Product.Product;
import Mart.com.singletontest.Product.Snacks;
import Mart.com.singletontest.Product.Vegetable;

@Configuration
public class ContextConfiguration {
	
	/*육류*/
	@Bean
	public Product beef() {
		return new Meat("소고기",22_900, 100 );
	}
	
	@Bean
	public Product pork() {
		return new Meat("돼지고기", 5_500, 100);
	}
	
	/*채소류*/
	@Bean
	public Product lettuce() {
		return new Vegetable("상추", 990, 100);
	}
	
	@Bean
	public Product cabbage() {
		return new Vegetable("배추", 6_500, 1500);
	}
	
	/*스낵류*/
	@Bean
	public Product indianBop() {
		return new Snacks("인디안밥", 1_500, 83);
	}
	
	@Bean
	public Product homeRunBall() {
		return new Snacks("홈런볼", 1_500, 46);
	}
	
	@Bean
	@Scope("prototype")
	public ShoopingCart cart() {
		return new ShoopingCart();
	}
	

}
