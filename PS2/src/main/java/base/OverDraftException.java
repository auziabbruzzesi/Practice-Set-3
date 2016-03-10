package base;


public class OverDraftException extends Exception{
	private double withdrawAmount;
	
	
	
	public double getWithdrawAmount() {
		return withdrawAmount;
	}



	public OverDraftException(double witdrawAmount)
	{
		this.withdrawAmount = withdrawAmount;
	}

}
