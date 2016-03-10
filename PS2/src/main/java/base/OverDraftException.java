package base;


public class OverDraftException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double withdrawAmount;
	
	
	

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}



	public double getWithdrawAmount() {
		return withdrawAmount;
	}
  


	public OverDraftException(double witdrawAmount)
	{
		this.withdrawAmount = getWithdrawAmount();
	}



	public OverDraftException(String string, double difference) {
		this(difference);
		System.out.print(string);
	}

}
