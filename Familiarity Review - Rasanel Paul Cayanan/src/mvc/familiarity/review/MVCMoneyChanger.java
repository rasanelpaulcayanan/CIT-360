package mvc.familiarity.review;

public class MVCMoneyChanger {

	public static void main(String[] args) {
		
		MoneyChangerView theView = new MoneyChangerView();
		
		MoneyChangerModel theModel  = new MoneyChangerModel();
		
		MoneyChangerController theController = new MoneyChangerController(theView,theModel);
	
		theView.setVisible(true);
		
	}

}
