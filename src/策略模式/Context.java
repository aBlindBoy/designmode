package ����ģʽ;

import ����ģʽ.�ӿ�.PromotionStrategy;

public class Context {

	private PromotionStrategy promotionStrategy;

	public Context(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public int executeDepreciate(int a, int b) {
		return promotionStrategy.depreciate(a, b);
	}

	public float executeDiscount(int a, float b) {
		return promotionStrategy.discount(a, b);
	}

}
