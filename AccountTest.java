class Account{
String name;
protected double balance;
Account(String str, double amt)
{
name=str;
balance=amt;
}
String getName()
{
return name;
}
double getBalance()
{
return balance;
}
void deposit(double amt)
{
balance += amt;
System.out.println("depositing:"+amt);
}
void withdraw(double amt)
{
balance -= amt;
System.out.println("withdrawing: " +amt);
}}
class SavingsAccount extends Account
{
double interestRate;
SavingsAccount(String str, double amt, double rate) 
{ 
super(str, amt);
interestRate = rate;
}
}
class CheckingAccount extends Account
{
double overDraft;
CheckingAccount(String str, double amt)
{
super(str, amt);
}
CheckingAccount(String str, double amt, double draft)
{
super(str, amt);
overDraft=draft;
}
void withdraw(double amt)
{
System.out.println("overdraft amt: " +overDraft);
if(amt<=balance)
{
balance-=amt;
System.out.println("withdrawing: "+amt);
}
else if((amt>balance)&&(amt>(balance+overDraft)))
{
System.out.println("sorry! you cannot withdraw");
}
else
{
double result=amt-balance;
overDraft-=result;
balance=0;
System.out.println("withdrawing: "+amt);
System.out.println("current overdraft amont: "+overDraft);
}}}
class AccountTest{
public static void main(String[] args)
{
SavingsAccount sAccountobj= new SavingsAccount("john",500,4);
System.out.println("\n savings account details");
System.out.println("-----------------------------");
System.out.println("" +sAccountobj.getName() +"has an initial balance of : " +sAccountobj.getBalance());
sAccountobj.deposit(200);
sAccountobj.withdraw(200);
System.out.println(""+ sAccountobj.getName()+"at the end of transaction has a balance of:"+sAccountobj.getBalance());
System.out.println("\n checking account details");
System.out.println("-----------------------------");
CheckingAccount cAccountobj= new CheckingAccount("stephen",200,200);
System.out.println("" +cAccountobj.getName() + " has an initial balance of :"+ cAccountobj.getBalance());
cAccountobj.deposit(200);
cAccountobj.withdraw(500);
System.out.println(""+ cAccountobj.getName()+"at the end of transaction has a balance of:"+cAccountobj.getBalance());
}}