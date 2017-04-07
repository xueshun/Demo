package strategyModel;

public class Demo {
	static double totalMoney = 0.0d;
	public static void main(String[] args) {
		CashSuper csuper = CashFactory.createCashAccept("正常收费");
		double totalPrice = 0.0d;
		totalPrice = csuper.acceptCash(Double.parseDouble("158.5"));
		totalMoney = totalMoney + totalPrice;
		System.out.println(totalMoney);
	}
}

class CashFactory{
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300返100":
			cs = new CashReturn("300", "100");
			break;
		case "打8折":
			cs = new CashRebate("0.8");
			break;
		}
		return cs;
	}
}
