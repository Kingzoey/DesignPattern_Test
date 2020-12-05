import interceptingfilterpattern.*;

public class InterceptingfilterTest {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Customer());
        filterManager.addFilter(new CashierFilter());
        filterManager.addFilter(new CookFilter());
        filterManager.addFilter(new WaiterFilter());
        Order order = new Order();
        order.setFilterManager(filterManager);
        order.sendRequest("海底世界嘉年华豪华家庭套餐");
    }
}
