public class FerengiClient extends AlienClient{
    OrderingStrategy orderingStrategy;

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        orderingStrategy = new SmartStrategy();
        return orderingStrategy;
    }
}
