/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args){
    longestStreak ("CCAAAAATTT!");
  }

  public static void longestStreak (String str){
    str = str.toUpperCase();
    int highestNumber = 0;
    int currentCount = 0;
    String mostLetter = "";
    String previousLetter = "";
    String currentLetter = "";
    int lengthOfString = str.length();
    
    for(int i = 0; i < lengthOfString; i++){
        currentCount ++;
        currentLetter = str.substring(i, i+1);
        
        if(!previousLetter.equals(currentLetter)){
            currentCount = 1;
            System.out.println(previousLetter + " is not " + currentLetter + ", currentCount reset to 1"); // Test code
        }
        
        if(currentCount > highestNumber){
            mostLetter = str.substring(i, i+1);
            highestNumber = currentCount;
            System.out.println(mostLetter + " is the current most character, there are " + highestNumber + " of it"); // Test code
        }

        previousLetter = str.substring(i, i+1);
        
        System.out.println(mostLetter + " " + highestNumber);
      }
    // This line will be added after being verified - System.out.println(mostLetter + " " + highestNumber);  
  }
}
