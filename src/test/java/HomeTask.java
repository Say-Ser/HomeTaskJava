public class HomeTask {
    public static void main(String[] args) {
    Task0(5,2);
    System.out.println(Task1(2,4,6));
    Task2(10,12);
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
    
}
