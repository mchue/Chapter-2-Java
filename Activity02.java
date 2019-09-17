public class Activity02{
  public static void main(String[] args){
    
    /** Write a program that has the following String variables: firstName, middleName, and lastName.
      * Initialize these with your first, middle, and last names. The program should also have the
      * following char variables: firstIntial, middleIntial, and lastIntial. Store your first, middle,
      * and last initials in these variables. The program should display the contents of these variables
      * on the screen.
      */ 
    
    String firstName = "Hli";
    String middleName = "Teresa";
    String lastName = "Tswb";
    
       // OR //
    /** String firstName, middleName, lastName; (if you just want to initialized them without being given a value*/
    
    char firstInitial = firstName.charAt(0);
    char middleInitial = middleName.charAt(0);
    char lastInitial = lastName.charAt(0);
    
    // OR //
    /** char firstIntial, middleIntial, lastIntial; (if you just want to initialized them without being given a value*/
    
    System.out.println("My name is: "+firstName+" "+middleName+" "+lastName);
    System.out.print("My initial: " +firstInitial+"."+middleInitial+"."+lastInitial);
    

  }
}