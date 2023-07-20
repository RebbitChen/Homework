package homework;
import java.util.Scanner;
class 屎蛋麵包屋訂單{
    int 法國麵包單價, 日本麵包單價, 貓貓麵包單價 = 50;
    int C1, C2, C3 = 0;
    int sum = 0;
    char delivery;
    double totalPrice = 0;
    boolean deliverys;
    public 屎蛋麵包屋訂單(){
        Scanner sc = new Scanner(System.in);
        System.out.println("品項: 法國麵包、日本麵包、貓貓麵包，均一價50元");
        System.out.println("不論品項，購買七顆(含)以上，價格七折優惠");
        System.out.println("若需宅配服務，需額外運費100元");
        System.out.println("請輸入法國麵包需求顆數: ");
        C1 = sc.nextInt();
        System.out.println("請輸入日本麵包需求顆數: ");
        C2 = sc.nextInt();
        System.out.println("請輸入貓貓麵包需求顆數:");
        C3 = sc.nextInt();
        sum = C1 + C2 + C3;
        System.out.println("請問是否需要宅配服務(Y/N) ?");
        delivery = sc.next().charAt(0);
        if(delivery == 'y') {
            deliverys = true;
        }else {
            deliverys = false;
        }
        if(sum <7) {
            if(deliverys) {
                totalPrice = sum * 50 +100;
            }
            else {
                totalPrice = sum * 50 ;
            }
        }
        else if(sum >= 7){
            if(deliverys) {
                totalPrice =(sum * 50 * 0.7) + 100;
            }
            else {
                totalPrice = (sum * 50 * 0.7);
            }
        }
        System.out.println("總費用: "+totalPrice);
    }
}
public class bakery {
public static void main(String[] args) {
	屎蛋麵包屋訂單 A1 = new 屎蛋麵包屋訂單();
 }
}
