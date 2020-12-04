import commandpattern.*;

public class CommandTest {
    public static void main(String[] args) {
        //准备盘子
        Dish krabbyPatty = new Dish("krabbyPatty");
        Dish cocacola = new Dish("cocacola");
        Dish chips = new Dish("chips");

        //准备订单
        iOrder kpOrder = new CookOrder(krabbyPatty);
        iOrder ccclOrder = new CookOrder(cocacola);
        iOrder chipsOrder = new CookOrder(chips);
        iOrder cancelChipsOrder = new CancelOrder(chips);
        iOrder cancelCcclOrder = new CancelOrder(cocacola);
        iOrder cancelKpOrder = new CancelOrder(krabbyPatty);

        //准备处理程序
        Cook spongeBob = new Cook();

        //开始将订单纳入待执行容器
        spongeBob.takeOrder(kpOrder);
        spongeBob.takeOrder(ccclOrder);
        spongeBob.takeOrder(cancelChipsOrder);

        //处理
        spongeBob.doOrders();

        //第二批
        spongeBob.takeOrder(chipsOrder);
        spongeBob.takeOrder(cancelKpOrder);
        spongeBob.takeOrder(cancelCcclOrder);
        spongeBob.doOrders();
    }
}
