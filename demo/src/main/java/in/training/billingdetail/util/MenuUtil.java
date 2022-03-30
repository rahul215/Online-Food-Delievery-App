package in.training.billingdetail.util;

import java.util.Scanner;

import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.service.BillService;
import in.training.billingdetail.serviceimpl.BillServiceImpl;

public class MenuUtil {

	private BillService billService;

    public MenuUtil() {
        billService =new BillServiceImpl();
    }
    public void start() {
        int menuChoice;
        String continueChoice;
        Scanner sc=new Scanner(System.in);
        do {
        showMenu();
        System.out.println("Enter your choice :(1,2,3,4,0) : ");
        menuChoice=sc.nextInt();
        sc.nextLine();
        switch(menuChoice) {
        case 1:
            Bill bill=new Bill();
            System.out.println("Enter Training Name : ");
            bill.setTrainingName(sc.nextLine());
             
            System.out.println("Enter Training Description : ");
            bill.setDescription(sc.nextLine());


             billService.createBill(bill);
            System.out.println("Success! Training Created..");
            break;
        case 2:
            System.out.println("-------------------List Operation--------------");
            List<Training> trainings= trainingService.showAllTrainings();
            for( Training train:trainings) {
                System.out.println(train);            }
            break;
        case 3:
            System.out.println("-------------------Update Operation--------------");
            System.out.println("Enter Training id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Updated Description");
            String projectDescription=sc.nextLine();
            trainingService.update(id,projectDescription);


            break;
        case 4:
            System.out.println("---------------------Delete Operation----------------");
            System.out.println("Enter Id of Training to Delete: ");
            Integer Id=sc.nextInt();
            try {
                trainingService.removeTraining(Id);
                System.out.println("Success! Training is deleted.");
            }catch(TrainingNotFoundException e) {
                System.out.println("Problem :"+e.getMessage());
            }
            break;
        case 0:
            System.exit(0);
            break;
        default:
            System.out.println("Wrong Choice");
            break;
        }
        System.out.println("Do you want to Continue : (yes/no) : ");
        continueChoice =sc.next();

    }while(continueChoice.equals("yes"));

    }
    private void showMenu() {
        System.out.println("-------TRAINING TRACKER APP (TRAINING MANAGEMENT TOOL)---------");
        System.out.println("1. Create Training");
        System.out.println("2. list Training");
        System.out.println("3. Update Training");
        System.out.println("4. Delete Training");
        
        
    }
	
}
