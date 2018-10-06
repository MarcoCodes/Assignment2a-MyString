/**
   @author       Marco Martinez
   @fileName     MyString.java
   @version      1.1
   @description  This program will construct and manipulate MyString objects.
   
   Classes
   AppDriver
   MyString
   
   Associations
   AppDriver --- 1 : 2 ---> MyString
   
   Instance Variables
   (-) myString
   (-) length
   
   Constructors
   (+) MyString() 				
   (+) MyString(in char newChar)	 		
   (+) MyString(in char[] newChar,in int size)  
   (+) MyString(in String newString)		
   (+) MyString(in MyString anotherMyString)		
   
   Change State Services
   (+) setChar(in int index, in char newChar)
   (+) setChar(in int startPos, in int index, in char[] newChar)
   (+) setUpperCase()
   (+) setLowerCase()
   (+) setInvert()
   (+) sortString()

   Read State Services
   (+) getChar(in int index, out char newChar)
   (+) getChar(in int startPos, in int index, out char[] newChar)
   (+) getLength(out int length)
   (+) getIntValue(out int value)
   (+) getLeft(in int index, out MyString leftString)
   (+) getRight(in int index, out MyString rightString)
   (+) getMiddle(int int startPos, in int index, out MyString middleString)
   (+) search(in String isIn, out int startPos)
   (+) search(in myString isIn, out int startPos)
   (+) search(in char[] isIn, in int length, out int startPos)
   (+) toString(out String outString)

   @date         10/1/2018

   Program Change Log 
   ==========================
   Name      Date   Description
   Marco     10/1   Create baseline for MyString.
   Marco     10/3   Refine MyString and fix consistency.
 */
 
public class MyString
{
   // INSTANCE VARIABLE DECLARATIONS
   private char[] myChar;
   private int length;

   // CLASS CONSTRUCTORS
   // (+) MyString()  				
   public MyString(){}

   // (+) MyString(in char newChar)	 
   public MyString(char newChar)
   {
      this.length = 0;
      this.myChar = new char [1];
      this.myChar[0] = newChar;
   }
    
   // (+) MyString(in char[] newChar,in int size)  
   public MyString(char newChar[], int size)
   {
      this.length = size;
      this.myChar = new char [this.length];
      this.myChar = newChar;
   }
    
   // (+) MyString(in String newString)	
   public MyString(String newString) 
   {
      this.length = newString.length();
      this.myChar = new char [this.length];
      this.myChar = newString.toCharArray();
   }
    
   // (+) MyString(in MyString anotherMyString)	
   public MyString(MyString anotherMyString)
   {
      this.length = anotherMyString.getLength();
      this.myChar = anotherMyString.getChar(0, anotherMyString.getLength());   
   }
    
   // CHANGE STATE SERVICES
   // (+) setChar(in int index, in char newChar)
   public void setChar(int index, char newChar)
   {
      if (index <= this.length && index >= 0) myChar[index] = newChar;
   }
   
   // (+) setChar(in int startPos, in int index, in int size, in char[] newChar)
   public void setChar(int startPos, int index, char[] newChar)
   {
      if (index == 1)
      {
         myChar[startPos] = newChar[startPos];
         return;
      }
      
      else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
      {
         for (int i = 0; i < index; i++)
         {
            this.myChar[startPos] = newChar[i];
            startPos++;
         }
      }
      return;
   }
   
   // (+) setChar(int startPos, String newString)
   public void setChar(int startPos, String newString)
   {
      int index = newString.length();
      char[] newChar = new char [index];
      newChar = newString.toCharArray();
      
      if (index == 1)
      {
         myChar[startPos] = newChar[startPos];
         return;
      }
      
      else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
      {
         for (int i = 0; i < index; i++)
         {
            this.myChar[startPos] = newChar[i];
            startPos++;
         }
      }
      return;
   }
   
   // (+) setChar(int startPos, MyString newString)
   public void setChar(int startPos, MyString newString)
   {
      int index = newString.getLength();
      char[] newChar = new char[index];
      newChar = newString.getChar(0, index);
      
      if (index == 1)
      {
         myChar[startPos] = newChar[startPos];
         return;
      }
      
      else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
      {
         for (int i = 0; i < index; i++)
         {
            this.myChar[startPos] = newChar[i];
            startPos++;
         }
      }
      return;
   }
    
   // (+) setUpperCase()
   public void setUpperCase()
   {
      for (int i = 0; i < this.length; i++)
      {
         if (this.myChar[i] == 'a') this.myChar[i] = 'A';
         else if (this.myChar[i] == 'b') this.myChar[i] = 'B';
         else if (this.myChar[i] == 'c') this.myChar[i] = 'C';
         else if (this.myChar[i] == 'd') this.myChar[i] = 'D';
         else if (this.myChar[i] == 'e') this.myChar[i] = 'E';
         else if (this.myChar[i] == 'f') this.myChar[i] = 'F';
         else if (this.myChar[i] == 'g') this.myChar[i] = 'G';
         else if (this.myChar[i] == 'h') this.myChar[i] = 'H';
         else if (this.myChar[i] == 'i') this.myChar[i] = 'I';
         else if (this.myChar[i] == 'j') this.myChar[i] = 'J';
         else if (this.myChar[i] == 'k') this.myChar[i] = 'K';
         else if (this.myChar[i] == 'l') this.myChar[i] = 'L';
         else if (this.myChar[i] == 'm') this.myChar[i] = 'M';
         else if (this.myChar[i] == 'n') this.myChar[i] = 'N';
         else if (this.myChar[i] == 'o') this.myChar[i] = 'O';
         else if (this.myChar[i] == 'p') this.myChar[i] = 'P';
         else if (this.myChar[i] == 'q') this.myChar[i] = 'Q';
         else if (this.myChar[i] == 'r') this.myChar[i] = 'R';
         else if (this.myChar[i] == 's') this.myChar[i] = 'S';
         else if (this.myChar[i] == 't') this.myChar[i] = 'T';
         else if (this.myChar[i] == 'u') this.myChar[i] = 'U';
         else if (this.myChar[i] == 'v') this.myChar[i] = 'V';
         else if (this.myChar[i] == 'w') this.myChar[i] = 'W';
         else if (this.myChar[i] == 'x') this.myChar[i] = 'X';
         else if (this.myChar[i] == 'y') this.myChar[i] = 'Y';
         else if (this.myChar[i] == 'z') this.myChar[i] = 'Z';
      } 
   }
  
   // (+) setLowerCase()
   public void setLowerCase()
   {
      for (int i = 0; i < this.length; i++)
      {
         if (this.myChar[i] == 'A') this.myChar[i] = 'a';
         else if (this.myChar[i] == 'B') this.myChar[i] = 'b';
         else if (this.myChar[i] == 'C') this.myChar[i] = 'c';
         else if (this.myChar[i] == 'D') this.myChar[i] = 'd';
         else if (this.myChar[i] == 'E') this.myChar[i] = 'e';
         else if (this.myChar[i] == 'F') this.myChar[i] = 'f';
         else if (this.myChar[i] == 'G') this.myChar[i] = 'g';
         else if (this.myChar[i] == 'H') this.myChar[i] = 'h';
         else if (this.myChar[i] == 'I') this.myChar[i] = 'i';
         else if (this.myChar[i] == 'J') this.myChar[i] = 'j';
         else if (this.myChar[i] == 'K') this.myChar[i] = 'k';
         else if (this.myChar[i] == 'L') this.myChar[i] = 'l';
         else if (this.myChar[i] == 'M') this.myChar[i] = 'm';
         else if (this.myChar[i] == 'N') this.myChar[i] = 'n';
         else if (this.myChar[i] == 'O') this.myChar[i] = 'o';
         else if (this.myChar[i] == 'P') this.myChar[i] = 'p';
         else if (this.myChar[i] == 'Q') this.myChar[i] = 'q';
         else if (this.myChar[i] == 'R') this.myChar[i] = 'r';
         else if (this.myChar[i] == 'S') this.myChar[i] = 's';
         else if (this.myChar[i] == 'T') this.myChar[i] = 't';
         else if (this.myChar[i] == 'U') this.myChar[i] = 'u';
         else if (this.myChar[i] == 'V') this.myChar[i] = 'v';
         else if (this.myChar[i] == 'W') this.myChar[i] = 'w';
         else if (this.myChar[i] == 'X') this.myChar[i] = 'x';
         else if (this.myChar[i] == 'Y') this.myChar[i] = 'y';
         else if (this.myChar[i] == 'Z') this.myChar[i] = 'z';
      } 
   }
  
   // (+) setInvert()
   public void setInvert()
   {
      for (int i = 0; i < this.length / 2; i++)
      {
         char temp = this.myChar[i];
         this.myChar[i] = this.myChar[this.length - i -1];
         this.myChar[this.length - i - 1] = temp;
      }
   }
   
   // (+) sortString()
   public void sortString()
   {
      char temp;
      
      for (int i = 0; i < this.length; i++)
      {
         for (int j = 0; j < this.length - 1; j++)
         {
            if (this.myChar[j+1] < this.myChar[j])
            {
               temp = this.myChar[j];
               this.myChar[j] = this.myChar[j+1];
               this.myChar[j+1] = temp;
            }
         }
      }
   }
  
   // READ STATE SERVICES
   // (+) getChar(in int index, out char newChar)
   public char getChar(int index)
   {
      if (index <= this.length && index >= 0) return this.myChar[index];
      else return '0';
   }
   
   // (+) getChar(int int startPos, in int index, out char[] newChar)
   public char[] getChar(int startPos, int index)
   {
      char[] temp = new char[index];
      
      if (index == 1)
      {
         temp[startPos] = this.myChar[startPos];
         return temp;
      }
      
      else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
      {
         for (int i = 0; i < index; i++)
         {
            temp[i] = this.myChar[startPos];
            startPos++;
         }
      }
      return temp;
   }
  
   // (+) getLength(out int length)
   public int getLength()
   {
      return this.length;
   }
   
   // (+) getIntValue(out int value)
   public int getValue()
   {
      int myInt = 0;
      
      for (int i = 0; i < this.length; i++)
      {
         myInt += this.myChar[i];
      }
      
      return myInt;
   }
  
   // (+) getLeft(in int index, out MyString leftString)
   public MyString getLeft(int index)
   {
      int startPos = 0;
      
      {
         if (index == 1)
         {
            return new MyString(this.myChar[startPos]);
         }
         else if (startPos < this.length && startPos >= 0)
         {  
            char[] temp = new char [index];
            
            for (int i = 0; i < index; i++)
            {
               temp[i] = this.myChar[startPos];
               startPos++;
            }
            return new MyString(temp, index);
         }
         return new MyString();
      }
   }
  
   // (+) getRight(in int index, out MyString rightString)
   public MyString getRight(int index)
   {
      int startPos = this.length - index - 1;
      
      if (index == 1)
      {
         return new MyString(this.myChar[startPos]);
      }
      else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
      {  
         char[] temp = new char [index];
            
         for (int i = 0; i < index; i++)
         {
            temp[i] = this.myChar[startPos];
            startPos++;
         }
         
         return new MyString(temp, index);
      }
      
      return new MyString();
   }
   
   // (+) getMiddle(int int startPos, in int index, out MyString middleString)
   public MyString getMiddle(int startPos, int index)
   {
      {
         if (index == 1)
         {
            return new MyString(this.myChar[startPos]);
         }
         else if (startPos <  this.length && startPos >= 0 && index <= this.length && index > 1)
         {  
            char[] temp = new char [index];
            
               for (int i = 0; i < index; i++)
               {
                  temp[i] = this.myChar[startPos];
                  startPos++;
               }
            
            return new MyString(temp, index);
         }
         
         return new MyString();
      }
   }
    
   // (+) search(in String isIn, out int startPos)
   public int search(String test)
   {
      int lengthOf = test.length();
      char[] isIn = new char [lengthOf];
      isIn = test.toCharArray();
      int myPlace;
      int newPlace;
      int checker;
      
      for (int i = 0; i < this.length; i++)
      { 
         myPlace = newPlace = checker = 0;
         if (this.myChar[i] == isIn[0])
         {
            myPlace = i;
               
            while (this.myChar[myPlace] == isIn[newPlace])
            {
               checker++;
               myPlace++;
               newPlace++;
               if (checker == lengthOf) return i + 1;
            }
         }
      }
    
      return -1;
   }
   
   // (+) search(in myString isIn, out int startPos)
   public int search(MyString isIn)
   {
      int myPlace;
      int newPlace;
      int checker;
      
      for (int i = 0; i < this.length; i++)
      { 
         myPlace = newPlace = checker = 0;
         if (this.myChar[i] == isIn.getChar(0))
         {
            myPlace = i;
               
            while (this.myChar[myPlace] == isIn.getChar(newPlace))
            {
               checker++;
               myPlace++;
               newPlace++;
               if (checker == isIn.getLength()) return i + 1;
            }
         }
      }
    
      return -1;
   }
  
   // (+) search(in char[] isIn, in int length, out int startPos)
   public int search(char[] isIn, int lengthOf)
   {
      int myPlace;
      int newPlace;
      int checker;
      
      for (int i = 0; i < this.length; i++)
      { 
         myPlace = newPlace = checker = 0;
         if (this.myChar[i] == isIn[0])
         {
            myPlace = i;
               
            while (this.myChar[myPlace] == isIn[newPlace])
            {
               checker++;
               myPlace++;
               newPlace++;
               if (checker == lengthOf) return i + 1;
            }
         }
      }
    
      return -1;
   }
   
   // (+) toString(out String outString)
   public String toString()
   {
      return new String(this.myChar);
   }
}