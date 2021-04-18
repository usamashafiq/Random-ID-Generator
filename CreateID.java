package testserver;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input the Student name
        String Student_Name = sc.nextLine();
        //funtion create Id from name
        // return in generated id
        String generated_ID = CreateID(Student_Name);
        System.out.print(Student_Name);
        System.out.println(" ID is "+generated_ID);


    }

    public static String CreateID(String input){

//        All upper-case letters  converted to lower-case in the ID.
        input = input.toLowerCase();
        //split the Name by space to check
        String[] Check = input.split("\\s");
        int len = Check.length;
        //store first second third name
        String F ,S,T ;
        // It is null.
        // It is empty.
        //It does not contain either two or three parts.
        if (input == null||input.length()<2||input.equals("")){
            return null;
        }



        //If the user enters a two part name
        if(len==2){
            //separate the first second Name
            F=Check[0];
            S=Check[1];
            char f,s;
            //pick the first word of  the name
             f = F.charAt(0);
             s = S.charAt(0);
             return f+"x"+s;




        }
        //If the user enters a three part name
        if(len==3){
            //separate the first second thrid Name
            F=Check[0];
            S=Check[1];
            T=Check[2];
            // pick a first word of the name
            char f,s,t;
             f = F.charAt(0);
             s = S.charAt(0);
             t = T.charAt(0);
             return f+""+s+t;
        }

        return null;




    }





}
