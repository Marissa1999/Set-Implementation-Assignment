import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Programmer: Marissa Gonçalves
 * Due Date: September 21, 2018
 */

public class MySetDriver 
{

     
    public static void main(String[] args) 
    {
       

       MySet<String> set1 = new MySet<>();
        
       String[] array = {"one", "two", "three"};
        
       String[] array2 = {"three", "four", "five"};
       
        
       List<String> list = new ArrayList<>(Arrays.asList(array2));
        
       MySet<String> set2 = new MySet<>(array);
        
       MySet<String> set3 = new MySet<>(list);
       
        
       
       
       
        
        
       
       
       set1.add("zero");
       set1.add("two");
       set1.add("two");
       
       
       
       display(set1, "Set 1:");
        
       System.out.println();
        
       
       
       
       display(set2, "Set 2:");
        
       System.out.println();
       
       
       
       
       
       display(set3, "Set 3:");
        
       System.out.println();
       
       
       
       
       
        
       set1.set("one", 1);
       set1.add(2, "two");
       set1.add(3, "one");
       set1.set("two", 0);
       //set1.remove("two");
       display(set1, "Set 1:");
        
        
       System.out.println();
       
       
       
       
       
       
       
       
       display(set1.intersection(set2), "Set 1 Intersection Set 2:");
       System.out.println();
       display(set1, "Set 1 After Intersection:");
       
       
       System.out.println();
       


       display(set2.intersection(set3), "Set 2 Intersection Set 3:");
       System.out.println();
       display(set2, "Set 2 After Intersection:");
       
       
       System.out.println();
       
       
       
       
       
       
       
       
       
       
       
        display(set1, "Set 1:");
        
       System.out.println();
        
       
       
       
       display(set2, "Set 2:");
        
       System.out.println();
       
       
       
       
       
       display(set3, "Set 3:");
        
       System.out.println();
       
       
       
       
       
       
       
       
       
       


       display(set1.union(set2), "Set 1 Union Set 2:");
       System.out.println();
       display(set1, "Set 1 After Union:");
        
       
       
       System.out.println();
       
       
       
       display(set2.union(set3), "Set 2 Union Set 3:");
       System.out.println();
       display(set2, "Set 2 After Union:");
        
       
       System.out.println();
       
       
 
       
       
       
       
       
       
       
       
       display(set1, "Set 1:");
        
       System.out.println();
        
       
       
       
       display(set2, "Set 2:");
        
       System.out.println();
       
       
       
       
       
       display(set3, "Set 3:");
        
       System.out.println();
       
       
       
       
       
       
       
       
       
       
       display(set1.difference(set2), "Set 1 Difference Set 2:");
       System.out.println();
       display(set1, "Set 1 After Difference:");
       
       
       
       System.out.println();
       
       
       
       display(set2.difference(set3), "Set 2 Difference Set 3:");
       System.out.println();
       display(set2, "Set 2 After Difference:");
       
       
       System.out.println();
       
       
       
       
       
       
       
       

       
//        set1.add("Message:";
//        set1.add("The Beginning");
//        set1.add("The Middle");
//        set1.add("The End");
//        set1.add("The End");
//        set1.add("...");
//        
//        
//        display(set1);
//          
//        
//        System.out.println();
//        
//        
//        
//        
//        
//        System.out.println("Set 2:");
//        
//        String[] array = { "4", "6", "10", "10", "Again" };
//        
//        MySet<String> set2 = new MySet<>(array);
//        
//        
//        display(set2);
//        
//        
//        
//        System.out.println();
//        
//
//        
//        System.out.println("Set 3:");
//        
//        String[] arrayList = { "Testing", "Testing", "Again", "!!!", "10", "4"};
//        
//        MySet<String> set3 = new MySet<>(Arrays.asList(arrayList));
//        
//
//        display(set3);
//        
//        
//        
//        System.out.println();
//        
//       
//        
//        
//        System.out.println("It is " + set1.add("13") + " that this element is unique.");
//        System.out.println();
//        System.out.println("New Set:");
//        display(set1);
//        
//        
//        System.out.println();
//        
//        
//        
//        
//        
//        System.out.println("It is " + set1.add("The End") + " that this element is unique.");
//        System.out.println();
//        System.out.println("New Set:");
//        display(set1);
//        
//        
//        System.out.println();
//        
//        
//        
//        
//        
//        
//        System.out.println("It is " + set1.remove("The End") + " that this element is found in the set.");
//        System.out.println();
//        System.out.println("New Set:");
//        display(set1);
//        
//        
//        System.out.println();
//        
//        
//        
//        
//        System.out.println("It is " + set1.add("Introduction") + " that this element is unique.");
//        System.out.println();
//        System.out.println("New Set:");
//        display(set1);
//        
//        
//        System.out.println();
//        
//        
//        
//        
//        System.out.println("The Union Set:");
//        MySet<String> set4 = set2.union(set3);
//        display(set4);
//        
//        System.out.println();
//        
//        
//        
//        System.out.println("The Intersection Set:");
//        MySet<String> set5 = set2.intersection(set3);
//        display(set5);
//        
//        System.out.println();
//        
//        
//        
//        System.out.println("The Difference Set:");
//        MySet<String> set7 = set2.difference(set3);
//        MySet<String> set8 = set3.difference(set2);
//        display(set7);
//        display(set8);
//
//        System.out.println();
//        
//        
        
    }   
        
    
    
    private static void display(MySet<String> set, String message) 
    {
        
        System.out.println(message);
        
        for (int i = 0; i < set.size(); i++)
        {
            System.out.println(set.get(i));
        }
        

    }
        
        
}
    

