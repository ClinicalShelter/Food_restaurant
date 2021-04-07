import java.util.Scanner;
import java.util.LinkedList;

public class Menu2 {
    /* create a restaurant that the customer can remove and add pick the food that
        they want to eat
        Author: Yasir Mohammed Sh. Ahmed
        Created: 30/3/2021
    */

        public static void main(String[] args) {
        Start start = new Start();

        String Welcome_the_user_to_the_restaurant = start.Welcome_the_user_to_the_restaurant;
        String choices_for_the_user_to_choose_from = start.choices_for_the_user_to_choose_from;
        String Compliment_the_users_choice = start.Compliment_the_users_choice;   
        String remove_ingredient_from_the_menu_question = start.remove_ingredient_from_the_menu_question;
        String Apology = start.Apology;
        String retry = start.retry;
        String asks_user_which_ingredient_should_be_removed = start.asks_user_which_ingredient_should_be_removed;
        String no_removal = start.no_removal;
        String the_food_is_ready = start.the_food_is_ready;
        String the_ingredient_is_reomved = start.the_ingredient_is_reomved;

        double[] price = start.price;
        double price_total = start.price_total;

        LinkedList<String> chicken_salad_ingredients = start.chicken_salad_ingredients;
        LinkedList<String> pizza_ingredients = start.pizza_ingredients;
        LinkedList<String> spaghetti_ingredients = start.spaghetti_ingredients;
        LinkedList<String> fruit_salad_ingredients = start.fruit_salad_ingredients;
        LinkedList<String> menu_list = start.menu_list;

        System.out.println(Welcome_the_user_to_the_restaurant);
        for (String i : menu_list) {
            System.out.println(i);
        }
        System.out.println();
        
        System.out.println(choices_for_the_user_to_choose_from);
        System.out.println("");
        Scanner scanner = new Scanner(System.in); 
        String users_choice_of_food = scanner.nextLine();

        switch (users_choice_of_food) {

        case "0":
            // store variables in case 0 
            System.out.println(chicken_salad_ingredients);
            System.out.println(Compliment_the_users_choice);
            System.out.println(remove_ingredient_from_the_menu_question);
            price_total = price[0];
            String remove_ingredient_for_chicken_salad = scanner.nextLine(); 

            switch (remove_ingredient_for_chicken_salad) {
            case "Y":
            case "y": 
                System.out.println(asks_user_which_ingredient_should_be_removed);
                System.out.println(chicken_salad_ingredients);
                String ingredients = scanner.nextLine(); 
                switch (ingredients) {
                case "0":
                    chicken_salad_ingredients.remove(0);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "1":
                    chicken_salad_ingredients.remove(1);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "2":
                    chicken_salad_ingredients.remove(2);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "3":
                    chicken_salad_ingredients.remove(3);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "4":
                    chicken_salad_ingredients.remove(4);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "5":
                    chicken_salad_ingredients.remove(5);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                case "6":
                    chicken_salad_ingredients.remove(6);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                default:
                    System.out.println(no_removal);
                    System.out.println(the_food_is_ready);
                    System.out.println(chicken_salad_ingredients);
                    break;
                } 
                break;

            default:
                System.out.println(no_removal);
                System.out.println(the_food_is_ready);
                System.out.println(chicken_salad_ingredients);
                break;
            } 
            break;
        case "1":
            System.out.println(pizza_ingredients);
            System.out.println(Compliment_the_users_choice);
            System.out.println(remove_ingredient_from_the_menu_question);
            System.out.println("");
            price_total = price[1];
            String pizza = scanner.nextLine();
            switch (pizza) {
            case "Y":
            case "y":
                System.out.println(asks_user_which_ingredient_should_be_removed);
                System.out.println(pizza_ingredients);
                String ingredients = scanner.nextLine();
                switch (ingredients) { 
                case "0":
                    pizza_ingredients.remove(0);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                case "1":
                    pizza_ingredients.remove(1);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                case "2":
                    pizza_ingredients.remove(2);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                case "3":
                    pizza_ingredients.remove(3);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                case "4":
                    pizza_ingredients.remove(4);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                case "5":
                    pizza_ingredients.remove(5);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                default:
                    System.out.println(no_removal);
                    System.out.println(the_food_is_ready);
                    System.out.println(pizza_ingredients);
                    break;
                } 
                break;

            default:
                System.out.println(no_removal);
                System.out.println(the_food_is_ready);
                System.out.println(pizza_ingredients);
                break;
            }
            break;
        case "2":
            System.out.println(spaghetti_ingredients);
            System.out.println(Compliment_the_users_choice);
            System.out.println(remove_ingredient_from_the_menu_question);
            System.out.println("");
            price_total = price[2];
            String Spaghetti = scanner.nextLine();

            switch (Spaghetti) {
            case "Y":
            case "y": 
                System.out.println(asks_user_which_ingredient_should_be_removed);
                System.out.println(spaghetti_ingredients);
                String ingredients = scanner.nextLine();
                switch (ingredients) { 
                case "0":
                    spaghetti_ingredients.remove(0);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(spaghetti_ingredients);
                    break;
                case "1":
                    spaghetti_ingredients.remove(1);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(spaghetti_ingredients);
                    break;
                case "2":
                    spaghetti_ingredients.remove(2);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(spaghetti_ingredients);
                    break;
                case "3":
                    spaghetti_ingredients.remove(3);
                    System.out.println(the_ingredient_is_reomved);
                    System.out.println(the_food_is_ready);
                    System.out.println(spaghetti_ingredients);
                    break;
                default:
                    System.out.println(no_removal);
                    System.out.println(the_food_is_ready);
                    System.out.println(spaghetti_ingredients);
                    break;
                } 
                break;
            default:
                System.out.println(no_removal);
                System.out.println(the_food_is_ready);
                System.out.println(spaghetti_ingredients);
                break;
            }
            break;
        case "3":
            System.out.println(fruit_salad_ingredients);
            System.out.println(Compliment_the_users_choice);
            System.out.println(remove_ingredient_from_the_menu_question);
            System.out.println("");
            price_total = price[3];
            String fruit_salad = scanner.nextLine(); // gets user's input
            switch (fruit_salad) {
            case "Y":
            case "y":
                System.out.println(asks_user_which_ingredient_should_be_removed);                                
                System.out.println(fruit_salad_ingredients);
                String ingredients = scanner.nextLine();
                switch (ingredients) { 
                    case "0":
                        fruit_salad_ingredients.remove(0);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "1":
                        fruit_salad_ingredients.remove(1);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "2":
                        fruit_salad_ingredients.remove(2);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "3":
                        fruit_salad_ingredients.remove(3);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "4":
                        fruit_salad_ingredients.remove(4);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "5":
                        fruit_salad_ingredients.remove(5);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "6":
                        fruit_salad_ingredients.remove(6);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    case "7":
                        fruit_salad_ingredients.remove(7);
                        System.out.println(the_ingredient_is_reomved);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    default:
                        System.out.println(no_removal);
                        System.out.println(the_food_is_ready);
                        System.out.println(fruit_salad_ingredients);
                        break;
                    } 
                    break;
            default:
                System.out.println(no_removal);
                System.out.println(the_food_is_ready);
                System.out.println(fruit_salad_ingredients);
                break;
            } 
            break;
        case "Stop":
            System.out.println(Apology);
            break;
        default:
            System.out.println(retry);
            break;
        } // switch-case is finished
        scanner.close();
        System.out.println(price_total); 
    }
}

