interface ITruck{
	 int getAxles();
	 int  getTotalWeight();
}
class Truck implements ITruck {
	int axles;
	 int totalWeight;

   Truck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
    }
     public int getAxles() {
    	return axles;
    	}
    public int getTotalWeight() {
    	return totalWeight;
    	}

}
interface ITollBooth{
	void calculateToll(Truck truck);
	void displayData();
	 void onReceiptCollection();

}
class TollBooth implements ITollBooth {
	 int receiptsSinceCollection;
	    int trucksSinceCollection;

    TollBooth() {
       trucksSinceCollection = 0;
       receiptsSinceCollection = 0;
    }

     public void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int totalWeight = truck.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/2000);
        System.out.println("******Truck arrival*******");
        System.out.println("No of Axles: " + axles);
        System.out.println("Total weight: " + totalWeight);  
        System.out.println("Toll due: " +tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
    }
     public void displayData() {
        System.out.println("Totals since last collection Receipts: " + receiptsSinceCollection);
        System.out.println("No of Trucks: " + trucksSinceCollection);

    }
     public void onReceiptCollection() {
        System.out.println("***Receipts Collection ***");
        displayData();
        trucksSinceCollection = 0;     
        receiptsSinceCollection = 0;
    }


}
public  class TollBothTest {
	public static void main(String [] args) {
        TollBooth booth = new TollBooth();
        Truck Ford = new Truck(5, 12500);
        Truck Nissan = new Truck(2, 5000);
        Truck Daweoo = new Truck(6, 17000);
        booth.calculateToll(Ford);
        booth.displayData();
        booth.calculateToll(Nissan);
        booth.displayData();
        booth.calculateToll(Daweoo);
        booth.displayData();
        booth.onReceiptCollection();

    }
}