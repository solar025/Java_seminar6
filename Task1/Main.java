package Task1;
public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Huawei", "MateBook", "Windows", 8, 256);
        Notebook notebook2 = new Notebook("Lenovo", "IdeaPad", "Linux", 8, 512);
        Notebook notebook3 = new Notebook("Dell", "Inspiron", "Windows", 4, 128);
        Notebook notebook4 = new Notebook("Apple", "MacBook Air", "MacOs", 16, 512);
        Notebook notebook5 = new Notebook("Acer", "Extensa", "Windows", 4, 512);
        Shop shop = new Shop();
        shop.add(notebook1);
        shop.add(notebook2);
        shop.add(notebook3);
        shop.add(notebook4);
        shop.add(notebook5);
        shop.print();
        shop.filter();
    }
}