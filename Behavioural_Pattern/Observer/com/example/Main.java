public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(101.00);

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(102.75);
    }
}
