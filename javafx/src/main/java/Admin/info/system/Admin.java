package Admin.info.system;
import SlotsPackage.slots;
import Users.info.system.Users;

import java.util.Scanner;

public class Admin extends Users {
   public Admin(){}

   public Admin(String name,String password){
      super(name,password);
   }
   public Admin(String name,String password,String email, String phoneNumber){
      super(name, password, email, phoneNumber);
   }

   public int menu(){
      System.out.println(
              "1. Add slots\n" +
              "2. Delete any entity\n" +
              "3. Display all available slots for all rooms)\n"+ // (room type, room ID,slot details <date and time>
              "4. Display all visitor’s data\n" +
              "5. Display all rooms’ data\n" +
              "6. Display all instructor’s data\n" +
              "7. Calculate the total amount of money for a room \n" +
              "8. Update any data of any entity");
      Scanner s = new Scanner(System.in);
      int answer = s.nextInt();
      return answer;
   }

   public void addSlot(){
      Scanner s = new Scanner(System.in);
      System.out.println("Start Time : "); int sT = s.nextInt();
      System.out.println("End Time : "); int eT = s.nextInt();
      System.out.println("Date : "); String D = s.next();
      System.out.println("Room Type : "); String rT = s.next();
      System.out.println("Availability : "); boolean aV = s.nextBoolean();
      //fees are not typed yet <<don't forget>>
      //slots s = new slots()
      //add it to the data base
   }






}
