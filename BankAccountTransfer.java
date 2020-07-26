package BestBright;

public class BankAccountTransfer {
	      String id,name;
	      int balance=0;
	  public BankAccountTransfer(String id,String name) {
		            this.id= id;
		              this.name = name;
	                  }
	  public BankAccountTransfer(String id,String name,int bala) {
		      this.id = id;
		      this.name =name;
		      this.balance = bala;
		  
	           }
	  public int Credit(int  amt) {

		  balance +=amt;	
		  return balance;
		  }
	  public void Debit(int amt) {
		  if(amt<balance) {
			  balance -= amt;
		            } else {
			         System.out.println("amount is not insufficient");
		      }
	  }
	  public void TransferTO(BankAccountTransfer other,int amt) {
		  if(amt<=balance) {
			  balance -= amt;
			 other.Credit(amt);
		        }else {
		        	System.out.println("amount accesses");
		        }
	                 
	       }
	      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           BankAccountTransfer b1 = new BankAccountTransfer("a1","Pan Ei Phyu",500000);
           BankAccountTransfer b2 = new BankAccountTransfer("a2","Thet Mon",500000);
           System.out.println("The balance of" +b1.name +"is" + b1.balance);
           System.out.println("The balance of" +b2.name + "is" +b2.balance);
           b1.TransferTO(b2,500000);
           System.out.println("The current balance" +b1+"is"+b1.balance);
           System.out.println("The current balance"+b2+"is"+b2.balance);
	}

}
