package 策略模式.接口;

import java.math.BigDecimal;

/**
 * 
 * @author 23853
 * 
 */
public interface PromotionStrategy {

	// 根据降价促销
	int depreciate(int a, int b);

	// 根据打折促销
	float discount(int a, float b);

}
