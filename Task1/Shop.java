package Task1;
import java.util.*;
// import java.util.HashSet;
public class Shop {
    private Set<Notebook> notebooks = new HashSet();
    public void add(Notebook notebook) {
        notebooks.add(notebook);
    }
    public void print() {
        for (Notebook notebook : notebooks) {
        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
        notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
        }
    }
    public void filter() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - Оперативная память");
            System.out.println("2 - Объем Жёсткого Диска");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Бренд");
            int choice = sc.nextInt();
            int minValue = 0;
            Object osValue;
            switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем Оперативной памяти (в гигабайтах) > ");
                minValue = sc.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getRam() >= minValue) {
                     System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                     notebook.getOS() + " " + notebook.getRam() + "Гб " + notebook.getHdSize() + "Гб");
                    }
                }
                break;
            case 2:
                System.out.println("Введите минимальный объем Жёсткого Диска (в гигабайтах) > ");
                minValue = sc.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getHdSize() >= minValue) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "Гб " + notebook.getHdSize() + "Гб");
                    }
                }
                break;
            case 3:
                System.out.println("Введите название ОС: Windows Linux MacOS > ");
                sc.nextLine();
                osValue = sc.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getOS().equals(osValue)) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "Гб " + notebook.getHdSize() + "Гб");
                    }
                }
                break;
            case 4:
                System.out.println("Введите название Бренда: Huawei Lenovo Dell Apple Acer > ");
                sc.nextLine();
                osValue = sc.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getBrand().equals(osValue)) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "Гб " + notebook.getHdSize() + "Гб");
                    }
                }
                break;   
            default:
                System.out.println("Некорректный выбор критерия.");
            }
        }
    }
}