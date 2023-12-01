import java.util.Scanner;
import java.util.ArrayList;

public class MedManagement{
    
    public static ArrayList <Medicine> medList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    private static final String STAFF_PASS = "000";
    
    public static void main(String[]args){
 
        while(true)
        {
            System.out.println("\nMedicine Management System");
            System.out.println("1. Patient: View Medicines");
            System.out.println("2. Patient: Search Medicines");
            System.out.println("3. Staff: Add Medicine");
            System.out.println("4. Staff: Delete Medicine");
            System.out.println("5. Staff: Update Medicine");
            System.out.println("6. Staff: View All Medicines");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
        
        
            int enter = input.nextInt();
            input.nextLine();

            String choice = Integer.toString(enter);
        
            
            switch (choice)
            {
                case "1":
                    viewAllMedicines();
                    break;

                case "2":
                    searchMed();
                    break;
                
                case "3":
                 System.out.println("Enter the staff password :");
                    String pass1 = input.nextLine();
                    if(pass1.equals(STAFF_PASS)){
                        int converted = Integer.parseInt(choice);
                        staffTrue(converted);
                    }else{
                        System.out.println("Wrong password please try again");
                    }
                    break;
                
                case "4":
                    System.out.println("Enter the staff password :");
                    String pass2 = input.nextLine();
                    if(pass2.equals(STAFF_PASS)){
                        int converted = Integer.parseInt(choice);
                        staffTrue(converted);
                    }else{
                        System.out.println("Wrong password please try again");
                    }
                    break;
                case "5":
                  System.out.println("Enter the staff password :");
                    String pass3 = input.nextLine();
                    if(pass3.equals(STAFF_PASS)){
                        int converted = Integer.parseInt(choice);
                        staffTrue(converted);
                    }else{
                        System.out.println("Wrong password please try again");
                    }
                    break;
                
                case "6":
                    System.out.println("Enter the staff password :");
                    String pass4 = input.nextLine();
                    if(pass4.equals(STAFF_PASS)){
                        int converted = Integer.parseInt(choice);
                        staffTrue(converted);
                    }else{
                        System.out.println("Wrong password please try again");
                    }
                    break;

                case "7":
                    System.out.println("Exiting code (0)");
                    break;
                
                default:
                    System.out.println("Invalid, please enter a number between 1-7");
                    break;
            }

        
        
        
        
        
        }
    
     }
    

    

private static void viewMed(){
    
    //*Checks if the list is empty, if it's not then it prints out every med */

    System.out.println("\n All medicine: ");
    if(medList.isEmpty()){
        System.out.println("Medicine list is empty!");
    }else{
        for(Medicine i : medList){
            System.out.println(i);
        }
    }
}

private static void searchMed(){
    System.out.println("Enter medicine you want to look for (Category / name ) : ");
    String searchName = input.nextLine().toLowerCase();

    boolean found = false;
    for(Medicine i : medList){
        if(i.getName().toLowerCase().contains(searchName) || i.getCategory().toLowerCase().contains(searchName)){
            System.out.println(i);
            found = true;
            
        }
    }

    if(!found){
        System.out.println("Medicine was not found, please make sure you entered the correct one.");
    }
}


public static void addMed(){
    System.out.println("Enter medicine name: ");
    String medNames = input.nextLine();

    System.out.println("Enter medicine category: ");
    String medCat = input.nextLine();

    System.out.println("Enter medicine quantity: ");
    int mQuantity = input.nextInt();

    Medicine medicine = new Medicine(medNames, mQuantity, medCat);
    medList.add(medicine);


    System.out.println("Medicine was added");

}




public static void deleteMed(){
    System.out.println("Enter medicine name to delete: ");
    String delMedName = input.nextLine();

    for(Medicine i : new ArrayList<>(medList)){
        if(i.getName().equalsIgnoreCase(delMedName)){
            medList.remove(i);
            System.out.println("Medicine was deleted!");
            return;
        }
    }

    System.out.println("Medicine was not found!");


}


public static void updateMed(){
    System.out.println("Enter medicine name to update: ");
    String updMedName = input.nextLine();

    for(Medicine i : medList){
        if(i.getName().equalsIgnoreCase(updMedName)){
            System.out.println("Enter new quantity : ");
            int newQuantity = input.nextInt();
            i.setQuantity(newQuantity);
            System.out.println("Medicine has been updated");
            return;
        }
    
        System.out.println("Medicine was not found");
    }
}



private static void viewAllMedicines() {
    System.out.println("\nAll Medicines:");

    if (medList.isEmpty()) {
        System.out.println("No medicines available.");
    } else {
        for (Medicine medicine : medList) {
            System.out.println(medicine);
        }
    }


}

public static void staffTrue(int enter){
    switch(enter){
        case 3: 
            addMed();
            break;

        case 4:
            deleteMed();
            break;
        case 5:
            updateMed();
            break;

        case 6:
            viewMed();
            break;
    }
}
}

