package oop.class_object.equals;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Киров Сергей", 2019);
        Child child2 = new Child("Семенчук Артем", 2018);
        Child child3 = new Child("Иванов Петр", 2018);
        Child child4 = new Child("Зимин Алексей", 2019);
        
        Child[] children = {child2, child1, child3, child4};
        
        ChildrenGarden childrenGarden = new ChildrenGarden(children);
        boolean result = false;
//
//        for (Child child : childrenGarden.getChildren()) {
//            if (child.getName().equals("Киров Сергей") && child.getYear() == 2019){
//                result = true;
//                System.out.println(child.getName());
//                break;
//            }
//        }
        for (Child child : childrenGarden.getChildren()) {
            Child childForFind = new Child("Киров Сергей", 2019);

            if (child.equals(childForFind)){
                result = true;
                System.out.println(child.getName());
                break;
            }
        }
        System.out.println(result);
    }
}
