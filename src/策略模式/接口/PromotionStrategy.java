package ����ģʽ.�ӿ�;

import java.math.BigDecimal;

/**
 * 
 * @author 23853
 * 
 */
public interface PromotionStrategy {

	// ���ݽ��۴���
	int depreciate(int a, int b);

	// ���ݴ��۴���
	float discount(int a, float b);

}
