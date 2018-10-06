/**
      @author       Marco Martinez
      @fileName     AppDriver.java
      @version      1.0
      @description  This program will test the functionality of MyString.
      @date         10/1/2018
  
      Program Change Log 
      ==================
      Name        Date     Description
      Marco       10/1     Create baseline for AppDriver
      Marco       10/4     Add finishing touches to AppDriver
 */
 
public class AppDriver
{
   public static void main(String[] args) 
   {
      // Test Variable Definitions
      char testChar = 'C';
      int sizeOfArray = 22;
      char[] testCharArray = new char[]{'T','h','i','s',' ','i','s',' ','a',' ','t','e','s','t',' ','a','r','r','a','y','.'};
      String testString = new String("This is a test string.");
      
      // MyString Constructors
      MyString firstTest = new MyString(testChar);
      System.out.println("MyString(Char): " + firstTest.toString());
         
      MyString secondTest = new MyString(testCharArray, sizeOfArray);
      System.out.println("MyString(Char[], int): " + secondTest.toString());
         
      MyString thirdTest = new MyString(testString);
      System.out.println("MyString(String): " + thirdTest.toString());
         
      MyString copyCat = new MyString(thirdTest);
      System.out.println("MyString(MyString): " + copyCat.toString());
      
      // Baseline for tests
      System.out.println("======================");
      System.out.println(copyCat.toString());
      System.out.println("======================\n");
      
      // Change State Tests
      copyCat.setChar(2,'u');
      System.out.println("Set specific character of MyString using character: " + copyCat.toString());
      
      copyCat.setChar(5,4,new char[]{'m','o','j','o'});
      System.out.println("Set specific characters of MyString using character array: " + copyCat.toString());
      
      copyCat.setChar(10,"jackhammers");
      System.out.println("Set specific characters of MyString using String: " + copyCat.toString());
      
      copyCat.setChar(0,thirdTest);
      System.out.println("Set specific chacters of MyString using anotherMyString: " + copyCat.toString());
      
      copyCat.setUpperCase();
      System.out.println("Set MyString to uppercase: " + copyCat.toString());
      
      copyCat.setLowerCase();
      System.out.println("Set MyString to lowercase: " + copyCat.toString());
      
      copyCat.setInvert();
      System.out.println("Set MyString to inverted form of itself: " + copyCat.toString());
      
      copyCat.sortString();
      System.out.println("Sort MyString: " + copyCat.toString());
      
      // Read State Services
      System.out.println("Get specific character of MyString: " + Character.toString(thirdTest.getChar(6)));
      
      System.out.println("Get character array of MyString: " + new String(thirdTest.getChar(8,14)));
      
      System.out.println("Get length of MyString: " + Integer.toString(thirdTest.getLength()));
      
      System.out.println("Get integer value of MyString: " + Integer.toString(thirdTest.getValue()));
      
      MyString leftString = thirdTest.getLeft(4);
      System.out.println("Get left character(s) of MyString: " + leftString.toString());
      
      MyString rightString = thirdTest.getRight(4);
      System.out.println("Get right character(s) of MyString: " + rightString.toString());
      
      MyString middleString = thirdTest.getMiddle(5,6);
      System.out.println("Get middle character(s) of MyString: " + middleString.toString());
      
      if (thirdTest.search("test") == -1) System.out.println("Not found.");
      else System.out.println("Searched element(s) found at: " + thirdTest.search("test") + ".");
      
      if (thirdTest.search(new MyString("is")) == -1) System.out.println("Not found.");
      else System.out.println("Searched element(s) found at: " + thirdTest.search(new MyString("is")) + ".");
      
      if (thirdTest.search(new char[]{'T','h','i','s',' '}, 5) == -1) System.out.println("Not found.");
      else System.out.println("Searched element(s) found at: " + thirdTest.search(new char[]{'T','h','i','s',' '}, 5) + ".");
      }
}
