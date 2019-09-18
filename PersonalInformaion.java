public class PersonalInformaion{
  public static void main(String[] args){
    
  /** Write a program that displays the following information, each on a separate line:
    * Your name
    * Your address, with city, state, and ZIP
    * Your telephone number
    * Your college majore
    * 
    * Although these items should be displayed on separate output lines, use only a single
    * println statement in your program.
    */
 
  String name, address, telephone, collegeMajor; //Initializing your variables //
  
  // Giving your String variables a value //
  name = "Hli Teresa";                           
  address = "1233 Happy Land Drive, TX, 79925";
  telephone = "(234) 345 - 3577";
  collegeMajor = "Computer Science";
  
  // Printing using a single println statement //
  System.out.println("My name is: "+name+", and my address is: "+address+". Please call me at: "+telephone
                       +" if you have any question about this code because I am majoring in "+collegeMajor);
  
  }
}