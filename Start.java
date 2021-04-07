import java.util.LinkedList;

public class Start {

        LinkedList<String> chicken_salad_ingredients = new LinkedList<String>();
        LinkedList<String> pizza_ingredients = new LinkedList<String>();
        LinkedList<String> spaghetti_ingredients = new LinkedList<String>();
        LinkedList<String> fruit_salad_ingredients = new LinkedList<String>();
        LinkedList<String> menu_list = new LinkedList<String>(); 
        
        
        String chicken_salad_ingredients_array = chicken_salad_ingredients.toString();
        String pizza_ingredients_array = pizza_ingredients.toString();
        String spaghetti_ingredients_array = spaghetti_ingredients.toString();
        String fruit_salad_ingredients_array = fruit_salad_ingredients.toString();
        
        double[] price = { 10.99, 20, 6.76, 3 };
        double price_total = 0;

        // all of the strings stored
        String Welcome_the_user_to_the_restaurant = "Hello there! We have choices you to choose from. Pick one!";
        String choices_for_the_user_to_choose_from = "Pick one of the food in the menu using numbers! If none of the following food interest you. \"Stop\" will stop the program.";
        String Compliment_the_users_choice = "Good choice";
        String remove_ingredient_from_the_menu_question = "Do you want to remove any of the ingredients? Y/N?";
        String Apology = "Sorry!";
        String retry = "Try again!";
        String asks_user_which_ingredient_should_be_removed = "Which of the ingredients do you want to remove?";
        String no_removal = "No ingredients is removed from the list";
        String the_food_is_ready = "The food is ready";
        String the_ingredient_is_reomved = "The requested ingredient is removed from the ingredient list when making the dish";

    public Start() {
        chicken_salad_ingredients.add("Chicken Breast (0) ");
        chicken_salad_ingredients.add("Tomatoes (1) ");
        chicken_salad_ingredients.add("Black olives (2) ");
        chicken_salad_ingredients.add("Ranch (3) ");
        chicken_salad_ingredients.add("Lettuce (4) ");
        chicken_salad_ingredients.add("Red capsicum (5) ");
        chicken_salad_ingredients.add("White onions (6) ");

        pizza_ingredients.add("Pepperoni (0) ");
        pizza_ingredients.add("Tomatoes (1) ");
        pizza_ingredients.add("Black olives (2)");
        pizza_ingredients.add("Cheese (3) ");
        pizza_ingredients.add("White onions (4) ");
        pizza_ingredients.add("Dough (5) ");

        spaghetti_ingredients.add("Meat (0) ");
        spaghetti_ingredients.add("Cheese (1) ");
        spaghetti_ingredients.add("Spaghetti (2) ");
        spaghetti_ingredients.add("Spaghetti sauce (3) ");

        fruit_salad_ingredients.add("Apple (0) ");
        fruit_salad_ingredients.add("Orange (1) ");
        fruit_salad_ingredients.add("Peach (2) ");
        fruit_salad_ingredients.add("Banana (3) ");
        fruit_salad_ingredients.add("Strawberry (4) ");
        fruit_salad_ingredients.add("Blueberry (5) ");
        fruit_salad_ingredients.add("Mango(6) ");
        fruit_salad_ingredients.add("Plum (7) ");

        menu_list.add("Chicken Salad (0) ");
        menu_list.add("Pizza (1) ");
        menu_list.add("Spaghetti (2) ");
        menu_list.add("Fruit salad (3) ");
    }
}