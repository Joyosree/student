import java.io.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("1. Show all student");
        System.out.println("2. Show random student");
        System.out.println("3. Show number of student");
        System.out.println("4. Add a student");
        System.out.println("5. Find a student");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter option(1-5):");
        int option=sc.nextInt();

        if(option==1){
            File file=new File("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt");
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            }
            catch(FileNotFoundException ex){
                System.out.println("Exception :"+ex.toString());
            }
            String st;
            while((st=br.readLine())!=null){
                System.out.println("st");


            }
            }
       else if (option == 2){
           int count=getNumberOfStudent();
            File file=new File("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt");
            BufferedReader br = null;
            try {
                       br = new BufferedReader(new FileReader(file));
            }
            catch(FileNotFoundException ex){
                System.out.println("Exception :"+ex.toString());
            }
            String[] ids = new String[count];

            int i = 0;
            String st;
            while ((st = br.readLine()) != null) {
                if (st.equals("")) {
                    continue;
                }
                ids[i] = st;
                i++;
            }

            int randNumber = randInt(0, ids.length - 1);

            System.out.println("Random Student : " + ids[randNumber]);


        }

        else if (option ==3){

            File file=new File("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt");
            BufferedReader br = null;
            try {
                 br = new BufferedReader(new FileReader(file));
            }
            catch(FileNotFoundException ex){
                System.out.println("Exception :"+ex.toString());
            }
            String st;
            int count=0;
            while((st=br.readLine())!=null){
                if(st.equals("")){
                    continue;
                }
                count=count+1;

            }
            System.out.println("number of student:"+count);

        }

        else if (option ==4){
            FileWriter fx = new FileWriter("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt", true);
            String newst = sc.next();
            fx.write("\n" + newst);
            fx.close();
            System.out.println("Student Added");



        }
        else if  (option ==5) {

            File file = new File("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt");
            BufferedReader br = null;
            try {
               br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                System.out.println("Exception :" + ex.toString());
            }
            System.out.println("Enter ID");
            String checkst = sc.next();
            String st;
            int flag = 0;
            while((st = br.readLine()) != null) {
                if (st.equals(checkst)) {
                    flag = 1;
                }


            }
            if (flag == 0) {
                System.out.println("Not found");
            } else {

                System.out.println("Found");
            }
        }
            else{
                System.out.println("Select correct option");
            }

        }
    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static int getNumberOfStudent() throws IOException{
        File file = new File("C:\\Users\\user\\Desktop\\hello\\studentlist-java-1\\src\\student.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("Exception : " + ex.toString());
        }
        String st;
        int count = 0;
        while ((st = br.readLine()) != null) {
            if (st.equals("")) {
                continue;
            }
            count = count + 1;
        }
        return count;
    }

}




