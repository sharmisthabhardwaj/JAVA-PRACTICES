import oracle.Softwares1;
import sun.Softwares;

public class SoftwareList {
	protected SoftwareList()
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Softwares objsun=new sun.Softwares();
objsun.listSoftware();
Softwares1 objoracle=new oracle.Softwares1();
objoracle.printSoftware();
	}
}