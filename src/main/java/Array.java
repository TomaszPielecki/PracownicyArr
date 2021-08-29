public class Array {
    public static void arr(){
        //Sumowanie tablicy typu float;
        float n[]={1f,2f,5f,8f,9f};//utworzenie tablicy
        System.out.println("Sum="+sum(n));
    }
    public static float sum(float numbers[]){
        float sum=0;
        for (float number: numbers){
            sum+=number;
        }
        return sum;
    }

//Dodawanie 1 i ostataniego elementu tablicy
    public static void arr1() {
        int z[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        int size = z.length;
        if (size % 2 != 0) {
            sum = z[0] + z[size / 2]+ z[size-1];
        }
        else{
            sum=z[0]+z[size-1];
        }
        System.out.println("Sum= "+sum);
        System.out.println("Ilosc elementow w tablicy= "+z.length);
        System.out.println("Ilosc elementow w tablicy= "+z[size-1]);
    }
}
