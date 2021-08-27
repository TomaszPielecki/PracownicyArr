public class Main
{
    private static Object Arr;

    public static void main(String[] args) {
        // tworzenie obiektów dla klasy Worker
    Worker pracownik= new Worker("Tomasz","Pielecki",35,"Kierowca",3500.50);
    Worker pracownik1= new Worker("Franciszek","Zakoscielny",25,"Magazynier",2800.80);
    Worker pracownik2= new Worker("Beata","Klepacka",45,"Kierownik",4550.90);
    Worker pracownik3= new Worker("Adam","Wierzbicki",55,"Dyrektor",3500.50);
        System.out.println(pracownik);
        System.out.println(pracownik1);
        System.out.println(pracownik2);
        System.out.println(pracownik3);


        String[] items = {"Appa Item no. 1", "Appa Item no. 2", "Appa Item no. 3", "Appa Item no. 4"};
        for (int i=0; i < items.length; i++) {
            System.out.println(items[i]);
        }

    }
}
