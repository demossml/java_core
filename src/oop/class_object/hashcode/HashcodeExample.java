package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    public static void main(String[] args) {
        Child child4 = new Child("Киров Сергей", 2019);
        Child child2 = new Child("Семенчук Артем", 2018);
        Child child3 = new Child("Иванов Петр", 2018);
        Child child1 = new Child("Зимин Алексей", 2019);

        Child[] group0 = {child2,  child3};
        Child[] group2 = {child1, child4,};

        Child[][] children = { group0, group2};

        Child childForFind = new Child("Киров Сергей", 2019);

        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);
        boolean result = false;

        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)) {
                result = true;
                System.out.println(child.getName());
                break;
            }

        }


        System.out.println(result);
    }
}
