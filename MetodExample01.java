import java.util.Scanner;
public class MetodExample01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算方式");
        System.out.println("-----------------");
        System.out.println("1.加法   2.减法   3.乘法");
        System.out.println("4.除法   5.平方   6.绝对值");
        System.out.println("-----------------");
        int method = sc.nextInt();
if(method > 6){
    System.out.println("请选择一个目标里有的数");
}else{
        System.out.println("请输入一个数");
        double number1 = sc.nextDouble();
        if (method != 5 && method != 6) {
            System.out.println("请输入第二个数");
            double number2 = sc.nextDouble();
            if(method == 1){
                jiafa(number1,number2);
            }else if(method == 2){
                jianfa(number1,number2);
            }else if(method == 3){
                chengfa(number1,number2);
            }else if(method == 4){
                chufa(number1,number2);
            }
        }else if(method == 5 || method == 6){
            if(method == 5){
                pingfang(number1);
            }else if(method == 6){
                jueduizhi(number1);
            }
        }
        }
    }
    public static void jiafa(double number1,double number2){
        double count = number1+number2;
        System.out.println("加法:"+count);
    }
    public static void jianfa(double number1,double number2){
        double count = number1-number2;
        System.out.println("减法:"+count);
    }
    public static void chengfa(double number1,double number2){
        double count = number1*number2;
        System.out.println("乘法:"+count);
    }
    public static void chufa(double number1,double number2){
        if(number2 == 0){
            System.out.println("除数不能为0");
        }else{
            double count = number1/number2;
            System.out.println("除法:"+count);
        }
    }
    public static void pingfang(double number1){
        double count = number1*number1;
        System.out.println("平方:"+count);
    }
    public static void jueduizhi(double number1){
        if(number1 * -1 >=0){
            double count = number1*-1;
            System.out.println("绝对值:"+count);
        }else{
            System.out.println("绝对值:"+number1);
        }
    }
}
