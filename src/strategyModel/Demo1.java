package strategyModel;

/**
 * 现金收费抽象类
 * @author Administrator
 *
 */
abstract class CashSuper {
	public abstract double acceptCash(double money);
}

/**
 * 正常收费
 * @author Administrator
 *
 */
class CashNormal extends CashSuper{
	@Override
	public double acceptCash(double money) {
		return 0;
	}
	
}

/**
 * 打折收费
 * @author Administrator
 *
 */
class CashRebate extends CashSuper{
	private double moneyRebate;//打折利率
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}
}
/**
 * 返利收费模式
 * @author Administrator
 *
 */
class CashReturn extends CashSuper{	
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money >= moneyCondition){
			result = money - Math.floor(money / moneyCondition)* moneyReturn;
		}
		return result;
	}
	
}


