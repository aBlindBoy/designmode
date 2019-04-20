package 策略模式.接口.Impl;

import 策略模式.接口.PromotionStrategy;

public class XiaoMiItem implements PromotionStrategy {

	@Override
	public int depreciate(int a, int b) {
		return a - b;
	}

	@Override
	public float discount(int a, float b) {
		return a * b;
	}

}
