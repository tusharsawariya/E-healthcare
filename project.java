
// E-HealthCare-Management-System is a console based application which is built using java.
// This application helps in management of Patients, doctors, admin in a easy and comfortable
//  way.using this Application patients can quickly Sign up, Login, view his/her profile, view
//   doctors, book Appointment, view Report, choose doctor, view Appointments, give feedback, pay
//    online and logout. Admin can add Doctors,view patients list, view Doctors list,remove
//     doctors, see feedback given by patients,view reports,logout.Doctor can login, view profile
//     , viewAppointments, Attend Patients and logout.
import java.util.Scanner;

class ttt {

  void user() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter what you want");
    System.out.println("1:-sign up" + "       " + "2:-login");
    int s = sc.nextInt();
    if (s == 2) {

      System.out.println("enter the details");
      System.out.println(" name    ");
      sc.nextLine();
      String xyz = sc.nextLine();
      System.out.println("phone no.");
      long t1 = sc.nextLong();
      System.out.println("address");
      sc.nextLine();
      String t2 = sc.nextLine();
      System.out.println("your account make successfully");
      String h = xyz + "786";
      System.out.println(h);

    } else if (s == 1) {
      System.out.println("successfully sign up");
    }
    System.out.println("which type of doctor you want");
    System.out.println("1:-dentist " + "      " + "2:-skin specialist");
    System.out.println("3:-regular" + "       " + "4:-specialist");
    int h = sc.nextInt();
    if (h == 1) {
      System.out.println("1:-dr. TUSHAR SAWARIYA" + "      " + "2:-dr.MOHAN YADAV");
      int u = sc.nextInt();
      if (u == 1) {
        System.out.println("NAME = TUSHAR SAWARIYA");
        System.out.println("completed study from delhi medical collage");
        System.out.println("expirence above 10 year");
        System.out.println("address Indore");

        System.out.println("if you want to appoint doctor press yes");
        String r = sc.next();
        if (r.equals("yes")) {
          System.out.println("your appointment is fixed with dr. TUSHAR ");
        }
      } else if (u == 2) {
        System.out.println("NAME = MOHAN YADAV");
        System.out.println("completed study from ujjain ");
        System.out.println("experince above 10 year");
        System.out.println("address Ujjain");
        System.out.println("if you want to appoint doctor press yes");
        String r = sc.next();
        if (r.equals("yes")) {
          System.out.println("your appointment is fixed with dr. MOHAN ");
        }

      }
    } else if (h == 2) {
      System.out.println("1:-dr.SANSKAR SHUKLA " + "        " + "2:-dr.ROHAN MANDAREE");
      int y = sc.nextInt();
      if (y == 1) {
        System.out.println("NAME = SANSKAR SHUKLA");
        System.out.println("completed study from delhi medical collage");
        System.out.println("expirence above 10 year");
        System.out.println("address Indore");
        System.out.println("if you want to appoint doctor press yes");
        String r = sc.next();
        if (r.equals("yes")) {
          System.out.println("your appointment is fixed with dr.SANSKAR ");
        }
      } else if (y == 2) {
        System.out.println("NAME = ROHAN MANDAREE");
        System.out.println("completed study from ujjain ");
        System.out.println("experince above 10 year");
        System.out.println("address Ujjain");
        System.out.println("if you want to appoint doctor press yes");
        String i = sc.next();
        if (i.equals("yes")) {
          System.out.println("your appointment is fixed with dr. ROHAN ");
        }

      }
    } else if (h == 3) {
      System.out.println("1:-dr.JAYA PATIDAR " + "        " + "2:-dr.SUMIT CHOUHAN");
      int o = sc.nextInt();
      if (o == 1) {
        System.out.println("NAME = JAYA PATIDAR");
        System.out.println("completed study from delhi medical collage");
        System.out.println("expirence above 10 year");
        System.out.println("address Indore");
        System.out.println("if you want to appoint doctor press yes");
        String rr = sc.next();
        if (rr.equals("yes")) {
          System.out.println("your appointment is fixed with dr. JAYA ");
        }
      } else if (o == 2) {
        System.out.println("NAME = SUMIT CHOUHAN");
        System.out.println("completed study from ujjain ");
        System.out.println("experince above 10 year");
        System.out.println("address Ujjain");
        System.out.println("if you want to appoint doctor press yes");
        String rrr = sc.next();
        if (rrr.equals("yes")) {
          System.out.println("your appointment is fixed with dr. SUMIT CHOUHAN ");
        }

      }
    } else if (h == 4) {
      System.out.println("1:-dr.RATHI " + "        " + "2:-dr.HEMANT ");
      int z = sc.nextInt();
      if (z == 1) {
        System.out.println("NAME = RATHI ");
        System.out.println("completed study from delhi medical collage");
        System.out.println("expirence above 10 year");
        System.out.println("address Indore");
        System.out.println("if you want to appoint doctor press yes");
        String rrrr = sc.next();
        if (rrrr.equals("yes")) {
          System.out.println("your appointment is fixed with dr. RATHI ");
        }
      } else if (z == 2) {
        System.out.println("NAME =HEMANTH");
        System.out.println("completed study from ujjain ");
        System.out.println("experince above 10 year");
        System.out.println("address Ujjain");
        System.out.println("if you want to appoint doctor press yes");
        String rz = sc.next();
        if (rz.equals("yes")) {
          System.out.println("your appointment is fixed with dr. HEMANT ");
        }

      }

    }
    System.out.println("if you want to give fedback about doctor");
    sc.nextLine();
    String str = sc.nextLine();
    System.out.println(str);
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("                            " + " payment" + "                                       ");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("                                                                               ");
    System.out.println("      " + " 1:-online payment" + "                   " + "2:-CASH payment              ");
    int b = sc.nextInt();
    if (b == 1) {
      System.out.println("Online pay successfully");
    } else if (b == 2) {
      System.out.println("payment successfully");
    }
  }

  void admin( String h,String h1,String h2,String h4 ) {
     h="Tushar Sawariya";
       h1="Sanskar Shukla";
       h2="Rohan Mandaree";
       h4="Pranshant Gorele";
   
    Scanner S = new Scanner(System.in);
    int pass = 1234;
    System.out.println("enter the password");
    int i = S.nextInt();
    
    if (i == 1234) {
      System.out.println("              " + "WELCOME" + "        ");
      System.out.println("1:-add doctor" + "            " + "2:-patient list");
      System.out.println("3:-view doctor list" + "      " + "4:-remove doctor");
      System.out.println("5:-view report" + "           " + "6:-see feedbacks");
      System.out.println("what you want ");
      int y = S.nextInt();
      if (y == 1) {
        boolean bool = true;
        if (bool == true) {
          while (bool == true) {
            System.out.println("add doctor");
            S.nextLine();
            String g = S.nextLine();
            S.nextLine();
            System.out.println("press true to add more"+"       "+"press false to not add");

            bool = S.nextBoolean();
            
          }
          System.out.println("if you want to log out pres yes");
          String yy=S.nextLine();
          
          if(yy=="yes"){
            S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
        }
      }if(y==2){
        System.out.println("PATIENT LIST  :-");
        System.out.println("1:-Deepak Sharma");
        System.out.println("2:-Sharukh khan");
        System.out.println("3:-Rahul Gandhi");
        System.out.println("4:-Kamal Nath");
         System.out.println("if you want to log out");
          S.nextLine();
          String yy=S.nextLine();
          S.nextLine();
          if(yy=="yes"){
             S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
      }if(y==3){
      

        System.out.println("DOCTOR LIST");
        System.out.println("1:-"+h);
        System.out.println("2:-"+h1);
        System.out.println("3:-"+h2);
        System.out.println("4:-"+h4);
         System.out.println("if you want to log out");
          S.nextLine();
          String yy=S.nextLine();
          S.nextLine();
          if(yy=="yes"){
            S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
      }if(y==4){
        System.out.println("enter the doctor name");
        S.nextLine();
        String j=S.nextLine();
        if(j.equals(h)||j.equals(h1)||j.equals(h2)||j.equals(h4)){
          System.out.println("This doctor is remove frome your list");

        }else{
          System.out.println("this doctor not found in your list");
        }
         System.out.println("if you want to log out");
          S.nextLine();
          String yy=S.nextLine();
          S.nextLine();
          if(yy=="yes"){
            S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
      }if(y==5){
        System.out.println("report is good");
           System.out.println("if you want to log out press yes");
          S.nextLine();
          String yy=S.nextLine();
          S.nextLine();
          if(yy=="yes"){
            S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
      }
      if(y==6){
        System.out.println("feedback is good by all patient");
           System.out.println("if you want to log out");
          S.nextLine();
          String yy=S.nextLine();
          S.nextLine();
          if(yy=="yes"){
            S.nextLine();
            System.out.println("log out successfully");
            System.out.println("VISIT AGAIN");
          }
      }
S.nextLine();
    }else{
      S.nextLine();
      System.out.println("your password is wrong");
    }

  }}
   public class project{
    public static void main(String[] args) {
      Scanner v=new Scanner(System.in);
     System.out.println("------------------------------------------------------------------");
     System.out.println("                          WELCOME"+"                                ");
     System.out.println("------------------------------------------------------------------");
     System.out.println("       "+"1:-USRE"+"                       "+"2:-ADMIN");
     int b=v.nextInt();
     if(b==1){
      ttt t=new ttt();
      t.user();

     }else if(b==2){
      ttt t1=new ttt();
      t1.admin(null, null, null, null);
     }
    }
  }


