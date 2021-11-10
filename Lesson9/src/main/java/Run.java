import hands.SamsungHand;
import hands.SonyHand;
import hands.ToshibaHand;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.SamsungLegs;
import legs.SonyLegs;
import legs.ToshibaLegs;

public class Run {
    private Robot robot;

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();

        SamsungLegs samsungLegs1 = new SamsungLegs();
        SamsungHand samsungHand1 = new SamsungHand();
        SamsungHead samsungHead1 = new SamsungHead();

        SonyHead sonyHead1 = new SonyHead();
        SonyLegs sonyLegs1 = new SonyLegs();
        SonyHand sonyHand1 = new SonyHand();

        ToshibaHead toshibaHead1 = new ToshibaHead();
        ToshibaLegs toshibaLegs1 = new ToshibaLegs();
        ToshibaHand toshibaHand1 = new ToshibaHand();

        robot1.setHand(samsungHand1);
        robot1.setHead(sonyHead1);
        robot1.setLeg(toshibaLegs1);
        robot1.action();
        System.out.println("Стоимость сборки: " + robot1.getPrice());
        System.out.println();

        robot2.setHand(sonyHand1);
        robot2.setHead(toshibaHead1);
        robot2.setLeg(samsungLegs1);
        robot2.action();
        System.out.println("Стоимость сборки: " + robot2.getPrice());
        System.out.println();

        robot3.setHand(samsungHand1);
        robot3.setHead(samsungHead1);
        robot3.setLeg(sonyLegs1);
        robot3.action();
        System.out.println("Стоимость сборки: " + robot3.getPrice());
        System.out.println();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Первая сборка робота самая дорогая, его цена: = " + robot1.getPrice());
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Вторая сборка робота самая дорогая, его цена: = " + robot2.getPrice());
        } else {
            System.out.println("Третья сборка робота самая дорогая, его цена: = " + robot3.getPrice());
        }
    }
}
