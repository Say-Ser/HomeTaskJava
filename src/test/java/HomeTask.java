public class HomeTask {
    public static void main(String[] args) {
    Task0(5,2);
    System.out.println(Task1(2,4,6));
    Task2(10,15);
    Task3(25);
    System.out.println(Task10(25));
    }
    public static void Task0(int x, int y) {
        int sum=x+y;
        if(sum>=0)
            System.out.println("Сумма "+sum+" положительна");
        else
            System.out.println("Сумма "+sum+" отрицательна");
    }
    public static int Task1(int x, int y, int z) {
        if(x*y+37>0){
            z=z*2;
            return 7*x+y;
        }
        else {
            if(x==0)
                z=z/5;
            else z=z/x;
            return 5*y-x;
        }
    }
    public static void Task2(int x, int y) {
        int AVG=(x+y)/2;
        int Xavg = (x-AVG)> 0 ? x-AVG : AVG-x ;
        int Yavg = (y-AVG)> 0 ? y-AVG : AVG-y ;
        System.out.println("Cредний возраст : "+AVG);
        System.out.println("Отличие Тани от среденего "+Xavg);
        System.out.println("Отличие Мити от среденего "+Yavg);
    }
    public static void Task3(double Cel){
        double Far=Cel*1.8+32;
        double Kel=Cel+273.15;
        System.out.println("Температура по шкале Цельсия: "+Cel);
        System.out.println("Температура по шкале Фаренгейта: "+Far);
        System.out.println("Температура по шкале Кельвина: "+Kel);
    }
    public static int Task4(int x){//564
        return x/10+x%10*100;
    }
    public static void Task6(int m, int n){
        if(m%n==0)
            System.out.println(m/n);
        else System.out.println("Число "+m+" не делится нацело на число "+n+" !");
    }
    public static void Task7(int x){

        if(x/100>x%10)
            System.out.println(x/100);
        else  System.out.println(x%10);
        if(x/100>x%100/10)
            System.out.println(x/100);
        else  System.out.println(x%100/10);
        if(x%100/10>x%10)
            System.out.println (x%100/10);
        else  System.out.println (x%10);
    }
    public static void Task8(int x, int y){
        boolean flag=false;
        while (x/10>0){
            if(x%10==y){
               flag=true;
               break;
            }
        }
        if (flag)
            System.out.println(y+" входит в число "+x);
        else  System.out.println(y+" не входит в число "+x);
    }
    public static void Task9(int x){
        String []w = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };
        System.out.println(w[x-1]);
    }

    public static int Task10(int N){
        int count=0;
        if(N<2){System.out.println("Четных чисел нет!");return 0;}
        for(int i=2;i<=N;i+=2){
            count++;
        }
        return count;
    }

    public static void Task11(int x, int y){
        while (x%y!=0) {
        x++;
        }
        System.out.println(x);
    }
    public static int Task12(String fk){
        int count=0;
        while (fk!='/0'){
            fk=fk/10;
            count++;
        }
        return count;
    }

    }

}
