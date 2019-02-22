public class WrapperDemo{
	public static void main(String args[]) {
      Integer intObj1 = new Integer(25);
      Integer intObj2 = new Integer("25");
      Integer intObj3 = new Integer(35);
      // compareTodemo
      System.out.println("ComparingusingcompareToObj1andObj2:" + intObj1.compareTo(intObj2));
      System.out.println("ComparingusingcompareToObj1andObj3:" + intObj1.compareTo(intObj3));
      // Equals demo
      System.out.println("ComparingusingequalsObj1andObj2:" + intObj1.equals(intObj2));
      System.out.println("ComparingusingequalsObj1andObj3:" + intObj1.equals(intObj3));
      Float f1 = new Float("2.25f");
      Float f2 = new Float("20.43f");
      Float f3 = new Float("2.25f");
      
      //System.out.println("Comparingusingcomparef1andf2:" + Float.compare(f1, f2));
      //System.out.println("Comparingusingcomparef1andf3:" + Float.compare(f1, f3));
       //AdditionofIntegerwithFloat
      //Float f = intObj1.floatValue() + f1;
      //System.out.println("AdditionofintObj1andf1:" + intObj1 + "+" + f1 + "=" + f);
	}
}