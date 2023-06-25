package Mart.com.singletontest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Mart.com.singletontest.Cart.ShoopingCart;
import Mart.com.singletontest.Product.Meat;
import Mart.com.singletontest.Product.Product;
import Mart.com.singletontest.Product.Snacks;
import Mart.com.singletontest.Product.Vegetable;
import Mart.com.singletontest.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(/*자바설정*/ContextConfiguration.class);
				
		Product beef = context.getBean("beef", Meat.class);
		Product pork = context.getBean("pork", Meat.class);
		Product lettuce = context.getBean("lettuce", Vegetable.class);
		Product cabbage = context.getBean("cabbage", Vegetable.class);
		Product indianBop = context.getBean("indianBop", Snacks.class);
		Product homeRunBall = context.getBean("homeRunBall", Snacks.class);
		
		/*민영 쇼핑카트*/
		ShoopingCart minyoung = context.getBean("cart", ShoopingCart.class);
		minyoung.addItem(homeRunBall);
		minyoung.addItem(homeRunBall);
		minyoung.addItem(beef);
		minyoung.addItem(pork);
		minyoung.addItem(pork);
		
		System.out.println("★★★★★ min_young shoopingcart★★★★★");
		minyoung.getItems();
		
		System.out.print("__ price : ");
		minyoung.priceItems();
		
		
		/*지환 쇼핑카트*/
		System.out.println();
		System.out.println();
		ShoopingCart jihwan = context.getBean("cart", ShoopingCart.class);
		jihwan.addItem(beef);
		jihwan.addItem(cabbage);
		jihwan.addItem(cabbage);
		jihwan.addItem(cabbage);
		
		System.out.println("★★★★★ ji_hwan shoopingcart★★★★★");
		jihwan.getItems();
		
		System.out.print("__ price : ");
		jihwan.priceItems();
		
	}

}
