public class Worker {
    String Name;
    String secondName;
    int age;
    String position;
    double salary;
    //Konstruktor Klasy worker
    public Worker(String Name,String secondName,int age,String position,double salary){
        this.Name=Name;
        this.secondName=secondName;
        this.age=age;
        this.position=position;
        this.salary=salary;
    }
    public String toString(){// Metoda wypisuje wszytskie informacje z klasy Worker
          return " Imie " + Name +
                " Nazwisko " + secondName +
                " Wiek " + age +
                " Stanowisko " + position +
                " Wypłata " + salary;
    }
}
