import java.util.*; 

 class Five{		
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		bank.setAccountNumber("45646597895");
		bank.setBalance(652.0);

		System.out.println(bank.getAccNo());
			System.out.println(bank.getBal());
	}
}
class BankAccount{
	private String AccNo;
	private double Bal;
	public void setAccountNumber(String AccNo){

		if(AccNo!=null&&!AccNo.isEmpty()){
			this.AccNo=AccNo;
		}else{
			System.out.println("Invalid accountNumber");
		}
	}
	public void setBalance(double Bal){
		if(Bal>=0){
			this.Bal=Bal;
		}else{
			System.out.println("Insufficent bank balance");
		}
	}
	   public String getAccNo() {
        return AccNo;
    }

    public double getBal() {
        return Bal;
    }

}