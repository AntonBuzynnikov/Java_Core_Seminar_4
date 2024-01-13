package Market.services;

import Market.models.Customer;
import Market.models.Gender;
import Market.models.Holiday;

import java.time.LocalDate;

public class CongratService {
    public static void congratulation(int day,int month, CustomerService customerService){
        for (Customer customer : customerService.getAll()){
            congrat23February(day,month,customer);
            congrat8March(day,month,customer);
            congratNewYear(day,month,customer);
        }
    }
    private static void congrat23February(int day,int month, Customer customer){
        if(customer.getGender() == Gender.MALE && day == Holiday.February23.getDay() && month == Holiday.February23.getMonth()){
            System.out.printf("Поздравляем с Днём защитника Отечества, %s!\n", customer.getName());
        }
    }
    private static void congrat8March(int day, int month, Customer customer){
        if(customer.getGender() == Gender.FEMALE && day == Holiday.March8.getDay() && month == Holiday.March8.getMonth()){
            System.out.printf("Поздравляем с Международным женским днём, %s!\n",customer.getName());
        }
    }
    private static void congratNewYear(int day, int month,Customer customer){
        if(day == Holiday.NewYear.getDay() && month == Holiday.NewYear.getMonth()){
            System.out.printf("Поздравляем с Новым Годом, %s!\n", customer.getName());
        }
    }
}
